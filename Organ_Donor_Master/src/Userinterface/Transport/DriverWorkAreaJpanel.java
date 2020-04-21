/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.Transport;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.Organization.TransportOrganization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorToDriverRequest;
import Buisness.WorkQueue.adminToDoctor;
import Buisness.WorkQueue.workRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class DriverWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DriverWorkAreaJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private TransportOrganization organization;
    private DoctorToDriverRequest req1;
    public DriverWorkAreaJpanel(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.account=account;
        this.container=container;
        this.enterprise=enterprise;
        this.system=system;
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) driverJtable.getModel();
         model.setRowCount(0);
         
         for(Organization org : enterprise.getOrganizationdirectory().getOrganizationList()){
             if(org instanceof TransportOrganization){
                 organization = (TransportOrganization)org;
                 for(workRequest request : organization.getWorkqueue().getDoctorToDriverList()){
                     req1 = (DoctorToDriverRequest)request;
                     Object[] row = new Object[5];
                        row[0] = request.getSender().getUsername();
                        row[1] = req1;
                        row[2] = request.getReceiver() == null ? null : request.getReceiver().getUsername();
                        row[3] = request.getResponse();
                        row[4] = request.getStatus();
                        model.addRow(row);
                 }
                 
             }
             
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        driverJtable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnDeliery = new javax.swing.JButton();
        txtRes = new javax.swing.JTextField();

        driverJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "sender", "Organ", "Receiver", "Response", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(driverJtable);

        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnDeliery.setText("Delivered");
        btnDeliery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelieryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnDeliery, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign)
                    .addComponent(btnDeliery)
                    .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(390, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        
        int selectedRow = (int)driverJtable.getSelectedRow();
        
        DoctorToDriverRequest request = (DoctorToDriverRequest)driverJtable.getValueAt(selectedRow, 1);
        
        if(selectedRow>=0){
        if(request.getReceiver() == null){
            
            request.setReceiver(account);
            request.setStatus("OutForDelivery");
            populateTable();
            
        }else{
            JOptionPane.showMessageDialog(null, "Out For Delivery");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Select Request first");
        }
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnDelieryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelieryActionPerformed
        
        int selectedRow = (int)driverJtable.getSelectedRow();
        String response = txtRes.getText();
        
        
        if(selectedRow>=0){
            DoctorToDriverRequest request = (DoctorToDriverRequest)driverJtable.getValueAt(selectedRow, 1);
            if(request.getStatus().equals("Delivered")){
               JOptionPane.showMessageDialog(null, "Organ is Deliverd"); 
            }else if(request.getReceiver() == null){
                JOptionPane.showMessageDialog(null, "Driver Not Found");
            }else{
                
                if(request.getReceiver().equals(account)){
                   
                    if(txtRes.getText().trim().equals("")){
                      JOptionPane.showMessageDialog(null, "Add Response");  
                    }else{
                        request.setStatus("Delivered");
                        request.setResponse(response);
                        JOptionPane.showMessageDialog(null, "Update Status Succesfull");
                        populateTable();
                    }
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Delivery In Process");
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "select Request first");
        }
        
    }//GEN-LAST:event_btnDelieryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnDeliery;
    private javax.swing.JTable driverJtable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
