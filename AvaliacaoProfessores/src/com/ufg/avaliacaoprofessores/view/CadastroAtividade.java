package com.ufg.avaliacaoprofessores.view;

import com.ufg.avaliacaoprofessores.bean.TipoAtividade;
import com.ufg.avaliacaoprofessores.controller.AtividadeController;
import com.ufg.avaliacaoprofessores.dao.TipoAtividadeDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class CadastroAtividade extends javax.swing.JFrame {

    public CadastroAtividade() throws Exception {
        initComponents();
        TipoAtividadeDAO tipoAtividadeDao = new TipoAtividadeDAO();
        List listTipoAtividade = new ArrayList();
        listTipoAtividade = tipoAtividadeDao.listar();
        tipoAtividadeCombo.addItem("");
        for (Iterator it = listTipoAtividade.iterator(); it.hasNext();) {
            TipoAtividade object = (TipoAtividade)it.next();
            tipoAtividadeCombo.addItem(object.getId()+"-"+object.getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id_ativ_lbl = new javax.swing.JLabel();
        desc_ativ_lbl = new javax.swing.JLabel();
        mas_pont_ativ_lbl = new javax.swing.JLabel();
        id_ativ_txt = new javax.swing.JTextField();
        desc_ativ_txt = new javax.swing.JTextField();
        max_pont_ativ_txt = new javax.swing.JTextField();
        salvar_ativ_bt = new javax.swing.JButton();
        tipoAtividadeCombo = new javax.swing.JComboBox();
        mas_pont_ativ_lbl1 = new javax.swing.JLabel();
        voltar_ativ_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Atividade");

        id_ativ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_ativ_lbl.setText("Código");
        id_ativ_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        desc_ativ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desc_ativ_lbl.setText("Descrição");
        desc_ativ_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mas_pont_ativ_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mas_pont_ativ_lbl.setText("Máx. Pontos");
        mas_pont_ativ_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        salvar_ativ_bt.setText("Salvar");
        salvar_ativ_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_ativ_btActionPerformed(evt);
            }
        });

        mas_pont_ativ_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mas_pont_ativ_lbl1.setText("Tipo Ativ.");
        mas_pont_ativ_lbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        voltar_ativ_bt.setText("Voltar");
        voltar_ativ_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_ativ_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 133, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(142, 142, 142))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mas_pont_ativ_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(desc_ativ_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_ativ_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mas_pont_ativ_lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_ativ_txt)
                            .addComponent(desc_ativ_txt)
                            .addComponent(max_pont_ativ_txt)
                            .addComponent(tipoAtividadeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvar_ativ_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(voltar_ativ_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_ativ_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_ativ_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(salvar_ativ_bt)
                    .addComponent(voltar_ativ_bt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvar_ativ_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_ativ_btActionPerformed
        AtividadeController avaliacaoController = new AtividadeController();
        avaliacaoController.validaCadastro(this);
        avaliacaoController.insereAtividade();
    }//GEN-LAST:event_salvar_ativ_btActionPerformed

    private void voltar_ativ_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_ativ_btActionPerformed
        this.setVisible(false);
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        telaInicial.setLocationRelativeTo(null);
    }//GEN-LAST:event_voltar_ativ_btActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroAtividade cadastroAtividade;
                try {
                    cadastroAtividade = new CadastroAtividade();
                    cadastroAtividade.setVisible(true);
                    cadastroAtividade.setLocationRelativeTo(null);
                } catch (Exception ex) {
                    Logger.getLogger(CadastroAtividade.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    public JTextField getDesc_ativ_txt() {
        return desc_ativ_txt;
    }

    public void setDesc_ativ_txt(JTextField desc_ativ_txt) {
        this.desc_ativ_txt = desc_ativ_txt;
    }

    public JTextField getId_ativ_txt() {
        return id_ativ_txt;
    }

    public void setId_ativ_txt(JTextField id_ativ_txt) {
        this.id_ativ_txt = id_ativ_txt;
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
    private javax.swing.JLabel desc_ativ_lbl;
    private javax.swing.JTextField desc_ativ_txt;
    private javax.swing.JLabel id_ativ_lbl;
    private javax.swing.JTextField id_ativ_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mas_pont_ativ_lbl;
    private javax.swing.JLabel mas_pont_ativ_lbl1;
    private javax.swing.JTextField max_pont_ativ_txt;
    private javax.swing.JButton salvar_ativ_bt;
    private javax.swing.JComboBox tipoAtividadeCombo;
    private javax.swing.JButton voltar_ativ_bt;
    // End of variables declaration//GEN-END:variables
}
