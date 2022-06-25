package guiAluno;

import aluno.Aluno;
import aluno.NegocioAluno;
import curso.Curso;
import curso.DadosCurso;
import curso.NegocioCurso;
import guidisciplina.VincularDisciplina;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MatricularAluno extends javax.swing.JFrame {

    private ArrayList<Curso> listaCursos;

    public MatricularAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCurso = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtNomeA = new javax.swing.JTextField();
        btnListarCurso = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nome do Aluno :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 439, -1, -1));

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoMatricula(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 408, 50, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Cursos :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/accept.png"))); // NOI18N
        jButton2.setText("Vincular Curso.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        tabCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Periodo", "Turno", "Turma"
            }
        ));
        jScrollPane1.setViewportView(tabCurso);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 202, 940, 142));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Insira o Codigo do Curso :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 405, -1, -1));

        txtNomeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAActionPerformed(evt);
            }
        });
        txtNomeA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNome(evt);
            }
        });
        jPanel1.add(txtNomeA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 442, 400, -1));

        btnListarCurso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnListarCurso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_side_list.png"))); // NOI18N
        btnListarCurso.setText("Listar Cursos Disponiveis");
        btnListarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCursoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 159, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cross.png"))); // NOI18N
        jButton1.setText("Remover");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo-faculdade-ibratec.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 11, 534, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Vincula o aluno ao Curso
        try {
            Aluno a = new Aluno();

            if (txtNomeA.getText().equals("") == false) {
                String n = txtNomeA.getText();
            }
            a.getCurso().setCodigoCurso(Integer.parseInt(txtCodigo.getText()));
            a.setNome(txtNomeA.getText());

            NegocioAluno Al = new NegocioAluno();
            Al.matricularAluno(a);
            JOptionPane.showMessageDialog(rootPane, " aluno matriculado ");
            VincularDisciplina vd = new VincularDisciplina();
            vd.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnListarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCursoActionPerformed
        //preenchendo a tabela do curso
        try {
            DadosCurso dc = new DadosCurso();
            Curso c = new Curso();
            ArrayList<Curso> listaCurso = dc.listar(c);

            DefaultTableModel modelo = new DefaultTableModel();
            String[] colunas = {"codigo", "Nome", "PERIODO", "TURNO", "TURMA"};
            modelo.setColumnIdentifiers(colunas);
            for (Curso Cs : listaCurso) {
                Object[] linha = {Cs.getCodigoCurso(), Cs.getNomeCurso(), Cs.getPeriodo(), Cs.getTurno(), Cs.getTurma()};
                modelo.addRow(linha);
            }
            NegocioCurso N = new NegocioCurso();
            this.listaCursos = N.listar(c);
            N.listar(c);

            tabCurso.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }


    }//GEN-LAST:event_btnListarCursoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //ação do botao para remover dados
        if (tabCurso.getSelectedRow() >= 0) {
            try {

                int remove = JOptionPane.showConfirmDialog(null, "Você realmente Deseja remover o Curso? ", "ATENÇÃO", JOptionPane.YES_OPTION);
                if (remove == JOptionPane.YES_OPTION) {
                    Curso a = this.listaCursos.get(tabCurso.getSelectedRow());
                    NegocioCurso re = new NegocioCurso();
                    re.removerCurso(a);

                    JOptionPane.showConfirmDialog(rootPane, "Curso removido com sucesso");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "selecionar uma linha da tabela");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void campoMatricula(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoMatricula
        //restriçao de letras para o codigo
        char c = evt.getKeyChar();
        if (Character.isDigit(c) == false) {
            evt.consume();

        }
    }//GEN-LAST:event_campoMatricula

    private void campoNome(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNome
        //restrição de numeros no campo nome
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_campoNome

    private void txtNomeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAActionPerformed

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
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatricularAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatricularAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarCurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCurso;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomeA;
    // End of variables declaration//GEN-END:variables
}
