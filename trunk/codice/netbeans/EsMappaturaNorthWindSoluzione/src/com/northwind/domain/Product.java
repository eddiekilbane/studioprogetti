/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.northwind.domain;

/**
 *
 * @author stefano
 */
public class Product {

    private int ProductID; //auto_increment,
    
    private String ProductName;
//  `SupplierID` int(10) default NULL,
//  `CategoryID` int(10) default NULL,
    private String quantityPerUnit;
    private double unitPrice;
    private String unitsInStock;
    private String unitsOnOrder;
    private int ReorderLevel;
    private int Discontinued;

//  KEY `CategoriesProducts` (`CategoryID`),
//  KEY `CategoryID` (`CategoryID`),
//  KEY `ProductName` (`ProductName`),
//  KEY `SupplierID` (`SupplierID`),
//  KEY `SuppliersProducts` (`SupplierID`),

}
