/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.avaliacaoprofessores.view;

import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.controller.TipoAtividadeController;
import com.ufg.avaliacaoprofessores.dao.TipoAtividadeDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author victor.tarelho
 */
public class CadastroTipoAtividade extends javax.swing.JFrame {

    public CadastroTipoAtividade() throws Exception {
        initComponents();
        TipoAtividadeController tipoAtividadeController = new TipoAtividadeController();
        tipoAtividadeController.preencheComboTipoAtividadePai(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desc_ativ_lbl = new javax.swing.JLabel();
        mas_pont_ativ_lbl = new javax.swing.JLabel();
        id_ativ_lbl = new javax.swing.JLabel();
        max_pont_ativ_txt = new javax.swing.JTextField();
        desc_ativ_txt = new javax.swing.JTextField();
        id_ativ_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        desc_ativ_lbl1 = new javax.swing.JLabel();
        mas_pont_ativ_lbl1 = new javax.swing.JLabel();
        cod_tipo_ativ_txt = new javax.swing.JTextField();
        desc_tipo_ativ_txt = new javax.swing.JTextField();
        voltar_tipo_ativ_bt = new javax.swing.JButton();
        salvar_tipo_ativ_bt = new javax.swing.JButton();
        mas_pont_ativ_lbl2 = new javax.swing.JLabel();
        atividade_pai_txt = new javax.swing.JComboBox();

        desc_ativ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc_ativ_lbl.setText("Descrição");
        desc_ativ_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mas_pont_ativ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mas_pont_ativ_lbl.setText("Máx. Pontos");
        mas_pont_ativ_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        id_ativ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_ativ_lbl.setText("ID");
        id_ativ_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro do Tipo de Atividade");

        desc_ativ_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc_ativ_lbl1.setText("Descrição");
        desc_ativ_lbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mas_pont_ativ_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mas_pont_ativ_lbl1.setText("Código");
        mas_pont_ativ_lbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        voltar_tipo_ativ_bt.setText("Voltar");
        voltar_tipo_ativ_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_tipo_ativ_btActionPerformed(evt);
            }
        });

        salvar_tipo_ativ_bt.setText("Salvar");
        salvar_tipo_ativ_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_tipo_ativ_btActionPerformed(evt);
            }
        });

        mas_pont_ativ_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mas_pont_ativ_lbl2.setText("Ativ. Pai");
        mas_pont_ativ_lbl2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 117, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(128, 128, 128))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(salvar_tipo_ativ_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(voltar_tipo_ativ_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mas_pont_ativ_lbl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mas_pont_ativ_lbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desc_ativ_lbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desc_tipo_ativ_txt)
                            .addComponent(cod_tipo_ativ_txt)
                            .addComponent(atividade_pai_txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc_ativ_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desc_tipo_ativ_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mas_pont_ativ_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cod_tipo_ativ_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mas_pont_ativ_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atividade_pai_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_tipo_ativ_bt)
                    .addComponent(voltar_tipo_ativ_bt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltar_tipo_ativ_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_tipo_ativ_btActionPerformed
        this.setVisible(false);
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
    }//GEN-LAST:event_voltar_tipo_ativ_btActionPerformed

    private void salvar_tipo_ativ_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_tipo_ativ_btActionPerformed
        TipoAtividadeController tipoAtividadeController = new TipoAtividadeController();
        tipoAtividadeController.validaCadastro(this);
    }//GEN-LAST:event_salvar_tipo_ativ_btActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTipoAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTipoAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTipoAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTipoAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  CadastroTipoAtividade cadastroTipoAtividade;
                try {
                    cadastroTipoAtividade = new CadastroTipoAtividade();
                    cadastroTipoAtividade.setVisible(true);
                    cadastroTipoAtividade.setLocationRelativeTo(null);
                } catch (Exception ex) {
                    Logger.getLogger(CadastroAtividade.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public JTextField getDesc_tipo_ativ_txt() {
        return desc_tipo_ativ_txt;
    }

    public void setDesc_ativ_txt(JTextField desc_tipo_ativ_txt) {
        this.desc_tipo_ativ_txt = desc_tipo_ativ_txt;
    }

    public JTextField getCodigo_tipo_ativ_txt() {
        return cod_tipo_ativ_txt;
    }

    public void setCodigo_tipo_ativ_txt(JTextField cod_tipo_ativ_txt) {
        this.cod_tipo_ativ_txt = cod_tipo_ativ_txt;
    }
    
    public JComboBox getAtividadePaiCombo() {
        return atividade_pai_txt;
    }

    public void setAtividadePaiCombo(JComboBox atividade_pai_txt) {
        this.atividade_pai_txt = atividade_pai_txt;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox atividade_pai_txt;
    private javax.swing.JTextField cod_tipo_ativ_txt;
    private javax.swing.JLabel desc_ativ_lbl;
    private javax.swing.JLabel desc_ativ_lbl1;
    private javax.swing.JTextField desc_ativ_txt;
    private javax.swing.JTextField desc_tipo_ativ_txt;
    private javax.swing.JLabel id_ativ_lbl;
    private javax.swing.JTextField id_ativ_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mas_pont_ativ_lbl;
    private javax.swing.JLabel mas_pont_ativ_lbl1;
    private javax.swing.JLabel mas_pont_ativ_lbl2;
    private javax.swing.JTextField max_pont_ativ_txt;
    private javax.swing.JButton salvar_tipo_ativ_bt;
    private javax.swing.JButton voltar_tipo_ativ_bt;
    // End of variables declaration//GEN-END:variables
}
