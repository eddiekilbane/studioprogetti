package test;

import dao.*;
import model.*;

public class TestDaoUtente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
				DaoUtente dao = new DaoUtente();
				Utente ris =dao.login("emilio", "butragueno");
				Utente ris2 =dao.login("attilio", "attilio");
				System.out.println(ris.getUserID());
				System.out.println(ris2.getUserID());
		}
		catch (Exception ecc){
			System.out.println(ecc);
		}
		
	}

}
