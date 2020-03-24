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
        int guess = 0;
        int attempts = 5;
        boolean error;
        String name;
        System.out.println("Hello, whats your name?");
        name = input.nextLine();
        System.out.println("Hello " + name + "," + " Im thinking of a number 1-20, take a guess");

        do {
            error = false;
            for (int i = 0; i < 5; i++) {
                try {
                    guess = input.nextInt();
                } catch (Exception e) {
                    System.out.println(" Invalid option...");
                    input.nextInt();
                }

                if (guess == secretNumber) {
                    System.out.println("Your guess is correct. Congratulations!");

                } else if (guess < secretNumber) {
                    attempts--;
                    if (attempts < 1)
                        System.out.println("You ran out of tries!");
                    else
                        System.out.println("Your guess is too small, you have " + attempts + " attempts left, take another guess.");
                } else if (guess > secretNumber) {
                    attempts--;
                    if (attempts < 1)
                        System.out.println("You ran out of tries!");
                    else
                        System.out.println("Your guess is too high, you have " + attempts + " attempts left, take another guess.");

                }

            }
        }while(error);

    }

}