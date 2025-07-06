import java.util.*;
public class Guess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int totalRound = 3;
        int totalScore = 0;
        System.out.println(" Welcome to  'Guess the Number' Game ! ");
        System.out.println("You have to guess a number between 1clear100.");
        System.out.println("You will get 3 rounds, each with 7 attempts.\n");
        for(int round = 1 ; round <= totalRound ; round++){
            int numberToGuess = r.nextInt(100)+1;
            int attemptsleft = 7;
            boolean guessedCorrectly = false;
             System.out.println("Let's go - Round :  " + round + " begins!");
             while (attemptsleft > 0) {
                System.out.println(" Guess a Number between ( 1 - 100 ) : ");
                int userGuess = sc.nextInt();
                if (userGuess==numberToGuess) {
                    System.out.println( " Congratulations !! You have guessed the Correct Number ");
                    guessedCorrectly = true;
                    break;
                }else if(userGuess<numberToGuess){
                    System.out.println(" Oops !! LOW... ");
                } else {
                    System.out.println(" Oops !! HIGH... ");
                }
                attemptsleft--;
                System.out.println("Now The Attempts left " + attemptsleft);
            }   
                if (guessedCorrectly) 
                {
                    int score = attemptsleft*10;
                    totalScore+=score;
                    System.out.println(" You have earned " + score + " points this round.");
                }else{
                    System.out.println( " You are running out of attempts. The Correct was " + numberToGuess);
                }
                    System.out.println();
                }
                System.out.println("Game Finished . You have earned total " + totalScore + " points");
                sc.close();
             }   
             }