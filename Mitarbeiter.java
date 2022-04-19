/**
 * Klasse Mitarbeiter gibt die Mitarbeitern aus, die ein Raum reservierung und ist von klasse Peron vererben
 *
 * @author (Jandost & Anas)
 * @version (1)
 */
public class Mitarbeiter extends Person {
    private String email;

    /**
     * Konstruktor die den forgenden parameter erhelt
     * @param vorname
     * @param nachname
     * @param email
     */
    public Mitarbeiter(String vorname, String nachname, String email) {
        super(vorname, nachname);
        this.email = email;
    }

    /**
     *
     * @return E-mail wird gezeigt
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @return gibt Das ganze Informationen ueber der Mitarbeiter aus 
     */

    public String toString() {
        return super.toString() + "\t(" + this.email + ")";
    }

    /**
     * die Methode reserviert das folgenden @param zum Raum
     * @param raum
     * @param beginn
     * @param ende
     * @param bemerkung
     */
    public void reserviere(Raum raum, Uhrzeit beginn, Uhrzeit ende, String bemerkung) {

        Hilfsmethoden.mehrereObjectUeberpruefen(raum, beginn, ende);

        Reservierung res = new Reservierung(beginn, ende);
        res.setBemerkung(bemerkung);
        res.setMitarbeiter(this);
        res.setRaum(raum);
        raum.addReservierung(res);
    }
}
