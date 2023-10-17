import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JList;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminFunctionsFrame extends JFrame implements ListSelectionListener{
    private JLabel functionLabel , emptyLabel1 , emptyLabel2 , emptyLabel3;
    private JPanel admFuncLabPanel , admFuncMainPanel;
    private JList admFuncList;
    private JTextArea mainDisplayArea;


    public AdminFunctionsFrame(){
        super("Book Exchange - Admin Frame");
        functionLabel = new JLabel("As An Admin, You Have The Following Options");
        functionLabel.setFont(new Font("Serif", Font.BOLD, 25));
        emptyLabel1 = new JLabel(" ");
        emptyLabel2 = new JLabel(" ");
        emptyLabel3 = new JLabel(" ");

        admFuncLabPanel = new JPanel(new GridBagLayout());
        admFuncLabPanel.add(functionLabel);

        String [] admFuncs = {
            "Show Available Books",
            "Show Exchanged Books",
            "Show Donated Books",
            "Show Issued Books",
            "Show Customer Details",
            "Add A Customer As BLACKLISTED",
            "Show BLACKLISTED Customer"
        };

        admFuncList = new JList<>(admFuncs);
        mainDisplayArea = new JTextArea(30, 30);
        mainDisplayArea.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY , 3)));
        mainDisplayArea.setBackground(Color.DARK_GRAY);
        mainDisplayArea.setForeground(Color.WHITE);
        mainDisplayArea.setTabSize(500);
        mainDisplayArea.setCaretColor(Color.white);
        mainDisplayArea.setFont(new Font("Serif", Font.PLAIN, 14));
        admFuncMainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        admFuncMainPanel.add(new JScrollPane(admFuncList) , gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        admFuncMainPanel.add(emptyLabel1 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        admFuncMainPanel.add(emptyLabel2 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        admFuncMainPanel.add(emptyLabel3 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        admFuncMainPanel.add(mainDisplayArea, gbc);

        admFuncList.addListSelectionListener(this);

        add(admFuncLabPanel , BorderLayout.NORTH);
        add(admFuncMainPanel , BorderLayout.CENTER);
        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
    }

    
     // Function To Show BLACKLISTED Customers
    void showBLACKLISTEDCustomers(){
        String temp = " ";
        int i = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from blackcust";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            mainDisplayArea.setText(" \n");
            while(rs.next()){
                mainDisplayArea.append(temp +i+ "          " + rs.getString(2) + "          " + rs.getString(3) + "\n");
                i++;
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Function To Show All Customers
    void showCustomers(){
        String temp = " ";
        int i = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from custdetails";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            mainDisplayArea.setText(" \n");
            while(rs.next()){
                mainDisplayArea.append(temp + i + "     " + rs.getString(2) + "     " + rs.getString(3) + "     " + rs.getString(4) + "\n");
                i++;
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Function To Show Issued Books By The Customers
    void showIssuedBooks(){
        String temp = " ";
        int i = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from issuedbooks";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            mainDisplayArea.setText(" \n");
            while(rs.next()){
                mainDisplayArea.append(temp +i+ "          " + rs.getString(2) + "          " + rs.getString(3) + "\n");
                i++;
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    // Function To Show Donated Books By The Customers
    void showDonatedBooks(){
        String temp = " ";
        int i = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from donbooks";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            mainDisplayArea.setText(" \n");
            while(rs.next()){
                mainDisplayArea.append(temp +i+ "          " + rs.getString(2) + "          " + rs.getString(3) + "\n");
                i++;
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Show The Exchanged Books By The Customers
    void showExchangedBooks(){
        String temp = " ";
        int i = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from excbooks";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            mainDisplayArea.setText(" \n");
            while(rs.next()){
                mainDisplayArea.append(temp +i+ "          " + rs.getString(2) + "          " + rs.getString(3) + "\n");
                i++;
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Show Available Books
    void showAvailableBooks(){
        String temp = " ";
        int i = 1;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "select * from avlbooks";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            mainDisplayArea.setText(" \n");
            while(rs.next()){
                mainDisplayArea.append(temp +i+ "          " + rs.getString(2) + "          " + rs.getString(3) + "\n");
                i++;
            }
            con.close();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void valueChanged(ListSelectionEvent e) {
        
        // Function Called According To The Option Selected
        if(admFuncList.getSelectedIndex() == 0){
            showAvailableBooks();
        }
        else if(admFuncList.getSelectedIndex() == 1){
            showExchangedBooks();
        }
        else if(admFuncList.getSelectedIndex() == 2){
            showDonatedBooks();
        }
        else if(admFuncList.getSelectedIndex() == 3){
            showIssuedBooks();
        }
        else if(admFuncList.getSelectedIndex() == 4){
            showCustomers();
        }
        else if(admFuncList.getSelectedIndex() == 5){
            // add A customer as BLACKLISTED
            BlacklistedCustomer bc = new BlacklistedCustomer();
            bc.setVisible(true);
        }
        else if(admFuncList.getSelectedIndex() == 6){
            // show BLACKLISTED customers
            showBLACKLISTEDCustomers();
        }
    }


}
