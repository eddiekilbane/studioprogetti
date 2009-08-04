package scripting.db.inserimenti;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPictureToMySql {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileInputStream fis = null;
	    PreparedStatement ps = null;
		String pathFile="";
	    
		try {
		Class.forName("org.gjt.mm.mysql.Driver");
		 
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/databaseName", "root", "root");
	    String INSERT_PICTURE = "insert into MyPictures(id, name, photo) values (?, ?, ?)";

	    
	   
	      conn.setAutoCommit(false);
	      File file = new File(pathFile);
	     
			fis = new FileInputStream(file);
		 
	      ps = conn.prepareStatement(INSERT_PICTURE);
	      ps.setString(1, "001");
	      ps.setString(2, "name");
	      ps.setBinaryStream(3, fis, (int) file.length());
	      ps.executeUpdate();
	      conn.commit();
	      
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	   

	}

}
