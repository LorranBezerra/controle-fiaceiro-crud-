
package DAO;

import DTO.Addnewusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class AddusuarioDAO {
    Connection cont;
    PreparedStatement pptm;
    ResultSet pez;
    ArrayList<AddusuarioDAO> lit = new ArrayList<>();
    
    public void Cadastrouser(Addnewusuario objAddnewusuario){
     String comando="insert into cadastro(nome, gmail, telefone, senh, nick, nacionalidade, nacimento) values(?, ?, ?, ?, ?, ?, ?)";
     cont=new Conectu().conectBD();
        try {
            pptm=cont.prepareStatement(comando);
            pptm.setString(1,objAddnewusuario.getNome());
            pptm.setString(2, objAddnewusuario.getEmail());
            pptm.setString(3, objAddnewusuario.getTelefone());
            pptm.setString(4, objAddnewusuario.getSenha());
            pptm.setString(5, objAddnewusuario.getNick());
            pptm.setString(6, objAddnewusuario.getNascionalidade());
            pptm.setString(7, objAddnewusuario.getNascimento());
            pptm.execute();
            pptm.close();
            
            /*string comando= "insert into boleto(nome, senh, nick) values(?, ?, ?)";
     cont=new Conectu().conectBD();
        try {
            pptm=cont.prepareStatement(comando);
            pptm.setString(1,objAddnewusuario.getNome());
            pptm.setString(2, objAddnewusuario.getEmail());
            pptm.setString(3, objAddnewusuario.getTelefone());
            pptm.setString(4, objAddnewusuario.getSenha());
            pptm.setString(5, objAddnewusuario.getNick());
            pptm.setString(6, objAddnewusuario.getNascionalidade());
            pptm.setString(7, objAddnewusuario.getNascimento());
            pptm.execute();
            pptm.close();*/
            
            
        } catch (Exception erro) {
             JOptionPane.showMessageDialog(null, erro.getMessage(), "cadastro", JOptionPane.ERROR_MESSAGE);
        }
 
    }
    
    
    
    public List<Addnewusuario> veruzuario() {
        cont = new Conectu().conectBD();
        List<Addnewusuario> ver = new ArrayList<>();

        try {
            String sql = "select *from cadastro ";
            PreparedStatement pptm = cont.prepareStatement(sql);
            pez = pptm.executeQuery();
            while (pez.next()) {
                Addnewusuario veruzer = new Addnewusuario();
               veruzer.setNascimento(pez.getString("nacimento"));
               veruzer.setEmail(pez.getString("gmail"));
               veruzer.setNick(pez.getString("nick"));
               veruzer.setTelefone(pez.getString("telefone"));
               veruzer.setNome(pez.getString("nome"));
               veruzer.setSenha(pez.getString("senh"));
               veruzer.setNascionalidade(pez.getString("nacionalidade"));
                veruzer.setIduzer(pez.getInt("iduzer"));
                ver.add(veruzer);
            }


        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "uzuariodao", JOptionPane.ERROR_MESSAGE);

            return null;

        }
        return ver;
    }
    
    public void alteraruzer( Addnewusuario cpdto) {
        String sql = "update cadastro set  nome= ?, gmail=?, telefone= ?, senh= ?, nacionalidade= ?,nacimento= ?, nick= ? where iduzer= ?";

        cont = new Conectu().conectBD();

        try {
            pptm = cont.prepareStatement(sql);
            pptm.setString(1, cpdto.getNome());
            pptm.setString(2, cpdto.getEmail());
            pptm.setString(3, cpdto.getTelefone());
            pptm.setString(4, cpdto.getSenha());
            pptm.setString(5, cpdto.getNascionalidade());
            pptm.setString(6, cpdto.getNascimento());
            pptm.setString(7, cpdto.getNick());
            pptm.setInt(8,cpdto.getIduzer());
            
            pptm.execute();
            pptm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cadastro Alterado fail" + e.getMessage());
        }
        
    }
         public void excluiruzer(Addnewusuario apagar) {
        String sql = "delete from cadastro where iduzer = ? ";

        cont = new Conectu().conectBD();

        try {
            pptm = cont.prepareStatement(sql);

            pptm.setInt(1, apagar.getIduzer());

            pptm.execute();
            pptm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "apagar cadatro Excluir" + e.getMessage());
        }
    }
        
    }
    
    
    
    
    

