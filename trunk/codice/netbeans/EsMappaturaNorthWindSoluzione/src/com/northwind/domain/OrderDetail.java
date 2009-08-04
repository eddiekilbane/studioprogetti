/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.northwind.domain;

/**
 *
 * @author stefano
 */
public class OrderDetail {


    private int OrderID;
//  `ProductID` int(10) NOT NULL,
  private double unitPrice;
  private double quantity;
  private double discount;
//  PRIMARY KEY  (`OrderID`,`ProductID`),
//  KEY `OrderID` (`OrderID`),
//  KEY `OrdersOrder Details` (`OrderID`),
//  KEY `ProductID` (`ProductID`),
//  KEY `ProductsOrder Details` (`ProductID`),

}
