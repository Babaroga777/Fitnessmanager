package Model;

public class Mitarbeiter extends Person{

    private String prefix = "MA";
    private String ID;
    private String maPasswort = "9999";

    public Mitarbeiter(String titel, String vorname, String nachname, String strasse, String plz, String ort, String geschlecht, String prefix, String ID, String maPasswort) {
        super(titel, vorname, nachname, strasse, plz, ort, geschlecht);
        this.prefix = prefix;
        this.ID = ID;
        this.maPasswort = maPasswort;
    }

    public Mitarbeiter() {

    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMaPasswort() {
        return maPasswort;
    }

    public void setMaPasswort(String maPasswort) {
        this.maPasswort = maPasswort;
    }


}
