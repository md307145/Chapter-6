import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        int userEntry;
        int count = 0;
        Scanner k = new Scanner(System.in);
        while (count != 998) {

            System.out.println("enter a whole number");
            userEntry = k.nextInt();
            if (userEntry % 2 == 0) {
                System.out.println (userEntry + " number is even");
            } else
                System.out.println(userEntry + "number is odd");
            ++ count;

        }
    }
}