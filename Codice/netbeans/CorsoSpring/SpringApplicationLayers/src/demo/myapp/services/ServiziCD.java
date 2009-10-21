/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.myapp.services;

import demo.myapp.domain.CD;

/**
 *
 * @author stefano
 */
public interface ServiziCD {


    public void inserisciCD( CD daInserire);

    public double getPrezzoById(Long idCD);

    public void cancellaCD (CD daCancellare);

}
