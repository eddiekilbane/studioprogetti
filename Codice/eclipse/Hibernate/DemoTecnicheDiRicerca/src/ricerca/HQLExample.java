
package ricerca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.MatchMode;


import beans.*;


public class HQLExample
{


        public void executeSimpleHQL(Session session)
        {
            Query query = session.createQuery("from Product");
            List results = query.list();
            displayProductsList(results);
        }
        
        public void executeCommentedHQL(Session session)
        {
            String hql = "from Supplier";
            Query query = session.createQuery(hql);
            query.setComment("My HQL: " + hql);
            List results = query.list();
        }
        
         
        public void executeProjectionHQL(Session session)
        {
            Query query = session.createQuery("select product.name, product.price from Product product");
            List results = query.list();
            displayObjectsList(results);
        }           

        public void executeCriteriaForRestrictions(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            Criterion price = Restrictions.gt("price",new Double(25.0));
            Criterion name = Restrictions.like("name","Mou%");
            LogicalExpression orExp = Restrictions.or(price,name);
            crit.add(orExp);
            crit.add(Restrictions.ilike("description","blocks%"));
            List results = crit.list();
            displayProductsList(results);

        }      

        public void executeHQLForRestrictions(Session session)
        {
            String hql = "from Product where price > 25.0"; // and name like 'Mou%'";
            Query query = session.createQuery(hql);
            List results = query.list();
            displayProductsList(results);
        }        
        
        public void executeNamedParametersHQL(Session session)
        {
            String hql = "from Product where price > :price";
            Query query = session.createQuery(hql);
            query.setDouble("price",25.0);
            List results = query.list();
            displayProductsList(results);
        }
        
        public void executeObjectNamedParametersHQL(Session session)
        {
            String supplierHQL = "from Supplier where name='MegaInc'";
            Query supplierQuery = session.createQuery(supplierHQL);
            Supplier supplier = (Supplier) supplierQuery.list().get(0);
            
            String hql = "from Product as product where product.supplier=:supplier";
            Query query = session.createQuery(hql);
            query.setEntity("supplier",supplier);
            List results = query.list();
            displayProductsList(results);
        }          
        
        public void executePagingHQL(Session session,int start, int howMany)
        {
            Query query = session.createQuery("from Product");
            query.setFirstResult(start);
            query.setMaxResults(howMany);
            List results = query.list();
            System.out.println("List with "+results.size()+ " items");
            displayProductsList(results);
        }
        
        
        public void executeUniqueResultHQL(Session session)
        {
            String hql = "from Product where price>25.0";
            Query query = session.createQuery(hql);
            query.setMaxResults(1);
            Product product = (Product) query.uniqueResult();
            //test for null here if needed
            
            List results = new ArrayList();
            results.add(product);
            displayProductsList(results);
        }          
                
        public void executeOrderHQL(Session session)
        {
            String hql = "from Product p where p.price>25.0 order by p.price desc";
            Query query = session.createQuery(hql);
            List results = query.list();
            displayProductsList(results);
        }              

        public void executeOrderTwoPropertiesHQL(Session session)
        {
            String hql = "from Product p order by p.supplier.name asc, p.price asc";
            Query query = session.createQuery(hql);
            List results = query.list();
            displayProductsList(results);
        }         
        
        public void executeAssociationsHQL(Session session)
        {
            String hql = "select s.name, p.name, p.price from Product p inner join p.supplier as s";
            Query query = session.createQuery(hql);
            List results = query.list();
            displayObjectsList(results);
        }  
        
        public void executeAssociationObjectsHQL(Session session)
        {
            String hql = "from Product p inner join p.supplier as s";
            Query query = session.createQuery(hql);
            List results = query.list();
            displayObjectsList(results);
        }
        
        public void executeFetchAssociationsHQL(Session session)
        {
            String hql = "from Supplier s inner join fetch s.products as p";
            Query query = session.createQuery(hql);
            List results = query.list();
            displaySupplierList(results);
        }
        
        public void executeCountHQL(Session session)
        {
            String hql = "select min(product.price), max(product.price) from Product product";
            Query query = session.createQuery(hql);
            List results = query.list();
            displayObjectsList(results);
        }
        
        // QUERY DEFINITA NEL FILE DI CONFIGURAZIONE (RIMOSSA)
        /*
        public void executeNamedQuery(Session session)
        {
            
            Query query = session.getNamedQuery(
                    "com.hibernatebook.criteria.Product.HQLpricing");
            List results = query.list();
            displayObjectList(results);
            
            query = session.getNamedQuery(
            "com.hibernatebook.criteria.Product.SQLpricing");
            results = query.list();
            displayObjectList(results);            
        } */
        
        public void executeScalarSQL(Session session)
        {
            String sql = "select avg(product.Prezzo) as avgPrice from prodotti product";
            
            SQLQuery query = session.createSQLQuery(sql);
            query.addScalar("avgPrice",Hibernate.DOUBLE);
            List results = query.list();
            displayObjectList(results);
                        
        }         

        public void executeSelectSQL(Session session)
        {
            String sql = "select {supplier.*} from fornitori supplier";
            
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity("supplier", Supplier.class);
            List results = query.list();
            displaySupplierList(results);
                        
        }
        
        public void executeUpdateHQL(Session session)
        {
            String hql = "update Supplier set name = :newName where name = :name";
            Query query = session.createQuery(hql);
            query.setString("name","SuperCorp");
            query.setString("newName","MegaCorp");
            int rowCount = query.executeUpdate();
            System.out.println("Rows affected: " + rowCount);

            //See the results of the update
            query = session.createQuery("from Supplier");
            List results = query.list();            

            displaySupplierList(results);            
        }
        
        public void executeDeleteHQL(Session session)
        {
            String hql = "delete from Product where name = :name";
            Query query = session.createQuery(hql);
            query.setString("name","Mouse");
            int rowCount = query.executeUpdate();
            System.out.println("Rows affected: " + rowCount);

            //See the results of the update
            query = session.createQuery("from Product");
            List results = query.list();            

            displayProductsList(results);            
        }        
        
       
        // da testare:
        //**************************************************
        
        
        public void executeEqualsCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.eq("name","Mouse"));
            List results = crit.list();
            displayProductsList(results);
        }    

        public void executeNotEqualsCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.ne("name","Mouse"));
            List results = crit.list();
            displayProductsList(results);
        }
        
        public void executeLikePatternCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.like("name","Mou%"));
            List results = crit.list();
            displayProductsList(results);
        }       

        public void executeILikeMatchModeCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.ilike("name","browser", MatchMode.END));
            List results = crit.list();
            displayProductsList(results);
        }    
        
        public void executeNullCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.isNull("name"));
            List results = crit.list();
            displayProductsList(results);
        }      

        public void executeGreaterThanCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.gt("price",new Double(25.0)));
            List results = crit.list();
            displayProductsList(results);
        }  

        public void executeAndCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            crit.add(Restrictions.gt("price",new Double(25.0)));
            crit.add(Restrictions.like("name","K%"));
            List results = crit.list();
            displayProductsList(results);
        }
        
        public void executeOrCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            Criterion price = Restrictions.gt("price",new Double(25.0));
            Criterion name = Restrictions.like("name","Mou%");
            LogicalExpression orExp = Restrictions.or(price,name);
            crit.add(orExp);
            List results = crit.list();
            displayProductsList(results);
        }     
        
        public void executeAndOrCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            Criterion price = Restrictions.gt("price",new Double(25.0));
            Criterion name = Restrictions.like("name","Mou%");
            LogicalExpression orExp = Restrictions.or(price,name);
            crit.add(orExp);
            crit.add(Restrictions.ilike("description","blocks%"));
            List results = crit.list();
            displayProductsList(results);
        }
        
     
     
       public void executeGroupByCriteria(Session session)
        {
            Criteria crit = session.createCriteria(Product.class);
            ProjectionList projList = Projections.projectionList();
            projList.add(Projections.groupProperty("name"));
            projList.add(Projections.property("price"));
            crit.setProjection(projList);
            List results = crit.list();
            displayObjectsList(results);
        }     
            
     
        public void populate(Session session)
        {

            Supplier superCorp = new Supplier();
            superCorp.setName("SuperCorp");
            session.save(superCorp);
            System.out.println("ID inserimento: "+superCorp.getId());
            
            Supplier megaInc = new Supplier();
            megaInc.setName("MegaInc");
            session.save(megaInc); 
            System.out.println("ID inserimento: "+megaInc.getId());
            
            Product mouse = new Product("Mouse","Optical Wheel Mouse", 20.0);
            mouse.setSupplier(superCorp);
            superCorp.getProducts().add(mouse);
            
            Product mouse2 = new Product("Mouse","One Button Mouse", 22.0);
            mouse2.setSupplier(superCorp);
            superCorp.getProducts().add(mouse2);        
            
            Product keyboard = new Product("Keyboard", "101 Keys", 30.0);
            keyboard.setSupplier(megaInc);
            megaInc.getProducts().add(keyboard);

            Software webBrowser = new Software("Web Browser","Blocks Pop-ups", 75.0, "2.0");
            webBrowser.setSupplier(superCorp);
            superCorp.getProducts().add(webBrowser);

            Software email = new Software("Email","Blocks spam", 49.99, "4.1 RMX Edition");
            email.setSupplier(megaInc);
            megaInc.getProducts().add(email);
            
        }
        
        public void displayObjectList(List list)
        {
            Iterator iter = list.iterator();
            if (!iter.hasNext())
            {
                System.out.println("No objects to display.");
                return;
            }
            while (iter.hasNext())
            {
                Object obj = iter.next();
                System.out.println(obj.getClass().getName());
                System.out.println(obj);
            }
        }
        
        public void displayObjectsList(List list)
        {
            Iterator iter = list.iterator();
            if (!iter.hasNext())
            {
                System.out.println("No objects to display.");
                return;
            }
            while (iter.hasNext())
            {
                System.out.println("New object");
                Object[] obj = (Object[]) iter.next();
                for (int i=0;i<obj.length;i++)
                {
                    System.out.println(obj[i]);
                }
                
                
            }
        }       
       
        public void displayProductsList(List list)
        {
            Iterator iter = list.iterator();
            if (!iter.hasNext())
            {
                System.out.println("No products to display.");
                return;
            }
            int count=0;
            while (iter.hasNext())
            {
            	count++;
                Product product = (Product) iter.next();
                String msg = product.getSupplier().getName() + "\t";
                msg += product.getName() + "\t";
                msg += product.getPrice() + "\t";
                msg += product.getDescription();
                System.out.println(count+") "+msg);
            }
        }
        
        public void displaySoftwareList(List list)
        {
            Iterator iter = list.iterator();
            if (!iter.hasNext())
            {
                System.out.println("No software to display.");
                return;
            }        
            while (iter.hasNext())
            {
                Software software = (Software) iter.next();
                String msg = software.getSupplier().getName() + "\t";
                msg += software.getName() + "\t";
                msg += software.getPrice() + "\t";
                msg += software.getDescription()  + "\t";
                msg += software.getVersion();
                System.out.println(msg);
            }
        }    
        
        public void displaySupplierList(List list)
        {
            Iterator iter = list.iterator();
            if (!iter.hasNext())
            {
                System.out.println("No suppliers to display.");
                return;
            }        
            while (iter.hasNext())
            {
                Supplier supplier = (Supplier) iter.next();
                String msg = supplier.getName();
                System.out.println(msg);
            }
        }
        
        public static void main(String args[])
        {         
        	
            SessionFactory sessionFactory;
            sessionFactory=new Configuration().configure().buildSessionFactory();
            
           HQLExample example = new HQLExample();          
           Session session = sessionFactory.openSession();
          
           session.beginTransaction();
             
            example.populate(session);
            
           
            //
            session.getTransaction().commit();
           
            session.beginTransaction();
            
            
            //example.executeSimpleHQL(session); //OK
            //example.executeCommentedHQL(session); //OK
            //example.executeProjectionHQL(session); //OK
            //example.executeCriteriaForRestrictions(session);//OK
            //example.executeHQLForRestrictions(session);//OK
            //example.executeNamedParametersHQL(session);//OK
            //example.executeObjectNamedParametersHQL(session);//OK
            //example.executePagingHQL(session);//OK
            //example.executeUniqueResultHQL(session);//OK
            //example.executeOrderHQL(session);//OK
            //example.executeOrderTwoPropertiesHQL(session);//OK
            //example.executeAssociationsHQL(session);//OK
            //example.executeAssociationObjectsHQL(session);//OK Da migliorare output!!
            //example.executeFetchAssociationsHQL(session);//OK
            //example.executeCountHQL(session);//OK
            //example.executeScalarSQL(session);//OK
            //example.executeSelectSQL(session);//OK
            //example.executeUpdateHQL(session); //OK
            //example.executeDeleteHQL(session);//OK
            
            example.executePagingHQL(session,2,4);
            
            session.getTransaction().commit();
            session.close();
            
        }
}
