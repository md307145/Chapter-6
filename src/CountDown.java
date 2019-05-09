public class CountDown {
    public static void main(String[] args) {
        System.out.print("FINAL COUNTDOWN ");
        int count = 1;
        displayDoWhile();
        displayForloop();
        while (count != 10) {
            System.out.print(count);
            ++count;

        }
        int count2 = 0;
        while (count2 != 10) {
            System.out.print(count2);
            ++count2;
        }
    }
    public static void displayDoWhile(){
       int count = 10;
       int count2=0;
       do{
               System.out.print(count);
               --count;
    }while (count<0);
       do{
           System.out.print(count2);
           ++count2;
       }while (count2<=10);

    }
    public static void displayForloop(){
        for(int i=0;i<=10; i++){
                System.out.print(i);
    }
        for(int j=10; j >=0;j++) {
            System.out.print(j);
        }
    }
}