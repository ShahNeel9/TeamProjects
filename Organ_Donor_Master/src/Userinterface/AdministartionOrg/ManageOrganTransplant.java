/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdministartionOrg;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.adminToDoctor;
import Buisness.WorkQueue.adminToLegalReport;
import Buisness.WorkQueue.workRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class ManageOrganTransplant extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganTransplant
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    public ManageOrganTransplant(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        populateReportTable();
        populate();
    }

   

     public void populateReportTable(){
        
        DefaultTableModel model = (DefaultTableModel) reportJtable.getModel();
        model.setRowCount(0);
              
        for(workRequest request : account.getWorkqueue().getAdminToLegalReportList()){
            adminToLegalReport req = (adminToLegalReport)request;
                        Object[] row = new Object[5];
                        row[0] = req.getPatient_name();
                        row[1] = req;
                        row[2] = request.getRequest();
                        row[3] = req.getResponse();
                        row[4] = request.getStatus();
                        model.addRow(row);
        }
        
    }
     
     public void populate(){
         
         DefaultTableModel model = (DefaultTableModel) transplantJtable.getModel();
         model.setRowCount(0);
         
         for(workRequest request : account.getWorkqueue().getAdminToDoctorlist()){
             adminToDoctor req1 = (adminToDoctor)request;
                        Object[] row = new Object[5];
                        row[0] = request.getSender().getUsername();
                        row[1] = req1.getDonor_name();
                        row[2] = request.getRequest();
                        row[3] = request.getResponse();
                        row[4] = request.getStatus();
                        model.addRow(row);
         }
         
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        reportJtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnInitiate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transplantJtable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtrequest = new javax.swing.JTextField();

        reportJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(reportJtable);

        jLabel1.setText("Approved Report");

        btnInitiate.setText("Initiate Transplant");
        btnInitiate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitiateActionPerformed(evt);
            }
        });

        transplantJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(transplantJtable);

        jLabel2.setText("My Transplant Request");

        txtrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtrequest, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInitiate, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE))
                        .addGap(91, 91, 91))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInitiate)
                    .addComponent(txtrequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(121, 121, 121)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInitiateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitiateActionPerformed
        
        int selectedRow = (int)reportJtable.getSelectedRow(); 
        String Request = txtrequest.getText();
        Organization org2 = null;
         for(Network network : system.getNetworkList()){
             for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     
                     if(organization instanceof DonorOrganization){
                         
                         org2 = organization;
                         break;
                     }
                 }
             }
                
         }

        if(selectedRow>=0){
            
            if(txtrequest.getText().trim().isEmpty()){
                
               JOptionPane.showMessageDialog(null, "plz Add Request"); 
            }else{
            adminToLegalReport request = (adminToLegalReport)reportJtable.getValueAt(selectedRow, 1);
            adminToDoctor req = new adminToDoctor();
            req.setSender(account);
            req.setPatient_name(request.getPatient_name());
                System.out.println(request.getPatient_email()+"at organ transplant");
            req.setPatient_email(request.getPatient_email());
            req.setDonor_name(request.getDonor_name());
            req.setOrgan(request.getOrgan());
            req.setDoctor(request.getDoctor());
            req.setRequest(Request);
            req.setStatus("SendToDoctor");
            
            try{
                
                org2.getWorkqueue().getAdminToDoctorlist().add(req);
                account.getWorkqueue().getAdminToDoctorlist().add(req);
                JOptionPane.showMessageDialog(null, "Request send succesfully"); 
                populate();
                
            }catch(Exception e){
                
            }
            
            }         
            
        }else{
            
            JOptionPane.showMessageDialog(null, "select Row first");
        }
        
        
    }//GEN-LAST:event_btnInitiateActionPerformed

    private void txtrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInitiate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable reportJtable;
    private javax.swing.JTable transplantJtable;
    private javax.swing.JTextField txtrequest;
    // End of variables declaration//GEN-END:variables
}
