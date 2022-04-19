
/**
 * Klasse Person gibt eine Name und Vorname aus und es können andere klassen davon erzeugt z.B. Mitarbeiter oder Chef
 *
 * @author (Jandost & Anas)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Person
{
    private String vorname ;
    private String nachname ;

    public Person(String vorname , String nachname){

        Hilfsmethoden.eingabeUeberpruefen(vorname);
        Hilfsmethoden.eingabeUeberpruefen(nachname);
        this.vorname = vorname ;
        this.nachname = nachname ;

    }

    /**
     *
     * @return nachname wird gezeigt
     */

    public String getNachname() {
        return nachname;
    }

    /**
     *
     * @return vorname wird gezeigt
     */
    public String getVorname() {
        return vorname;
    }

    /**
     *
     * @param nachname
     * @exeption null und empty space werden überprüft
     */
    public void setNachname(String nachname) {
        Hilfsmethoden.eingabeUeberpruefen(nachname);
        this.nachname = nachname;
    }

    /**
     *
     * @return gibt Das ganze Informationen ueber die Person aus 
     */
    public String toString(){
        return vorname +" "+ nachname ;
    }
}