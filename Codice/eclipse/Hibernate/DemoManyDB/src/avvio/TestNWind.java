package avvio;

import java.math.BigDecimal;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.mappatura.northwind.Categories;
import es.mappatura.northwind.Suppliers;

public class TestNWind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Integer productId;
		 Categories categories;
		 Suppliers suppliers;
		 String productName;
		 String quantityPerUnit;
		 BigDecimal unitPrice;
		 Short unitsInStock;
		 Short unitsOnOrder;
		 Short reorderLevel;
		 boolean discontinued;
		 */
		Configuration config = new Configuration();
		Configuration nwind = config.configure("hibernateNwind.cfg.xml");
		SessionFactory factory = nwind.buildSessionFactory();
		
		System.out.println(factory.toString());
	}

}
