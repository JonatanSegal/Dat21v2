package Exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayAndArraylists {
    public static void main(String[] args) throws FileNotFoundException {
        int[] intArray = new int[10];
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        File test = new File("1. semester/src/Exam/Datz");
        try {
            Scanner fileSC = new Scanner(test);
        }catch (InputMismatchException e){
            System.out.println("Error file path is wrong.");
        }


    }
}
