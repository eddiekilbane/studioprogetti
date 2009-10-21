/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.ristorante.services.impl;

import demo.ristorante.dao.AddressDao;
import demo.ristorante.domain.Address;
import demo.ristorante.services.ServizioAddress;

/**
 *
 * @author stefano
 */
public class ServizioAddressImpl implements ServizioAddress {


    private AddressDao daoAddress;

    public AddressDao getDaoAddress() {
        return daoAddress;
    }

    public void setDaoAddress(AddressDao daoAddress) {
        this.daoAddress = daoAddress;
    }

    public void inserisciAddress(Address daInserire) {

        this.daoAddress.insertAddress(daInserire);
    }

}
