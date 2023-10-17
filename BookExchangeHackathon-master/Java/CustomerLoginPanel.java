import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class CustomerLoginPanel extends JPanel implements ActionListener{
    private JLabel fillDetails , name , number , emptyLabel1 , emptyLabel2 ,  emptyLabel3 ,  emptyLabel4;
    private JTextField nameField , numberField;
    private JButton cont;

    //Constructor For Customer Login Panel
    public CustomerLoginPanel(){

        fillDetails = new JLabel("Fill In The Following Details");
        fillDetails.setFont(new Font("Serif", Font.ITALIC, 25));
        emptyLabel1 = new JLabel(" ");
        emptyLabel2 = new JLabel(" ");
        emptyLabel3 = new JLabel(" ");
        emptyLabel4 = new JLabel(" ");

        name = new JLabel("Name:  ");
        name.setFont(new Font("Serif", Font.BOLD, 20));
        nameField = new JTextField(20);
        
        number = new JLabel("Phone Number:  ");
        number.setFont(new Font("Serif", Font.BOLD, 20));
        numberField = new JTextField(20);

        cont = new JButton("Continue");

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
        add(number, gbc);
        gbc.gridx = 3;
        gbc.gridy = 6;
        add(numberField, gbc);
        gbc.gridx = 1;
        gbc.gridy = 7;
        add(emptyLabel4, gbc);
        gbc.gridx = 2;
        gbc.gridy = 8;
        add(cont, gbc);
        setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 3) ,"Signin As Customer" , TitledBorder.CENTER , TitledBorder.TOP));

        cont.addActionListener(this);
    }


    // Funtion To Insert The Customer Details In The DataBase
    public void custTableInput(String name , String number , String date){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_exchange_db?user=root&password=1234");
            String query = "insert into custdetails (customer_name , customer_number , date_time) value (? , ? , ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, number);
            pst.setString(3, date);
            pst.executeLargeUpdate();
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

    
    public void actionPerformed(ActionEvent e) {
        String custName = nameField.getText();
        String custNumber = numberField.getText();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String dateStr = sdf.format(date);

        // Insertion Function Called
        custTableInput(custName, custNumber, dateStr);

        // Frame Class Of Customer Functions Called
        CustomerFunctionsFrame cfp = new CustomerFunctionsFrame();
        nameField.setText("");
        numberField.setText("");
        cfp.setVisible(true);
    }
}