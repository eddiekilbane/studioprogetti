/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.northwind.domain;

import java.util.Date;

/**
 *
 * @author stefano
 */
public class Order {


    private int OrderID; //auto_increment,
//  private String CustomerID;
//  `EmployeeID` int(10) default NULL,
    private Date orderDate;
    private Date requiredDate;
    private Date shippedDate;
    private double freight;
    private String shipName;
    private String shipAddress;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;
//  KEY `CustomerID` (`CustomerID`),
//  KEY `CustomersOrders` (`CustomerID`),
//  KEY `EmployeeID` (`EmployeeID`),
//  KEY `EmployeesOrders` (`EmployeeID`),
//  KEY `OrderDate` (`OrderDate`),
//  KEY `ShippedDate` (`ShippedDate`),
//  KEY `ShippersOrders` (`ShipVia`),
//  KEY `ShipPostalCode` (`ShipPostalCode`),
}
