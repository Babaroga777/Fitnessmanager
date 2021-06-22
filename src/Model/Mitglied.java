package Model;

public class Mitglied extends Person {


    public int schluesselnr;
    public String idPrefix = "MI-";
    public String ID;


    public Mitglied(String titel, String vorname, String nachname, String strasse, String plz, String ort, String geschlecht, int schluesselnr, String idPrefix, String ID) {
        super(titel, vorname, nachname, strasse, plz, ort, geschlecht);

        this.schluesselnr = schluesselnr;
        this.idPrefix = idPrefix;
        this.ID = ID;
    }

    public Mitglied() {

    }


    public int getSchluesselnr() {
        return schluesselnr;
    }

    public void setSchluesselnr(int schluesselnr) {
        this.schluesselnr = schluesselnr;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIdPrefix() {
        return "MI-";
    }

    public void setIdPrefix(String idPrefix) {
        this.idPrefix = idPrefix;
    }

    @Override
    public String toString() {
        return  "*************************" + '\n' +
                "Mitglied" + '\n' +
                "-------------------------" + '\n' +
                "Schlüsselnr: " + schluesselnr + "   " +
                "ID: " + ID + '\n'
                + super.toString() + '\n';
    }
}