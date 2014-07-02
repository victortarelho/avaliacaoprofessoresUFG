package com.ufg.avaliacaoprofessores.view;

import com.ufg.avaliacaoprofessores.bean.Atividade;
import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.controller.AtividadeController;
import com.ufg.avaliacaoprofessores.dao.TipoAtividadeDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EditaAtividade extends javax.swing.JFrame {

    AtividadeController controller;
    Atividade atividade;

    public EditaAtividade() {
        initComponents();
        controller = new AtividadeController();
        TipoAtividadeDAO tipoAtividadeDao = new TipoAtividadeDAO();
        List listTipoAtividade = new ArrayList();
        try {
            listTipoAtividade = tipoAtividadeDao.listar();
        } catch (Exception ex) {
            Logger.getLogger(EditaAtividade.class.getName()).log(Level.SEVERE, null, ex);
        }
        tipoAtividadeCombo.addItem("");
        for (Iterator it = listTipoAtividade.iterator(); it.hasNext();) {
            TipoAtividade object = (TipoAtividade) it.next();
            tipoAtividadeCombo.addItem(object.getId() + "-" + object.getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        salvar_ativ_ed_bt = new javax.swing.JButton();
        max_pont_ativ_txt = new javax.swing.JTextField();
        desc_ativ_txt = new javax.swing.JTextField();
        voltar_ativ_ed_bt = new javax.swing.JButton();
        tipoAtividadeCombo = new javax.swing.JComboBox();
        mas_pont_ativ_lbl1 = new javax.swing.JLabel();
        id_ativ_lbl = new javax.swing.JLabel();
        desc_ativ_lbl = new javax.swing.JLabel();
        mas_pont_ativ_lbl = new javax.swing.JLabel();
        codigo_ativ_txt = new javax.swing.JTextField();
        selec_ativ_ed_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Editar Atividade");

        salvar_ativ_ed_bt.setText("Salvar");
        salvar_ativ_ed_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_ativ_ed_btActionPerformed(evt);
            }
        });

        voltar_ativ_ed_bt.setText("Voltar");
        voltar_ativ_ed_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_ativ_ed_btActionPerformed(evt);
            }
        });

        mas_pont_ativ_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mas_pont_ativ_lbl1.setText("Tipo Ativ.");
        mas_pont_ativ_lbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        id_ativ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_ativ_lbl.setText("Código");
        id_ativ_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        desc_ativ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc_ativ_lbl.setText("Descrição");
        desc_ativ_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mas_pont_ativ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mas_pont_ativ_lbl.setText("Máx. Pontos");
        mas_pont_ativ_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        codigo_ativ_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigo_ativ_txtActionPerformed(evt);
            }
        });

        selec_ativ_ed_bt.setText("Selec.");
        selec_ativ_ed_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec_ativ_ed_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(salvar_ativ_ed_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltar_ativ_ed_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mas_pont_ativ_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desc_ativ_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_ativ_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mas_pont_ativ_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desc_ativ_txt)
                            .addComponent(max_pont_ativ_txt)
                            .addComponent(tipoAtividadeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigo_ativ_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selec_ativ_ed_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_ativ_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo_ativ_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selec_ativ_ed_bt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc_ativ_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_ativ_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mas_pont_ativ_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(max_pont_ativ_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoAtividadeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mas_pont_ativ_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_ativ_ed_bt)
                    .addComponent(voltar_ativ_ed_bt))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvar_ativ_ed_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_ativ_ed_btActionPerformed
        if (atividade == null) {
            JOptionPane.showMessageDialog(null, "Selecione uma atividade primeiro!");
            return;
        }
        AtividadeController avaliacaoController = new AtividadeController();
        avaliacaoController.carregaParaEdicao(this);
        avaliacaoController.atualizaAtividade();
    }//GEN-LAST:event_salvar_ativ_ed_btActionPerformed

    private void voltar_ativ_ed_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_ativ_ed_btActionPerformed
        this.setVisible(false);
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
    }//GEN-LAST:event_voltar_ativ_ed_btActionPerformed

    private void selec_ativ_ed_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec_ativ_ed_btActionPerformed
        if(codigo_ativ_txt == null || codigo_ativ_txt.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Digite o valor do codigo!");
            return;
        }
        try{
            Long.parseLong(codigo_ativ_txt.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um valor numerico para codigo!");
            return;
        }
        atividade = controller.restoreAtividade(Long.parseLong(codigo_ativ_txt.getText()));
        desc_ativ_txt.setText(atividade.getDescricao());
        max_pont_ativ_txt.setText(atividade.getPontos() + "");
        tipoAtividadeCombo.setSelectedItem(atividade.getTipoAtividade().getId() + "-" + atividade.getTipoAtividade().getNome());
    }//GEN-LAST:event_selec_ativ_ed_btActionPerformed

    private void codigo_ativ_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigo_ativ_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigo_ativ_txtActionPerformed

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
            java.util.logging.Logger.getLogger(EditaAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditaAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditaAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditaAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditaAtividade().setVisible(true);
            }
        });
    }

    public JTextField getCodigo_ativ_txt() {
        return codigo_ativ_txt;
    }

    public void setCodigo_ativ_txt(JTextField codigo_ativ_txt) {
        this.codigo_ativ_txt = codigo_ativ_txt;
    }

    public JTextField getDesc_ativ_txt() {
        return desc_ativ_txt;
    }

    public void setDesc_ativ_txt(JTextField desc_ativ_txt) {
        this.desc_ativ_txt = desc_ativ_txt;
    }

    public JTextField getMax_pont_ativ_txt() {
        return max_pont_ativ_txt;
    }

    public void setMax_pont_ativ_txt(JTextField max_pont_ativ_txt) {
        this.max_pont_ativ_txt = max_pont_ativ_txt;
    }

    public JComboBox getTipoAtividadeCombo() {
        return tipoAtividadeCombo;
    }

    public void setTipoAtividadeCombo(JComboBox tipoAtividadeCombo) {
        this.tipoAtividadeCombo = tipoAtividadeCombo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo_ativ_txt;
    private javax.swing.JLabel desc_ativ_lbl;
    private javax.swing.JTextField desc_ativ_txt;
    private javax.swing.JLabel id_ativ_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mas_pont_ativ_lbl;
    private javax.swing.JLabel mas_pont_ativ_lbl1;
    private javax.swing.JTextField max_pont_ativ_txt;
    private javax.swing.JButton salvar_ativ_ed_bt;
    private javax.swing.JButton selec_ativ_ed_bt;
    private javax.swing.JComboBox tipoAtividadeCombo;
    private javax.swing.JButton voltar_ativ_ed_bt;
    // End of variables declaration//GEN-END:variables
}
