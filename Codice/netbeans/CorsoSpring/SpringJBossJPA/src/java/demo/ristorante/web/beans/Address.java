/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.web.beans;

/**
 *
 * @author stefano
 */
public class Address {

  private long id;
  private int streetNumber;
  private String streetName;

  
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(int streetNumber) {
    this.streetNumber = streetNumber;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }
}
