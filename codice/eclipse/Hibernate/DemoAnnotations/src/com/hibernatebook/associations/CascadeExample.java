package com.hibernatebook.associations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class CascadeExample {
    private static SessionFactory factory = 
        new AnnotationConfiguration().configure().buildSessionFactory();
    
    public static void main(String... args) {
        Session session = factory.openSession();
        session.beginTransaction();

        Email email = new Email("Email title");
        Message message = new Message("Message content");
        email.setMessage(message);
        message.setEmail(email);
        
        Integer emailId = (Integer)session.save(email);

        session.getTransaction().commit();
        session.close();
        
        session = factory.openSession();
        session.beginTransaction();
        
        email = (Email)session.get(Email.class,(java.io.Serializable)emailId);
        System.out.println("Email message: " + email.getMessage());

        session.getTransaction().commit();
        session.close();
    }
}
