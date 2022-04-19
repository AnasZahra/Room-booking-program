/**
 * Dialog klasse probiert verschiedene eingaben um das Programm zu testen
 *
 * @author (Jandost & Anas)
 * @version (1)
 */
public class Dialog {
    public static void main(String[] args) {
        Uhrzeit beginn = new Uhrzeit(10,15);
        Uhrzeit ende   = new Uhrzeit(15,30);

        Uhrzeit beginn2 = new Uhrzeit(13,15);
        Uhrzeit ende2   = new Uhrzeit(17,45);

        Mitarbeiter Mark     = new Mitarbeiter("Max","Mustermann","max@htwsaar.com");
        Mitarbeiter John     = new Mitarbeiter("John","Doe","John@htwsaar.com");
        Mitarbeiter Eren     = new Mitarbeiter("Eren","Jaeger","Eren@htwsaar.com");
        Mitarbeiter johan    = new Mitarbeiter("johan","liebert","johan@htwsaar.com");
        Mitarbeiter ragnar   = new Mitarbeiter("ragnar ","lothbrok","ragnar@htwsaar.com");
        Mitarbeiter Averroes = new Mitarbeiter("Averroes ","abnRshd","Averroes@htwsaar.com");

        System.out.println("\nMitarbeiter Liste:" + "\n" );
        System.out.println(Mark);
        System.out.println(John);
        System.out.println(Eren);
        System.out.println(johan);
        System.out.println(ragnar);
        System.out.println(Averroes + "\n\n\n\n");



        Raum t1 = new Raum(18,0,1);
        Raum t2 = new Raum(11,3,5);
        Raum t3 = new Raum(33,4,2);
        Raum t4 = new Raum(4,2,9);
        Raum t5 = new Raum(9,6,9);
        Raum t6 = new Raum(1,1,1);



        Mark.reserviere(t1, beginn, ende2, "vip");
        John.reserviere(t3, beginn2, ende, "WI");
        Eren.reserviere(t4, beginn2, ende2, "PI");
        johan.reserviere(t4, beginn, ende, "KI");
        ragnar.reserviere(t5, beginn, ende, "007");
        Averroes.reserviere(t6, beginn2, ende, "Al-Andalus");


        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);

    }
}
