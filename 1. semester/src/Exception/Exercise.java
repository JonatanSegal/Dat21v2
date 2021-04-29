package Exception;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        while(true) {
            Scanner input = new Scanner(System.in);
            NemIdAuthorizer authorizer = new NemIdAuthorizer();
            UserFileReader userExists = new UserFileReader();

            System.out.println("CPR: ");
            String cpr = input.nextLine();
            try {
                authorizer.isValidInput(cpr, "Hej");
                userExists.isValidUser(cpr,"asjd");
                break;
            } catch (InputMismatchException | FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
