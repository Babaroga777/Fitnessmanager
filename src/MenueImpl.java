import java.util.InputMismatchException;
import java.util.Scanner;

public class MenueImpl implements Menue {

    int menueOption;
    Scanner scan = new Scanner(System.in);
    LogicController controller = new LogicController();


    @Override
    public void showMenue() {


        System.out.println("Willkommen im Fitnessmanager");
        System.out.println("------------------------------");
        System.out.println("Bitte geben sie das Passwort ein");

        String passwort = scan.next();

        if (passwort.equals("9999")) {

            System.out.println("1. Neues Mitglied anlegen");
            System.out.println("2. Mitglied loeschen");
            System.out.println("3. Liste aller Mitglieder");
            System.out.println("4. Programm beenden");
            try {
                menueOption = scan.nextInt();
                switch (menueOption) {
                    case 1:
                        controller.neuesMitglied();
                        showMenue();
                        break;
                    case 2:
                        controller.deleteMitglied();
                        showMenue();
                        break;
                    case 3:
                        controller.getMitgliederListe();
                        showMenue();
                        break;
                    case 4:
                        System.out.println("Danke, fleißig warst");
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Bitte korrekte Option auswählen 1-7");
                        showMenue();
                }
            } catch (InputMismatchException e) {
                System.out.println("Bitte geben sie eine der genannten Optionen ein ---> keine Buchstaben");
            }
        } else {
            System.out.println("Passwort wurde falsch eingegebn > 1. Erneut eingeben < > 7. Programm beenden");
            if (scan.nextLine().equals("1")) {
                showMenue();
            } else if (scan.nextLine().equals("7")) {
                System.out.println("Programm wird auf wunsch des Users beendet");
                System.exit(1);
            } else {
                System.out.println("Falsche eingabe");
                showMenue();
            }
        }

    }
}

