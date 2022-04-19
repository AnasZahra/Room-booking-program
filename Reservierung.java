
/**
 * Klasse Reservierung gibt alle Reservierung Daten und organisiert das beginn und ende eine Meeting
 *
 * @author (Jandost & Anas)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Reservierung {
    private String bemerkung;
    private Uhrzeit beginn;
    private Uhrzeit ende;
    private Raum raum;
    private Mitarbeiter mitarbeiter;

    public Reservierung(Uhrzeit beginn, Uhrzeit ende) {
       Hilfsmethoden.objectUeberpruefen(beginn);
       Hilfsmethoden.objectUeberpruefen(ende);
       if (beginn.getStunde() > ende.getStunde()){
               throw new IllegalArgumentException
                       ("Der Beginn der Uhrzeit muss kleiner als das Ende der Uhrzeit!! ");
       } else if (beginn.getStunde() == ende.getStunde() ) {
           if (beginn.getMinute() >= ende.getMinute()){
               throw new IllegalArgumentException
                       ("Der Beginn der Uhrzeit muss kleiner als das Ende der Uhrzeit!! ");
           }
       }
        this.beginn = beginn;
        this.ende = ende;
    }

    /**
     *  wird ein bemerkung gezeigt
     * @param bemerkung
     */
    public void setBemerkung(String bemerkung) {
        Hilfsmethoden.eingabeUeberpruefen(bemerkung);
        this.bemerkung = bemerkung;
    }

    /**
     *  wird ein Mitarbeter gezeigt
     * @param mitarbeiter
     */
    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        Hilfsmethoden.objectUeberpruefen(mitarbeiter);
        this.mitarbeiter = mitarbeiter;
    }

    /**
     * wird ein Raum gelegt
     * @param raum
     */
    public void setRaum(Raum raum) {
        Hilfsmethoden.objectUeberpruefen(mitarbeiter);
        this.raum = raum;
    }

    /**
     *
     * @return gibt aus Das ganze Informationen ueber die Reservierung als eine Zeichenkette
     */
    public String toString() {
        return " gebucht von " + mitarbeiter.getVorname()+ " " +mitarbeiter.getNachname() + " (" + mitarbeiter.getEmail() + ") "
                + " von " + beginn +  " bis " + ende + " für " + bemerkung + "\n";
    }
}
