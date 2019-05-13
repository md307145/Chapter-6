import java.util.Scanner;

public class TEstScoreStatistics {
    public static void main(String[] args) {
        int score = 0;
        int scoreTotal = 0;
        int count=1;
        int average;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int f=0;

            Scanner k = new Scanner(System.in);

        while (score != 999) {
            System.out.println("enter test score 999 to quit ");
            score=k.nextInt();

            ++count;
        }
        scoreTotal = scoreTotal + score;
        average = scoreTotal /count;
        if(score == 999) {
            System.out.println();
            count=count=999;
            System.out.println(average);
    }
        else if (score >90) {
            System.out.println("Student got an A");
            ++a;
        }
        else if (score >80 && score <89) {
            System.out.println("Student got a B");
            ++b;
        }
        else if (score>70 && score< 79) {
            System.out.println("Student got a C");
            ++c;
        }
        else if(score>60 &&score<69) {
            System.out.println("Student got a D");
            ++d;
        }
        else if(score<59) {
            System.out.println("student got an F");
            ++f;
        }

        System.out.println("you have "+a+" A ");displayBar(a);
        System.out.println("you have "+b+" B ");displayBar(b);
        System.out.println("you have "+c+" C ");displayBar(c);
        System.out.println("you have "+d+" D  ");displayBar(d);
        System.out.println("you have "+f+" F ");displayBar(f);
    }

    public static void displayBar(int b) {
        for (int i = 0; i < b; ++i) {
            System.out.print("/");
        }
    }
    }
