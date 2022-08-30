package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.ColorUIResource;

public class Inteface extends javax.swing.JFrame {
    
    public Inteface() {
        initComponents();
        
        URL caminhoicon=getClass().getResource("/imagen/img/user.png");
        Image iconeTitulo=Toolkit.getDefaultToolkit().getImage(caminhoicon);
        this.setIconImage(iconeTitulo);
    }
     public static boolean adm=false;
             
             
             
             
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Senha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" CONTROLE FINACEIRO"));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 170, 70, 40);

        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        jPanel1.add(Senha);
        Senha.setBounds(250, 210, 109, 19);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\rodri\\Desktop\\images\\user.png")); // NOI18N
        jLabel6.setText("Usuario ");
        jLabel6.setDisabledIcon(null);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 120, 100, 16);

        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });
        jPanel1.add(Nome);
        Nome.setBounds(250, 150, 109, 19);

        jButton1.setBackground(new java.awt.Color(225, 234, 244));
        jButton1.setText("Acessar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, null, java.awt.Color.darkGray, java.awt.Color.black));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 250, 109, 21);

        jButton3.setBackground(new java.awt.Color(225, 235, 244));
        jButton3.setText("Sair");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, null, java.awt.Color.darkGray, java.awt.Color.black));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(250, 300, 109, 21);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rodri\\Documents\\conectadojavacql\\taxa-de-administração.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 620, 430);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        
        try {
            String Nomeuser;
            String Senhauser;

            Nomeuser = Nome.getText();
            Senhauser = Senha.getText();

            UsuarioDTO objuser = new UsuarioDTO();
            objuser.setNome_usuario(Nomeuser);
            objuser.setSenha_usuario(Senhauser);
        
            UsuarioDAO objdao=new UsuarioDAO();
            ResultSet ret_usuariodao= objdao.verificacao_de_usuario(objuser);
            
            
            if(Nome.getText().equals("Adm")&&Senha.getText().equals("134")){
                adm=true;
                TelaAdm telaadm=new TelaAdm();
                  telaadm.setVisible(true);
                  dispose();
            }
            else if (ret_usuariodao.next()) {
                Telauzer telapc=new Telauzer();
                telapc.setVisible(true);
                dispose();
            } else {
                Nome.setText("");
                Senha.setText("");
                JOptionPane.showMessageDialog(null, "usuario ou senha invalido");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "vie", JOptionPane.ERROR_MESSAGE);
            
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed

    }//GEN-LAST:event_NomeActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(new Color(40, 165, 42));
        jButton1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setBackground(new Color(238, 12, 14));
        jButton3.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
       jButton3.setBackground(new Color(225, 234, 244));
        jButton3.setForeground(new Color(0,0,0));
                                         
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(225, 234, 244));
        jButton1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jButton1MouseExited

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inteface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nome;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
