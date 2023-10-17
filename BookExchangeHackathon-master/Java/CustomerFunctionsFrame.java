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

public class CustomerFunctionsFrame extends JFrame implements ListSelectionListener{
    private JLabel functionLabel , emptyLabel1 , emptyLabel2 , emptyLabel3;
    private JPanel admFuncLabPanel , admFuncMainPanel;
    private JList admFuncList;
    private JTextArea mainDisplayArea;


    public CustomerFunctionsFrame(){
        super("Book Exchange - Customer Frame");
        functionLabel = new JLabel("As An Customer, You Have The Following Options");
        functionLabel.setFont(new Font("Serif", Font.BOLD, 25));
        emptyLabel1 = new JLabel(" ");
        emptyLabel2 = new JLabel(" ");
        emptyLabel3 = new JLabel(" ");

        admFuncLabPanel = new JPanel(new GridBagLayout());
        admFuncLabPanel.add(functionLabel);

        String [] admFuncs = {
            "Show Books",
            "Issue A Book",
            "Donate A Book",
            "Exchange A Book"
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

    // Function To Show All Books To The Customers
    public void showBooks(){

        int i = 1;
        String temp1 = "";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query1 = "select * from avlbooks";
            PreparedStatement ps1 = con.prepareStatement(query1);
            ResultSet rs1 = ps1.executeQuery();

            mainDisplayArea.setText(" \n");
            while(rs1.next()){
                mainDisplayArea.append(temp1 + i + "          " + rs1.getString(2) + "          " + rs1.getString(3) + "\n");
                i++;
            }
            
            String query2 = "select * from donbooks";
            PreparedStatement ps2 = con.prepareStatement(query2);
            ResultSet rs2 = ps2.executeQuery();

            
            while(rs2.next()){
                mainDisplayArea.append(i + "          " + rs2.getString(2) + "          " + rs2.getString(3) + "\n");
                i++;
            }
            
            String query3 = "select * from excbooks";
            PreparedStatement ps3 = con.prepareStatement(query3);
            ResultSet rs3 = ps3.executeQuery();

            
            while(rs3.next()){
                mainDisplayArea.append(i + "          " + rs3.getString(2) + "          " + rs3.getString(3) + "\n");
                i++;
            }

        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    

    public void valueChanged(ListSelectionEvent e) {

        // Functions Added According To Choice Selected 
        if(admFuncList.getSelectedIndex() == 0){
            showBooks();
        }
        else if(admFuncList.getSelectedIndex() == 1){
            // Issue A Book
            IssueBook ib = new IssueBook();
            ib.setVisible(true);
            mainDisplayArea.setText("");
        }
        else if(admFuncList.getSelectedIndex() == 2){
            // Donate A Book
            DonateBook db = new DonateBook();
            db.setVisible(true);
            mainDisplayArea.setText("");
        }
        else if(admFuncList.getSelectedIndex() == 3){
            // Exchange A Book
            ExchangeBook eb = new ExchangeBook();
            eb.setVisible(true); 
            mainDisplayArea.setText("");
        }

    }


}
