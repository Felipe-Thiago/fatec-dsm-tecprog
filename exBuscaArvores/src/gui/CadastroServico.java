
package GUI;

import Classes.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CadastroServico extends javax.swing.JFrame {

    private Controle controle;
    private Equipamento equipamento=null;
    private Componente componente=null;
    
    public CadastroServico(String idEquipamento, String idComponente, Controle controle) throws Exception {
        this.controle=controle;
        initComponents();
        inicializar(idEquipamento,idComponente);
        this.setVisible(true);
    }
    private void inicializar(String idEquipamento, String idComponente) throws Exception{
        
        //Busca o equipamento pelo IDEquipamento
        equipamento=(Equipamento)controle.getEquipamento(idEquipamento);
        //Busca o componente pelo idComponente
        if(idEquipamento.equals(idComponente)){
            componente=equipamento;
        }else{
            componente= equipamento.buscaComponente(idComponente);
        }
        if(equipamento !=null && componente!=null){
            lblID.setText("Id Equipamento: "+equipamento.getId());
        }else{
            throw new Exception("Componente não foi encontrado");
        }
        
        //Carrega cbox com a lista de Serviços
        cboxServicos.removeAllItems();
        for(EnumServicos serv: EnumServicos.values()){
            cboxServicos.addItem(serv.name());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboxServicos = new javax.swing.JComboBox<>();
        lblValorUnit = new javax.swing.JLabel();
        txtbQtdHoras = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btoSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbDescricao = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboxServicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxServicos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxServicosItemStateChanged(evt);
            }
        });
        cboxServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxServicosActionPerformed(evt);
            }
        });

        lblValorUnit.setText("Valor Unit:");

        txtbQtdHoras.setText("0");
        txtbQtdHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbQtdHorasActionPerformed(evt);
            }
        });

        jLabel1.setText("Qtd Horas");

        btoSalvar.setText("Salvar");
        btoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        lblID.setText("lblID");

        jScrollPane1.setViewportView(txtbDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxServicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValorUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbQtdHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addComponent(cboxServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorUnit)
                    .addComponent(txtbQtdHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxServicosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxServicosItemStateChanged
        
        if(cboxServicos.getSelectedIndex()!=-1){
            //Se getSelectedIndex=-1 significa que nenhum item do cbox foi selecionado
            //Atribui ao label o valor correspondente ao Serviço selecionado
            lblValorUnit.setText(String.valueOf( EnumServicos.valueOf(cboxServicos.getSelectedItem().toString()).getValor()));
        }
    }//GEN-LAST:event_cboxServicosItemStateChanged

    private void btoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoSalvarActionPerformed
        
        //Adiciona um novo serviço ao componente
        try {
            String servicoSelecionado=cboxServicos.getSelectedItem().toString();
            EnumServicos servico= EnumServicos.getEnumServico(servicoSelecionado);
        
            controle.addServico(equipamento.getId(), componente.getId(),servico,
                    txtbDescricao.getText(),Float.parseFloat(txtbQtdHoras.getText()) );
            
            //Fecha a janela 
            CadastroServico.this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btoSalvarActionPerformed

    private void cboxServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxServicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxServicosActionPerformed

    private void txtbQtdHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbQtdHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbQtdHorasActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new CadastroServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoSalvar;
    private javax.swing.JComboBox<String> cboxServicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblValorUnit;
    private javax.swing.JTextPane txtbDescricao;
    private javax.swing.JTextField txtbQtdHoras;
    // End of variables declaration//GEN-END:variables
}
