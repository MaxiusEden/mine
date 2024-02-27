/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author puc
 */
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

        JTextField_Altura.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N

        JComboBox_Sexo.setFont(new java.awt.Font("Liberation Sans", 2, 14)); // NOI18N
        JComboBox_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Opções--", "Masculino", "Feminino" }));
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JtextField_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTextField_Peso, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(JTextField_Altura)))
                    .addComponent(JButtom_Executar))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JtextField_NomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTextField_Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTextField_Altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JButtom_Executar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(29, 29, 29))
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
        String nomeCompleto = "";
        int peso = 0;
        float altura = 0;
        String sexo = "";
        
        nomeCompleto = JtextField_NomeCompleto.getText();
        peso = Integer.parseInt(JTextField_Peso.getText());
        altura = Float.parseFloat(JTextField_Altura.getText());
        
        String saida = "CLINICA GYN\n";
        saida += "DADOS DO PACIENTE\n";
        
        JTextArea_Saida.setText(saida);
    }//GEN-LAST:event_JButtom_ExecutarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
