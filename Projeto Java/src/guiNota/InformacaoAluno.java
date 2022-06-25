
package guiNota;

import javax.swing.JOptionPane;
import nota.NegocioNota;
import nota.Nota;

public class InformacaoAluno extends javax.swing.JFrame {

    public InformacaoAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNota1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblMedia = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        txtNota1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoD = new javax.swing.JTextField();
        btnNota2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Nota1:");

        btnNota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_left.png"))); // NOI18N
        btnNota1.setText("Inserir Nota ");
        btnNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNota1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Nota2:");

        lblMedia.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txtMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaActionPerformed(evt);
            }
        });
        txtMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoMatricula(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Matricula:");

        txtNota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNota2(evt);
            }
        });

        txtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota1ActionPerformed(evt);
            }
        });
        txtNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNota1(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Codigo da Disciplina :");

        txtCodigoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoDActionPerformed(evt);
            }
        });
        txtCodigoD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCodigoD(evt);
            }
        });

        btnNota2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_left.png"))); // NOI18N
        btnNota2.setText("Inserir Nota ");
        btnNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNota2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoD, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNota2)
                                    .addComponent(btnNota1)))))
                    .addComponent(lblMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNota1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNota2))
                .addGap(25, 25, 25)
                .addComponent(lblMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_gear.png"))); // NOI18N
        jMenu2.setText("Opção");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/arrow_redo.png"))); // NOI18N
        jMenuItem1.setText("Voltar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("AlterarDados");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNota1ActionPerformed
        //enviar a nota para o sql
        try {
            Nota N = new Nota();
            if (txtMatricula.getText().equals("") == false) {
                String n = txtMatricula.getText();
            }
            N.getAluno().setMatricula(Integer.parseInt(txtMatricula.getText()));
            N.getDisciplina().setCodigoDisciplina(Integer.parseInt(txtCodigoD.getText()));
            N.setNota1(Float.parseFloat(txtNota1.getText()));
            NegocioNota inserir = new NegocioNota();
            inserir.cadastrarNota1(N);
            JOptionPane.showMessageDialog(rootPane, "Nota inserida");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }


    }//GEN-LAST:event_btnNota1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaActionPerformed

    private void campoNota2(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNota2
        // restrição de letras e da quantidade de caracteres
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
            if (txtNota2.getText().length() > 2) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_campoNota2

    private void campoNota1(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNota1
        // restrição de letras e  da quantidade de caracteres
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
            if (txtNota1.getText().length() > 2) {
                evt.consume();
            }
        }

    }//GEN-LAST:event_campoNota1

    private void txtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota1ActionPerformed

    private void txtCodigoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoDActionPerformed

    private void campoMatricula(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMatricula
        // restrição de letras no campo matriculae da quantidade de caracteres
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();
            if (txtMatricula.getText().length() > 9) {
                evt.consume();
            }

        }
    }//GEN-LAST:event_campoMatricula

    private void campoCodigoD(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCodigoD
        // restrição de letras no codigo da disciplina
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();

        }
    }//GEN-LAST:event_campoCodigoD

    private void btnNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNota2ActionPerformed
        try {
            Nota N = new Nota();
            if (txtMatricula.getText().equals("") == false) {
                String n = txtMatricula.getText();
            }
        
            N.setNota2(Float.parseFloat(txtNota2.getText()));
            N.getDisciplina().setCodigoDisciplina(Integer.parseInt(txtCodigoD.getText()));
            N.getAluno().setMatricula(Integer.parseInt(txtMatricula.getText()));

            NegocioNota inserir = new NegocioNota();
            inserir.cadastrarNota2(N);
            JOptionPane.showMessageDialog(rootPane, "Nota nota aterada");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnNota2ActionPerformed

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
            java.util.logging.Logger.getLogger(InformacaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacaoAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacaoAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNota1;
    private javax.swing.JButton btnNota2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JTextField txtCodigoD;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    // End of variables declaration//GEN-END:variables
}
