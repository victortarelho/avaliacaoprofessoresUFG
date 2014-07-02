package com.ufg.avaliacaoprofessores.view;

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
        fecha_sistema_bt = new javax.swing.JButton();
        ed_ativ_bt = new javax.swing.JButton();
        list_ativ_bt = new javax.swing.JButton();
        cad_tipo_ativ_bt = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

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

        fecha_sistema_bt.setText("Sair");
        fecha_sistema_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_sistema_btActionPerformed(evt);
            }
        });

        ed_ativ_bt.setText("Editar Atividade");
        ed_ativ_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ed_ativ_btActionPerformed(evt);
            }
        });

        list_ativ_bt.setText("Listar Atividades");
        list_ativ_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_ativ_btActionPerformed(evt);
            }
        });

        cad_tipo_ativ_bt.setText("Cadastrar Tipo Ativ.");
        cad_tipo_ativ_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_tipo_ativ_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cad_tipo_ativ_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(list_ativ_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ed_ativ_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha_sistema_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(visualiza_avaliacao_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(realiza_avaliacao_bt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cad_ativ_bt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cad_docente_bt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cad_ativ_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ed_ativ_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list_ativ_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cad_tipo_ativ_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cad_docente_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(realiza_avaliacao_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visualiza_avaliacao_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_sistema_bt)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cad_ativ_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_ativ_btActionPerformed
        try {
            CadastroAtividade cadastroAtividade = new CadastroAtividade();
            cadastroAtividade.setVisible(true);
            cadastroAtividade.setLocationRelativeTo(null);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_cad_ativ_btActionPerformed

    private void cad_docente_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_docente_btActionPerformed
        CadastroDocente cadastroDocente = new CadastroDocente();
        cadastroDocente.setVisible(true);
        cadastroDocente.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_cad_docente_btActionPerformed

    private void realiza_avaliacao_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realiza_avaliacao_btActionPerformed
        CadastroAvaliacao cadastroAvalicao = new CadastroAvaliacao();
        cadastroAvalicao.setVisible(true);
        cadastroAvalicao.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_realiza_avaliacao_btActionPerformed

    private void visualiza_avaliacao_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualiza_avaliacao_btActionPerformed
        VisualizaAvaliacaoGeral visualizaAvaliacao = new VisualizaAvaliacaoGeral();
        visualizaAvaliacao.setVisible(true);
        visualizaAvaliacao.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_visualiza_avaliacao_btActionPerformed

    private void fecha_sistema_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_sistema_btActionPerformed
        System.exit(0);
    }//GEN-LAST:event_fecha_sistema_btActionPerformed

    private void ed_ativ_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ed_ativ_btActionPerformed
        EditaAtividade editaAtividade = new EditaAtividade();
        editaAtividade.setVisible(true);
        editaAtividade.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ed_ativ_btActionPerformed

    private void list_ativ_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_ativ_btActionPerformed
        ListaAtividades listaAtividade;
        try {
            listaAtividade = new ListaAtividades();
            listaAtividade.setVisible(true);
            listaAtividade.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_list_ativ_btActionPerformed

    private void cad_tipo_ativ_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_tipo_ativ_btActionPerformed
        CadastroTipoAtividade tipoAtividade;
        try {
            tipoAtividade = new CadastroTipoAtividade();
            tipoAtividade.setVisible(true);
            tipoAtividade.setLocationRelativeTo(null);
            this.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cad_tipo_ativ_btActionPerformed

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
    private javax.swing.JButton cad_tipo_ativ_bt;
    private javax.swing.JButton ed_ativ_bt;
    private javax.swing.JButton fecha_sistema_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton list_ativ_bt;
    private javax.swing.JButton realiza_avaliacao_bt;
    private javax.swing.JButton visualiza_avaliacao_bt;
    // End of variables declaration//GEN-END:variables
}
