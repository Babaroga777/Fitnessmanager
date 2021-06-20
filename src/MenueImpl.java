import java.util.InputMismatchException;
import java.util.Scanner;

public class MenueImpl implements Menue {

    int menueOption;
    Scanner scan = new Scanner(System.in);
    Database db = new Database();

    @Override
    public void showMenue() {

        System.out.println("1. Neues Mitglied anlegen");
        System.out.println("2. Mitglied loeschen");
        System.out.println("3. Einchecken Mitglied");
        System.out.println("4. Mitglied auschecken");
        System.out.println("5. Shop");
        System.out.println("6. Liste aller Mitglieder");
        System.out.println("7. Liste eingecheckter Mitglieder");
        System.out.println("8. Programm beenden und Heim fahren");
        try {
            menueOption = scan.nextInt();
            switch (menueOption) {
                case 1:
                    db.neuesMitglied();
                    showMenue();
                    break;
                case 2:
                     db.deleteMitglied();
                     showMenue();
                    break;
                case 3:
                    // db.einchecken();
                    break;
                case 4:
                    // db.auschecken();
                    break;
                case 5:
                    // db.buchenUmsatz();
                    break;
                case 6:
                    db.getMitgliederListe();
                    showMenue();
                    break;
                case 7:
                    //  db.eingecheckteMitglieder();
                    break;
                case 8:
                    System.out.println("Danke, fleißig warst");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Bitte korrekte Option auswählen 1-8... du faggot");
                    showMenue();
            }
        } catch (InputMismatchException e) {
            System.out.println("Bitte geben sie eine der genannten Optionen ein ---> keine Buchstaben");
            showMenue();
        }

    }
}

