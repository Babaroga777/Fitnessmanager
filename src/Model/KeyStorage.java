package Model;
import java.util.HashMap;

public class KeyStorage {


    HashMap<String, Integer> schliessfaecher = new HashMap<String, Integer>();


    public KeyStorage() {
    }

    public HashMap<String, Integer> getSchliessfaecher() {
        return schliessfaecher;
    }

    public void setSchliessfaecher(String key, Integer schlüsselNummer) {
        schliessfaecher.put(key,schlüsselNummer);
    }

    @Override
    public String toString() {
        return "KeyStorage{" +
                "schliessfaecher=" + schliessfaecher +
                '}';
    }
}
