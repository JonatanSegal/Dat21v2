package Exception;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NemIdAuthorizer {
    public boolean isValidInput(String cpr, String password){
        if(cpr.length() != 10){
            throw new InputMismatchException();
    }
        System.out.println("Success");
        return  true;
    }
}
