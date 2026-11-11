package Game;

import java.util.ArrayList;

public class Player {
    private String playerName;
    private int score;
    private final ArrayList<Die> dice;
    
    
    Player(String playerName)
    {
        this.playerName = playerName;
        this.score =0;
        this.dice = new ArrayList<>();
    }

    // Returns the player's current score.
    public int getScore()
    {
        return score;
    }

    // Updates the player's score.
    public void setScore(int score)
    {
        this.score = score;
    }

    // Returns the player's name.
    public String getPlayerName(){
        return playerName;
    }

    // Creates a die with the specified number of sides and assigns it to the player.
    public void addDie(int numberOfSides)
    {
            dice.add(new Die(numberOfSides));
            System.out.println("\nWelcome " + getPlayerName() + "!");
            //
    }

    // Rolls the player's die.
    public void rollDice(){
        for (Die die: dice) 
        {
            die.roll();
        }
    }
    
    // Returns the current value of the player's die.
    public int getDieValue(){
        return dice.get(0).getCurrentValue();
    }

    public ArrayList<Die> getDice(){
        return dice;
    }

    // Increases the player's score by one point.

    public void increaseScore(){
        setScore(score+1);

    }
}
