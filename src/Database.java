import Model.KeyStorage;
import Model.Mitglied;
import utilities.IdGenerator;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Database {
    private ArrayList<Mitglied> stammDaten = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private IdGenerator idGenerator = new IdGenerator();
    private KeyStorage keyStorage = new KeyStorage();
    private Integer schlüsselNr = 0;

    public Database() {

    }

    public void neuesMitglied() {

        // Mitglied mitglied = new Mitglied();

        // System.out.println("m_aennlich oder w_eiblich?");

        // mitglied.setGeschlecht(scan.next());

        // if (mitglied.getGeschlecht().equals("m")) {
        //     mitglied.setTitel("Herr");
        // } else if (mitglied.getGeschlecht().equals("w")) {
        //     mitglied.setTitel("Frau");
        // } else {
        //     mitglied.setTitel("Diverse");
        // }

        // System.out.println("Geben sie den Vornamen ein");
        // mitglied.setVorname(scan.next());

        // System.out.println("Geben sie den Nachnamen ein");
        // mitglied.setNachname(scan.next());


        // System.out.println("Geben sie die Strasse ein");
        // mitglied.setStrasse(scan.next());

        // System.out.println("Geben sie die Postleitzahl ein");
        // mitglied.setPlz(scan.next());


        // System.out.println("Geben sie den Ort ein");
        // mitglied.setOrt(scan.next());

        // mitglied.setCheckin(true);

        // // mitglied.setID(mitglied.getIdPrefix() + idGenerator.generateId());

        // mitglied.setID("123");

        // keyStorage.setSchliessfaecher(mitglied.getID(), schlüsselNr);

        // mitglied.setSchluesselnr(keyStorage.getSchliessfaecher().get(mitglied.getID()));


        // Testing from here
        Mitglied mitglied = new Mitglied("Herr", "afsd", "lkfj", "wqlekr", "eorwo", "asödflk", "mqwe", true, 1, 0, "MI-", "123");
        Mitglied mitglied2 = new Mitglied("Herr", "afsd", "lkfj", "wqlekr", "eorwo", "asödflk", "mqwe", true, 1, 0, "MI-", "321");

        stammDaten.add(mitglied2);

        // Testing till here
        schlüsselNr++;

        stammDaten.add(mitglied);

    }

    public void getMitgliederListe() {

        stammDaten.forEach(System.out::println);
    }

    public void deleteMitglied() {
        System.out.println("Welches Mitglied soll aus der Liste entfernt werden");
        String userInput = scan.next();
        stammDaten.removeIf(mitglied -> mitglied.getID().equals(userInput));
        System.out.println("Mitglied wurde gelöscht");
    }
}


// testing end
