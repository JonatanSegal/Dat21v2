package PrøveExam;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class scprøve {
    private static File inputFile = new File("1. semester/src/PrøveExam/SCFile");
    private static Scanner fileSc;
    static {
        try {
            fileSc = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

   public void readFile(){
        while(fileSc.hasNextLine()){
            System.out.println(fileSc.nextLine());
        }
   }

    public static void main(String[] args) throws FileNotFoundException {
        scprøve sc = new scprøve();
        sc.readFile();
    }
}
