/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packCliente;

/**
 *
 * @author juan.gferreira
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        endereço = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        celular = new javax.swing.JLabel();
        txtFCelular = new javax.swing.JFormattedTextField();
        cpf = new javax.swing.JLabel();
        txtFCpf = new javax.swing.JFormattedTextField();
        bairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        numero = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        Cidade = new javax.swing.JLabel();
        txtCiddade = new javax.swing.JTextField();
        uf = new javax.swing.JLabel();
        txtFUF = new javax.swing.JFormattedTextField();
        CEP = new javax.swing.JLabel();
        txtFCEP = new javax.swing.JFormattedTextField();
        Telefone = new javax.swing.JLabel();
        txtFTelefone = new javax.swing.JFormattedTextField();
        JbtnSalvar = new javax.swing.JButton();
        JbtnCancelar = new javax.swing.JButton();
        JmnuBarra = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mItemSair = new javax.swing.JMenuItem();
        JmnuArquivo = new javax.swing.JMenu();
        mItemModificar = new javax.swing.JMenuItem();
        mItemExibir = new javax.swing.JMenuItem();
        mItemApagar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N

        nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nome.setText("Nome:");

        txtNome.setToolTipText("");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        endereço.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        endereço.setText("Endereço:");

        txtEnd.setToolTipText("Digite o endereço do cliente");
        txtEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndActionPerformed(evt);
            }
        });

        celular.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        celular.setText("Celular:");

        try {
            txtFCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFCelular.setToolTipText("Apenas numeros");
        txtFCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCelularActionPerformed(evt);
            }
        });

        cpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cpf.setText("CPF:");

        try {
            txtFCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFCpf.setToolTipText("Apenas numeros");
        txtFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCpfActionPerformed(evt);
            }
        });

        bairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bairro.setText("Bairro:");

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        numero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numero.setText("Numero:");

        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });

        Cidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Cidade.setText("Cidade:");

        txtCiddade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCiddadeActionPerformed(evt);
            }
        });

        uf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        uf.setText("UF:");

        try {
            txtFUF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AA")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFUFActionPerformed(evt);
            }
        });

        CEP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        CEP.setText("CEP:");
        CEP.setToolTipText("");

        try {
            txtFCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFCEP.setToolTipText("Apenas numeros");
        txtFCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCEPActionPerformed(evt);
            }
        });

        Telefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Telefone.setText("Telefone:");

        try {
            txtFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFTelefone.setToolTipText("Apenas numero");
        txtFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFTelefoneActionPerformed(evt);
            }
        });

        JbtnSalvar.setText("Salvar");
        JbtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnSalvarActionPerformed(evt);
            }
        });

        JbtnCancelar.setText("Cancelar");
        JbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(celular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endereço, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCiddade, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uf))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNum)
                                    .addComponent(txtFUF, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JbtnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JbtnCancelar))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(Telefone)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtEnd)
                                        .addComponent(txtNome)))
                                .addGap(0, 16, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bairro)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numero)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereço)
                            .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCiddade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CEP)
                    .addComponent(txtFCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf)
                    .addComponent(txtFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celular)
                    .addComponent(txtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnSalvar))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JbtnCancelar, JbtnSalvar});

        jMenu2.setText("Executar");
        jMenu2.setToolTipText("");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salvar");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("Cancelar");
        jMenu2.add(jMenuItem2);

        mItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packImagens/Exit-18dp.png"))); // NOI18N
        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        jMenu2.add(mItemSair);

        JmnuBarra.add(jMenu2);

        JmnuArquivo.setText("Arquivo");

        mItemModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packImagens/Edit-18dp.png"))); // NOI18N
        mItemModificar.setText("Modificar");
        mItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemModificarActionPerformed(evt);
            }
        });
        JmnuArquivo.add(mItemModificar);

        mItemExibir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packImagens/Exibir-18dp.png"))); // NOI18N
        mItemExibir.setText("Exibir");
        mItemExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemExibirActionPerformed(evt);
            }
        });
        JmnuArquivo.add(mItemExibir);

        mItemApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/packImagens/Lixeira-18dp.png"))); // NOI18N
        mItemApagar.setText("Apagar");
        JmnuArquivo.add(mItemApagar);

        JmnuBarra.add(JmnuArquivo);

        setJMenuBar(JmnuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemModificarActionPerformed
        Modificar modificar = new Modificar();

        modificar.setVisible(true);
    }//GEN-LAST:event_mItemModificarActionPerformed

    private void mItemExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemExibirActionPerformed
        LocalizarE localE = new LocalizarE();
        
        localE.setVisible(true);
        
        
        
    }//GEN-LAST:event_mItemExibirActionPerformed

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        System.exit(0);
      
    }//GEN-LAST:event_mItemSairActionPerformed

    private void JbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnCancelarActionPerformed

    }//GEN-LAST:event_JbtnCancelarActionPerformed

    private void JbtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnSalvarActionPerformed
        String celular;
        
        celular = txtFCelular.getText();
    }//GEN-LAST:event_JbtnSalvarActionPerformed

    private void txtFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFTelefoneActionPerformed
        String telefone= txtFTelefone.getText().replace("(","").replace(")","").replace("-", "");
    }//GEN-LAST:event_txtFTelefoneActionPerformed

    private void txtFCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCEPActionPerformed
        String cep = txtFCEP.getText().replace("-","");
    }//GEN-LAST:event_txtFCEPActionPerformed

    private void txtFUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFUFActionPerformed
        String uf = txtFUF.getText().toUpperCase();
    }//GEN-LAST:event_txtFUFActionPerformed

    private void txtCiddadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCiddadeActionPerformed
        String cidade = txtCiddade.getText().toUpperCase().trim();
    }//GEN-LAST:event_txtCiddadeActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        String num = txtNum.getText().toUpperCase();
    }//GEN-LAST:event_txtNumActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        String bairro = txtBairro.getText().toUpperCase().trim();
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCpfActionPerformed
        String cpf = txtFCpf.getText().replace("-","");

    }//GEN-LAST:event_txtFCpfActionPerformed

    private void txtFCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCelularActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFCelularActionPerformed

    private void txtEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndActionPerformed
        // TODO add your handling code here:
        txtEnd.getText().toUpperCase();
    }//GEN-LAST:event_txtEndActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText().toUpperCase().trim();
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel Cidade;
    private javax.swing.JButton JbtnCancelar;
    private javax.swing.JButton JbtnSalvar;
    private javax.swing.JMenu JmnuArquivo;
    private javax.swing.JMenuBar JmnuBarra;
    private javax.swing.JLabel Telefone;
    private javax.swing.JLabel bairro;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel endereço;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mItemApagar;
    private javax.swing.JMenuItem mItemExibir;
    private javax.swing.JMenuItem mItemModificar;
    private javax.swing.JMenuItem mItemSair;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel numero;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCiddade;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JFormattedTextField txtFCEP;
    private javax.swing.JFormattedTextField txtFCelular;
    private javax.swing.JFormattedTextField txtFCpf;
    private javax.swing.JFormattedTextField txtFTelefone;
    private javax.swing.JFormattedTextField txtFUF;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNum;
    private javax.swing.JLabel uf;
    // End of variables declaration//GEN-END:variables
}
