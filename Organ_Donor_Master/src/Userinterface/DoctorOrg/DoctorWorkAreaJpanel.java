/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DoctorOrg;

import Buisness.Enterprise.Enterprise;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class DoctorWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
    public DoctorWorkAreaJpanel(JPanel container, UserAccount account, Enterprise enterprise, Organization organization) {
        initComponents();
        this.container=container;
        this.account=account;
        this.enterprise=enterprise;
        this.organization=organization;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnManagepatient = new javax.swing.JButton();
        btnCreaterequest = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();

        jLabel1.setText("Doctor Work Area");

        btnManagepatient.setText("Manage Patient Details");
        btnManagepatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagepatientActionPerformed(evt);
            }
        });

        btnCreaterequest.setText("create request for Organ");
        btnCreaterequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreaterequestActionPerformed(evt);
            }
        });

        btnCheck.setText("Check Organ Delivery");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManagepatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreaterequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(279, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(151, 151, 151)
                .addComponent(btnManagepatient)
                .addGap(57, 57, 57)
                .addComponent(btnCreaterequest)
                .addGap(55, 55, 55)
                .addComponent(btnCheck)
                .addContainerGap(274, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagepatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagepatientActionPerformed
        
       ManagePatientJpanel add = new ManagePatientJpanel(container, account,organization);
        container.add("Managepatient", add);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnManagepatientActionPerformed

    private void btnCreaterequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreaterequestActionPerformed
        // TODO add your handling code here:
        CreateOrganRequestJpanel add = new CreateOrganRequestJpanel(container, account,organization,enterprise);
        container.add("Addpatientdetail", add);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnCreaterequestActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        
        CheckOrganDelivery add = new CheckOrganDelivery(container, account,organization,enterprise);
        container.add("Addpatientdetail", add);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container); 
        
        
    }//GEN-LAST:event_btnCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnCreaterequest;
    private javax.swing.JButton btnManagepatient;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
