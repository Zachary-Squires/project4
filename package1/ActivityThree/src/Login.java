import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args) {
        String userName = ("zsquires");
        int password = 1234;
        String loginName;
        int loginPassword;
        loginName = JOptionPane.showInputDialog("Input username:");
        loginPassword = Integer.parseInt(JOptionPane.showInputDialog("Input password:"));
        if (userName.equals(loginName)){
            if (password == loginPassword){
                System.out.println("Welcome to CS121");
            }
            else{
                System.out.println("Incorrect password");
            }
        }
        else if(password == loginPassword){
            System.out.println("Incorrect username");
        }
        else{
            System.out.println("Both inputs incorrect");
        }

    }
}
