package Game;

public class Player {
    private String playerName;
    private int score;
    private Die die;
    
    
    Player(String playerName)
    {
        this.playerName = playerName;
        this.score =0;
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
        die = new Die(numberOfSides);
        System.out.println("\nWelcome " + getPlayerName() + "!");
        System.out.println("\n" + getPlayerName() + " You have chosen " + die.getNumberOfSides() + " sided die");
    }

    // Rolls the player's die.
    public void rollDice(){
        die.roll();
    }
    
    // Returns the current value of the player's die.
    public int getDieValue(){
        return die.getCurrentValue();
    }

    // Increases the player's score by one point.

    public void increaseScore(){
        score++;

    }
}
