package hotelmanagementsystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Date;
import java.sql.*;
public class AddCustomer extends JFrame implements ActionListener{
    
    JComboBox comboid;
    JTextField tfnumber,tfname, tfcountry, tfdeposit;
    JRadioButton rmale, rfemale;
    Choice croom;
    JLabel checkintime;
    JButton Add, Back;
    
    AddCustomer(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel text = new JLabel("NEW CUSTOMER FORM");
        text.setBounds(100, 20, 300, 30);
        text.setFont(new Font("Raleway", Font.PLAIN , 20));
        add(text);
        
        JLabel lbid = new JLabel("ID");
        lbid.setBounds(35, 80, 100, 20);
        lbid.setFont(new Font("Raleway", Font.PLAIN , 20));
        add(lbid);
        
      String options[] = {"Aadhar Card", "Passport", "Driving License", "Voter ID"};

       comboid = new JComboBox(options);
       comboid.setBounds(200, 80, 150, 25);
       comboid.setBackground(Color.WHITE);
       add(comboid);
       
       JLabel lbnumber = new JLabel("Number");
       lbnumber.setBounds(35, 120, 100, 20);
        lbnumber.setFont(new Font("Raleway", Font.PLAIN , 20));
        add(lbnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(200, 120, 150, 25);
        add(tfnumber);
    
      JLabel lblname = new JLabel("Name");
      lblname.setBounds(35, 160, 100, 20);
        lblname.setFont(new Font("Raleway", Font.PLAIN , 20));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 160, 150, 25);
        add(tfname);
        
        JLabel lblgender = new JLabel("Gender");
      lblgender.setBounds(35, 200, 100, 25);
        lblgender.setFont(new Font("Raleway", Font.PLAIN , 20));
        add(lblgender);
        
        rmale = new JRadioButton("Male");
        rmale.setBackground(Color.WHITE);
        rmale.setBounds(200, 200, 60, 25);
        add(rmale);
        
        rfemale = new JRadioButton("Female");
        rfemale.setBackground(Color.WHITE);
        rfemale.setBounds(270, 200, 100, 25);
        add(rfemale);
        
        JLabel lblcountry = new JLabel("Country");
      lblcountry.setBounds(35, 240, 100, 20);
        lblcountry.setFont(new Font("Raleway", Font.PLAIN , 20));
        add(lblcountry);
        
        tfcountry = new JTextField();
        tfcountry.setBounds(200, 240, 150, 25);
        add(tfcountry);
        
      JLabel lblroom = new JLabel("Room Number");
      lblroom.setBounds(35, 280, 150, 20);
        lblroom.setFont(new Font("Raleway", Font.PLAIN , 20));
        add(lblroom);
        
        croom = new Choice();
        
        try{
           conn conn = new conn();
           String query ="select * from room where availability = 'Available'";
           ResultSet rs = conn.s.executeQuery(query);
           while(rs.next()){
               croom.add(rs.getString("roomnumber"));
           }
           
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
        
        croom.setBounds(200, 280, 150, 25);
        add(croom);

        JLabel lbltime = new JLabel("Checkin time");
      lbltime.setBounds(35, 320, 150, 20);
        lbltime.setFont(new Font("Raleway", Font.PLAIN , 20));
        add(lbltime);
        
        Date date = new Date();
        
      checkintime= new JLabel("" + date);
      checkintime.setBounds(200, 320, 150, 25);
      checkintime.setFont(new Font("Raleway", Font.PLAIN , 15));
        add(checkintime);   
        
      JLabel lbldeposit = new JLabel("Deposit Amt.");
      lbldeposit.setBounds(35, 360, 150, 20);
        lbldeposit.setFont(new Font("Raleway", Font.PLAIN , 20));
        add(lbldeposit);
        
        tfdeposit = new JTextField();
        tfdeposit.setBounds(200, 360, 150, 25);
        add(tfdeposit);  
        
        Add = new JButton("Add");
        Add.setBackground(Color.BLACK);
        Add.setForeground(Color.WHITE);
        Add.setBounds(50, 410, 120, 30);
        Add.addActionListener(this);
        add(Add); 
        
        Back = new JButton("Back");
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        Back.setBounds(200, 410, 120, 30);
        Back.addActionListener(this);
        add(Back); 
  
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/addCustomer.png"));
        Image i2 =i1.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 50, 300, 400);
        add(image);
                
                
    setBounds(350,200,800,550);
    setVisible(true);
    }

    @Override
   public void actionPerformed (ActionEvent ae){
       if(ae.getSource()== Add){
       String id = (String) comboid.getSelectedItem();
       String number = tfnumber.getText();
       String name = tfname.getText();
       String gender = null;

       if(rmale.isSelected()){
           gender ="Male";
        } else {
           gender = "Female";
       }
       
       String country = tfcountry.getText();
       String room = croom.getSelectedItem();
       String time = checkintime.getText();
       String deposit = tfdeposit.getText();

       try{
        String q1 = "insert into customer values('"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"', '"+room+"', '"+time+"', '"+deposit+"')";
        String query2 = "update room set availability = 'occupied' where roomnumber = '"+room+"'";
        conn c = new conn();
        c.s.executeUpdate(q1);
        c.s.executeUpdate(query2);
        JOptionPane.showMessageDialog(null,"New Customer Added Successfully ");
        setVisible(false);
        new Reception();
       } catch (Exception e){
         e.printStackTrace(); 
       }    
    } else if(ae.getSource()== Back){
     setVisible(false);
        new Reception();
    }

   }
   public static void main(String[]args){
       new AddCustomer();
   }
}
