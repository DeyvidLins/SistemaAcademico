package guialuno;

import aluno.Aluno;
import aluno.DadosAluno;
import aluno.NegocioAluno;
import guicurso.InserirCurso;
import javax.swing.JOptionPane;

public class CadastrarAluno extends javax.swing.JFrame {

    public CadastrarAluno() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        txtData = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        alterDados = new javax.swing.JButton();
        txtRg = new javax.swing.JFormattedTextField();
        itemSexo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblMatricula = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        btnSair = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("D. de Nascimento :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNome(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 480, 30));

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user_add.png"))); // NOI18N
        jButtonCadastrar.setText("Cadastrar Aluno");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        txtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDataKeyTyped(evt);
            }
        });
        jPanel1.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 100, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Cidade :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });
        txtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoEstado(evt);
            }
        });
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 210, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Estado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCidade(evt);
            }
        });
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 140, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Estado Civil :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Sexo :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Telefone :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, 20));

        txtEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoCivilActionPerformed(evt);
            }
        });
        txtEstadoCivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoEstCivil(evt);
            }
        });
        jPanel1.add(txtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 130, 30));

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(81)9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 220, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Cpf:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Rg:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });
        txtCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfKeyTyped(evt);
            }
        });
        jPanel1.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 160, 30));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logo-faculdade-ibratec.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 6, -1, -1));

        alterDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/user_add.png"))); // NOI18N
        alterDados.setText("Alterar Dados");
        alterDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterDadosActionPerformed(evt);
            }
        });
        jPanel1.add(alterDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        try {
            txtRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 130, 30));

        itemSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        itemSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSexoActionPerformed(evt);
            }
        });
        jPanel1.add(itemSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 140, 30));

        jLabel3.setText("Matricula:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));
        jPanel1.add(lblMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 90, 20));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jMenuBar1.setForeground(new java.awt.Color(102, 255, 255));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/page_white_gear.png"))); // NOI18N
        jMenu2.setText("Opções");

        btnSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/door_in.png"))); // NOI18N
        btnSair.setText("Sair do Sistema");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jMenu2.add(btnSair);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/magnifier.png"))); // NOI18N
        jMenuItem1.setText("Buscar Aluno Por Matricula.");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/application_side_list.png"))); // NOI18N
        jMenuItem2.setText("Cadastrar Curso No Sistema");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void recebeMatricula(Integer matricula) throws Exception {
        Object[] Dados = null;
        DadosAluno da = new DadosAluno();

        try {
            Dados = da.mostraMatricula(matricula);
            Aluno aluno = (Aluno) Dados[0];
            //  Curso curso = (Curso) Dados[1];

            this.lblMatricula.setText(Integer.toString(aluno.getMatricula()));
            //  this.lblNome.setText(aluno.getNome());
            //  this.lblCurso.setText(curso.getNomeCurso());

        } catch (Exception ex) {
            throw new Exception(ex.getMessage() + " at line: " + ex.getCause());
        }
    }
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        SelecionarAluno S = new SelecionarAluno();
        S.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        //cadastrando dados do aluno no banco
        try {
            Aluno a = new Aluno();
            if (txtNome.getText().equals("") == false) {
                String n = txtNome.getText();
            }
            // this.lblMatricula.setText(Integer.toString(a.getMatricula()));
            a.setNome(txtNome.getText());
            a.setDataNascimento(txtData.getText());
            a.setCpf(txtCpf.getText());
            a.setRg(txtRg.getText());
            a.setEstado(txtEstado.getText());
            a.setEstadoCivil(txtEstadoCivil.getText());
            a.setCidade(txtCidade.getText());
            a.setSexo(itemSexo.getToolTipText());
            a.setTelefone(txtTelefone.getText());

            NegocioAluno Al = new NegocioAluno();
            Al.cadastrarAluno(a);
            this.lblMatricula.setText(Integer.toString(a.getMatricula()));
            JOptionPane.showMessageDialog(rootPane, "aluno castradado com sucesso");

            /*    guiAluno.MatricularAluno ma = new guiAluno.MatricularAluno();
            ma.setVisible(true);
            this.dispose();*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }


    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        InserirCurso cd = new InserirCurso();
        cd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void alterDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterDadosActionPerformed
        //altera dados o aluno
        try {
            Aluno a = new Aluno();
            if (txtNome.getText().equals("") == false) {
                String n = txtNome.getText();
            }

            a.setNome(txtNome.getText());
            a.setDataNascimento(txtData.getText());
            a.setCpf(txtCpf.getText());
            a.setRg(txtRg.getText());
            a.setEstado(txtEstado.getText());
            a.setEstadoCivil(txtEstadoCivil.getText());
            a.setCidade(txtCidade.getText());
            a.setSexo(itemSexo.getToolTipText());
            a.setTelefone(txtTelefone.getText());
            a.setNome(txtNome.getText());

            NegocioAluno Al = new NegocioAluno();
            Al.alterarAluno(a);
            JOptionPane.showMessageDialog(rootPane, "dados alterados ");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_alterDadosActionPerformed

    private void txtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneKeyTyped

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDataKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataKeyTyped

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed

    }//GEN-LAST:event_txtDataActionPerformed

    private void txtCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfKeyTyped

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoCivilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoCivilActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void campoNome(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNome
        //restrição de numeros no campo nome
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_campoNome

    private void campoEstCivil(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEstCivil
        // restrição de numeros no campo estado civil
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_campoEstCivil

    private void campoEstado(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEstado
        // restrição de numeros no campo estado  e também na quantidade de caracteres
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        } else if (txtEstado.getText().length() > 1) {
            evt.consume();
        }
    }//GEN-LAST:event_campoEstado

    private void campoCidade(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCidade
        //restrição do campo cidade
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_campoCidade

    private void itemSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemSexoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterDados;
    private javax.swing.JMenuItem btnSair;
    private javax.swing.JComboBox<String> itemSexo;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
