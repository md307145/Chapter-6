import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PracticeListArray {
    public static void main(String [] args){

        ArrayList<String> custumerName = new ArrayList<>();

        boolean quit = true;
        while (quit){
            String name =JOptionPane.showInputDialog(null, "Enter the customers name");
            if(name.equals("quit") ){
                quit = false;
            }
                    custumerName.add(name);

        }

        System.out.println("Customers name are ");

        Collections.sort(custumerName);
        System.out.println("Customers name are "+custumerName);

        }
    }

