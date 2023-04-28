import javax.swing.JOptionPane;

public class TestScores {
    public static void main(String[] args) {
        Integer grade1;
        Integer grade2;
        Integer grade3;
        String lGrade;
        grade1 = Integer.parseInt(JOptionPane.showInputDialog("Enter grade 1:"));
        grade2 = Integer.parseInt(JOptionPane.showInputDialog("Enter grade 2:"));
        grade3 = Integer.parseInt(JOptionPane.showInputDialog("Enter grade 3:"));
        Integer average = (grade1 + grade2 + grade3)/3;
        if (average > 90)
        {
            lGrade = "A";
        }
        else if (average > 80)
        {
            lGrade = "B";
        }
        else if (average > 70)
        {
            lGrade = "C";
        }
        else if (average > 60)
        {
            lGrade = "D";
        }
        else
        {
            lGrade = "F";
        }
        System.out.println("Average is: " + average);
        System.out.println("Average letter grade is: " + lGrade);
        }
    }
