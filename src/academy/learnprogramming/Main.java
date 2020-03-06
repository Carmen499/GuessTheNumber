package academy.learnprogramming;

import java.lang.Math;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GuessingGame();

        while (true) {
            System.out.println("Do you want to play again? (y or n)");
            String response = input.nextLine().toLowerCase();
            if (response.equals("y")) {
                GuessingGame();
            } else {
                break;
            }
        }

    }

    public static void GuessingGame() {
        Scanner input = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * 20 + 1);
        int guess;
        int attempts = 5;
        String name;
        System.out.println("Hello Whats your name?");
        name = input.nextLine();
        System.out.println("Hello " + name + "," + " Im thinking of a number 1-20, take a guess");

        for (int i = 0; i < 5; i++) {
            guess = input.nextInt();

            if (guess == secretNumber) {

                System.out.println("Your guess is correct. Congratulations!");

            } else if (guess < secretNumber) {
                attempts--;
                System.out.println("Your guess is too small, you have " + attempts + " left, take another guess.");

            } else if (guess > secretNumber) {
                attempts--;
                System.out.println("Your guess is too high, you have" + attempts + " left, take another guess.");


            } else {
                if (attempts <= 0) {
                    System.out.println("You ran out of tries, would you like to play again?");
                }

            }
        }

    }
}