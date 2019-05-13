import javax.swing.*;
import java.util.Scanner;

public class GuessThenumber {
    public static void main(String[] args) {
        int count=1;

        while (count !=999) {


            Scanner k = new Scanner(System.in);
            int userguess;
            System.out.println("Welcome to my game ");
            System.out.print("Pick a number between 1 and 10");
            System.out.print(" Guess correctly win a price\n ");
            System.out.println("Pick a number ");
            userguess = k.nextInt();
            int random = (int) (Math.random()) * 10 + 1;

            if (userguess == random) {
                System.out.println("You got it  =) \n it only took you "+count+ " Try" );
                count=count=999;
            }
            else if (userguess > random)
                System.out.println("Wrong number, it was too high\n");
            else if (userguess < random)
                System.out.println("Wrong number, it was low high\n");
            else
                System.out.println("That not an option ");
            }
            ++ count;
        }
    }



