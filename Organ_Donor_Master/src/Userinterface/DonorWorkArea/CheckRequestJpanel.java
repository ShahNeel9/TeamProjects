/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DonorWorkArea;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
import Buisness.WorkQueue.opoDoctorToDonorRequest;
import Buisness.WorkQueue.workRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class CheckRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CheckRequestJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private Organization organization;
    private DonorOrganization org;
    public CheckRequestJpanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        //System.out.println(account.getUsername());
//        for(UserAccount aa : enterprise.getUseraccountdirectory().getUserAccountList()){
//            System.out.println(aa.getUsername() +"ccc");
//        }
        populateTable();
    }

    
    public void populateTable(){

        DefaultTableModel model = (DefaultTableModel) requestJtable.getModel();
        model.setRowCount(0);
        

        
        for(Network network : system.getNetworkList()){
             for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     for(UserAccount aa : organization.getUseraccountdirectory().getUserAccountList()){
                         
                        if (aa.getRole().toString().equals("Buisness.Role.OPO_DoctorRole")) {
                        //System.out.println("in pd account");

                        for (workRequest request : aa.getWorkqueue().getOpoDoctorTodonorlist()) {

                            opoDoctorToDonorRequest req = (opoDoctorToDonorRequest) request;
                            //System.out.println(req.getD().getName());
                            if(req.getD().getName().equals(account.getUsername().toString())){
                            Object[] row = new Object[5];
                            row[0] = request.getSender();
                            row[1] = request;
                            row[2] = req.getD().getName();
                            row[3] = request.getResponse();
                            row[4] = request.getStatus();
                            model.addRow(row);
                            }
                        } 
                        } 
                     }
                 }
             }
        }
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        requestJtable = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();

        requestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Request", "Donor", "Response", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(requestJtable);

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(btnDecline, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnDecline))
                .addContainerGap(302, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        
        
        int selectedrow = (int)requestJtable.getSelectedRow();
          Organization org=null;
        for(Network network : system.getNetworkList()){
                for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     
                     if(organization instanceof DonorOrganization){
                         
                         org = organization;
                         break;
                     }
                 }
                }
              }
      
        if(selectedrow>=0){
            
            opoDoctorToDonorRequest request = (opoDoctorToDonorRequest)requestJtable.getValueAt(selectedrow, 1);
            System.out.println(request.getStatus()+"status");
            if(request.getStatus()!= "completed"){
                request.setReceiver(account);
                request.setStatus("completed");
                request.setResponse("Approve");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request send succesfully");
                
                for(workRequest req : org.getWorkqueue().getWorkrequestList()){
                    DoctorOrganRequest req1 = (DoctorOrganRequest)req;
                    if(req1.getDonor().getName().equals(account.getUsername().toString())){
                        req1.setStatus("ApproveByDonor");
                    }
                }
               
            } 
            else{
                JOptionPane.showMessageDialog(null, "Request completed already");
            }
        }else{
            JOptionPane.showMessageDialog(null, "select row first");
        }
        
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        
        int selectedrow = (int)requestJtable.getSelectedRow();
         Organization org=null;
        for(Network network : system.getNetworkList()){
                for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     
                     if(organization instanceof DonorOrganization){
                         
                         org = organization;
                         break;
                     }
                 }
                }
              }
        if(selectedrow>=0){
            
            opoDoctorToDonorRequest request = (opoDoctorToDonorRequest)requestJtable.getValueAt(selectedrow, 1);
            if(request.getStatus()!= "completed"){
                request.setReceiver(account);
                request.setStatus("completed");
                request.setResponse("Decline");
                populateTable();
                JOptionPane.showMessageDialog(null, "Request send succesfully");
                for(workRequest req : org.getWorkqueue().getWorkrequestList()){
                    DoctorOrganRequest req1 = (DoctorOrganRequest)req;
                    if(req1.getDonor().getName().equals(account.getUsername().toString())){
                        req1.setStatus("DeclineByDonor");
                    }
                }
            } 
            else{
                JOptionPane.showMessageDialog(null, "Request completed already");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "select row first");
        }
        
        
    }//GEN-LAST:event_btnDeclineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnDecline;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestJtable;
    // End of variables declaration//GEN-END:variables
}
