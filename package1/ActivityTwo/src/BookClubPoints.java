import javax.swing.JOptionPane;
public class BookClubPoints {
    public static void main(String[] args) {
        int books;
        int points = 0;
        books = Integer.parseInt(JOptionPane.showInputDialog("How many books have you purchased?"));

        if (books == 0)
        {
            System.out.println("You earned " + points + " points.");

        }
        if (books == 1)
        {
            points += 5;
            System.out.println("You earned " + points + " points.");
        }
        if (books == 2)
        {
            points += 15;
            System.out.println("You earned " + points + " points.");
        }
        if (books == 3)
        {
            points += 30;
            System.out.println("You earned " + points + " points.");
        }
        if (books >= 4)
        {
            points += 60;
            System.out.println("You earned " + points + " points.");
        }

    }
}