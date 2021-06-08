package InheritanceNFiles;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        EasyPancake ep = new EasyPancake();
        JPPancake jpCake = new JPPancake();

        System.out.println("Easy pancake:\n"+ep.toString());
        System.out.println();
        System.out.println("JP fluffy pancakes:\n"+jpCake.toString()+"\n");

        System.out.println("JP recipe");
        jpCake.recipe();

        System.out.println();
        System.out.println("Easy recipe");
        ep.recipe();
    }
}
