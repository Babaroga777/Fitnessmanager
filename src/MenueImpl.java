import Model.Mitarbeiter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenueImpl implements Menue {

    int menueOption;
    Scanner scan = new Scanner(System.in);
    LogicController controller = new LogicController();
    Mitarbeiter ma = new Mitarbeiter("Herr", "Max", "Muster", "Mustergasse 14", "6020", "Innsbruck", "m", "MA-", "1234", "9999");

    @Override
    public void checkUserPassword() {

        System.out.println("**********************************");
        System.out.println("Willkommen im Fitnesszentermanager");
        System.out.println("----------------------------------");
        System.out.println("Bitte geben sie das Passwort ein");
        String passwort = scan.nextLine();


        if (passwort.equals(ma.getMaPasswort())) {
            showMenue();
        } else {
            System.out.println("Passwort wurde falsch eingegebn > 1. Erneut eingeben < > 7. Programm beenden");
            String userOption = scan.nextLine();
            if (userOption.equals("1")) {
                checkUserPassword();
            } else if (userOption.equals("7")) {
                System.out.println("Programm wird auf wunsch des Users beendet");
                System.exit(1);
            } else {
                System.out.println("Falsche eingabe");
                checkUserPassword();
            }
        }
    }

    @Override
    public void showMenue() {

        System.out.println("-------------------------");
        System.out.println("1. Neues Mitglied anlegen");
        System.out.println("2. Mitglied loeschen");
        System.out.println("3. Liste aller Mitglieder");
        System.out.println("4. Programm beenden");
        System.out.println("-------------------------");
        System.out.print("Bitte 1 bis 4 eingeben: ");
        try {
            menueOption = scan.nextInt();
            switch (menueOption) {
                case 1:
                    controller.neuesMitglied();
                    showMenue();
                    break;
                case 2:
                    controller.mitgliedLoeschen();
                    showMenue();
                    break;
                case 3:
                    controller.getMitgliederListe();
                    showMenue();
                    break;
                case 4:
                    System.out.println("");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Bitte korrekte Option auswählen 1-4");
                    showMenue();
            }
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben sie eine der genannten Optionen ein ---> keine Buchstaben, das Programm wird beendet");
        }
    }
}


