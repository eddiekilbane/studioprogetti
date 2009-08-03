/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo.myapp.dao;

import demo.myapp.domain.CD;
import java.util.List;

/**
 *
 * @author stefano
 */
public interface DaoCd {


    public Long insert(CD daInserire);

    public void update(CD daAggiornare);

    public void delete(CD daCancellare);

    public CD findById(Long id);

    public List<CD> findAll();


    

}
