package com.ufg.avaliacaoprofessores.telas;

import com.ufg.avaliacaoprofessores.bean.Docente;
import com.ufg.avaliacaoprofessores.controller.DocenteController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class CadastroDocente extends javax.swing.JFrame {

    public CadastroDocente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome_doc_lbl = new javax.swing.JLabel();
        mat_doc_lbl = new javax.swing.JLabel();
        unid_dep_doc_lbl = new javax.swing.JLabel();
        regime_doc_lbl = new javax.swing.JLabel();
        mat_doc_txt = new javax.swing.JTextField();
        unid_dep_doc_txt = new javax.swing.JTextField();
        regime_doc_txt = new javax.swing.JTextField();
        salvar_doc_bt = new javax.swing.JButton();
        nome_doc_txt = new javax.swing.JTextField();
        sair_docente_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Docente");

        nome_doc_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome_doc_lbl.setText("Nome");
        nome_doc_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nome_doc_lbl.setMaximumSize(new java.awt.Dimension(47, 18));
        nome_doc_lbl.setMinimumSize(new java.awt.Dimension(47, 18));
        nome_doc_lbl.setPreferredSize(new java.awt.Dimension(47, 18));

        mat_doc_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mat_doc_lbl.setText("Matrícula");
        mat_doc_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        unid_dep_doc_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unid_dep_doc_lbl.setText("Unidade/Dep.");
        unid_dep_doc_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        regime_doc_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regime_doc_lbl.setText("Regime");
        regime_doc_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        salvar_doc_bt.setText("Salvar");
        salvar_doc_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_doc_btActionPerformed(evt);
            }
        });

        sair_docente_bt.setText("Voltar");
        sair_docente_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_docente_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(unid_dep_doc_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mat_doc_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nome_doc_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regime_doc_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mat_doc_txt)
                            .addComponent(unid_dep_doc_txt)
                            .addComponent(regime_doc_txt)
                            .addComponent(nome_doc_txt))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 135, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(145, 145, 145))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvar_doc_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair_docente_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome_doc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome_doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mat_doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mat_doc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unid_dep_doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unid_dep_doc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regime_doc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regime_doc_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar_doc_bt)
                    .addComponent(sair_docente_bt))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvar_doc_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_doc_btActionPerformed
        DocenteController docenteController = new DocenteController();
        docenteController.validaCadastro(this);
        docenteController.insereDocente();
    }//GEN-LAST:event_salvar_doc_btActionPerformed

    private void sair_docente_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_docente_btActionPerformed
        this.setVisible(false);
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
    }//GEN-LAST:event_sair_docente_btActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroDocente cadastroDocente;
                try {
                    cadastroDocente = new CadastroDocente();
                    cadastroDocente.setVisible(true);
                    cadastroDocente.setLocationRelativeTo(null);
                } catch (Exception ex) {
                    Logger.getLogger(CadastroDocente.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    public JTextField getMat_doc_txt() {
        return mat_doc_txt;
    }

    public void setMat_doc_txt(JTextField mat_doc_txt) {
        this.mat_doc_txt = mat_doc_txt;
    }

    public JTextField getNome_doc_txt() {
        return nome_doc_txt;
    }

    public void setNome_doc_txt(JTextField nome_doc_txt) {
        this.nome_doc_txt = nome_doc_txt;
    }

    public JTextField getRegime_doc_txt() {
        return regime_doc_txt;
    }

    public void setRegime_doc_txt(JTextField regime_doc_txt) {
        this.regime_doc_txt = regime_doc_txt;
    }

    public JTextField getUnid_dep_doc_txt() {
        return unid_dep_doc_txt;
    }

    public void setUnid_dep_doc_txt(JTextField unid_dep_doc_txt) {
        this.unid_dep_doc_txt = unid_dep_doc_txt;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mat_doc_lbl;
    private javax.swing.JTextField mat_doc_txt;
    private javax.swing.JLabel nome_doc_lbl;
    private javax.swing.JTextField nome_doc_txt;
    private javax.swing.JLabel regime_doc_lbl;
    private javax.swing.JTextField regime_doc_txt;
    private javax.swing.JButton sair_docente_bt;
    private javax.swing.JButton salvar_doc_bt;
    private javax.swing.JLabel unid_dep_doc_lbl;
    private javax.swing.JTextField unid_dep_doc_txt;
    // End of variables declaration//GEN-END:variables
}
