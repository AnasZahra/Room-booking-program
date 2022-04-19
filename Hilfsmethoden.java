/**
 * Diese Hilfsmethode wird aufgeruft für Exeption zu pruefen 
 *
 * @author (Jandost & Anas)
 * @version (eine Versionsnummer oder ein Datum)
 */
public  class Hilfsmethoden {

   //--------------///////---//***-hilfsmethoden-***//---///////--------------//

    /**
     * diese methode prueft ob der name leer zeichen hat oder vorhanden ist
     * @param name
     */
    public static void eingabeUeberpruefen (String name){
        if (name == null || name.strip().isEmpty()){
            throw new IllegalArgumentException ("\nFehler: "+name+" darf nicht nicht leer sein");
        }
    }

    /**
     * diese methode prueft ob der Object vorhanden 
     * @param object
     */
    public static void objectUeberpruefen (Object object){
        if (object == null ){
            throw new IllegalArgumentException ("\nFehler: "+object+" darf nicht nicht leer sein");
        }
    }

    /**
     * diese methode prueft ob der Object vorhanden ist und gilt fuer drei objecte
     * @param object
     * @param object2
     * @param object3
     */
    public static void mehrereObjectUeberpruefen (Object object, Object object2, Object object3){
        if (object == null  || object2 == null || object3 == null ){
            throw new IllegalArgumentException ("\nFehler: "+object+" darf nicht nicht leer sein");
        }
    }

    /**
     * diese methode prueft ob die nummer kleiner gleich null ist
     * @param nummer
     */
    public static void nigativUeberpruefen (int nummer){
        if (nummer <= 0){
            throw new IllegalArgumentException ("\nKeine Nigative Zahlen sind erlaubt");

        }

    }

    /**
     * diese methode prueft ob eine nummer kleiner als null ist
     * @param nummer
     */
    public static void nigativUeberpruefenNull (int nummer){
        if (nummer < 0){
            throw new IllegalArgumentException ("\nKeine Nigative Zahlen sind erlaubt");

        }

    }
}
