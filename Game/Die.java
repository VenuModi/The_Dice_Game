package Game;

import java.util.Random;

public class Die{

    private int numberOfSides;
    private int currentValue;
    private Random random;

    //Constructor
    Die(int numberOfSides){

        this.numberOfSides = numberOfSides;
        this.currentValue = 0;
        this.random = new Random();
    }


    //Returns the number of sides on the die 
    public int getNumberOfSides(){
        return numberOfSides;
    }

    //Returns the currentValue of the die that is generated from the roll() function
    public int getCurrentValue(){
        return currentValue;
    }

    //Generates a random value from 1 to numberOfSides 
    public void roll(){
        currentValue = random.nextInt(numberOfSides) + 1;
    }
}