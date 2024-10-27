package hotelmanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        setForeground(Color.CYAN);
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel NewLabel = new JLabel(i3);
        NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);

        JLabel HotelManagementSystem = new JLabel("THE LUVANIA WELCOMES YOU");
        HotelManagementSystem.setForeground(Color.yellow);
        HotelManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
        HotelManagementSystem.setBounds(600, 60, 1000, 85);
        NewLabel.add(HotelManagementSystem);


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu hotel_management = new JMenu("HOTEL MANAGEMENT");
        hotel_management.setForeground(Color.BLUE);
        menuBar.add(hotel_management);

        JMenuItem reception = new JMenuItem("RECEPTION");
        hotel_management.add(reception);
        reception.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception();
            }
        });

        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.RED);
        menuBar.add(admin);

        JMenuItem addEmployeeBtn = new JMenuItem("ADD EMPLOYEE");
        admin.add(addEmployeeBtn);
        addEmployeeBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
        });


        JMenuItem addRoomBtn = new JMenuItem("ADD ROOMS");
        admin.add(addRoomBtn);
        addRoomBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
        });


        JMenuItem AddDriverBtn = new JMenuItem("ADD DRIVERS");
        admin.add(AddDriverBtn);
        AddDriverBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
        });
        
        setSize(1950,1090);
        setVisible(true);
        getContentPane().setBackground(Color.gray);
    }
}
