package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import model.Utente;

public class DaoUtente {

	
	public Utente login (String userId, String password)throws ClassNotFoundException, 
	SQLException,IllegalAccessException,InstantiationException{
		
		Utente loggato;
			
//			Register the JDBC driver for MySQL.
			Class.forName("com.mysql.jdbc.Driver").newInstance();


//			Define URL of database server for
//			 database named mysql on the localhost
//			 with the default port number 3306.
			String url ="jdbc:mysql://localhost:3306/blogTerraFirma";
			
//			Get a connection to the database for a
//			 user named root with a blank password.
//			 This user is the default administrator
//			 having full privileges to do anything.
			Connection con = DriverManager.getConnection(url,"root", "stefano");

			
//			
//			Get a Statement object
			//String sql =;
			PreparedStatement prepared = con.prepareStatement("select * from Utente where userid=? AND password=? ");
			prepared.setString(1,userId);
			prepared.setString(2,password);
			
			//Statement prepared = con.createStatement();
			ResultSet tabella =prepared.executeQuery();
			
			
			
			if (tabella.next()){
				
				int id=tabella.getInt(1);
				String user= tabella.getString(2);
				String pw= tabella.getString(3);
				String nome= tabella.getString(4);
				String cognome= tabella.getString(5);
				String telefono= tabella.getString(6);
				String email= tabella.getString(7);
				
				loggato =  new Utente(id,  user,  pw, nome, cognome,  telefono,  email);
								
			}
			else {
				loggato= new Utente(0,"NonValido","","","","","");
				
			}
			
			con.close();
			
			return loggato;
			
		}
		
	
	
}
