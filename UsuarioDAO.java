package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection cont;

    public ResultSet verificacao_de_usuario(UsuarioDTO objuser) {
        cont = new Conectu().conectBD();
        try {
            String sql = "select *from cadastro where nick=? and senh=? ";
            PreparedStatement pptm = cont.prepareStatement(sql);
            
            pptm.setString(1, objuser.getNome_usuario()); 
            pptm.setString(2, objuser.getSenha_usuario());
            
            ResultSet ret=pptm.executeQuery();
             return ret;
             
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "uzuariodao", JOptionPane.ERROR_MESSAGE);
            return null; 
            
        }

    }

}
