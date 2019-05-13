import java.util.Scanner;

public class TEstScoreStatistics {
    public static void main(String[] args) {
        int score;
        int count = 0;
        int high = 0;
        int low = 100;
        int ATotal = 0;
        int BTotal = 0;
        int CTotal = 0;
        int DTotal = 0;
        int FTotal = 0;
        while (count != 999) {
            Scanner k = new Scanner(System.in);
            System.out.println("enter test score ");
            score = k.nextInt();

            if (score > high) {
                high = score;
            }
            else if (score < 100) {
                low = score;
            }
            message(score,ATotal,BTotal,CTotal,DTotal,FTotal);

            System.out.println("A total " );displayBar(ATotal);
            System.out.println("B total ");displayBar(BTotal);
            System.out.println("C total ");displayBar(CTotal);
            System.out.println("D total ");displayBar(DTotal);
            System.out.println("F total ");displayBar(FTotal);
            ++count;
        }
    }

    public static void displayBar(int b) {
        for (int i = 0; i < b; ++i) {
            System.out.print("/");

        }


        }



    public static void message(int score,int ATotal,int BTotal,int CTotal, int DTotal, int FTotal) {
    if (score > 90 || score < 100)
        ++ATotal;
    else if (score >= 80 || score <= 89)
        ++BTotal;
    else if (score >= 70 || score <= 79)
        ++CTotal;
    else if (score >= 60 || score <= 69)
        ++DTotal;
    else if (score <= 59)
        ++FTotal;
}
}