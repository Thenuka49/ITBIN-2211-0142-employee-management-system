package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnection {
    
    public static Connection con = null;
    
    public static Connection loadConnection(){
        String url = "jdbc:mysql://localhost:3306/employee_managemenet_system";
        String root = "root";
        String pass = "";
        
        try {
            con = DriverManager.getConnection(url, root, pass);
            if (con != null){
                JOptionPane.showMessageDialog(null, "Database has been connected successfully");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error in database loading" + e);
        }
        return con;
    }
}
