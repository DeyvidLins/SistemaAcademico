/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guialuno;

import aluno.Aluno;
import aluno.NegocioAluno;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SelecionarAluno extends javax.swing.JFrame {

    private ArrayList<Aluno> listaAlunos;

    public SelecionarAluno() {
        initComponents();
        //centralizando o form
        this.setLocationRelativeTo(null);
    }

    private void preencherTabelaAlunos() {
        //novo modelo para ser sobreposto na tabela
        DefaultTableModel modelo = new DefaultTableModel();
        String[] colunasDaTabela = new String[]{"Matricula", "Nome"};
        modelo.setColumnIdentifiers(colunasDaTabela);
        for (Aluno a : this.listaAlunos) {
            String[] dadosDalinha = new String[]{"" + a.getMatricula(), a.getNome(),};
            modelo.addRow(dadosDalinha);
        }
        jTable1.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPesquisar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        txtMatricula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPesquisar.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros da Pesquisa: "));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Matricula:");

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoMatricula(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Matricula", "Nome"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPesquisarLayout = new javax.swing.GroupLayout(PanelPesquisar);
        PanelPesquisar.setLayout(PanelPesquisarLayout);
        PanelPesquisarLayout.setHorizontalGroup(
            PanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(PanelPesquisarLayout.createSequentialGroup()
                        .addGroup(PanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPesquisarLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar))
                            .addComponent(jButton1))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addGap(282, 282, 282))
        );
        PanelPesquisarLayout.setVerticalGroup(
            PanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_gear.png"))); // NOI18N
        jMenu1.setText("Opção");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_redo.png"))); // NOI18N
        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // verficar se tem a matricula no banco de dados e lista na tabela
        try {
            Aluno al = new Aluno();
            if (txtMatricula.getText().equals("") == false) {
                int m = Integer.parseInt(txtMatricula.getText());
                al.setMatricula(m);
            }

            al.setMatricula(Integer.parseInt(txtMatricula.getText()));

            NegocioAluno N = new NegocioAluno();
            this.listaAlunos = N.listar(al);
            N.listar(al);

            this.preencherTabelaAlunos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            try {

                int remove = JOptionPane.showConfirmDialog(null, "Você realmente Deseja remover o aluno ? ", "ATENÇÃO", JOptionPane.YES_OPTION);
                if (remove == JOptionPane.YES_OPTION) {
                    Aluno a = this.listaAlunos.get(jTable1.getSelectedRow());
                    NegocioAluno re = new NegocioAluno();
                    re.removerAluno(a);

                    JOptionPane.showConfirmDialog(rootPane, "Aluno removido com sucesso");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "selecionar uma linha da tabela");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //chama o form cadastrar aluno,ou seja voltar para o form.
        CadastrarAluno ca = new CadastrarAluno();
        ca.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void CampoMatricula(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoMatricula
        //restriçao de letras para a matricula
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
        } else if (txtMatricula.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_CampoMatricula

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
            java.util.logging.Logger.getLogger(SelecionarAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelecionarAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelecionarAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelecionarAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelecionarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
}
