package test;

import java.sql.*;



public class EsempioMySql {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			
			
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

			
//			Display URL and connection information
			System.out.println("URL: " + url);
			System.out.println("Connection: " + con);

//			Get a Statement object
			Statement stmt = con.createStatement();
			String sql ="select * from Utente";
			ResultSet tabella =stmt.executeQuery(sql);
			
			
			
			while (tabella.next()){
				
				System.out.print( tabella.getString(1)+"\t");
				System.out.println( tabella.getString(2));
			}
			
			stmt.close();
			con.close();
			
		}
		
		catch (ClassNotFoundException eccezione){
			
			
			System.out.print("la classe non e' presente nel classpath" +eccezione.getMessage());
		}
		
		
		
		catch (Exception eccezione){
			
			
			System.out.print(eccezione.getMessage());
		}




		
		
		
		
		
		
		
		
		
		
	}

}
