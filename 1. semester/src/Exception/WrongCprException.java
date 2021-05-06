package Exception;

public class WrongCprException extends RuntimeException{
    WrongCprException(){
        super("Wrong CPR");
    }
}
