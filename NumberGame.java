import java.util.*;

public class NumberGame {

    public static void game() {
        Random rand = new Random();
        int x = rand.nextInt(101);
        Scanner sc = new Scanner(System.in);
        int score=3;
        System.out.print("\nLET'S PLAY...!\nGuess a number between 0 -100:");
        for (int attempt = 0; attempt < 3; attempt++) {
            int guess = sc.nextInt();
            
            if (guess == x) {
                System.out.println("You guessed the correct number.\n YOU WON.....!\nYour score is:"+score);
                break;
            }
            
            else if (guess > x) {
                System.out.println("Oops the number is greater than the secret number.\n");

                if (attempt == 2) {
                    System.out.println("You have exhaused all your attempts.YOU LOSE..");
                    System.out.println("The secret number was : " + x);
                    System.out.println();

                    System.out.println("Do you want to play again..? Enter 'Y' for yes and 'N' for no");
                    char ch = sc.next().charAt(0);
                    if (ch == 'y' || ch == 'Y') {
                    game();
                    } else if (ch == 'n' || ch == 'N') {
                        System.out.println("See you next time.");
                        break;
                    } else {
                        System.out.println("Not a valid input.");

                    }
                } else {
                    System.out.println("Make an another guess:");
                }

            }

            else if (guess < x) {
                System.out.println("Oops the number is smaller than the secret number.\n");

                if (attempt == 2) {
                    System.out.println("You have exhaused all your attempts.YOU LOSE..");
                    System.out.println("The secret number was : " + x);

                    System.out.println();

                    System.out.println("Do you want to play again..? Enter 'Y' for yes and 'N' for no");
                    char ch = sc.next().charAt(0);
                    if (ch == 'y' || ch == 'Y') {
                        game();
                    } else if (ch == 'n' || ch == 'N') {
                        System.out.println("See you next time.");
                        break;
                    } else {
                        System.out.println("Not a valid input.");
                        break;
                    }
                } else {
                    System.out.println("Make an another guess:");
                }
            }

            else {
                System.out.println("Please enter a valid integer input");
            }
            score--;
        }
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println(
                "\nWelcome to GUESS NUMBER GAME....!\nA secret number is generated between 0 -100.\nYou have 3 attempts to guess the secret number.");
        game();
    }

}
