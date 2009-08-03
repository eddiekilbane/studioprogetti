/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.domain;

/**
 *
 * @author stefano
 */
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="restaurant")
public class Restaurant {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;

  @OneToOne(cascade = CascadeType.ALL)
  private Address address;

  @ManyToMany
  @JoinTable(inverseJoinColumns = @JoinColumn(name = "ENTREE_ID"))
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
