package Exception;

import java.util.InputMismatchException;

public class NoSuchUserException extends InputMismatchException {
    NoSuchUserException(){
        super("User not found");
    }
}
