package Model;

public class Person {
    private String titel;
    private String vorname;
    private String nachname;
    private String strasse;
    private String plz;
    private String ort;
    private String geschlecht;

    public Person(String titel, String vorname, String nachname, String strasse, String plz, String ort, String geschlecht) {
        this.titel = titel;
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
        this.geschlecht = geschlecht;
    }

    public Person() {

    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    @Override
    public String toString() {
        return "titel='" + titel + '\n' +
                ", vorname='" + vorname + '\n' +
                ", nachname='" + nachname + '\n' +
                ", strasse='" + strasse + '\n' +
                ", plz='" + plz + '\n' +
                ", ort='" + ort + '\n' +
                ", geschlecht='" + geschlecht + '\n';
    }
}
