import java.util.Scanner;

public class TEstScoreStatistics {
    public static void main(String[] args) {
        int score;
        String choise;
        int count = 0;
        int avr;
        int high = 0;
        int low = 100;
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;
        while (count != 999) {
            Scanner k = new Scanner(System.in);
            System.out.println("enter test score ");
            score = k.nextInt();

            if (score > high) {
                high = score;
            } else if (score < 100) {
                low = score;
            }
            else if(score > 90||score<100)
                ++A;
            else if(score >= 80||score <= 89)
                ++B;
            else if(score >= 70 || score <= 79)
                ++C;
            else if(score >= 60 || score <= 69)
                ++D;
            else if(score <= 59)
                ++F;
            System.out.println("A total" );displayBar(A);
            System.out.println("B total ");displayBar(B);
            System.out.println("C total ");displayBar(C);
            System.out.println("D total ");displayBar(D);
            System.out.println("F total ");displayBar(F);
            ++count;
        }
    }

    public static void displayBar(int b) {
        for (int i = 0; i < b; ++i) {
            System.out.print("/");
        }


    }
}