package visao;
import javax.swing.JOptionPane;
import entidades.Paciente;

 public class Tela_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
     
    public Tela_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JtextField_NomeCompleto = new javax.swing.JTextField();
        JTextField_Peso = new javax.swing.JTextField();
        JTextField_Altura = new javax.swing.JTextField();
        JComboBox_Sexo = new javax.swing.JComboBox<>();
        JButtom_Executar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTextArea_Saida = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLINICA DE PESO ClinGYN");

        jLabel1.setFont(new java.awt.Font("Nimbus Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro do Paciente");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        jLabel2.setText("Nome Completo:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        jLabel3.setText("Peso:");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        jLabel4.setText("Altura:");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        jLabel5.setText("Sexo:");

        JtextField_NomeCompleto.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        JtextField_NomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtextField_NomeCompletoActionPerformed(evt);
            }
        });

        JTextField_Peso.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        JTextField_Peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_PesoActionPerformed(evt);
            }
        });
        JTextField_Peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextField_PesoKeyTyped(evt);
            }
        });

        JTextField_Altura.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        JTextField_Altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextField_AlturaKeyTyped(evt);
            }
        });

        JComboBox_Sexo.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        JComboBox_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        JComboBox_Sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBox_SexoActionPerformed(evt);
            }
        });

        JButtom_Executar.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        JButtom_Executar.setText("EXECUTAR");
        JButtom_Executar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtom_ExecutarActionPerformed(evt);
            }
        });

        JTextArea_Saida.setColumns(20);
        JTextArea_Saida.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        JTextArea_Saida.setRows(5);
        jScrollPane1.setViewportView(JTextArea_Saida);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tarefas POO_resized_resized_resized.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(JTextField_Peso, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(JTextField_Altura)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(JComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JButtom_Executar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(JtextField_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JtextField_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(JTextField_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(JTextField_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(JComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127)
                        .addComponent(JButtom_Executar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(134, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JtextField_NomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtextField_NomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtextField_NomeCompletoActionPerformed

    private void JTextField_PesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_PesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_PesoActionPerformed

    private void JComboBox_SexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBox_SexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBox_SexoActionPerformed

    private void JButtom_ExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtom_ExecutarActionPerformed
       Paciente p1 = new Paciente();
       
       p1.nomeCompleto = JtextField_NomeCompleto.getText();
       p1.peso = Integer.parseInt(JTextField_Peso.getText());
       p1.altura = Float.parseFloat(JTextField_Altura.getText());
       p1.sexo = (String) JComboBox_Sexo.getSelectedItem();
       
        
        if(p1.nomeCompleto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome Completo faltando", "\nInsira o por favor: ", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        
        String saida = "CLINICA GYN\n"; 
        saida += "DADOS DO PACIENTE\n";  
        JTextArea_Saida.setText(saida + "Nome Completo: " + p1.nomeCompleto + "\nPeso: " + p1.peso
        + "\nAltura: " + p1.altura + "\nSexo: " + p1.sexo + "\nIMC: " + p1.calcularIMC());
        
        
    }//GEN-LAST:event_JButtom_ExecutarActionPerformed

    private void JTextField_PesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_PesoKeyTyped
     
                char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();  // Ignora o evento de digitação
                }
            
    }//GEN-LAST:event_JTextField_PesoKeyTyped

    private void JTextField_AlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_AlturaKeyTyped
       char c = evt.getKeyChar();
                if (!Character.isDigit(c)) {
                    evt.consume();  
                }
    }//GEN-LAST:event_JTextField_AlturaKeyTyped

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtom_Executar;
    private javax.swing.JComboBox<String> JComboBox_Sexo;
    private javax.swing.JTextArea JTextArea_Saida;
    private javax.swing.JTextField JTextField_Altura;
    private javax.swing.JTextField JTextField_Peso;
    private javax.swing.JTextField JtextField_NomeCompleto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
