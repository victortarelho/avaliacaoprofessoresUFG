package com.ufg.avaliacaoprofessores.telas;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cad_ativ_bt = new javax.swing.JButton();
        cad_docente_bt = new javax.swing.JButton();
        realiza_avaliacao_bt = new javax.swing.JButton();
        visualiza_avaliacao_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tela Inicial");

        cad_ativ_bt.setText("Cadastrar Atividade");
        cad_ativ_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_ativ_btActionPerformed(evt);
            }
        });

        cad_docente_bt.setText("Cadastrar Docente");
        cad_docente_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_docente_btActionPerformed(evt);
            }
        });

        realiza_avaliacao_bt.setText("Realizar Avaliação");
        realiza_avaliacao_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realiza_avaliacao_btActionPerformed(evt);
            }
        });

        visualiza_avaliacao_bt.setText("Visualizar Avaliação");
        visualiza_avaliacao_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualiza_avaliacao_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(visualiza_avaliacao_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(realiza_avaliacao_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cad_ativ_bt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cad_docente_bt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cad_ativ_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cad_docente_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(realiza_avaliacao_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualiza_avaliacao_bt)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cad_ativ_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_ativ_btActionPerformed
        try {
            CadastroAtividade cadastroAtividade = new CadastroAtividade();
            cadastroAtividade.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_cad_ativ_btActionPerformed

    private void cad_docente_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_docente_btActionPerformed
        CadastroDocente cadastroDocente = new CadastroDocente();
        cadastroDocente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cad_docente_btActionPerformed

    private void realiza_avaliacao_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realiza_avaliacao_btActionPerformed
        CadastroAvaliacao cadastroAvalicao = new CadastroAvaliacao();
        cadastroAvalicao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_realiza_avaliacao_btActionPerformed

    private void visualiza_avaliacao_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualiza_avaliacao_btActionPerformed
        VisualizaAvaliacaoGeral visualizaAvaliacao = new VisualizaAvaliacaoGeral();
        visualizaAvaliacao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_visualiza_avaliacao_btActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setVisible(true);
                telaInicial.setLocationRelativeTo(null);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cad_ativ_bt;
    private javax.swing.JButton cad_docente_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton realiza_avaliacao_bt;
    private javax.swing.JButton visualiza_avaliacao_bt;
    // End of variables declaration//GEN-END:variables
}
