package DAO;

import DTO.AddboletoDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AddboletoDAO {

    Connection conti;
    PreparedStatement pptmi;
    ResultSet pez;
    ArrayList<AddboletoDTO> lista = new ArrayList<>();

    public void Cadastroboleto(AddboletoDTO objaddboleto) {
        String addmovimento = "insert into boletos(valor, tipo, datadepagamento,senha, descricao, situacao, forma, parcelas, adicionado) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        conti = new Conectu().conectBD();
        try {
            pptmi = conti.prepareStatement(addmovimento);

            pptmi.setDouble(1, objaddboleto.getValor());
            pptmi.setString(2, objaddboleto.getFixa_var());
            pptmi.setString(3, objaddboleto.getVencimento());
            pptmi.setString(4, objaddboleto.getConfirmasenha());
            pptmi.setString(5, objaddboleto.getDescricao());
            pptmi.setString(6, objaddboleto.getPag_vanc());
            pptmi.setString(7, objaddboleto.getParcelado_avista());
            pptmi.setString(8, objaddboleto.getParcelas());
            pptmi.setString(9, objaddboleto.getLucro_despesa());
            pptmi.execute();
            pptmi.close();

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
            JOptionPane.showMessageDialog(null, erro.getMessage(), "cadastro de boleto ", JOptionPane.ERROR_MESSAGE);
        }

    }

    public ArrayList<AddboletoDTO> Pesquisasdemovimento(String zenha) {
        String sql = "SELECT * FROM boletos WHERE senha = ?";
        conti = new Conectu().conectBD();

        try {
            pptmi = conti.prepareStatement(sql);
            pptmi.setString(1, zenha); //pra uzar o here de banco para zelecionar o boleto do uzario atual
            pez = pptmi.executeQuery();
            while (pez.next()) {
                AddboletoDTO objboleto = new AddboletoDTO();
                objboleto.setLucro_despesa(pez.getString("adicionado"));
                objboleto.setParcelado_avista(pez.getString("forma"));
                objboleto.setDescricao(pez.getString("descricao"));
                objboleto.setVencimento(pez.getString("datadepagamento"));
                objboleto.setValor(pez.getInt("valor"));
                objboleto.setParcelas(pez.getString("parcelas"));
                //objboleto.setConfirmasenha(pez.getString("senha"));
                objboleto.setPag_vanc(pez.getString("situacao"));
                objboleto.setFixa_var(pez.getString("tipo"));

                lista.add(objboleto);

            }
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, erro.getMessage(), "erro na conzultar de bolet ", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    Connection cont;

    public List<AddboletoDTO> vertabela() {
        cont = new Conectu().conectBD();
        List<AddboletoDTO> boletos = new ArrayList<>();

        try {
            String sql = "select *from boletos ";
            PreparedStatement pptm = cont.prepareStatement(sql);
            pez = pptm.executeQuery();
            while (pez.next()) {
                AddboletoDTO objboleto = new AddboletoDTO();
                objboleto.setLucro_despesa(pez.getString("adicionado"));
                objboleto.setParcelado_avista(pez.getString("forma"));
                objboleto.setDescricao(pez.getString("descricao"));
                objboleto.setVencimento(pez.getString("datadepagamento"));
                objboleto.setValor(pez.getInt("valor"));
                objboleto.setParcelas(pez.getString("parcelas"));
                //objboleto.setConfirmasenha(pez.getString("senha"));
                objboleto.setPag_vanc(pez.getString("situacao"));
                objboleto.setFixa_var(pez.getString("tipo"));
                objboleto.setIdbolet(pez.getInt("idboleto"));

                boletos.add(objboleto);
            }

            //pptm.setString(1, objuser.getNome_usuario()); 
            //pptm.setString(2, objuser.getSenha_usuario());
            //ResultSet ret = pptm.executeQuery();
            //return boletos;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "uzuariodao", JOptionPane.ERROR_MESSAGE);

            return null;

        }
        return boletos;
    }
    public void excluirCadastroboleto(AddboletoDTO apagar) {
        String sql = "delete from boletos where idboleto = ? ";

        cont = new Conectu().conectBD();

        try {
            pptmi = cont.prepareStatement(sql);

            pptmi.setInt(1, apagar.getIdbolet());

            pptmi.execute();
            pptmi.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "apagar cadatro Excluir" + e.getMessage());
        }
    }
    
    public void alterarboleto( AddboletoDTO cpdto) {
        String sql = "update boletos set  valor= ?, tipo= ?,  datadepagamento= ?, descricao= ?, situacao= ?, forma= ? where idboleto = ? ";

        cont = new Conectu().conectBD();

        try {
            pptmi = cont.prepareStatement(sql);
            pptmi.setDouble(1, cpdto.getValor());
            pptmi.setString(2, cpdto.getFixa_var());
            pptmi.setString(3, cpdto.getVencimento());
            pptmi.setString(4, cpdto.getDescricao());
            pptmi.setString(5, cpdto.getPag_vanc());
            pptmi.setString(6, cpdto.getParcelado_avista());
            pptmi.setInt(7, cpdto.getIdbolet());

            pptmi.execute();
            pptmi.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cadastro Alterado fail" + e.getMessage());
        }
    }
    
    
    
    
}
