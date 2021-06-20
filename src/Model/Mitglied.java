package Model;

public class Mitglied extends Person {

    public boolean checkin;
    public int schluesselnr;
    public double umsatz;
    public String idPrefix = "MI-";
    public String ID;


    public Mitglied(String titel, String vorname, String nachname, String strasse, String plz, String ort, String geschlecht, boolean checkin, int schluesselnr, double umsatz, String idPrefix, String ID) {
        super(titel, vorname, nachname, strasse, plz, ort, geschlecht);
        this.checkin = checkin;
        this.schluesselnr = schluesselnr;
        this.umsatz = umsatz;
        this.idPrefix = idPrefix;
        this.ID = ID;
    }

    public Mitglied() {

    }

    public boolean isCheckin() {
        return checkin;
    }

    public void setCheckin(boolean checkin) {
        this.checkin = checkin;
    }

    public int getSchluesselnr() {
        return schluesselnr;
    }

    public void setSchluesselnr(int schluesselnr) {
        this.schluesselnr = schluesselnr;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
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
        return "Mitglied{" +
                "checkin=" + checkin +
                ", schluesselnr=" + schluesselnr +
                ", umsatz=" + umsatz +
                ", idPrefix='" + idPrefix + '\'' +
                ", ID='" + ID + '\'' +
                "} " + super.toString();
    }
}