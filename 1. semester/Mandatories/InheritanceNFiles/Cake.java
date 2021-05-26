package InheritanceNFiles;

import java.io.FileNotFoundException;

public abstract class Cake {

    //The four basic components a cake is made of
    //Is in int for describe the amount of what is needed
    private int flourAmount;
    private int numberOfEggs;
    private int fatAmount;
    private int howMuchSugar;

    //Empty constructor
    public Cake(){}


    //toString method
    @Override
    public String toString() {
        return "Cake{" +
                "flourAmount=" + flourAmount +
                ", numberOfEggs=" + numberOfEggs +
                ", fatAmount=" + fatAmount +
                ", howMuchSugar=" + howMuchSugar +
                '}';
    }

    //Recipe method
    public void recipe() throws FileNotFoundException {}


    //Setters and getters
    public void setFlourAmount(int flourAmount) {
        this.flourAmount = flourAmount;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }

    public void setFatAmount(int fatAmount) {
        this.fatAmount = fatAmount;
    }

    public void setHowMuchSugar(int howMuchSugar) {
        this.howMuchSugar = howMuchSugar;
    }

    public int getFlourAmount() {
        return flourAmount;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public int getFatAmount() {
        return fatAmount;
    }

    public int getHowMuchSugar() {
        return howMuchSugar;
    }

}
