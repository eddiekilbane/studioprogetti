/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao.interfaces;

import java.util.List;
import demo.ristorante.domain.Restaurant;

public interface RestaurantDao {

  public Restaurant findById(long id);

  public List<Restaurant> findByName(String name);

  public List<Restaurant> findByStreetName(String streetName);

  public List<Restaurant> findByEntreeNameLike(String entreeName);

  public List<Restaurant> findRestaurantsWithVegetarianEntrees();

  public void save(Restaurant restaurant);

  public Restaurant update(Restaurant restaurant);

  public void delete(Restaurant restaurant);

}
