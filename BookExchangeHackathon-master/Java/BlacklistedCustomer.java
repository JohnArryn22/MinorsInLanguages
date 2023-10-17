import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
public class BlacklistedCustomer extends JFrame implements ActionListener{
    private JPanel mainPanel , infoPanel;
    private JLabel nameLabel , tagLabel , issueLabel , noIssuLabel , emptyLabel1 , emptyLabel2 , emptyLabel3 , emptyLabel4 , emptyLabel5 , emptyLabel6;
    private JTextField nameCust;
    private JButton issueBut;    

    BlacklistedCustomer(){
        super("Book Exchange - Admin - BlackListing");
        
        emptyLabel1 = new JLabel(" ");
        emptyLabel2 = new JLabel(" ");
        emptyLabel3 = new JLabel(" ");
        emptyLabel4 = new JLabel(" ");
        emptyLabel5 = new JLabel(" ");
        emptyLabel6 = new JLabel(" ");

        nameLabel = new JLabel("Please Fill The Following Information");
        nameLabel.setFont(new Font("Serif", Font.ITALIC, 25));
        infoPanel = new JPanel(new GridBagLayout());
        infoPanel.add(nameLabel);

        tagLabel = new JLabel("Name Of Customer: ");
        tagLabel.setFont(new Font("Serif", Font.BOLD, 20));
        nameCust = new JTextField(20);
        issueBut = new JButton("Done");
        issueBut.setPreferredSize(new Dimension(100, 30));
        issueBut.addActionListener(this);
        issueLabel = new JLabel("Customer Is BlackListed");
        issueLabel.setFont(new Font("Serif", Font.BOLD, 20));
        issueLabel.setVisible(false);
        noIssuLabel = new JLabel("Well The Customer Is Not In Your ");
        noIssuLabel.setFont(new Font("Serif", Font.BOLD, 20));
        noIssuLabel.setVisible(false);
        mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
       
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(tagLabel , gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        mainPanel.add(nameCust , gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        mainPanel.add(emptyLabel1 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        mainPanel.add(emptyLabel2 , gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        mainPanel.add(issueBut , gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        mainPanel.add(emptyLabel3 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        mainPanel.add(emptyLabel4 , gbc);
        gbc.gridx = 2;
        gbc.gridy = 7;
        mainPanel.add(issueLabel , gbc);
        gbc.gridx = 2;
        gbc.gridy = 7;
        mainPanel.add(noIssuLabel , gbc);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.gridx = 1;
        gbc1.gridy = 1;
        add(infoPanel , gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 2;
        add(emptyLabel5 , gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 3;
        add(emptyLabel6 , gbc1);
        gbc1.gridx = 1;
        gbc1.gridy = 4;
        add(mainPanel , gbc1);

        setSize(1960, 1080);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }

    // Funciton To Delete The Details Of Customer Which Is Selected As BlackListed
    public void deleteFromCustDetails(String id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query1 = "delete from custdetails where customer_id = " + id;
            PreparedStatement ps1 = con.prepareStatement(query1);
            ps1.executeUpdate();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Function TO Insert Data Into Database (Blacklisted)
    public void insertIntoBlacklistedTable( String name , String date_time){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "insert into blackcust (blackcust_name , date_time) value (? , ?)";
            PreparedStatement pst = con.prepareStatement(query);

            
            
            pst.setString(1, name);
            pst.setString(2, date_time);
            pst.executeLargeUpdate();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Funtion To Find Whether The Name Is Actually Your Customer Or Not
    public boolean isCustomerAvailable(JTextField tf){
        boolean flag = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query1 = "select * from custdetails";
            PreparedStatement ps1 = con.prepareStatement(query1);
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next()){
                if(tf.getText().equals(rs1.getString(2))){

                    
                    String name = rs1.getString(2);
                    String id = ""+ rs1.getInt(1);
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat();
                    String dateStr = sdf.format(date);

                    // Insertion Function Call To Insert In BlackList Table
                    insertIntoBlacklistedTable(name, dateStr);

                    // Delete The BLacklisted Customer Name From Customer Details
                    deleteFromCustDetails(id);

                    flag = true;
                }
            }

            
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return flag;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(isCustomerAvailable(nameCust)){
            issueLabel.setVisible(true);
            nameCust.setText("");
            noIssuLabel.setVisible(false);
        }
        else{
            noIssuLabel.setVisible(true);
            issueLabel.setVisible(false);
        }
    }
    
}
