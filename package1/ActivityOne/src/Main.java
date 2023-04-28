import javax.swing.JOptionPane;
import java.util.Locale;
//************************************************************** //
// Assignment #1 //
// Name: Zack Squires //
// CompSci 2 Date: 1/17/2023
// *************************************************************** //
// Program will request that the user enter a name which will then be returned in upper case, lower case, and reverse.
// Afterwards, two numbers will be requested which will be returned, added together, subtracted, multiplied, divided,
// the square root of both will be returned, number one will be multiplied to the power of number two, and the
// logarithms of both numbers will also be returned.
// *****************************************************************
public class Main {
    public static void main(String[] args) {
        String name;
        name = JOptionPane.showInputDialog("What is your name?");
        String n1 = name.toUpperCase(Locale.ROOT);
        System.out.println(n1);
        String n2 = name.toLowerCase(Locale.ROOT);
        System.out.println(n2);
        char ch;
        String n3 = "";
        for (int i=0; i<name.length(); i++)
        {
            ch = name.charAt(i);
            n3 = ch + n3;
        }
        System.out.println(n3);

        Integer int1;
        Integer int2;
        int1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number:"));
        int2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Number Two:"));
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int1 + int2);
        System.out.println(int1 - int2);
        System.out.println(int1 * int2);
        System.out.println(int1 / int2);
        System.out.println(Math.sqrt(int1));
        System.out.println(Math.sqrt(int2));
        System.out.println(Math.pow(int1, int2));
        System.out.println(Math.log(int1));
        System.out.println(Math.log(int2));


    }
}