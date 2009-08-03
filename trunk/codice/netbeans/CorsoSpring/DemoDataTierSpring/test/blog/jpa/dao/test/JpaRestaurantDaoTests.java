/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blog.jpa.dao.test;

import java.util.List;
import org.springframework.test.jpa.AbstractJpaTests;
import demo.ristorante.dao.interfaces.RestaurantDao;
import demo.ristorante.domain.Restaurant;

public class JpaRestaurantDaoTests extends AbstractJpaTests {

  private RestaurantDao restaurantDao;

  public void setRestaurantDao(RestaurantDao restaurantDao) {
    this.restaurantDao = restaurantDao;
  }

  protected String[] getConfigLocations() {
    return new String[] {"classpath:/blog/jpa/dao/applicationContext.xml"};
  }

  protected void onSetUpInTransaction() throws Exception {
    jdbcTemplate.execute("insert into address (id, street_number, street_name) values (1, 10, 'Main Street')");
    jdbcTemplate.execute("insert into address (id, street_number, street_name) values (2, 20, 'Main Street')");
    jdbcTemplate.execute("insert into address (id, street_number, street_name) values (3, 123, 'Dover Street')");

    jdbcTemplate.execute("insert into restaurant (id, name, address_id) values (1, 'Burger Barn', 1)");
    jdbcTemplate.execute("insert into restaurant (id, name, address_id) values (2, 'Veggie Village', 2)");
    jdbcTemplate.execute("insert into restaurant (id, name, address_id) values (3, 'Dover Diner', 3)");

    jdbcTemplate.execute("insert into entree (id, name, vegetarian) values (1, 'Hamburger', 0)");
    jdbcTemplate.execute("insert into entree (id, name, vegetarian) values (2, 'Cheeseburger', 0)");
    jdbcTemplate.execute("insert into entree (id, name, vegetarian) values (3, 'Tofu Stir Fry', 1)");
    jdbcTemplate.execute("insert into entree (id, name, vegetarian) values (4, 'Vegetable Soup', 1)");

    jdbcTemplate.execute("insert into restaurant_entree (restaurant_id, entree_id) values (1, 1)");
    jdbcTemplate.execute("insert into restaurant_entree (restaurant_id, entree_id) values (1, 2)");
    jdbcTemplate.execute("insert into restaurant_entree (restaurant_id, entree_id) values (2, 3)");
    jdbcTemplate.execute("insert into restaurant_entree (restaurant_id, entree_id) values (2, 4)");
    jdbcTemplate.execute("insert into restaurant_entree (restaurant_id, entree_id) values (3, 1)");
    jdbcTemplate.execute("insert into restaurant_entree (restaurant_id, entree_id) values (3, 2)");
    jdbcTemplate.execute("insert into restaurant_entree (restaurant_id, entree_id) values (3, 4)");
  }

  public void testFindByIdWhereRestaurantExists() {
    Restaurant restaurant = restaurantDao.findById(1);
    assertNotNull(restaurant);
    assertEquals("Burger Barn", restaurant.getName());
  }

  public void testFindByIdWhereRestaurantDoesNotExist() {
    Restaurant restaurant = restaurantDao.findById(99);
    assertNull(restaurant);
  }

  public void testFindByNameWhereRestaurantExists() {
    List<Restaurant> restaurants = restaurantDao.findByName("Veggie Village");
    assertEquals(1, restaurants.size());
    Restaurant restaurant = restaurants.get(0);
    assertEquals("Veggie Village", restaurant.getName());
    assertEquals("Main Street", restaurant.getAddress().getStreetName());
    assertEquals(2, restaurant.getEntrees().size());
  }

  public void testFindByNameWhereRestaurantDoesNotExist() {
    List<Restaurant> restaurants = restaurantDao.findByName("No Such Restaurant");
    assertEquals(0, restaurants.size());
  }

  public void testFindByStreetName() {
    List<Restaurant> restaurants = restaurantDao.findByStreetName("Main Street");
    assertEquals(2, restaurants.size());
    Restaurant r1 = restaurantDao.findByName("Burger Barn").get(0);
    Restaurant r2 = restaurantDao.findByName("Veggie Village").get(0);
    assertTrue(restaurants.contains(r1));
    assertTrue(restaurants.contains(r2));
  }

  public void testFindByEntreeNameLike() {
    List<Restaurant> restaurants = restaurantDao.findByEntreeNameLike("%burger");
    assertEquals(2, restaurants.size());
  }

  public void testFindRestaurantsWithVegetarianOptions() {
    List<Restaurant> restaurants = restaurantDao.findRestaurantsWithVegetarianEntrees();
    assertEquals(2, restaurants.size());
  }

  public void testModifyRestaurant() {
    String oldName = "Burger Barn";
    String newName = "Hamburger Hut";
    Restaurant restaurant = restaurantDao.findByName(oldName).get(0);
    restaurant.setName(newName);
    restaurantDao.update(restaurant);
    List<Restaurant> results = restaurantDao.findByName(oldName);
    assertEquals(0, results.size());
    results = restaurantDao.findByName(newName);
    assertEquals(1, results.size());
  }

  public void testDeleteRestaurantAlsoDeletesAddress() {
    String restaurantName = "Dover Diner";
    int preRestaurantCount = jdbcTemplate.queryForInt("select count(*) from restaurant");
    int preAddressCount = jdbcTemplate.queryForInt("select count(*) from address where street_name = 'Dover Street'");
    Restaurant restaurant = restaurantDao.findByName(restaurantName).get(0);
    restaurantDao.delete(restaurant);
    List<Restaurant> results = restaurantDao.findByName(restaurantName);
    assertEquals(0, results.size());
    int postRestaurantCount = jdbcTemplate.queryForInt("select count(*) from restaurant");
    assertEquals(preRestaurantCount - 1, postRestaurantCount);
    int postAddressCount = jdbcTemplate.queryForInt("select count(*) from address where street_name = 'Dover Street'");
    assertEquals(preAddressCount - 1, postAddressCount);
  }

  public void testDeleteRestaurantDoesNotDeleteEntrees() {
    String restaurantName = "Dover Diner";
    int preRestaurantCount = jdbcTemplate.queryForInt("select count(*) from restaurant");
    int preEntreeCount = jdbcTemplate.queryForInt("select count(*) from entree");
    Restaurant restaurant = restaurantDao.findByName(restaurantName).get(0);
    restaurantDao.delete(restaurant);
    List<Restaurant> results = restaurantDao.findByName(restaurantName);
    assertEquals(0, results.size());
    int postRestaurantCount = jdbcTemplate.queryForInt("select count(*) from restaurant");
    assertEquals(preRestaurantCount - 1, postRestaurantCount);
    int postEntreeCount = jdbcTemplate.queryForInt("select count(*) from entree");
    assertEquals(preEntreeCount, postEntreeCount);
  }
}
