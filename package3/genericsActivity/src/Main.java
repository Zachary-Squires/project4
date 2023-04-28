import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GenericMethods generic = new GenericMethods();
        ArrayList<Integer> intAL = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Double> douAL = new ArrayList<Double>(Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5));
        ArrayList<Character> chaAL = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        ArrayList<String> strAL = new ArrayList<String>(Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon"));
        System.out.println("Integer array list: ");
        generic.printArrayList(intAL);
        System.out.println("Double array list: ");
        generic.printArrayList(douAL);
        System.out.println("Character array list: ");
        generic.printArrayList(chaAL);
        System.out.println("String array list: ");
        generic.printArrayList(strAL);
    }
}