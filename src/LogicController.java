import Model.KeyStorage;
import Model.Mitarbeiter;
import Model.Mitglied;
import utilities.IdGenerator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class LogicController {
    private ArrayList<Mitglied> stammDaten = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private IdGenerator idGenerator = new IdGenerator();
    private KeyStorage keyStorage = new KeyStorage();
    private Integer schlüsselNr = 0;

    public LogicController() {

    }

    public void neuesMitglied() {

        Mitglied mitglied = new Mitglied();

        System.out.println("m_aennlich oder w_eiblich?");

        mitglied.setGeschlecht(scan.next());

        if (mitglied.getGeschlecht().equals("m")) {
            mitglied.setTitel("Herr");
        } else if (mitglied.getGeschlecht().equals("w")) {
            mitglied.setTitel("Frau");
        } else {
            System.out.println("Bitte geben sie nur >m< oder >w< eingeben");
            neuesMitglied();
        }

        System.out.println("Geben sie den Vornamen ein");
        mitglied.setVorname(scan.next());

        System.out.println("Geben sie den Nachnamen ein");
        mitglied.setNachname(scan.next());


        System.out.println("Geben sie die Strasse ein");
        mitglied.setStrasse(scan.next());

        System.out.println("Geben sie die Postleitzahl ein");
        mitglied.setPlz(scan.next());


        System.out.println("Geben sie den Ort ein");
        mitglied.setOrt(scan.next());


        mitglied.setID(mitglied.getIdPrefix() + idGenerator.generateId());

        keyStorage.setSchliessfaecher(mitglied.getID(), schlüsselNr);

        mitglied.setSchluesselnr(keyStorage.getSchliessfaecher().get(mitglied.getID()));

        schlüsselNr++;

        stammDaten.add(mitglied);

    }

    public void getMitgliederListe() {
        if(!stammDaten.isEmpty()) {
            stammDaten.forEach(System.out::println);
        } else {
            System.out.println("Keine Mitglieder in der Datenbank");
        }
    }

    public void deleteMitglied() {
        System.out.println("Welches Mitglied soll aus der Liste entfernt werden");
        String userInput = scan.next();
        for (Iterator<Mitglied> iterator = stammDaten.iterator(); iterator.hasNext(); ) {
            Mitglied mitglied = iterator.next();
            if (mitglied.getID().equals("MI-" + userInput)) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
                System.out.println("Mitglied wurde gelöscht");
            } else {
                System.out.println("Kein Mitglied mit der eingegebenen ID gefunden, bitte eingabe überprüfen!");
            }
        }
    }

    public void createMA() {
        Mitarbeiter ma = new Mitarbeiter("Herr", "Aleksandar", "Prekodravac", "Schlossergasse 14", "6060", "Hall in Tirol", "m", "MA-", "1234", "9999");
    }

}


