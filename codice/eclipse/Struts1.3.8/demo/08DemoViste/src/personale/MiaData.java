
package personale;

import java.util.Date;


public class MiaData
{

       //dati

       private int giorno;
       private int mese;
       private int anno;

       
       

       // costruttori

       public MiaData ()
       {

       	    Date d=new Date ();
       	    giorno=d.getDate();
            mese=d.getMonth()+1;
            anno=1900+d.getYear();

       }

       public MiaData (int g,int mese , int anno)throws Exception
       {
              
             if (g<1) throw new Exception("il giorno è inferiore a 1");
             
             setGiorno(giorno);
             setMese (mese);
             setAnno (anno);
       }



       // metodi get e set per i campi
       
       public int getGiorno ()
       {
       	      return giorno;
       }
       
       public void setGiorno (int giorno)
       {
           if( ( giorno > 0) && (giorno < 32 ) )
           {
           	this.giorno=giorno;
           }
           else
           {
           	this.giorno=1;
           }
       }
       


       public int getMese ()
       {
       	      return mese;
       	}

       public void setMese (int mese)
       {
              if ( (mese > 0 ) && (mese < 13 ))
              {
              	 this.mese=mese;
              }
              else
              {
              	  this.mese=1;
              }
       }
 
 
       
       public int getAnno ()
       {
       	      return anno;
       }

       public void setAnno (int anno)
       {
             if ( (anno > 1000) && (anno < 3000) )
             {
                  this.anno=anno;
             }
             else
             {
             	  this.anno=2000;
             	  
             }
       }
       
       
     

       
       public int confrontaDate (MiaData d)
       {
       	      int compara=1;
       	      if( d.giornoAssoluto() > this.giornoAssoluto())
       	      {
       	          compara= -1;
       	      }
              if( d.giornoAssoluto() == this.giornoAssoluto())
       	      {
       	          compara= 0;
       	      }
       	      return compara;
       } 
       
       
       //doppione di compareTo che rende MiaData Comparable
       /*
       public int compareTo (MiaData d)
       {      
              return confrontaDate(d);
       }
       */
       
       
       public int differenzaDate (MiaData d)
       {

       	      return (d.giornoAssoluto() - this.giornoAssoluto());

       }
       
       
       
       public boolean equals (MiaData d)
       {
       	      return (d.giornoAssoluto() == this.giornoAssoluto());
       }
       
      
       

       public String toString()
       {
       	      return ( giorno + "/" + mese + "/" + anno );
       }
       
       
       
       
       
       // METODI PRIVATE
       // AD UTILITA' INTERNA (SONO USATI PIU VOLTE DA ALTRI METODI)

       private int giornoAssoluto ()
       {
       	      // a partire dall' anno mille
       	      
       	      int assoluto=0;

              assoluto=assoluto + 365*(anno)+ giorno;
              
              for (int i=1 ; i <=mese ;i++)
              {
              	 if((i==4)|| (i==6) || (i==9) || (i==11) )
              	 {
              	 	assoluto = assoluto + 30;
              	 }
                 
                 if ( i==2)
                 {
                 	assoluto=assoluto + 28;
                 }
                 
                 if ( (i==1) || (i==3) || (i==5) || (i==7) || (i==8) || (i==10) || (i==12) )
                 {
                 	assoluto=assoluto+ 31;
                 }
                }


       	      return assoluto;
       }
      
}



