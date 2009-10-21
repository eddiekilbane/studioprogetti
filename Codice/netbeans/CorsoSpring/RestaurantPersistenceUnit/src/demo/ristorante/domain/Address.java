/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.domain;

/**
 *
 * @author stefano
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="address")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "STREET_NUMBER")
  private int streetNumber;

  @Column(name = "STREET_NAME")
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
