
package personale;


public class Impiegato
{
       // attributi

       private String nome;
       private double stipendio;
       private Data assunzione;

       //costruttori
       
       public Impiegato(){}
       
       public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAssunzione(Data assunzione) {
		this.assunzione = assunzione;
	}

	public Impiegato(String nome,double stipendio, Data assunzione)
       {
       	      this.nome=nome;
       	      this.stipendio=stipendio;
       	      this.assunzione=assunzione;
       }
       
       // metodi
       
       //get
       public String getNome()
       {
       	      return nome;
       }
       
       public double getStipendio()
       {
       	      return stipendio;
       }

       public Data getAssunzione()
       {
       	      return assunzione;
       }



// non ci sono set perche' i campi nome e assunzione non hanno senso
// in scrittura. per cui vengono impostati solo dal costruttore


// Unica eccezione il campo Stipendio. Oltre al set c'e' un metodo che
// lo incrementa e uno che lo decrementa in percentuale


       public void incrementaStipendio(double p)
       {
       	      stipendio=stipendio + p * (stipendio/100);
       }
       
       public void decrementaStipendio(double p)
       {
       	      stipendio=stipendio - p * (stipendio/100);
       }
       
       public void setStipendio(double nuovostipendio)
       {
       	      stipendio=nuovostipendio;
       }
       

       public String toString()
       {
       	      return ( nome+", "+stipendio+", "+assunzione.toString());
       }

}




