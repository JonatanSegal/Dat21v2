package InheritanceNFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JPPancake extends Cake{
    //New attributes needed to make easy pancakes
    private int eggYolks;
    private int milk;
    private int eggWhites;
    private int berries;

    //Constructor that uses the setIng methods to set it's attributes
    // With an empty super since mainly uses the setters from the super
    public JPPancake(){
        super();
        setIng();
    }

    //Set the value for each attribute uses the setters inherited from cake
    public void setIng(){
        this.eggYolks = 2;
        this.eggWhites = 4;
        this.berries = 175;
        this.milk = 120;
        setHowMuchSugar(50);
        setFlourAmount(95);
    }

    //Changes the recipe method to fit this class
    public void recipe() throws FileNotFoundException {
        File recipe = new File("1. semester/resources/JPCakeRecipe");
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
    public String toString(){
        return this.eggYolks + " egg yolks\n"+
                getHowMuchSugar() + " grams of white sugar\n"+
                this.milk + " ml of milk\n"+
                this.getFlourAmount() + " grams of pancake mix\n"+
                this.eggWhites + " egg whites\n"+
                this.berries + " grams of berries for serving";
    }

}
