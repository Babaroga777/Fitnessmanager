package utilities;

import java.util.Random;

public class IdGenerator {
    public int generateId(){
        int random =  (new Random()).nextInt(9000) + 1000;
        return random;
    }
}
