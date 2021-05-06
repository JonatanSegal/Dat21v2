package Exception;

import java.util.InputMismatchException;

public class PasswordValidator {
    public boolean isValidPassword(String password){
        if(!isStringValid(password) && !isLengthGood(password)){
            throw new InputMismatchException();
        }
        return true;
    }

    private boolean isStringValid(String s){
        String a = ".*[0-9].*";
        String b = ".*[A-Z].*";

        return s.matches(a) && s.matches(b);
    }

    private boolean isLengthGood(String s){
        return s.length() >= 6 && s.length() <= 40;
    }
}
