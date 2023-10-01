# Wordle Game using Maven and TDD Approach

## DESCRIPTION :

This project is a Java implementation of the popular word game Wordle, where players have six attempts to guess a five-letter word. The game is built using test-driven development and uses Junit 5 as the unit-testing framework. The code is built and tests are run using the Maven configuration file and commands.


---

Files in the application: 
<ol>
 Main File :  </br>
 <li> WordleApp.java
 <li> GameEngine.java 
 <li> RandomEngine.java
 <li> WordChecker.java
 <li> ScoreEngine.java 
 <li> ColorAssigner.java
 <li> WordleGridLayout.java 
  </ol>
            
---

## INSTALLATION 
1) Clone the repository (or)
2) Extract the *.zip file.
3) Navigate to the src folder of the Program.
4) Compile the .java files in terminal 
5) Also clean <code> mvn clean </code> and package <code> mvn package </code> using maven to generate .jar file
6) Run WordleApp.java to generate the Command Line Interface.

This will compile the code and generate a jar file in the target directory.

--- 

## Usage :
To play Wordle, run the following command: </br>
<code>java -jar target/filename.jar </code> </br>
The game will select a random word from the provided wordlist and prompt the user to make a guess. The user has six attempts to guess the word. After each guess, the game will display the appropriate feedback to the user. The game ends when the user correctly guesses the word or runs out of attempts. At the end of the game, the user's score is displayed.


---

## CONTRIBUTING
If you would like to contribute to Wordle, please follow these steps:
<ol>
<li> Fork the repository
<li> Create a new branch for your feature or bug fix
<li> Make your changes and write tests to cover them
<li> Run <code> mvn test </code> to ensure all tests pass
<li> Submit a pull request
</ol>

<strong> JUnit Tests </strong> : JUnit Test built for the application run on JUnit5.

Test Files : 
1) ClassLoaderTest.java
2) GameEngineTest.java
3) RandomEngineTest.java
4) ScoreEngineTest.java
5) WordCheckerTest.java 

## LICENSE :
This project is licensed under the MIT License. See the <code> LICENSE </code> file for more information.
--- 
