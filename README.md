Number Guessing Game
Overview

The Number Guessing Game is a simple console-based game written in Java. In this game, the player has a limited number of attempts to guess a randomly generated number within a specified range. The game consists of multiple rounds, and the player's score is calculated based on the number of attempts taken to guess the correct number.
Features

    Random number generation for each round.
    Multiple rounds of gameplay.
    Limited number of attempts to guess the number in each round.
    Scoring system based on the number of attempts.
    User-friendly prompts and feedback for higher/lower guesses.

Structure

The project consists of a single Java class:

    NumberGuessingGame: The main class that contains the game logic and user interactions.

Getting Started
Prerequisites

    Java Development Kit (JDK) installed.
    An IDE or text editor for Java development.

Running the Program

    Clone the Repository:

    sh

git clone https://github.com/your-repo/number-guessing-game.git

Navigate to the Project Directory:

sh
cd number-guessing-game

Compile the Java File:

sh
javac NumberGuessingGame.java

Run the Main Class:

sh
    java NumberGuessingGame

Usage
Gameplay

    Welcome Message:
        The game starts with a welcome message and informs the player about the number of rounds.

    Rounds:
        The game consists of a specified number of rounds (default is 2).
        In each round, a random target number between 1 and 100 is generated.
        The player has a limited number of attempts (default is 5) to guess the target number.

    Guessing:
        The player is prompted to guess a number between 1 and 100.
        Feedback is provided whether the guess is higher or lower than the target number.

    Scoring:
        If the player guesses the number correctly, they earn points based on the number of remaining attempts.
        If the player fails to guess the number within the allowed attempts, the round ends with no score for that round.
        The total score is accumulated over all rounds.

    End of Game:
        After all rounds are completed, the game displays the final score and exits.

Code Overview:
NumberGuessingGame Class

    Main Method:
        Initializes the scanner and random number generator.
        Defines the number of rounds and initializes the total score.
        Loops through each round, generating a target number and handling the guessing process.

    Round Logic:
        For each round, a target number is generated, and the player is given a limited number of attempts.
        The player guesses numbers, and feedback is provided to guess higher or lower.
        If the player guesses correctly, they earn points based on the remaining attempts.

    Scoring:
        Points are calculated as (maxAttempts - attempts + 1) * 10 for each correct guess.
        The total score is updated and displayed after each round.

Example Output:

Welcome to the Number Guessing Game!
You have 2 rounds to play.

Round 1 starts now!
You have 5 attempts to guess the number.
Guess a number between 1 and 100: 50
Lower! Try again.
Guess a number between 1 and 100: 25
Higher! Try again.
Guess a number between 1 and 100: 35
Higher! Try again.
Guess a number between 1 and 100: 40
Lower! Try again.
Guess a number between 1 and 100: 38
You won! The number was 38.
Your score after round 1 is: 20

Round 2 starts now!
You have 5 attempts to guess the number.
Guess a number between 1 and 100: 60
Higher! Try again.
Guess a number between 1 and 100: 80
Lower! Try again.
Guess a number between 1 and 100: 70
You won! The number was 70.
Your score after round 2 is: 60

Game over! Your final score is: 80

License

This project is open-source and available under the MIT License.

Feel free to modify the code to suit your needs or contribute to the project by submitting pull requests. If you encounter any issues or have suggestions for improvement, please open an issue on GitHub.
