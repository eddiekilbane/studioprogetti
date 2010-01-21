package package1;

import junit.framework.TestCase;

public class ClasseDaTestareTest extends TestCase {

	ClasseDaTestare daTestare;
	ClasseDaTestare daTestare2;
	
	protected void setUp() throws Exception {
		
		daTestare= new ClasseDaTestare("Stefano",100,2000.0);
		daTestare2= new ClasseDaTestare("Stefano",100,2000.0);
	}

	protected void tearDown() throws Exception {
		daTestare=null;
		daTestare2=null;
	}

	public void testHashCode() {
		
		ClasseDaTestare diverso = new ClasseDaTestare("Stefano",101,200.0);
		if (daTestare.hashCode()!=daTestare2.hashCode()){
			fail("Hash code devono essere uguali");
		}
		if (diverso.hashCode()!=daTestare2.hashCode()){
			fail("Hash code devono essere diversi per dati diversi");
		}
		if (diverso.hashCode()!=daTestare2.hashCode()){
			fail("Hash code devono essere diversi per dati diversi");
		}
		
		
	}
	
/*
	public void testGetUnCampoString() {
		fail("Not yet implemented");
	}

	public void testSetUnCampoString() {
		fail("Not yet implemented");
	}

	public void testGetUnCampoIntero() {
		fail("Not yet implemented");
	}

	public void testSetUnCampoIntero() {
		fail("Not yet implemented");
	}

	public void testGetUnCampoDouble() {
		
		assertTrue(daTestare.getUnCampoDouble()==200.0);
		fail("Not yet implemented");
	}

	public void testSetUnCampoDouble() {
		fail("Not yet implemented");
	}

	public void testIncrementaIntero() {
		fail("Not yet implemented");
	}

	public void testEqualsObject() {
		fail("Not yet implemented");
	}

*/
	
	public void testDividiInteroPer(){
		try{
		daTestare.dividiInteroPer(5);
		fail("Test fallito perche' non ha lanciato l'eccezione");
		}
		catch (Exception ecc){
			
			assertEquals("Divisione per zero", ecc.getMessage());
		}
	}
}