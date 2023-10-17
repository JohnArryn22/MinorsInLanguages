import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class AdminLoginPanel extends JPanel implements ActionListener{
    private JLabel fillDetails , name , password , emptyLabel1 , emptyLabel2 ,  emptyLabel3 ,  emptyLabel4;
    private JTextField nameField , passField;
    private JButton logInButton;

    //Constructor For Admin Login Panel
    public AdminLoginPanel(){

        fillDetails = new JLabel("Fill In The Following Details");
        fillDetails.setFont(new Font("Serif", Font.ITALIC, 25));
        emptyLabel1 = new JLabel(" ");
        emptyLabel2 = new JLabel(" ");
        emptyLabel3 = new JLabel(" ");
        emptyLabel4 = new JLabel(" ");

        name = new JLabel("Name:  ");
        name.setFont(new Font("Serif", Font.BOLD, 20));
        nameField = new JTextField(20);
        
        password = new JLabel("Password: ");
        password.setFont(new Font("Serif", Font.BOLD, 20));
        passField = new JPasswordField(20);

        logInButton = new JButton("Log In");

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(fillDetails , gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(emptyLabel1 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(emptyLabel2 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(name , gbc);
        gbc.gridx = 3;
        gbc.gridy = 4;
        add(nameField , gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(emptyLabel3 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        add(password, gbc);
        gbc.gridx = 3;
        gbc.gridy = 6;
        add(passField, gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        add(emptyLabel4, gbc);
        gbc.gridx = 2;
        gbc.gridy = 8;
        add(logInButton, gbc);
        setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 3) ,"Login As Admin" , TitledBorder.CENTER , TitledBorder.TOP));

        logInButton.addActionListener(this);
    }

    
    public void actionPerformed(ActionEvent e) {

        String admName = nameField.getText();
        String admPass = passField.getText();

        // if Condition To Check The Name And Password
        if(admName.equals("anushk") && admPass.equals("1234")){
            AdminFunctionsFrame afp = new AdminFunctionsFrame();
            afp.setVisible(true);
            nameField.setText("");
            passField.setText("");
        }
        else{
            // Error Frame If Either Of The Name Or Paaword Is Incorrect
            AdminLoginError ale = new AdminLoginError(nameField, passField);
            ale.setVisible(true);
        }

        
        
    }
}