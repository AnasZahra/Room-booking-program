
/**
 * Die Klasse gibt die Uhrzeit aus 
 *
 * @author (Jandost & Anas)
 * @version (1)
 */
public class Uhrzeit {
    private int stunde ;
    private int minute ;

    /**
     * Konstruktor die den forgenden parameter erhaltet
     * @param stunde
     * @param minute
     */
    public Uhrzeit (int stunde, int minute){

        if ( stunde > 24 || stunde < 0 ){
            throw new IllegalArgumentException ( "\nFehler: " + "Ein Tag hat 24 stunden!! " );
        }

        if ( minute > 60 || minute < 0 ){
            throw new IllegalArgumentException ( "\nFehler: " + "Eine Stunde hat 60 minuten!! " );
        }

        this.stunde = stunde ;
        this.minute = minute ;
    }

    //Getter

    /**
     *
     * @return Minute wird gezeigt
     */
    public int getMinute() {
        return minute;
    }

    /**
     *
     * @return Stunde wird gezeigt
     */
    public int getStunde() {
        return stunde;
    }

    /**
     *
     * @return Stunde und minute werden gezeigt z.B.(10:45 Uhr)
     */
    public String toString(){
        return this.stunde + ":" + this.minute + " Uhr" ;
    }
}
