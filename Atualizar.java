/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.AddboletoDAO;
import DTO.AddboletoDTO;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class Atualizar extends javax.swing.JFrame {

    /**
     * Creates new form Atualizar
     */
    public Atualizar() {
        initComponents();
        lerTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        lucdepre = new javax.swing.ButtonGroup();
        fivar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabaltera = new javax.swing.JTable();
        Cituaciones = new javax.swing.JComboBox<>();
        Bottlucro = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Datadepagament = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        desctxt = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Bottfixa = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Bottvaria = new javax.swing.JCheckBox();
        Bottdespesas = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        avista = new javax.swing.JCheckBox();
        Parcela = new javax.swing.JCheckBox();
        atualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        idzenha = new javax.swing.JTextField();
        valo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabaltera.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tabaltera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Descricao", "Tipo", "Movimento", "Valor", "Data", "Situacao", "Forma da compra", "id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabaltera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabalteraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabaltera);

        Cituaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paga", "Atrasada" }));
        Cituaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CituacionesActionPerformed(evt);
            }
        });

        lucdepre.add(Bottlucro);
        Bottlucro.setText("Lucro");
        Bottlucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottlucroActionPerformed(evt);
            }
        });

        jLabel2.setText("Situaçao:");

        jLabel5.setText("Adicionar:");

        try {
            Datadepagament.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Datadepagament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatadepagamentActionPerformed(evt);
            }
        });

        desctxt.setColumns(20);
        desctxt.setRows(5);
        jScrollPane2.setViewportView(desctxt);

        jLabel6.setText("Data do pagamento");

        fivar.add(Bottfixa);
        Bottfixa.setText("Fixa");
        Bottfixa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BottfixaItemStateChanged(evt);
            }
        });
        Bottfixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottfixaActionPerformed(evt);
            }
        });

        jLabel3.setText("Descriçao:");

        jLabel4.setText("Tipo:");

        fivar.add(Bottvaria);
        Bottvaria.setText("Variavel");

        lucdepre.add(Bottdespesas);
        Bottdespesas.setText("Despesas");
        Bottdespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottdespesasActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor:");

        jLabel7.setText("Forma de pagamento");

        buttonGroup2.add(avista);
        avista.setText("Ávista");
        avista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avistaMouseClicked(evt);
            }
        });
        avista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avistaActionPerformed(evt);
            }
        });

        buttonGroup2.add(Parcela);
        Parcela.setText("Parcelado");

        atualizar.setText("Atualizar");
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });

        jLabel9.setText("senha");

        idzenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idzenhaActionPerformed(evt);
            }
        });

        valo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valoActionPerformed(evt);
            }
        });

        jLabel8.setText("ID");

        id.setEditable(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jButton2.setText("Deletar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Bottdespesas)
                                            .addComponent(Bottfixa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Bottvaria)
                                            .addComponent(Bottlucro)))
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Datadepagament)
                                            .addComponent(Cituaciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(valo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(65, 65, 65))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(avista))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Parcela)
                                            .addComponent(idzenha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bottdespesas)
                    .addComponent(Bottlucro)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bottfixa, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bottvaria, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Datadepagament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Cituaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(avista)
                                    .addComponent(Parcela))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(idzenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel10))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizar)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CituacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CituacionesActionPerformed
        //colocar a acao aqui
    }//GEN-LAST:event_CituacionesActionPerformed

    private void BottlucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottlucroActionPerformed

    }//GEN-LAST:event_BottlucroActionPerformed

    private void DatadepagamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatadepagamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatadepagamentActionPerformed

    private void BottfixaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BottfixaItemStateChanged


    }//GEN-LAST:event_BottfixaItemStateChanged

    private void BottfixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottfixaActionPerformed

        // colocar o codigo que for fazer a escolha da opção
    }//GEN-LAST:event_BottfixaActionPerformed

    private void BottdespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottdespesasActionPerformed

    }//GEN-LAST:event_BottdespesasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Inteface.adm==true){ 
        TelaAdm telapc = new TelaAdm();
        telapc.setVisible(true);
        dispose();
       } else{
          Telauzer u=new Telauzer();
          u.setVisible(true);
          dispose();
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void avistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avistaActionPerformed
        // colocar a o codigo que vai escolher a ação
    }//GEN-LAST:event_avistaActionPerformed

    public void lerTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tabaltera.getModel();
        modelo.setNumRows(0);
        AddboletoDAO pdao = new AddboletoDAO();

        for (AddboletoDTO c : pdao.vertabela()) {

            modelo.addRow(new Object[]{
                c.getDescricao(),
                c.getFixa_var(),
                c.getLucro_despesa(),
                c.getValor(),
                c.getVencimento(),
                c.getPag_vanc(),
                c.getParcelado_avista(),
                c.getIdbolet()
            });

        }
    }
    
    
    private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
        
        
        String lucro_despesa;
        String fixa_var;
        String data;
        String situacao;
        String descricao;
        String forma;
        int parcelada;
        String password;
        int idbole;

        descricao = desctxt.getText();
        double value = Double.parseDouble(valo.getText());
        data = Datadepagament.getText();
        password = idzenha.getText();
        idbole=Integer.parseInt(id.getText());
        
        
        
        
        AddboletoDTO objalteraboleto = new AddboletoDTO();
        objalteraboleto.setValor(value);
        objalteraboleto.setDescricao(descricao);
        objalteraboleto.setVencimento(data);
        objalteraboleto.setConfirmasenha(password);
        objalteraboleto.setIdbolet(idbole);
        if (Bottfixa.isSelected()) {
            objalteraboleto.setFixa_var("conta Fixa");
        }
        if (Bottvaria.isSelected()) {
            objalteraboleto.setFixa_var("conta Variavel");
        }
        if (Bottdespesas.isSelected()) {
            objalteraboleto.setLucro_despesa("Despesas");
        }
        if (Bottlucro.isSelected()) {
            objalteraboleto.setLucro_despesa("lucro");
        }
        if (Cituaciones.getSelectedItem().toString().equals("Paga")) {
            objalteraboleto.setPag_vanc("conta paga");
        }
        if (Cituaciones.getSelectedItem().toString().equals("Atrasada")) {
            objalteraboleto.setPag_vanc("conta atrasada");
        }
        if (Parcela.isSelected()) {
            objalteraboleto.setParcelado_avista("conta parcelada");
        }
        if (avista.isSelected()) {
            objalteraboleto.setParcelado_avista("conta Avista");
        }

        AddboletoDAO alteraboleto = new AddboletoDAO();
        alteraboleto.alterarboleto(objalteraboleto);

        
        JOptionPane.showMessageDialog(null, "Atualizacao concluido com sucesso");
        
        lerTabela();
        
        valo.setText("");
        desctxt.setText("");
        Datadepagament.setText("");
        idzenha.setText("");

    }//GEN-LAST:event_atualizarActionPerformed

    private void idzenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idzenhaActionPerformed

    }//GEN-LAST:event_idzenhaActionPerformed

    private void valoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valoActionPerformed

    private void tabalteraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabalteraMouseClicked
        if (tabaltera.getSelectedRow() != -1) {
            
            desctxt.setText(tabaltera.getValueAt(tabaltera.getSelectedRow(), 0).toString());
            valo.setText(tabaltera.getValueAt(tabaltera.getSelectedRow(), 3).toString());
            Datadepagament.setText(tabaltera.getValueAt(tabaltera.getSelectedRow(), 4).toString());
            id.setText(tabaltera.getValueAt(tabaltera.getSelectedRow(), 7).toString());
            
            
            
            String fic_var, luc_dep, forma;

            luc_dep = tabaltera.getValueAt(tabaltera.getSelectedRow(), 2).toString();
            if (luc_dep.equals("Despesas")) {
                Bottdespesas.doClick();
            } if(luc_dep.equals("lucro")) {
                Bottlucro.doClick();
            }

            fic_var = tabaltera.getValueAt(tabaltera.getSelectedRow(), 1).toString();
            if (fic_var.equals("conta Fixa")) {
                Bottfixa.doClick();
            }
            if (fic_var.equals("conta Variavel")) {
                Bottvaria.doClick();
            }

            forma = tabaltera.getValueAt(tabaltera.getSelectedRow(), 6).toString();
            if (forma.equals("conta parcelada")) {
                Parcela.doClick();
            } 
            if(forma.equals("conta Avista")){
                avista.doClick();
            }
            
            
            String situacao;
            
            situacao= tabaltera.getValueAt(tabaltera.getSelectedRow(), 5).toString();
            if(Cituaciones.getSelectedItem().toString().equals("Paga")){
                Cituaciones.setSelectedItem("Paga");
            }
            if(Cituaciones.getSelectedItem().toString().equals("Atrasado")){
                Cituaciones.setSelectedItem("Atrasada");
            }
            
            //Cituaciones.set(tabaltera.getValueAt(tabaltera.getSelectedRow(), 5).toString());

//txtPlaca.setText(tabaltera.getValueAt(tabaltera.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_tabalteraMouseClicked

    private void avistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avistaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avistaMouseClicked

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if (tabaltera.getSelectedRow() != -1) {
            AddboletoDTO c = new AddboletoDTO();
            AddboletoDAO dao = new AddboletoDAO();

            c.setIdbolet((int) tabaltera.getValueAt(tabaltera.getSelectedRow(),7));
            dao.excluirCadastroboleto(c);

            lerTabela();

        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Bottdespesas;
    private javax.swing.JCheckBox Bottfixa;
    private javax.swing.JCheckBox Bottlucro;
    private javax.swing.JCheckBox Bottvaria;
    private javax.swing.JComboBox<String> Cituaciones;
    private javax.swing.JFormattedTextField Datadepagament;
    private javax.swing.JCheckBox Parcela;
    private javax.swing.JButton atualizar;
    private javax.swing.JCheckBox avista;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextArea desctxt;
    private javax.swing.ButtonGroup fivar;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idzenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup lucdepre;
    private javax.swing.JTable tabaltera;
    private javax.swing.JTextField valo;
    // End of variables declaration//GEN-END:variables

    private void LerTabela(JTextField Confirmasenha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void LerTabela(String zenha) {
        DefaultTableModel modelo = (DefaultTableModel) tabaltera.getModel();
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
                c.getIdbolet()
            });

        }
    }

}