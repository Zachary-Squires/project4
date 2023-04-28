import javax.swing.JOptionPane;
public class Triangles {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        side1 = Integer.parseInt(JOptionPane.showInputDialog("Input first side length:"));
        side2 = Integer.parseInt(JOptionPane.showInputDialog("Input second side length:"));
        side3 = Integer.parseInt(JOptionPane.showInputDialog("Input third side length:"));

        if (side1 == side2 && side2 == side3){
            System.out.println("Triangle is Equilateral");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("Triangle is Isosceles");
        }
        else {
            System.out.println("Triangle is Scalene");
        }
    }
}
