package com.ufg.avaliacaoprofessores.telas;

import com.ufg.avaliacaoprofessores.controller.AvaliacaoController;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CadastroAvaliacao extends javax.swing.JFrame {

    private AvaliacaoController controller;
    private File arquivo;

    public CadastroAvaliacao() {
        controller = new AvaliacaoController();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        realizarAvaliacaoBtn = new javax.swing.JButton();
        caminhoArquivoLabel = new javax.swing.JLabel();
        buscar_arq_bt = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        persistirJsonBtn = new javax.swing.JButton();
        sair_avaliacao_bt = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Realizar Avaliação");

        realizarAvaliacaoBtn.setText("Calcular Pontuação");
        realizarAvaliacaoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarAvaliacaoBtnActionPerformed(evt);
            }
        });

        caminhoArquivoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        caminhoArquivoLabel.setText("Caminho do arquivo");
        caminhoArquivoLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        buscar_arq_bt.setText("Buscar Arquivo");
        buscar_arq_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_arq_btActionPerformed(evt);
            }
        });

        persistirJsonBtn.setText("Persistir Json");
        persistirJsonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persistirJsonBtnActionPerformed(evt);
            }
        });

        sair_avaliacao_bt.setText("Sair");
        sair_avaliacao_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_avaliacao_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addComponent(persistirJsonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(realizarAvaliacaoBtn)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caminhoArquivoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buscar_arq_bt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair_avaliacao_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caminhoArquivoLabel)
                    .addComponent(buscar_arq_bt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(realizarAvaliacaoBtn)
                    .addComponent(persistirJsonBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair_avaliacao_bt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realizarAvaliacaoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarAvaliacaoBtnActionPerformed
           controller.validaJson(arquivo);
           controller.consomeJson(arquivo);
    }//GEN-LAST:event_realizarAvaliacaoBtnActionPerformed

    private void buscar_arq_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_arq_btActionPerformed
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            arquivo = fc.getSelectedFile();
            JOptionPane.showMessageDialog(null, "Voce escolheu o arquivo: " + arquivo.getName());
        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_buscar_arq_btActionPerformed

    private void persistirJsonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persistirJsonBtnActionPerformed
        
    }//GEN-LAST:event_persistirJsonBtnActionPerformed

    private void sair_avaliacao_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_avaliacao_btActionPerformed
        this.setVisible(false);
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
    }//GEN-LAST:event_sair_avaliacao_btActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAvaliacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroAvaliacao cadastroAvaliacao = new CadastroAvaliacao();
                cadastroAvaliacao.setVisible(true);
                cadastroAvaliacao.setLocationRelativeTo(null);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar_arq_bt;
    private javax.swing.JLabel caminhoArquivoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton persistirJsonBtn;
    private javax.swing.JButton realizarAvaliacaoBtn;
    private javax.swing.JButton sair_avaliacao_bt;
    // End of variables declaration//GEN-END:variables
}
