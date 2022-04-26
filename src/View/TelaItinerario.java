/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.Controle.ConexaoBD;
import Controller.Controle.ConexaoItinerario;
import Model.Modelo.ModeloItinerario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author MuAwa
 */
public class TelaItinerario extends javax.swing.JFrame {

    ModeloItinerario mod = new ModeloItinerario();
    ConexaoBD conex = new ConexaoBD();
    ConexaoItinerario control = new ConexaoItinerario();
    
    int flag = 0;

    /** Creates new form TelaItinerario */
    public TelaItinerario() {
        initComponents();
        preencherMotoristas();
        preencherBus();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CancelarIti = new javax.swing.JButton();
        EditarIti = new javax.swing.JButton();
        NovoIti = new javax.swing.JButton();
        EnviarIti = new javax.swing.JButton();
        CodigoIti = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LugarIti = new javax.swing.JTextField();
        ComboMotorista = new javax.swing.JComboBox<>();
        ComboItiBus = new javax.swing.JComboBox<>();
        PesquisarIti = new javax.swing.JButton();
        CampoPesquisar = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Codigo:");

        CancelarIti.setText("Cancelar");
        CancelarIti.setEnabled(false);
        CancelarIti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarItiActionPerformed(evt);
            }
        });

        EditarIti.setText("Editar");
        EditarIti.setEnabled(false);
        EditarIti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarItiActionPerformed(evt);
            }
        });

        NovoIti.setText("Novo");
        NovoIti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoItiActionPerformed(evt);
            }
        });

        EnviarIti.setText("Enviar");
        EnviarIti.setEnabled(false);
        EnviarIti.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                EnviarItiAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        EnviarIti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarItiActionPerformed(evt);
            }
        });

        CodigoIti.setEnabled(false);

        jLabel2.setText(" Motorista :");

        jLabel3.setText(" Bus:");

        jLabel4.setText("Lugar :");

        LugarIti.setEnabled(false);

        ComboMotorista.setEnabled(false);
        ComboMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMotoristaActionPerformed(evt);
            }
        });

        ComboItiBus.setEnabled(false);

        PesquisarIti.setText("Pesquisar");
        PesquisarIti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarItiActionPerformed(evt);
            }
        });

        CampoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CodigoIti)
                                    .addComponent(LugarIti)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboItiBus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboMotorista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NovoIti, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnviarIti, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditarIti, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CancelarIti)
                        .addGap(30, 30, 30))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(PesquisarIti)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoIti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LugarIti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboItiBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnviarIti)
                    .addComponent(NovoIti)
                    .addComponent(EditarIti)
                    .addComponent(CancelarIti))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisarIti))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(395, 292));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComboMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMotoristaActionPerformed

    private void NovoItiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoItiActionPerformed
        flag=1;
        LugarIti.setEnabled(true);
        ComboMotorista.setEnabled(true);
        ComboItiBus.setEnabled(true);
        CancelarIti.setEnabled(true);
        EnviarIti.setEnabled(true);
        EditarIti.setEnabled(false);
        
        CodigoIti.setText("");
        LugarIti.setText("");
        CampoPesquisar.setText("");
        
    }//GEN-LAST:event_NovoItiActionPerformed

    private void EnviarItiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarItiActionPerformed
       if(flag ==1 ){ 
       mod.setCodItiMoto((int) ComboMotorista.getSelectedIndex());
       mod.setCodItiBus((int) ComboItiBus.getSelectedIndex());
       mod.setLugar(LugarIti.getText());
       control.Salvar(mod);
       LugarIti.setEnabled(false);
       ComboMotorista.setEnabled(false);
       ComboItiBus.setEditable(false);
       CancelarIti.setEnabled(false);
       EnviarIti.setEnabled(false);
       NovoIti.setEnabled(true);
       CodigoIti.setText("");
       LugarIti.setText("");
       CampoPesquisar.setText("");
      }else{
         mod.setCodIti((Integer.parseInt(CodigoIti.getText())));
         mod.setLugar(LugarIti.getText());
         mod.setCodItiMoto((int) ComboMotorista.getSelectedItem());
         mod.setCodItiBus((int) ComboItiBus.getSelectedItem());
         control.Editar(mod);
         LugarIti.setEnabled(false);
         ComboMotorista.setEnabled(false);
         ComboItiBus.setEditable(false);
         CancelarIti.setEnabled(false);
         EnviarIti.setEnabled(false);
         NovoIti.setEnabled(true);
          
         CodigoIti.setText("");
         LugarIti.setText("");
         CampoPesquisar.setText("");
        
      }
    }//GEN-LAST:event_EnviarItiActionPerformed

    private void EditarItiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarItiActionPerformed
        flag = 2;
        ComboMotorista.setEnabled(true);
        ComboItiBus.setEditable(true);
        LugarIti.setEnabled(true);
        CancelarIti.setEnabled(true);        
        EnviarIti.setEnabled(true);
        EditarIti.setEnabled(false);
        NovoIti.setEnabled(true);
    }//GEN-LAST:event_EditarItiActionPerformed

    private void CancelarItiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarItiActionPerformed
        LugarIti.setEnabled(false);
        ComboMotorista.setEnabled(false);
        ComboItiBus.setEnabled(false);
        CancelarIti.setEnabled(false);
        EnviarIti.setEnabled(false);
        NovoIti.setEnabled(true);
        EditarIti.setEnabled(false);
    }//GEN-LAST:event_CancelarItiActionPerformed

    private void CampoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPesquisarActionPerformed

    private void PesquisarItiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarItiActionPerformed
        mod.setPesquisa(CampoPesquisar.getText());
        ModeloItinerario model = control.BustaIti(mod);//chama modelo e enviar por parametro
        CodigoIti.setText(String.valueOf(model.getCodIti()));
        LugarIti.setText(model.getLugar());
        ComboMotorista.setSelectedItem(model.getCodItiMoto());
        ComboItiBus.setSelectedItem(model.getCodItiBus());
        
        ComboItiBus.setEnabled(true);
        ComboMotorista.setEnabled(true);
        EditarIti.setEnabled(true);
        CancelarIti.setEnabled(true);
    }//GEN-LAST:event_PesquisarItiActionPerformed

    private void EnviarItiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EnviarItiAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_EnviarItiAncestorAdded

    public void preencherMotoristas(){
        conex.conexao();
        conex.executasql("select * from Funcionarios order by CodFuncionarios");
        try{
            conex.rs.first();
            ComboMotorista.removeAllItems();
            do{
                ComboMotorista.addItem(conex.rs.getString("CodFuncionarios"));
            }while(conex.rs.next());
        }catch(SQLException ex){
         JOptionPane.showMessageDialog(rootPane,"Erro no campo Motoristas");
        }
    }
     public void preencherBus(){
        conex.conexao();
        conex.executasql("select * from Bus order by CodBus");
        try{
            conex.rs.first();
            ComboItiBus.removeAllItems();
            do{
                ComboItiBus.addItem(conex.rs.getString("CodBus"));
            }while(conex.rs.next());
        }catch(SQLException ex){
         JOptionPane.showMessageDialog(rootPane,"Erro no campo PlacaBus");
        }
    }
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
            java.util.logging.Logger.getLogger(TelaItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaItinerario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaItinerario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoPesquisar;
    private javax.swing.JButton CancelarIti;
    private javax.swing.JTextField CodigoIti;
    private javax.swing.JComboBox<String> ComboItiBus;
    private javax.swing.JComboBox<String> ComboMotorista;
    private javax.swing.JButton EditarIti;
    private javax.swing.JButton EnviarIti;
    private javax.swing.JTextField LugarIti;
    private javax.swing.JButton NovoIti;
    private javax.swing.JButton PesquisarIti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
