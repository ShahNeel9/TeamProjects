/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdminWorkArea;

import Buisness.Enterprise.Enterprise;
import Buisness.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class AdminWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJpanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private UserAccount account;
    public AdminWorkAreaJpanel(JPanel container, Enterprise enterprise,UserAccount account) {
        initComponents();
        this.container = container;
        this.enterprise = enterprise;
        this.account = account;
        valueJlable.setText(enterprise.getName());
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        valueJlable = new javax.swing.JLabel();
        btnOrg = new javax.swing.JButton();
        btnEmp = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();

        jLabel1.setText(" Admin Work Area");

        jLabel2.setText("Enterprise : ");

        valueJlable.setText("<value>");

        btnOrg.setText("Manage Organization");
        btnOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgActionPerformed(evt);
            }
        });

        btnEmp.setText("Manage Employee");
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });

        btnUser.setText("Manage User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueJlable)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(valueJlable))
                .addGap(91, 91, 91)
                .addComponent(btnOrg)
                .addGap(31, 31, 31)
                .addComponent(btnEmp)
                .addGap(28, 28, 28)
                .addComponent(btnUser)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
      
        ManageTransplantEmployee manageOrganizationJPanel = new ManageTransplantEmployee(container, enterprise.getOrganizationdirectory());
        container.add("manageTransplantEmployee", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgActionPerformed
        
        ManageTransplantOrganization manageOrganizationJPanel = new ManageTransplantOrganization(container, enterprise);
        container.add("manageTransplantOrganization", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnOrgActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        
        ManageTransplantUser manageOrganizationJPanel = new ManageTransplantUser(container, enterprise,account);
        container.add("manageTransplantUser", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnOrg;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel valueJlable;
    // End of variables declaration//GEN-END:variables
}