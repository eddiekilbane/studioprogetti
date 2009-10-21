
package personale;

import java.util.*;

public class MappaImpiegato {
	
	
	public static Map dati;
	
	
	public static void creaDati(){
		
	try{
		dati= new HashMap();
		dati.put("01",new personale.Impiegato("Stefano",1000.0,new personale.Data(20,2,1992)) );
		dati.put("02",new personale.Impiegato("Filippo",1500.0,new personale.Data(21,9,1991)) );
		dati.put("03",new personale.Impiegato("Antonio",2000.0,new personale.Data(1,7,1996)) );		
		dati.put("04",new personale.Impiegato("Carlo",1650.0,new personale.Data(6,12,1995)) );
		dati.put("05",new personale.Impiegato("Matteo",1900.0,new personale.Data(19,4,1992)) );
		dati.put("06",new personale.Impiegato("Giovanni",1200.0,new personale.Data(15,8,1992)) );
		dati.put("07",new personale.Impiegato("Massimiliano",3000.0,new personale.Data(12,5,1993)) );
		dati.put("08",new personale.Impiegato("Alberto",2300.0,new personale.Data(5,8,1991)) );
		dati.put("09",new personale.Impiegato("Luca",1000.0,new personale.Data(25,6,1992)) );
		dati.put("10",new personale.Impiegato("Ernesto",1000.0,new personale.Data(30,5,1995)) );
		dati.put("11",new personale.Impiegato("Maria",1700.0,new personale.Data(2,11,1993)) );
		dati.put("12",new personale.Impiegato("Grazia",1800.0,new personale.Data(23,10,1996)) );
		dati.put("13",new personale.Impiegato("Romina",1500.0,new personale.Data(16,7,1992)) );
	}	
	catch (Exception e){}
		
	
	}
		
}