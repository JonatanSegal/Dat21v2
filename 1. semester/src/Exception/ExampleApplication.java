package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        /*
        Try/catch for exceptions
        Try first if an exception happens doing the try sequence the catch code is executed
         */
        try {
            Scanner input = new Scanner(System.in);
            CprValidator cpr = new CprValidator();
            System.out.println(cpr.validator(input.nextLine()));
        }
        catch(InputMismatchException e){
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }
}
