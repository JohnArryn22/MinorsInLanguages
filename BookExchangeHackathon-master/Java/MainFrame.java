import javax.swing.*;

import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


public class MainFrame extends JFrame{
    static MainFrame mf = new MainFrame();

    private JLabel welcomeLabel1 , welcomeLabel2 , emptyLabel1 , emptyLabel2 , emptyLabel3 , footerLabel;
    private JPanel welcomeLabelPanel , footerPanel;
    private JTabbedPane optionsPane;

    //Constructor For Main Frame
    public MainFrame(){
        super("Book Exchange - Main Frame");

        welcomeLabel1 = new JLabel("Welcome To Book Exchange Application");
        welcomeLabel1.setFont(new Font("Serif", Font.BOLD, 30));
        welcomeLabel2 = new JLabel("You Can Use This Application In Two Ways");
        welcomeLabel2.setFont(new Font("Serif", Font.ITALIC, 25));
        emptyLabel1 = new JLabel("  ");
        emptyLabel2 = new JLabel("  ");
        emptyLabel3 = new JLabel("  ");
        footerLabel = new JLabel("Copyright @Anushk2023");

        // ---------- footerPanel Started ----------
        footerPanel = new JPanel(new GridBagLayout());
        footerPanel.add(footerLabel);
        footerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // ---------- footerPanel Ended ----------

        // ---------- optionsPane Started ----------
        AdminLoginPanel alp = new AdminLoginPanel();
        CustomerLoginPanel clp = new CustomerLoginPanel();
        
        optionsPane = new JTabbedPane();
        optionsPane.addTab("ADMIN", alp);
        optionsPane.addTab("CUSTOMER", clp);
        // ---------- optionsPane Ended ----------

        // ---------- WelcomeLabelPanel Started ----------
        // We Set The JPanel In The Horizontal Centre Of The JFrame NORTH And Use Empty JLables To Give Space Between Two Welcome JLabels
        welcomeLabelPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        welcomeLabelPanel.add(welcomeLabel1 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        welcomeLabelPanel.add(emptyLabel1 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        welcomeLabelPanel.add(emptyLabel2 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        welcomeLabelPanel.add(emptyLabel3 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        welcomeLabelPanel.add(welcomeLabel2 , gbc);
        welcomeLabelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        // ---------- WelcomeLabelPanel Ended ----------

        //Adding Components To The JFrame
        add(welcomeLabelPanel , BorderLayout.NORTH);
        add(optionsPane , BorderLayout.CENTER);
        add(footerPanel , BorderLayout.SOUTH);
    }

    //Main Function To Run The Application 
    //First Frame
    public static void main(String[] args) {
        mf.setSize(1920, 1080);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

