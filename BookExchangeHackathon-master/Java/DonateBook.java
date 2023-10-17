import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DonateBook extends JFrame implements ActionListener{
    private JPanel mainPanel , infoPanel;
    private JLabel nameLabel , tagLabel ,tagLabel2 , issueLabel , noIssuLabel , emptyLabel1 , emptyLabel2 , emptyLabel3 , emptyLabel4 , emptyLabel5 , emptyLabel6 , emptyLabel7 , emptyLabel8;
    private JTextField nameBook , unqNameBook;
    private JButton issueBut;    

    DonateBook(){
        super("Book Exchange - Customer - Donate A Book");
        
        emptyLabel1 = new JLabel(" ");
        emptyLabel2 = new JLabel(" ");
        emptyLabel3 = new JLabel(" ");
        emptyLabel4 = new JLabel(" ");
        emptyLabel5 = new JLabel(" ");
        emptyLabel6 = new JLabel(" ");
        emptyLabel7 = new JLabel(" ");
        emptyLabel8 = new JLabel(" ");

        nameLabel = new JLabel("Please Fill The Following Information");
        nameLabel.setFont(new Font("Serif", Font.ITALIC, 25));
        infoPanel = new JPanel(new GridBagLayout());
        infoPanel.add(nameLabel);

        tagLabel = new JLabel("Name Of Book: ");
        tagLabel.setFont(new Font("Serif", Font.BOLD, 20));
        nameBook = new JTextField(20);
        tagLabel2 = new JLabel("Set A Unique Name: ");
        tagLabel2.setFont(new Font("Serif", Font.BOLD, 20));
        unqNameBook = new JTextField(20);
        issueBut = new JButton("Donate");
        issueBut.setPreferredSize(new Dimension(100, 30));
        issueBut.addActionListener(this);
        issueLabel = new JLabel("Book Is Donated");
        issueLabel.setFont(new Font("Serif", Font.BOLD, 20));
        issueLabel.setVisible(false);
        noIssuLabel = new JLabel("Thank You For Donating");
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
        mainPanel.add(emptyLabel7 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        mainPanel.add(tagLabel2 , gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        mainPanel.add(unqNameBook , gbc);


        gbc.gridx = 1;
        gbc.gridy = 4;
        mainPanel.add(emptyLabel1 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        mainPanel.add(emptyLabel2 , gbc);
        gbc.gridx = 2;
        gbc.gridy = 6;
        mainPanel.add(issueBut , gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        mainPanel.add(emptyLabel3 , gbc);
        gbc.gridx = 1;
        gbc.gridy = 8;
        mainPanel.add(emptyLabel4 , gbc);
        gbc.gridx = 2;
        gbc.gridy = 9;
        mainPanel.add(issueLabel , gbc);
        gbc.gridx = 1;
        gbc.gridy = 10;
        mainPanel.add(emptyLabel8 , gbc);
        gbc.gridx = 2;
        gbc.gridy = 11;
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


    // Function TO Insert INto Donated Table
    public void insertIntoDonatedTable(String unqName , String name){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "insert into donbooks (don_book_unq , don_book_name ) value (? , ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, unqName);
            pst.setString(2, name);
            pst.executeLargeUpdate();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String unqName = unqNameBook.getText();
        String name = nameBook.getText();
        insertIntoDonatedTable(unqName, name);
        issueLabel.setVisible(true);
        noIssuLabel.setVisible(true);
        
    }
}
