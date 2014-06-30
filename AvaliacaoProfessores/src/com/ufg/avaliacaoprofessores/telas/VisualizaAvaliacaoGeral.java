package com.ufg.avaliacaoprofessores.telas;

import com.ufg.avaliacaoprofessores.bean.AvaliacaoDocente;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VisualizaAvaliacaoGeral extends javax.swing.JFrame {

    public VisualizaAvaliacaoGeral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        sair_visual_bt = new javax.swing.JButton();

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

        sair_visual_bt.setText("Sair");
        sair_visual_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_visual_btActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(291, 291, 291))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair_visual_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair_visual_bt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sair_visual_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_visual_btActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sair_visual_btActionPerformed

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
    private javax.swing.JTable jTable1;
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
