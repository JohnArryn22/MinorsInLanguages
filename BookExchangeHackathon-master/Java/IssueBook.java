
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

public class IssueBook extends JFrame implements ActionListener{

    private JPanel mainPanel , infoPanel;
    private JLabel nameLabel , tagLabel , issueLabel , noIssuLabel , emptyLabel1 , emptyLabel2 , emptyLabel3 , emptyLabel4 , emptyLabel5 , emptyLabel6;
    private JTextField nameBook;
    private JButton issueBut;    

    IssueBook(){
        super("Book Exchange - Customer - Issue A Book");
        
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

        tagLabel = new JLabel("Name Of Book: ");
        tagLabel.setFont(new Font("Serif", Font.BOLD, 20));
        nameBook = new JTextField(20);
        issueBut = new JButton("Issue");
        issueBut.setPreferredSize(new Dimension(100, 30));
        issueBut.addActionListener(this);
        issueLabel = new JLabel("Book Is Issued");
        issueLabel.setFont(new Font("Serif", Font.BOLD, 20));
        issueLabel.setVisible(false);
        noIssuLabel = new JLabel("Book Is Not Available");
        noIssuLabel.setFont(new Font("Serif", Font.BOLD, 20));
        noIssuLabel.setVisible(false);
        mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
       
        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(tagLabel , gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        mainPanel.add(nameBook , gbc);
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


    // Function To Dlelete From Exchanged Table
    public void deleteFromExchangedBooks(String id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query1 = "delete from excbooks where exc_book_id = " + id;
            PreparedStatement ps1 = con.prepareStatement(query1);
            ps1.executeUpdate();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Function To Dlelete From Donated Table
    public void deleteFromDonatedBooks(String id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query1 = "delete from donbooks where don_book_id = " + id;
            PreparedStatement ps1 = con.prepareStatement(query1);
            ps1.executeUpdate();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Function To Dlelete From Available Table
    public void deleteFromAvailableBooks(String id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query1 = "delete from avlbooks where avl_book_id = " + id;
            PreparedStatement ps1 = con.prepareStatement(query1);
            ps1.executeUpdate();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Funtion To Insert Into Issued Table
    public void insertIntoIssuedTable(String unqName , String name , String date_time){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "insert into issuedbooks (issued_book_unq , issued_book_name , date_time) value (? , ? , ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, unqName);
            pst.setString(2, name);
            pst.setString(3, date_time);
            pst.executeLargeUpdate();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    // Function To Check If The Book Is Available Or Not
    public boolean isBookAvailable(JTextField tf){
        boolean flag = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query1 = "select * from avlbooks";
            PreparedStatement ps1 = con.prepareStatement(query1);
            ResultSet rs1 = ps1.executeQuery();
            while(rs1.next()){
                if(tf.getText().equals(rs1.getString(3))){

                    String unqName =  rs1.getString(2);
                    String name = rs1.getString(3);
                    String id = ""+ rs1.getInt(1);
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat();
                    String dateStr = sdf.format(date);
                    insertIntoIssuedTable(unqName, name , dateStr);

                    deleteFromAvailableBooks(id);

                    flag = true;
                }
            }

            String query2 = "select * from donbooks";
            PreparedStatement ps2 = con.prepareStatement(query2);
            ResultSet rs2 = ps2.executeQuery();
            while(rs2.next()){
                if(tf.getText().equals(rs2.getString(3))){

                    String unqName =  rs2.getString(2);
                    String name = rs2.getString(3);
                    String id = ""+rs2.getInt(1);
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat();
                    String dateStr = sdf.format(date);
                    insertIntoIssuedTable(unqName, name , dateStr);

                    deleteFromDonatedBooks(id);
                    flag = true;
                }
            }

            String query3 = "select * from excbooks";
            PreparedStatement ps3 = con.prepareStatement(query3);
            ResultSet rs3 = ps3.executeQuery();
            while(rs3.next()){
                if(tf.getText().equals(rs3.getString(3))){

                    String unqName =  rs3.getString(2);
                    String name = rs3.getString(3);
                    String id = ""+rs3.getInt(1);
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat();
                    String dateStr = sdf.format(date);
                    insertIntoIssuedTable(unqName, name , dateStr);

                    deleteFromExchangedBooks(id);
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
        if(isBookAvailable(nameBook)){
            issueLabel.setVisible(true);
            nameBook.setText("");
            noIssuLabel.setVisible(false);
        }
        else{
            noIssuLabel.setVisible(true);
            issueLabel.setVisible(false);
        }


    }
    
}
