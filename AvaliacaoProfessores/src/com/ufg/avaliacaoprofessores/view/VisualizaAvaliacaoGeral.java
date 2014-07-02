package com.ufg.avaliacaoprofessores.view;

import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import com.ufg.avaliacaoprofessores.controller.AvaliacaoController;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VisualizaAvaliacaoGeral extends javax.swing.JFrame {

    private AvaliacaoController controller;
    
    public VisualizaAvaliacaoGeral() {
        initComponents();
        controller = new AvaliacaoController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sair_visual_bt = new javax.swing.JButton();
        ordena_nome_bt = new javax.swing.JButton();
        ordena_data_bt = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Visualização de Avaliações");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Docente", "Atividades de Ensino", "Produção Intelectual", "Pesquisa e Extensão", "Administrativas e de Representação", "Outras Atividades", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        sair_visual_bt.setText("Voltar");
        sair_visual_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_visual_btActionPerformed(evt);
            }
        });

        ordena_nome_bt.setText("Ordenar Por Nome");
        ordena_nome_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordena_nome_btActionPerformed(evt);
            }
        });

        ordena_data_bt.setText("Ordenar Por Nota");
        ordena_data_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordena_data_btActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(291, 291, 291))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sair_visual_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(319, 319, 319))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ordena_nome_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ordena_data_bt)
                .addGap(230, 230, 230))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordena_nome_bt)
                    .addComponent(ordena_data_bt))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair_visual_bt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sair_visual_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_visual_btActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_sair_visual_btActionPerformed

    private void ordena_nome_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordena_nome_btActionPerformed
        controller.ordenaListaPorNome(this);
    }//GEN-LAST:event_ordena_nome_btActionPerformed

    private void ordena_data_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordena_data_btActionPerformed
        controller.ordenaListaPorNota(this);
    }//GEN-LAST:event_ordena_data_btActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualizaAvaliacaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizaAvaliacaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizaAvaliacaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizaAvaliacaoGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VisualizaAvaliacaoGeral visualizaAvaliacaoGeral = new VisualizaAvaliacaoGeral();
                visualizaAvaliacaoGeral.setVisible(true);
                visualizaAvaliacaoGeral.setLocationRelativeTo(null);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton ordena_data_bt;
    private javax.swing.JButton ordena_nome_bt;
    private javax.swing.JButton sair_visual_bt;
    // End of variables declaration//GEN-END:variables

    public void carregaListaAvaliacoes(List<AvaliacaoDocente> listaAvaliacaoDocenteFinal) {
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Docente", "Atividades de Ensino", "Produção Intelectual",
                    "Pesquisa e Extensão", "Administrativas e de Representação", "Outras Atividades", "Total"
                });
        jTable1.setModel(model);
        for (AvaliacaoDocente avaliacaoDocente : listaAvaliacaoDocenteFinal) {
            Object[] linha = new Object[7];
            linha[0] = avaliacaoDocente.getDocente().getNome();
            linha[1] = avaliacaoDocente.getPontuacaoAtividadeDeEnsino().toString();
            linha[2] = avaliacaoDocente.getPontuacaoAtividadeProducaoIntelectual().toString();
            linha[3] = avaliacaoDocente.getPontuacaoAtividadePesquisa().toString();
            linha[4] = avaliacaoDocente.getPontuacaoAtividadeAdministrativa().toString();
            linha[5] = avaliacaoDocente.getPontuacaoAtividadeOutras().toString();
            linha[6] = avaliacaoDocente.getPontuacaoTotal().toString();
            model.addRow(linha);
        }
    }

}
