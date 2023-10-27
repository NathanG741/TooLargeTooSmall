

import java.util.Random;
import java.util.Scanner;


/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        //This is a "random" class
        Random rand = new Random();

        int randomNumber = rand.nextInt(25) + 1;
        System.out.println("Random number is " + randomNumber);
        int tryCount = 0;
        while (true) {
            System.out.println("Pick a number between 1-25 ");

            Scanner scanner = new Scanner(System.in);
            int playerGuess = scanner.nextInt();
            tryCount++;
            if (playerGuess == randomNumber) {
                System.out.println("correct guess");
                System.out.println("It took you " + tryCount + " tries" );
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("too small");
            } else {
                System.out.println("too large");
            }
        }
    }

}