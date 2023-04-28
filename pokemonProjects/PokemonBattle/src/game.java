import javax.swing.JOptionPane;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        int rounds = Integer.parseInt(JOptionPane.showInputDialog("Enter an odd number of rounds:"));
        while (rounds % 2 == 0){
            System.err.println("Invalid number of rounds.");
            rounds = Integer.parseInt(JOptionPane.showInputDialog("Enter an odd number of rounds:"));
        }
        String p1Name = JOptionPane.showInputDialog("First player enter Pokemon name:");
        int p1HP = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon hit points:"));
        String p1Move = JOptionPane.showInputDialog("First player enter Pokemon move:");
        int p1Attack = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon's move power:"));
        int p1AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon move speed:"));
        String p2Name = JOptionPane.showInputDialog("Second player enter Pokemon name:");
        int p2HP = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon hit points:"));
        String p2Move = JOptionPane.showInputDialog("Second player enter Pokemon move:");
        int p2Attack = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move power:"));
        int p2AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move speed:"));
        int p1Wins = 0;
        int p2Wins = 0;
        int i;
        Random random = new Random();

        if (p1AttackSpeed == p2AttackSpeed){
            int randomInt = random.nextInt(3);
            if(randomInt == 1){
                p1AttackSpeed += 9999;
            }
            else {
                p2AttackSpeed += 9999;
            }
        }

        for (i = rounds; i > 0;){
            if(p1AttackSpeed > p2AttackSpeed){
                while(p1HP > 0 && p2HP > 0){
                    p2HP -= p1Attack;
                    p1HP -= p2Attack;
                }
                if (p1HP <= 0){
                    System.out.println("Player two's " + p2Name + " wins this round.");
                    p2Wins += 1;
                    i--;
                    if(i <= 0){
                        break;
                    }
                    p1Name = JOptionPane.showInputDialog("First player enter Pokemon name:");
                    p1HP = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon hit points:"));
                    p1Move = JOptionPane.showInputDialog("First player enter Pokemon move:");
                    p1Attack = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon's move power:"));
                    p1AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon move speed:"));
                    p2Name = JOptionPane.showInputDialog("Second player enter Pokemon name:");
                    p2HP = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon hit points:"));
                    p2Move = JOptionPane.showInputDialog("Second player enter Pokemon move:");
                    p2Attack = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move power:"));
                    p2AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move speed:"));
                    if (p1AttackSpeed == p2AttackSpeed){
                        int randomInt = random.nextInt(3);
                        if(randomInt == 1){
                            p1AttackSpeed += 9999;
                        }
                        else {
                            p2AttackSpeed += 9999;
                        }
                    }
                }
                else{
                    System.out.println("Player one's " + p1Name + "wins this round.");
                    p1Wins += 1;
                    i--;
                    if(i <= 0){
                        break;
                    }
                    p1Name = JOptionPane.showInputDialog("First player enter Pokemon name:");
                    p1HP = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon hit points:"));
                    p1Move = JOptionPane.showInputDialog("First player enter Pokemon move:");
                    p1Attack = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon's move power:"));
                    p1AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon move speed:"));
                    p2Name = JOptionPane.showInputDialog("Second player enter Pokemon name:");
                    p2HP = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon hit points:"));
                    p2Move = JOptionPane.showInputDialog("Second player enter Pokemon move:");
                    p2Attack = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move power:"));
                    p2AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move speed:"));
                    if (p1AttackSpeed == p2AttackSpeed){
                        int randomInt = random.nextInt(3);
                        if(randomInt == 1){
                            p1AttackSpeed += 9999;
                        }
                        else {
                            p2AttackSpeed += 9999;
                        }
                    }
                }
            }
            else if(p1AttackSpeed < p2AttackSpeed){
                while(p1HP > 0 && p2HP > 0){
                    p1HP -= p2Attack;
                    p2HP -= p1Attack;
                }
                if (p1HP <= 0){
                    System.out.println("Player two's " + p2Name + " wins this round.");
                    p2Wins += 1;
                    i--;
                    if(i <= 0){
                        break;
                    }
                    p1Name = JOptionPane.showInputDialog("First player enter Pokemon name:");
                    p1HP = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon hit points:"));
                    p1Move = JOptionPane.showInputDialog("First player enter Pokemon move:");
                    p1Attack = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon's move power:"));
                    p1AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon move speed:"));
                    p2Name = JOptionPane.showInputDialog("Second player enter Pokemon name:");
                    p2HP = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon hit points:"));
                    p2Move = JOptionPane.showInputDialog("Second player enter Pokemon move:");
                    p2Attack = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move power:"));
                    p2AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move speed:"));
                    if (p1AttackSpeed == p2AttackSpeed){
                        int randomInt = random.nextInt(3);
                        if(randomInt == 1){
                            p1AttackSpeed += 9999;
                        }
                        else {
                            p2AttackSpeed += 9999;
                        }
                    }
                }
                else{
                    System.out.println("Player one's " + p1Name + "wins this round.");
                    p1Wins += 1;
                    i--;
                    if(i <= 0){
                        break;
                    }
                    p1Name = JOptionPane.showInputDialog("First player enter Pokemon name:");
                    p1HP = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon hit points:"));
                    p1Move = JOptionPane.showInputDialog("First player enter Pokemon move:");
                    p1Attack = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon's move power:"));
                    p1AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("First player enter Pokemon move speed:"));
                    p2Name = JOptionPane.showInputDialog("Second player enter Pokemon name:");
                    p2HP = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon hit points:"));
                    p2Move = JOptionPane.showInputDialog("Second player enter Pokemon move:");
                    p2Attack = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move power:"));
                    p2AttackSpeed = Integer.parseInt(JOptionPane.showInputDialog("Second player enter Pokemon move speed:"));
                    if (p1AttackSpeed == p2AttackSpeed){
                        int randomInt = random.nextInt(3);
                        if(randomInt == 1){
                            p1AttackSpeed += 9999;
                        }
                        else {
                            p2AttackSpeed += 9999;
                        }
                    }
                }
            }
        }
        System.out.println("Player one: " + p1Wins);
        System.out.println("Player two: " + p2Wins);
        if (p1Wins > p2Wins){
            System.out.println("Player one wins!");
        }
        else{
            System.out.println("Player two wins!");
        }

    }
}