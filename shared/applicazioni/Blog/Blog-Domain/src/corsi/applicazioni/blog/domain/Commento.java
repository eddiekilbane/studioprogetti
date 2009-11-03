package corsi.applicazioni.blog.domain;

import java.util.List;

public class Commento {

	private Long idCommento;
	private String testo;
	private String Utente;
	private double votoMedio;
	private List <Voto> voti;
	private Articolo articoloRiferimento;
	
	
}
