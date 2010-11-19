package package1;

public class ClasseDaTestare {

	private String unCampoString;
	private int unCampoIntero;
	private double unCampoDouble;
	
	
	public ClasseDaTestare(String unCampoString, int unCampoIntero,
			double unCampoDouble) {
		super();
		this.unCampoString = unCampoString;
		this.unCampoIntero = unCampoIntero;
		this.unCampoDouble = unCampoDouble;
	}


	public String getUnCampoString() {
		return unCampoString;
	}


	public void setUnCampoString(String unCampoString) {
		this.unCampoString = unCampoString;
	}


	public int getUnCampoIntero() {
		return unCampoIntero;
	}


	public void setUnCampoIntero(int unCampoIntero) {
		this.unCampoIntero = unCampoIntero;
	}


	public double getUnCampoDouble() {
		return unCampoDouble;
	}


	public void setUnCampoDouble(double unCampoDouble) {
		this.unCampoDouble = unCampoDouble;
	}


	public void incrementaIntero (){
		this.unCampoIntero++;
	}


	@Override
	
	public int hashCode() {
		
		int result =("**"+this.unCampoIntero+"*"+this.unCampoIntero+"*"+unCampoString).hashCode();
		return result;
	}


	@Override
	
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}

	
	public double dividiInteroPer (int divisore) throws Exception{
		if (divisore==1) throw new Exception("Divisione per zero");
		return (double)this.unCampoIntero/divisore;
	}

	

}