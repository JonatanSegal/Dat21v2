package PrøveExam;

import java.util.ArrayList;

public class list {
    private static ArrayList<String> slist = new ArrayList<>();

    public list(){
        slist.add("the");
        slist.add("quick");
        slist.add("brown");
        slist.add("fox");

    }

    public void printConcatString(){
        for(String s : slist){
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        list testList = new list();
        testList.printConcatString();
    }
}
