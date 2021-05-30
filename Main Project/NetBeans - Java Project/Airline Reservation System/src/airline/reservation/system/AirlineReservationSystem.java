/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.reservation.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author udity
 */
public class AirlineReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static String user = null, email = null, CLASS = null;
    public static int flight_id = 0, passenger_count = 0, total_price = 0;
    public static Date DOJ = null;
    
    public static Connection connectDB(){
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","uditya","uditya1234");
            return conn;   
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Login().setVisible(true);
    }
    
}
