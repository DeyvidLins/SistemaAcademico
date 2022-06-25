/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guicurso;

import curso.Curso;
import curso.NegocioCurso;
import guialuno.CadastrarAluno;
import guidisciplina.InserirDisciplina;
import javax.swing.JOptionPane;

public class InserirCurso extends javax.swing.JFrame {

    public InserirCurso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jComboBox1 = new javax.swing.JComboBox();
        jButtonCadastrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNomeCurso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTurma = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        btnCadastraCurso = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        alterDados = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user_add.png"))); // NOI18N
        jButtonCadastrar.setText("Cadastrar Aluno");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Código Do Curso :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 167, -1, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoCodigo(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 167, 52, -1));

        txtNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCursoActionPerformed(evt);
            }
        });
        txtNomeCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoNomeC(evt);
            }
        });
        jPanel1.add(txtNomeCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 205, 413, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nome Do Curso :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 206, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Período:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 244, -1, -1));

        txtTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurmaActionPerformed(evt);
            }
        });
        txtTurma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTurma(evt);
            }
        });
        jPanel1.add(txtTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 310, 108, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Turno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 273, -1, -1));

        txtPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodoActionPerformed(evt);
            }
        });
        txtPeriodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPeriodo(evt);
            }
        });
        jPanel1.add(txtPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 243, 42, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Turma:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 309, -1, -1));

        txtTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurnoActionPerformed(evt);
            }
        });
        txtTurno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTurno(evt);
            }
        });
        jPanel1.add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 274, 104, -1));

        btnCadastraCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/book_open.png"))); // NOI18N
        btnCadastraCurso.setText("Cadastrar Curso");
        btnCadastraCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraCursoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastraCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 272, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo-faculdade-ibratec.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 11, 557, -1));

        alterDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/style_edit.png"))); // NOI18N
        alterDados.setText("Alterar Dados");
        alterDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterDadosActionPerformed(evt);
            }
        });
        jPanel1.add(alterDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 308, 131, -1));

        jMenuBar2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_gear.png"))); // NOI18N
        jMenu3.setText("Opção");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_side_list.png"))); // NOI18N
        jMenuItem6.setText("Cadastrar Disciplina no Sistema");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_redo.png"))); // NOI18N
        jMenuItem4.setText("Voltar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed


    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void btnCadastraCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraCursoActionPerformed
        // cadastrar dados do curso no sqlServer
        Curso c = new Curso();
        try {
            if (txtNomeCurso.getText().equals("") == false) {
                String n = txtNomeCurso.getText();
            }
            c.setCodigoCurso(Integer.parseInt(txtCodigo.getText()));
            c.setNomeCurso(txtNomeCurso.getText());
            c.setPeriodo(Integer.parseInt(txtPeriodo.getText()));
            c.setTurma(txtTurma.getText());
            c.setTurno(txtTurno.getText());

            NegocioCurso N = new NegocioCurso();
            N.cadastrarCurso(c);
            JOptionPane.showMessageDialog(rootPane, "Curso inserido no Sistema");

            //jLabel4.setText(String.valueOf(a.getMatricula()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnCadastraCursoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //chama o form cadastrarDisciplina
        InserirDisciplina cd = new InserirDisciplina();
        cd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //chama o form cadastrarAluno
        CadastrarAluno cd = new CadastrarAluno();
        cd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void alterDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterDadosActionPerformed
        //altera dados o aluno
        try {
            Curso c = new Curso();
            if (txtNomeCurso.getText().equals("") == false) {
                String n = txtNomeCurso.getText();
            }
            //   a.setMatricula(Integer.parseInt(jLabel13.getText()));

            c.setNomeCurso(txtNomeCurso.getText());
            c.setPeriodo(Integer.parseInt(txtPeriodo.getText()));
            c.setTurma(txtTurma.getText());
            c.setTurno(txtTurno.getText());
            c.setCodigoCurso(Integer.parseInt(txtCodigo.getText()));

            NegocioCurso N = new NegocioCurso();
            N.alterarCurso(c);
            JOptionPane.showMessageDialog(rootPane, "dados alterados ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_alterDadosActionPerformed

    private void CampoCodigo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoCodigo
        // restrição do campo codigo do curso 
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();

        }
    }//GEN-LAST:event_CampoCodigo

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void CampoNomeC(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNomeC
        // restrição do campo nome do curso 
         String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_CampoNomeC

    private void txtNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCursoActionPerformed

    private void campoPeriodo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPeriodo
         // restrição da quantidade de numeros e não permite letras 
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
        } else if (txtPeriodo.getText().length() > 1) {
            evt.consume();
        }
    }//GEN-LAST:event_campoPeriodo

    private void txtPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodoActionPerformed

    private void campoTurno(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTurno
   // restrição de numeros e da quantidade de letras
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }else if (txtTurno.getText().length() > 4) {
            evt.consume();
        }
    }//GEN-LAST:event_campoTurno

    private void txtTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurnoActionPerformed
        
    }//GEN-LAST:event_txtTurnoActionPerformed

    private void txtTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurmaActionPerformed
        
    }//GEN-LAST:event_txtTurmaActionPerformed

    private void campoTurma(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTurma
        
    }//GEN-LAST:event_campoTurma

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
            java.util.logging.Logger.getLogger(InserirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InserirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InserirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InserirCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InserirCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterDados;
    private javax.swing.JButton btnCadastraCurso;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtTurma;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
