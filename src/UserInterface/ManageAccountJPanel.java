/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author zhaojiyuan
 */
public class ManageAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAccountJPanel
     */
    
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;
    
    public ManageAccountJPanel(JPanel userProcessContainer,AccountDirectory accountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.accountDirectory = accountDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAccountJButton = new javax.swing.JButton();
        viewAccountJButton = new javax.swing.JButton();

        createAccountJButton.setText("Create Account");
        createAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountJButtonActionPerformed(evt);
            }
        });

        viewAccountJButton.setText("View Account");
        viewAccountJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAccountJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewAccountJButton)
                    .addComponent(createAccountJButton))
                .addGap(346, 346, 346))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(createAccountJButton)
                .addGap(113, 113, 113)
                .addComponent(viewAccountJButton)
                .addContainerGap(288, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountJButtonActionPerformed
        // TODO add your handling code here:
        CreateAccountJPanel createAccountJPanel = new CreateAccountJPanel(userProcessContainer,accountDirectory);
        userProcessContainer.add("CreateAccountJPanel",createAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_createAccountJButtonActionPerformed

    private void viewAccountJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAccountJButtonActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewJPanel = new ViewJPanel(userProcessContainer,accountDirectory);
        userProcessContainer.add("ViewJPanel",viewJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewAccountJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountJButton;
    private javax.swing.JButton viewAccountJButton;
    // End of variables declaration//GEN-END:variables
}
