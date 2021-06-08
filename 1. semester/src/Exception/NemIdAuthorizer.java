package Exception;


import java.util.InputMismatchException;


public class NemIdAuthorizer {
    public boolean isValidInput(String cpr, String password){
        if(cpr.length() != 10){
            throw new InputMismatchException();
    }
        System.out.println("Success");
        return  true;
    }
}
