/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.web.beans;

/**
 *
 * @author stefano
 */



public class Entree {

 
  private long id;
  private String name;
  private boolean vegetarian;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(boolean vegetarian) {
    this.vegetarian = vegetarian;
  }

}
