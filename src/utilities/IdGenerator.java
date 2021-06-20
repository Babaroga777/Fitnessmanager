package utilities;

import java.util.Random;

public class IdGenerator {
    public int generateId(){
        int random =  (new Random()).nextInt(900000) + 100000;
        return random;
    }
}
