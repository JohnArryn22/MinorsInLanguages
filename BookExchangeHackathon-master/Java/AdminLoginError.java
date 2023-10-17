import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


import javax.swing.*;

// class For Error Message Frame
public class AdminLoginError extends JFrame{
    private JPanel mainErrorP;
    private JLabel errorMessage1 , errorMessage2 , emptyLabel1;

    public AdminLoginError(JTextField tf1 , JTextField tf2){
        super("ERROR");
        tf1.setText("");
        tf2.setText("");
        errorMessage1 = new JLabel("Either The Admin's Name Or The Password Is Incorrect.");
        errorMessage1.setForeground(Color.RED);
        errorMessage1.setFont(new Font("Serif", Font.BOLD, 25));
        errorMessage2  = new JLabel("Please Try Again.");
        errorMessage2.setForeground(Color.RED);
        errorMessage2.setFont(new Font("Serif", Font.BOLD, 25));
        emptyLabel1 = new JLabel(" ");

        mainErrorP = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainErrorP.add(errorMessage1 , gbc);
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        mainErrorP.add(emptyLabel1 , gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        mainErrorP.add(errorMessage2 , gbc);

        add(mainErrorP , BorderLayout.CENTER);

        setSize(850, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
   
}


