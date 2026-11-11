package Game;

public class Player {
    private String playerName;
    private int score;
    private Die dice;
    
    
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
        dice = new Die(numberOfSides);
    }

    // Rolls the player's die.
    public void rollDice(){
        dice.roll();
    }
    
    // Returns the current value of the player's die.
    public int getDieValue(){
        return dice.getCurrentValue();
    }

    // Increases the player's score by one point.

    public void increaseScore(){
        score++;

    }
}
