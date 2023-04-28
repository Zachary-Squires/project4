import java.util.Scanner;
public class ArrayFromInput {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int[] integers = new int[3];
        int[] integers2 = new int[3];
        String[] Strings = new String[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Int 1: ");
            integers[i] = Integer.parseInt(console.nextLine());
            System.out.println("Int 2: ");
            integers2[i] = Integer.parseInt(console.nextLine());
            System.out.println("String: ");
            Strings[i] = console.nextLine();

        }

        System.out.printf("%-14s %s\n", "String", "Int 1", "Int 2");

        for (int i = 0; i < integers.length; i++){
            System.out.printf("%-14s %d\n", Strings[i] + " " + integers[i], integers2[i]);
        }
        console.close();
    }
}