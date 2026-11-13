# The Dice Game 🎲

A terminal-based Java dice game created as a pair project. The program includes a single-player guessing game and an optional multiplayer game.

## How to run

You need a Java Development Kit (JDK), version 17 or newer.

From the repository's root folder, run:

```bash
javac Game/*.java
java Game.Main
```

You can also open the project in VS Code and run `Main.java`.

## Game modes

**1. Single player**

- Choose the number of rounds and the number of sides on the die.
- Enter your name and guess a number in the die's range each round.
- A correct guess gives **1 point**; an incorrect guess gives **0 points**.
- Your final score is shown after the last round.

**2. Multiplayer**

- Choose the number of players (at least 2), dice per player, and rounds.
- Enter each player's name. Each player receives the chosen number of **six-sided dice**.
- Each round, every player rolls all their dice. The sum is added to their total score.
- Results appear in a scoreboard. Press **Enter** to move to the next round.
- The player with the highest final score wins. Tied highest scores produce multiple winners.

**3. Exit** — Closes the application.

## Java classes

| Class | Responsibility |
| --- | --- |
| `Main.java` | Starts the application and displays the game-mode menu. |
| `DiceGame.java` | Handles single-player input, guesses, rounds, and scoring. |
| `MultiPlayerGame.java` | Creates multiplayer players, runs rounds, shows the scoreboard, and finds winners. |
| `Player.java` | Stores a player's name, score, and `ArrayList<Die>`. |
| `Die.java` | Stores a die's sides and current value and generates random rolls. |

## Testing and error handling

The game uses loops, conditions, and `try/catch` to reject many invalid number inputs, such as zero or negative rounds, out-of-range guesses, and text instead of integers. We tested both valid and invalid inputs, dice counts, scoring, and game completion. The project report contains more detail about tests and debugging.

## Collaboration

Developed together using **VS Code Live Share**, with **Git and GitHub** for version control.

