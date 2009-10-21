package modello;

public class ServizioEuroConvertitore {

	
	
	public double convertiLireInEuro(int lire){
		return lire/1936.27;
	}
	
	
	public int convertiEuroInLire(double euro){
		float p=(float)(euro*1936.27);
		return Math.round(p);
	}
	
}
