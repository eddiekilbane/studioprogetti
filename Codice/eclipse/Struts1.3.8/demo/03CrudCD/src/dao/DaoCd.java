package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import model.Cd;



public class DaoCd {

	/**
	 * @param args
	 */
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cd c = new Cd();
		
	}*/
	
	private String driver;
	private String url;
	private static Connection connessione;
	
	
	public DaoCd(String driver, String url) throws ClassNotFoundException, SQLException{
		super();
		this.driver = driver;
		this.url = url;
		Class.forName(this.driver);
		this.connessione= DriverManager.getConnection(this.url);
	}

	public DaoCd(String driver, String url, String user, String pw) throws ClassNotFoundException, SQLException{
		super();
		this.driver = driver;
		this.url = url;
		Class.forName(this.driver);
		this.connessione= DriverManager.getConnection(this.url,user,pw);
	}
	
	
	
	
	public Vector cercaPerTitolo(String titolo) throws SQLException{
		
		Vector v= new Vector();
	 	
		String query = "Select * from cd where titolo = ?";
		PreparedStatement cmdSelect = connessione.prepareStatement(query);
		cmdSelect.setString(1, titolo);
		ResultSet tabella = cmdSelect.executeQuery();
		
		
		while(tabella.next()){
  	    //1) per ogni riga del resultset devo creare un oggetto cd
		Cd riga = new Cd(tabella.getLong(1)
				        ,tabella.getString(2)
				        ,tabella.getString(3)
				        ,tabella.getDouble(4)
				        ,tabella.getString(5)
				        ,tabella.getString(6)
				        ,tabella.getInt(7)
				        ,tabella.getInt(8));
		
			
	    //2) aggiungo il nuovo cd al vector
		v.add(riga);
			
		}
		//connessione.close();
		return v;
	}
	
	
	public Vector <model.Cd> getCatalogoCd()throws SQLException{
		
		Vector <model.Cd> v= new Vector <model.Cd>();
	 	
		String query = "Select * from cd";
		PreparedStatement cmdSelect = connessione.prepareStatement(query);
		ResultSet tabella = cmdSelect.executeQuery();
		
		
		while(tabella.next()){
  	    //1) per ogni riga del resultset devo creare un oggetto cd
		Cd riga = new Cd(tabella.getLong(1)
				        ,tabella.getString(2)
				        ,tabella.getString(3)
				        ,tabella.getDouble(4)
				        ,tabella.getString(5)
				        ,tabella.getString(6)
				        ,tabella.getInt(7)
				        ,tabella.getInt(8));
		
			
	    //2) aggiungo il nuovo cd al vector
		v.add(riga);
			
		}
		//connessione.close();
		return v;
		
		
	}
	
	
	public  int inserisciCD(Cd c) throws SQLException {
		
		String query = "insert into cd (IdCD,ARTISTA,ETICHETTA,PREZZO,TITOLO,NAZIONE,ANNO,QUANTITA)"+
		"values (?,?,?,?,?,?,?,?)";
		
		
		PreparedStatement cmdInsert = connessione.prepareStatement(query);
		cmdInsert.setLong(1, c.getPrimary());
		cmdInsert.setString(2, c.getArtist());
		cmdInsert.setString(3, c.getCompany());
		cmdInsert.setDouble(4, c.getPrice());
		cmdInsert.setString(5, c.getTitle());
		cmdInsert.setString(6, c.getCountry());
		cmdInsert.setInt(7, c.getYear());
		cmdInsert.setInt(8, c.getQuantity());
		
		int insert = cmdInsert.executeUpdate();
		
		return insert;
		//connessione.close();
	}
	
	public static void eliminaCD(Cd c) throws SQLException {
		
		/*
		String query = "Delete cd where PrimaryKey=? and ForeignKey=? and ARTIST=? and COMPANY=?"+
		" and COUNTRY=? and PRICE=? and TITLE=? and YEAR=?";
		*/
		
		String query = "Delete FROM cd where idCd= ?";
		
		PreparedStatement cmdDel = connessione.prepareStatement(query);
		cmdDel.setLong(1, c.getPrimary());
		/*
		cmdDel.setInt(2, c.getForeign());
		cmdDel.setString(3, c.getArtist());
		cmdDel.setString(4, c.getCompany());
		cmdDel.setString(5, c.getCountry());
		cmdDel.setInt(6, c.getPrice());
		cmdDel.setString(7, c.getTitle());
		cmdDel.setInt(8, c.getYear());
		*/
		int delete = cmdDel.executeUpdate();
		
		//connessione.close();

	}
	
	public static void chiudiConn() throws SQLException{
		connessione.close();
	}	

}
