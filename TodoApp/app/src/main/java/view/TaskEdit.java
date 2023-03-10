/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProjectController;
import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Task;

/**
 *
 * @author dougr
 */
public class TaskEdit extends javax.swing.JFrame {

    TaskController controller;
    
    public TaskEdit() {
        
        
        
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

        jPanelToolBarEdit = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelToolBarCheck = new javax.swing.JLabel();
        jPanelToolBartens = new javax.swing.JPanel();
        jLabelEditName = new javax.swing.JLabel();
        jTextFieldEditName = new javax.swing.JTextField();
        jLabelEditDescription = new javax.swing.JLabel();
        jScrollPaneEditTextArea = new javax.swing.JScrollPane();
        jTextAreaEdit = new javax.swing.JTextArea();
        jLabelEditDeadline = new javax.swing.JLabel();
        jFormattedTextFieldEditdeadline = new javax.swing.JFormattedTextField();
        jLabelEditNotes = new javax.swing.JLabel();
        jScrollPaneEditNotes = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabelEditErrorName = new javax.swing.JLabel();
        jLabelErrorDeadline = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelToolBarEdit.setBackground(new java.awt.Color(0, 153, 102));

        jLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelToolBarTitle.setForeground(java.awt.Color.white);
        jLabelToolBarTitle.setText("Editar");

        jLabelToolBarCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
        jLabelToolBarCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToolBarCheckMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolBarEditLayout = new javax.swing.GroupLayout(jPanelToolBarEdit);
        jPanelToolBarEdit.setLayout(jPanelToolBarEditLayout);
        jPanelToolBarEditLayout.setHorizontalGroup(
            jPanelToolBarEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelToolBarCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelToolBarEditLayout.setVerticalGroup(
            jPanelToolBarEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelToolBarEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToolBarEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelToolBarCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelToolBartens.setBackground(java.awt.Color.white);

        jLabelEditName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEditName.setText("Editar nome ");

        jLabelEditDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEditDescription.setText("Editar descri????o");

        jTextAreaEdit.setColumns(20);
        jTextAreaEdit.setRows(5);
        jScrollPaneEditTextArea.setViewportView(jTextAreaEdit);

        jLabelEditDeadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEditDeadline.setText("Editar prazo");

        jFormattedTextFieldEditdeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jLabelEditNotes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelEditNotes.setText("Editar notas");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPaneEditNotes.setViewportView(jTextArea2);

        jLabelEditErrorName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEditErrorName.setForeground(new java.awt.Color(255, 0, 0));
        jLabelEditErrorName.setText("Campo Obrigat??rio");

        jLabelErrorDeadline.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelErrorDeadline.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorDeadline.setText("Campo Obrigat??rio");

        javax.swing.GroupLayout jPanelToolBartensLayout = new javax.swing.GroupLayout(jPanelToolBartens);
        jPanelToolBartens.setLayout(jPanelToolBartensLayout);
        jPanelToolBartensLayout.setHorizontalGroup(
            jPanelToolBartensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelEditName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextFieldEditName)
            .addComponent(jLabelEditDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelToolBartensLayout.createSequentialGroup()
                .addComponent(jLabelEditErrorName)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelToolBartensLayout.createSequentialGroup()
                .addGroup(jPanelToolBartensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneEditTextArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldEditdeadline)
                    .addComponent(jLabelEditNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneEditNotes)
                    .addGroup(jPanelToolBartensLayout.createSequentialGroup()
                        .addComponent(jLabelErrorDeadline)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelToolBartensLayout.setVerticalGroup(
            jPanelToolBartensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBartensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelEditName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEditErrorName)
                .addGap(14, 14, 14)
                .addComponent(jLabelEditDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneEditTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEditDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldEditdeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelErrorDeadline)
                .addGap(24, 24, 24)
                .addComponent(jLabelEditNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneEditNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelToolBarEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelToolBartens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelToolBarEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelToolBartens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelToolBarCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToolBarCheckMouseClicked
        try {
            if(isValid()) {
             Task task = new Task();
        
            task.setName(jTextFieldEditName.getText());
            task.setDescription(jLabelEditDescription.getText());
            task.setNotes(jLabelEditNotes.getText());
            task.setIsCompleted(false);

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date deadline = null;

            deadline = dateFormat.parse(jLabelEditDeadline.getText());
            task.setDeadline(deadline);

            controller.update(task);
            JOptionPane.showMessageDialog(rootPane,"Tarefa editada com sucesso");
            this.dispose();
            } else {
                
                hideErrorFileds();
                jLabelEditErrorName.setVisible(true);
                jLabelErrorDeadline.setVisible(true);
                JOptionPane.showMessageDialog(rootPane, "Os campos obrigat??rios tem que ser preenchidos");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_jLabelToolBarCheckMouseClicked

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
            java.util.logging.Logger.getLogger(TaskEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldEditdeadline;
    private javax.swing.JLabel jLabelEditDeadline;
    private javax.swing.JLabel jLabelEditDescription;
    private javax.swing.JLabel jLabelEditErrorName;
    private javax.swing.JLabel jLabelEditName;
    private javax.swing.JLabel jLabelEditNotes;
    private javax.swing.JLabel jLabelErrorDeadline;
    private javax.swing.JLabel jLabelToolBarCheck;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JPanel jPanelToolBarEdit;
    private javax.swing.JPanel jPanelToolBartens;
    private javax.swing.JScrollPane jScrollPaneEditNotes;
    private javax.swing.JScrollPane jScrollPaneEditTextArea;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextAreaEdit;
    private javax.swing.JTextField jTextFieldEditName;
    // End of variables declaration//GEN-END:variables

        public void hideErrorFileds() {
        jLabelEditErrorName.setVisible(false);
        jLabelErrorDeadline.setVisible(false);
    }
    
    public boolean IsValid() {
    return (!jTextFieldEditName.getText().isEmpty())
           && (!jFormattedTextFieldEditdeadline.getText().isEmpty());
    }
}
