/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.web.beans;

/**
 *
 * @author stefano
 */
import java.util.Set;



public class Restaurant {

 
  private long id;

  private String name;


  private Address address;


  private Set<Entree> entrees;

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

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Set<Entree> getEntrees() {
    return entrees;
  }

  public void setEntrees(Set<Entree> entrees) {
    this.entrees = entrees;
  }

}
