
package VIEW;

import DAO.AddboletoDAO;
import DTO.AddboletoDTO;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Consut extends javax.swing.JFrame {

   
    public Consut() {
        initComponents();
         URL caminhoicon=getClass().getResource("/imagen/img/plan.png");
        Image iconeTitulo=Toolkit.getDefaultToolkit().getImage(caminhoicon);
        this.setIconImage(iconeTitulo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        idzenha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaboleto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(231, 75, 92, 25);

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 130, 92, 25);

        idzenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idzenhaActionPerformed(evt);
            }
        });
        getContentPane().add(idzenha);
        idzenha.setBounds(231, 38, 92, 25);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("sua senha ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(254, 17, 62, 16);

        tabelaboleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Descriçao", "Tipo", "Adicionar", "Valor", "Data", "Situaçao", "Forma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaboleto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 230, 617, 149);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\rodri\\Documents\\conectadojavacql\\a62cfd8bdc98858b1ff7f0503d54b1d9.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 638, 310);
        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(616, 449));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(Inteface.adm==true){ 
        TelaAdm telapc = new TelaAdm();
        telapc.setVisible(true);
        dispose();
       } else{
          Telauzer u=new Telauzer();
          u.setVisible(true);
          dispose();
       }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void idzenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idzenhaActionPerformed

       
    }//GEN-LAST:event_idzenhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String id;
        
        id=idzenha.getText();
        
        AddboletoDTO objaddboleto=new AddboletoDTO();
       objaddboleto.setIdboleto(id);
       
       
        LerTabela(id);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idzenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaboleto;
    // End of variables declaration//GEN-END:variables
   public void LerTabela(String zenha) {
        DefaultTableModel modelo = (DefaultTableModel) tabelaboleto.getModel();
        modelo.setNumRows(0);
        AddboletoDAO pdao = new AddboletoDAO();

        for (AddboletoDTO c : pdao.Pesquisasdemovimento(zenha)) {

            modelo.addRow(new Object[]{
                c.getDescricao(),
                c.getFixa_var(),
                c.getLucro_despesa(),
                c.getValor(),
                c.getVencimento(),
                c.getPag_vanc(),
                c.getParcelado_avista(),
                c.getParcelas(),
                c.getIdbolet()
            });

        }
    }

}
