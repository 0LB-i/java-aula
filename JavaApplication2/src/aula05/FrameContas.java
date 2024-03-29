
package aula05;

import ferramentas.CaixaDeDialogo;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author gabriel.machado4
 */
public class FrameContas extends javax.swing.JFrame {

    /**
     * Creates new form FrameContas
     */
        Conta objConta1;
        Conta objConta2;
        DefaultComboBoxModel modelContas;
        
    public FrameContas() {
        initComponents();
        
        ArrayList<Conta> listaContas = new ArrayList<>();
                
        Conta objConta = new Conta("Gabriel", 1, 2000,500);
        listaContas.add(objConta);
        
        objConta = new Conta("Isabella", 2, 1500, 500);
        listaContas.add(objConta);
        
        modelContas = new DefaultComboBoxModel();
        for (Conta objeto : listaContas){
            modelContas.addElement(objeto);
        }
        cbConta1.setModel(modelContas);
        
        modelContas = new DefaultComboBoxModel();
        for (Conta objeto : listaContas){
            modelContas.addElement(objeto);
        }
        cbConta2.setModel(modelContas);
        
        
    }
    
    private void atualizarSaldos(){
        txt.setText("");
        txt1.setText("");
        lblSaldoConta1.setText("Saldo: "+objConta1.getSaldoConta());
        lblSaldoConta3.setText("Saldo: "+objConta2.getSaldoConta());
        lblLimiteChequeConta1.setText("Lim. Chque Esp.:"+objConta1.getLimiteChequeEspecial());
        lblLimiteChequeConta2.setText("Lim. Chque Esp.:"+objConta2.getLimiteChequeEspecial());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblSaldoConta2 = new javax.swing.JLabel();
        lblConta2 = new javax.swing.JLabel();
        lblConta1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        lblNumConta1 = new javax.swing.JLabel();
        lblNumConta2 = new javax.swing.JLabel();
        lblSaldoConta1 = new javax.swing.JLabel();
        lblSaldoConta3 = new javax.swing.JLabel();
        lblLimiteChequeConta1 = new javax.swing.JLabel();
        lblLimiteChequeConta2 = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        btnS = new javax.swing.JButton();
        btnT = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        btnS1 = new javax.swing.JButton();
        btnT1 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbConta1 = new javax.swing.JComboBox<>();
        cbConta2 = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        lblSaldoConta2.setText("Saldo:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblConta2.setText("Conta2");
        lblConta2.setFocusTraversalPolicyProvider(true);

        lblConta1.setText("Conta1");
        lblConta1.setFocusTraversalPolicyProvider(true);

        lblNome1.setText("Nome: xxxxxxxx");

        lblNome2.setText("Nome: xxxxxxx");

        lblNumConta1.setText("Número: xxxxxx");

        lblNumConta2.setText("Número: xxxxxx");

        lblSaldoConta1.setText("Saldo: xxxxx");

        lblSaldoConta3.setText("Saldo: xxxxxxxx");

        lblLimiteChequeConta1.setText("Lim. Cheq. Espe.: xxxxxxx");

        lblLimiteChequeConta2.setText("Lim. Cheq. Espe.: xxxxxxxx");

        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        btnS.setText("Sacar");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        btnT.setText("Trasnferir");
        btnT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTActionPerformed(evt);
            }
        });

        btnD.setText("Depositar");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        btnS1.setText("Sacar");
        btnS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnS1ActionPerformed(evt);
            }
        });

        btnT1.setText("Trasnferir");
        btnT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnT1ActionPerformed(evt);
            }
        });

        btnD1.setText("Depositar");
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logo_Banco_Fibra.svg.png"))); // NOI18N
        jLabel2.setToolTipText("");

        cbConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblConta1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblSaldoConta1)
                    .addComponent(lblNumConta1)
                    .addComponent(lblNome1)
                    .addComponent(btnD)
                    .addComponent(btnT)
                    .addComponent(btnS)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLimiteChequeConta1)
                    .addComponent(cbConta1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(147, 147, 147)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblConta2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(lblNome2)
                    .addComponent(lblNumConta2)
                    .addComponent(lblSaldoConta3)
                    .addComponent(btnD1)
                    .addComponent(btnT1)
                    .addComponent(btnS1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLimiteChequeConta2)
                    .addComponent(cbConta2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConta2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome1)
                    .addComponent(lblNome2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumConta1)
                    .addComponent(lblNumConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoConta1)
                    .addComponent(lblSaldoConta3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLimiteChequeConta1)
                    .addComponent(lblLimiteChequeConta2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnT1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD1)))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        // Saque
        
        try{
            double valorSaque = Double.parseDouble(txt.getText());
            
            boolean resposta = CaixaDeDialogo.obterinstancia()
                    .pedirConfirmacao("Comfirma o saque no valor de "+valorSaque+"?","Confirmação", 'p');
            
            if(resposta == true)
            if(objConta1.sacar(valorSaque)){
            
            atualizarSaldos();
            }else{
           CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente", 'e');
            }
        
        }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
            atualizarSaldos();
        }
        
        
    }//GEN-LAST:event_btnSActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        // Depositar
        
        try{
            double valorDeposito = Double.parseDouble(txt.getText());
            objConta1.depositar(valorDeposito);
            atualizarSaldos();
        }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
            atualizarSaldos();
        }
           
        
            
            
        
    }//GEN-LAST:event_btnDActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void btnS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnS1ActionPerformed
        // TODO add your handling code here:
        
        try{
            double valorSaque = Double.parseDouble(txt1.getText());
            if(objConta2.sacar(valorSaque)){
            
            atualizarSaldos();
            }else{
            CaixaDeDialogo.obterinstancia().exibirMensagem("Saldo insuficiente", 'e');
            }
        }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
            atualizarSaldos();
        }
    }//GEN-LAST:event_btnS1ActionPerformed

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        // TODO add your handling code here:
        
        try{
            double valorDeposito = Double.parseDouble(txt1.getText());
            objConta2.depositar(valorDeposito);
            atualizarSaldos();
        }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
            atualizarSaldos();
        }
        
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTActionPerformed
        // Transferir
        
        try{
            double valorTrasnferir = Double.parseDouble(txt.getText());
            if(objConta1.tranferir(valorTrasnferir, objConta2)){
            atualizarSaldos();
            }
        }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
            atualizarSaldos();
        }
            
        
    }//GEN-LAST:event_btnTActionPerformed

    private void btnT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT1ActionPerformed
        // TODO add your handling code here:
        
        try{
            double valorTrasnferir = Double.parseDouble(txt1.getText());
            if(objConta2.tranferir(valorTrasnferir, objConta1)){
            atualizarSaldos();
            }
        }catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
            atualizarSaldos();
        }
    }//GEN-LAST:event_btnT1ActionPerformed

    private void cbConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConta1ActionPerformed
        // TODO add your handling code here:
        
        objConta1 = (Conta) cbConta1.getSelectedItem();
        
        lblNome1.setText("Nome: "+objConta1.getNome());
        lblNumConta1.setText("Número: "+objConta1.getNumConta());
        lblLimiteChequeConta1.setText("Lim. Chque Esp.: "+objConta1.getLimiteChequeEspecial());
        lblSaldoConta1.setText("Saldo: " + objConta1.getSaldoConta());
        txt.setText("");
        
        
    }//GEN-LAST:event_cbConta1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameContas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameContas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnD1;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnS1;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnT1;
    private javax.swing.JComboBox<String> cbConta1;
    private javax.swing.JComboBox<String> cbConta2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblConta1;
    private javax.swing.JLabel lblConta2;
    private javax.swing.JLabel lblLimiteChequeConta1;
    private javax.swing.JLabel lblLimiteChequeConta2;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNumConta1;
    private javax.swing.JLabel lblNumConta2;
    private javax.swing.JLabel lblSaldoConta1;
    private javax.swing.JLabel lblSaldoConta2;
    private javax.swing.JLabel lblSaldoConta3;
    private javax.swing.JTextField txt;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables
}
