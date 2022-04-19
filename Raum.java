/**
 * Klasse Raum gibt alle Raeume aus, die von Miarbeitern reserviert werden 
 *
 * @author (Jandost & Anas)
 * @version (1)
 */


public class Raum
{
    private int geb ;
    private int etage ;
    private int raum ;
    private Reservierung[] reservierung;
    private int index = 0;

    public Raum (int geb , int etage , int raum ){
        Hilfsmethoden.nigativUeberpruefenNull(geb);
        Hilfsmethoden.nigativUeberpruefenNull(etage);
        Hilfsmethoden.nigativUeberpruefenNull(raum);
        this.geb =  geb ;
        this.etage = etage ;
        this.raum = raum;
        reservierung = new Reservierung[10];
    }

    /**
     *
     * @return gibt aus Das ganze Informationen ueber die Raum
     */

    public String toString(){
      String alleResvierungen = "\n";

      for (int i = 0; i < this.reservierung.length; i++ ){
            if (reservierung[i] != null){
                alleResvierungen += reservierung[i].toString();
            }else {

            }
      }

      //andere Möglichkeit
    
      /**
       *  for (Reservierung res : reservierung){
       *        if ( res != null){
       *        alleResvierungen += res.toString()+"\n";
       *      }
       *  }
      */
        return "Raum" + this.geb +"-"+this.etage +"."+ this.raum + alleResvierungen;
    }

    /**
     * wird ein Reservirung eingelegt / geschpichert
     * @param reservierung
     */

    public void addReservierung( Reservierung reservierung){
        Hilfsmethoden.objectUeberpruefen(reservierung);
        this.reservierung [index] = reservierung;
        index ++;
    }

    /**
     *
     * @return Etage nummer wird gegeben
     */
    public int getEtage() {
        return etage;
    }

    /**
     *
     * @param index
     * @return wird die Reservirung an den index stele zuruckt gegeben
     */
    public Reservierung getReservierung(int index) {
        Hilfsmethoden.nigativUeberpruefenNull(index);
        return reservierung[index];
    }

    /**
     *
     * @return raum nummer wird gezeigt
     */
    public int getRaum() {
        return raum;
    }

    /**
     *
     * @return Gebeude nummer wird gezeigt
     */
    public int getGeb() {
        return geb;
    }

}
