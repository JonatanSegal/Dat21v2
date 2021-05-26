package InheritanceNFiles;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        EasyPancake ep = new EasyPancake();
        JPPancake jpCake = new JPPancake();

        System.out.println(ep.toString());
        System.out.println();
        System.out.println(jpCake.toString());
        System.out.println();
        jpCake.recipe();
        System.out.println();
        ep.recipe();

    }
}
