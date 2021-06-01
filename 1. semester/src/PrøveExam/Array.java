package PrøveExam;


import java.sql.SQLOutput;

public class Array {
    public static void main(String[] args) {
        int[] numberArray = {11,22,33,44,55,66};

        oddNumbers(numberArray);
        sumOfEntireArray(numberArray);



    }


    public static void oddNumbers(int[] numberArray){
        System.out.print("Odd Numbers: ");
        int oddSum = 0;
        for (int k : numberArray) {
            if (k % 2 != 0) {
                System.out.print(k + " ");
                oddSum = k + oddSum;
            }
        }
        System.out.println();
        System.out.println("Sum of the odd numbers: " + oddSum);
    }

    public static void sumOfEntireArray(int[] numberArray){
        int sumOfArray = 0;
        for (int j : numberArray) {
            sumOfArray = j + sumOfArray;
        }
        System.out.println("Sum of the entire array: "+ sumOfArray);
    }
}
