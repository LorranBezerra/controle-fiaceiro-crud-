
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conectu {
    public Connection conectBD(){
        Connection cont= null;
         
         
        try {
            String url="jdbc:mysql://localhost:3306/usuario?user=root&password=";
            cont=DriverManager.getConnection(url);
        } catch (SQLException erro){
               JOptionPane.showMessageDialog(null, " aonde ta o banco "+ erro.getMessage(), "conecdao", JOptionPane.ERROR_MESSAGE);           
        }
        return cont;
    }
}
