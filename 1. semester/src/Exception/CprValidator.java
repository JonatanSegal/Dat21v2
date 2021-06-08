package Exception;

import java.util.InputMismatchException;

public class CprValidator {
    public boolean validator(String cpr){
        if(cpr.length() !=10){
            throw new WrongCprException();
        }
        return true;
    }
}
