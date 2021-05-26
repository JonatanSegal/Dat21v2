package InheritanceNFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EasyPancake extends Cake{
    //New attributes needed to make easy pancakes
    private int amountOfSalt;
    private int milkAmount;
    private int bakingPowder;

    //Constructor that uses the setIng methods to set it's attributes
    // With an empty super since mainly uses the setters from the super
    public EasyPancake(){
        super();
        setIng();
    }


    //Set the value for each attribute uses the setters inherited from cake
    public void setIng(){
        this.setFlourAmount(190);
        this.bakingPowder = 15;
        this.amountOfSalt = 5;
        this.milkAmount = 160;
        this.setNumberOfEggs(1);
        this.setFatAmount(45);
        this.setHowMuchSugar(15);
    }

    //Changes the recipe method to fit this class
    public void recipe() throws FileNotFoundException {
        File recipe = new File("1. semester/resources/EasyPancakeRecipe");
        Scanner fileSc = new Scanner(recipe);
        int words = 0;

        while(fileSc.hasNextLine()){
            String currentLine = fileSc.nextLine();
            String[]lineAsArray = currentLine.split(" ");
            int wordsInLine = lineAsArray.length;
            words = wordsInLine +words;
        }
        System.out.println("Number of words in file: "+ words);
    }

    //overrides the toString method
    @Override
    public String toString() {
        return getFlourAmount() + " grams of All-purpose flour\n"+
                bakingPowder +" grams of baking powder\n"+
                amountOfSalt + " grams of salt\n"+
                getHowMuchSugar()+" grams of sugar\n"+
                milkAmount + " ml of milk\n"+
                getNumberOfEggs() + " eggs\n"+
                getFatAmount() + " grams of melted butter";
    }

}
