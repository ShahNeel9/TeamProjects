/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.OPOWorkArea;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.Organization.TransportOrganization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorToDriverRequest;
import Buisness.WorkQueue.adminToDoctor;
import Buisness.WorkQueue.workRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class ManageTransplantJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTransplantJpanel
     */
    private JPanel container;
    private UserAccount account ;
    private Enterprise enterprise;
    private EcoSystem system;
    private DonorOrganization organization;
    private adminToDoctor req1;
    public ManageTransplantJpanel(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container=container;
        this.account=account;
        this.enterprise = enterprise;
        this.system= system;
        System.out.println(account.getUsername());
        populate();
    }

    

     public void populate(){
         
         DefaultTableModel model = (DefaultTableModel) transplantJtable.getModel();
         model.setRowCount(0);
         
         for(Organization org : enterprise.getOrganizationdirectory().getOrganizationList()){
             if(org instanceof DonorOrganization){
                 organization = (DonorOrganization)org;
                 for(workRequest request : organization.getWorkqueue().getAdminToDoctorlist()){
                     req1 = (adminToDoctor)request;
                     Object[] row = new Object[6];
                        row[0] = request.getSender().getUsername();
                        row[1] = request.getReceiver() == null ? null : request.getReceiver().getUsername();
                        row[2] = req1;
                        row[3] = request.getRequest();
                        row[4] = request.getResponse();
                        row[5] = request.getStatus();
                        model.addRow(row);
                 }
                 
             }
             
         }
     }
     
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        transplantJtable = new javax.swing.JTable();
        btnAss = new javax.swing.JButton();
        txtRes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnsend = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();

        transplantJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transplantJtable);

        btnAss.setText("Assign To Me");
        btnAss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssActionPerformed(evt);
            }
        });

        jButton1.setText("process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnsend.setText("Send For Delivery");
        btnsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendActionPerformed(evt);
            }
        });

        btnCheck.setText("Check Progress");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAss)
                        .addGap(43, 43, 43)
                        .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnsend, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAss)
                    .addComponent(btnsend)
                    .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnCheck))
                .addContainerGap(443, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssActionPerformed
        
        int selectedRow = (int)transplantJtable.getSelectedRow();
        if(selectedRow>=0){
            
            
            
            adminToDoctor request = (adminToDoctor)transplantJtable.getValueAt(selectedRow, 2);
            
            if(request.getReceiver() == null){
                request.setReceiver(account);
                request.setStatus("processing");
                populate();
            }else{
                JOptionPane.showMessageDialog(null, "Request already assign");
            }
            
            
        }else{
            
            JOptionPane.showMessageDialog(null, "select Request First");
        }
        
    }//GEN-LAST:event_btnAssActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String response = txtRes.getText();
        int selectedRow = (int)transplantJtable.getSelectedRow();
        if(selectedRow>=0){
            
            adminToDoctor req = (adminToDoctor)transplantJtable.getValueAt(selectedRow, 2);
            
            if(req.getStatus().equals("complete")){
                
                JOptionPane.showMessageDialog(null, "process Completed");
                
            }else if(req.getReceiver() == null){
                JOptionPane.showMessageDialog(null, "Doctor Not Found");
            }else{
                
                if(req.getReceiver().equals(account)){
                    
                    if(txtRes.getText().trim().equals("")){
                        JOptionPane.showMessageDialog(null, "Enter Response");
                    }else{
                        req.setResponse(response);
                        req.setStatus("complete");
                        JOptionPane.showMessageDialog(null, "Operation succesfull");
                        populate();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Request already assigned");
                }
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Select Request first");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendActionPerformed
        
        int selectedRow = (int)transplantJtable.getSelectedRow();
        Organization organization = null;
        for(Organization org : enterprise.getOrganizationdirectory().getOrganizationList()){
            
            if(org instanceof TransportOrganization){
                organization = org;
                break;
            }
            
        }
        
        if(selectedRow>=0){
            
            adminToDoctor req = (adminToDoctor)transplantJtable.getValueAt(selectedRow, 2);
            if(req.getStatus().equals("complete")){
                
                DoctorToDriverRequest request = new DoctorToDriverRequest();
                
                request.setSender(account);  
                request.setPatient_name(req.getPatient_name());
                request.setPatient_email(req.getPatient_email());
                request.setOrgan(req.getOrgan());
                request.setDonor_name(req.getDonor_name());
                request.setDoctor(req.getDoctor());
                request.setStatus("sendForDelivery");
                
                try{
                    
                    organization.getWorkqueue().getDoctorToDriverList().add(request);
                    account.getWorkqueue().getDoctorToDriverList().add(request);
                    JOptionPane.showMessageDialog(null, "Request send Succesfully");
                    
                }catch(Exception e){
                    System.out.println(e);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Request is not complete yet");
            }
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Select Request first");
        }
        
    }//GEN-LAST:event_btnsendActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        OrganDeliveryJpanel add = new OrganDeliveryJpanel(container, account,enterprise,system);
        container.add("opoDoctorworkArea", add);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
        
    }//GEN-LAST:event_btnCheckActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAss;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnsend;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable transplantJtable;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
