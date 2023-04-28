import javax.swing.JOptionPane;
public class SwitchActivity {
    public static void main(String[] args) {
        String planet;
        planet = JOptionPane.showInputDialog("Input planet (Mercury, Earth, Mars, Venus):");

        switch(planet){
            case "Mercury":
                System.out.println("Radius: 1,516 miles | Distance from the sun: 0.4 AU | Habitable: No");
                break;
            case "Earth":
                System.out.println("Radius: 3,958 miles | Distance from the sun: 1 AU | Habitable: Yes");
                break;
            case "Mars":
                System.out.println("Radius: 2,106 miles | Distance from the sun: 1.52 AU | Habitable: Potentially");
                break;
            case "Venus":
                System.out.println("Radius: 3,760 miles | Distance from the sun: 0.72 AU | Habitable: No");
                break;
        }

    }
}