/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.dao;

import demo.ristorante.domain.Address;

/**
 *
 * @author stefano
 */
public interface AddressDao {


     public void insertAddress(Address indirizzo);

    public void deleteAddress(Address indirizzo);

    public void updateAddress (Address indirizzo);

}
