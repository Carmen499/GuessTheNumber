package academy.learnprogramming;

import java.lang.Math;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 20 + 1);

        int guess;


        String name;
        System.out.println("Hello Whats your name?");

        name = input.nextLine();
        System.out.println("Hello " + name + "," + " Im thinking of a number 1-20, take a guess");


        for (int i = 0; i <= 5; i++) {


            guess = input.nextInt();

            if (guess == secretNumber) {

                System.out.println("Your guess is correct. Congratulations!, would you like to play again?");

            } else if (guess < secretNumber) {

                System.out.println("Your guess is too small, take another.");

            } else if (guess > secretNumber) {

                System.out.println("Your guess is too high, take another guess.");

            } else {
                System.out.println("You ran out of tries");
            }

        }
    }

}