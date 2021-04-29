package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserFileReader {
    public UserFileReader(){}

    public boolean isValidUser(String cpr, String password) throws FileNotFoundException {
        File userData = new File("D:\\Git\\Dat\\1. semester\\src\\Exception\\TestData");
        Scanner fileSc = new Scanner(userData);
        while(fileSc.hasNextLine()){
            String a = fileSc.nextLine();
            String[] aAsArray =a.split(";");
            if(aAsArray[0].equals(cpr)){
                return true;
            }
        }
        throw new NoSuchUserException();
    }
}
