import java.util.Scanner;

public class CountByThress {
    public static void main(String[] args) {
        countByUseChoice();

    }
    public static void countbyThrees(){
        System.out.println("Printing 3 to 300  how much fun is this");
        for(int i =3; i<=300;i = i +3){
            System.out.print(i + " ");
            if(i % 30 == 0){
                System.out.println();
            }
        }
    }
    public static void countByUseChoice(){
        Scanner k =new Scanner(System.in);
        int choise=0;
        int high;
        int count=0;

        while(choise !=999){
        System.out.println("\n" +
                "user chooses number to count by ");
        choise=k.nextInt();
        System.out.println("chose a number to count to");
        high=k.nextInt();
        for (int i = 1; i <= high; i = choise + i){
            count = count +1;
            if(count % 11 == 0){
        System.out.println();
    }
            else
                    System.out.print(i + " ");
        }
        }
}
}
