/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.LegalAuthorityOrg;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.LabOrganization;
import Buisness.Organization.LegalOrganization;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.adminToLegalReport;
import Buisness.WorkQueue.workRequest;
import Userinterface.SystemAdninWorkArea.ManageEnterpriseAdminJpanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class manageRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form manageRequestJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private Organization organization;
    private LegalOrganization org;
    public manageRequestJpanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        populateReportTable();
        mypopulateTable();
    }

    

    public void populateReportTable(){
        
        DefaultTableModel model = (DefaultTableModel) reportJtable1.getModel();
        model.setRowCount(0);
              
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            if(organization instanceof LegalOrganization){
                org = (LegalOrganization)organization;
                for(workRequest request : org.getWorkqueue().getAdminToLegalReportList()){
                    adminToLegalReport req = (adminToLegalReport)request;
                        Object[] row = new Object[6];
                        row[0] = request.getSender().getUsername();
                        row[1] = req;
                        row[2] = req.getDonor_name();
                        row[3] = request.getRequest();
                        row[4] = req.getResponse();
                        row[5] = request.getStatus();
                        model.addRow(row);
                }
            }
            
                        
        }
        
    }
    
    public void mypopulateTable(){
        
         DefaultTableModel model = (DefaultTableModel) myJtable.getModel();
        model.setRowCount(0);
              
        for(workRequest request : account.getWorkqueue().getAdminToLegalReportList()){
            adminToLegalReport req = (adminToLegalReport)request;
                        Object[] row = new Object[6];
                        row[0] = request.getReceiver().getUsername();
                        row[1] = req;
                        row[2] = req.getDonor_name();
                        row[3] = request.getRequest();
                        row[4] = req.getResponse();
                        row[5] = request.getStatus();
                        model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        myJtable = new javax.swing.JTable();
        btnassign = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        reportJtable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        myJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Receiver", "Patient", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(myJtable);

        btnassign.setText("Assign To Me");
        btnassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignActionPerformed(evt);
            }
        });

        reportJtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "sender", "Patient", "Donor", "Request", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(reportJtable1);

        jButton1.setText("Check Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnassign, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                    .addGap(25, 25, 25)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(btnassign)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(444, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignActionPerformed
        
        int selectedRow = (int)reportJtable1.getSelectedRow();
        if(selectedRow>=0){
            
            adminToLegalReport request =(adminToLegalReport)reportJtable1.getValueAt(selectedRow, 1);
            request.setReceiver(account);
            account.getWorkqueue().getAdminToLegalReportList().add(request);
            JOptionPane.showMessageDialog(null, "Succesful");
            mypopulateTable();  
        }else{
             JOptionPane.showMessageDialog(null, "Select Request First");
        }
        
    }//GEN-LAST:event_btnassignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int selectedRow = (int)myJtable.getSelectedRow();
       
        if(selectedRow>=0){
            
            adminToLegalReport request =(adminToLegalReport)myJtable.getValueAt(selectedRow, 1);
             ReportJpanel report=new ReportJpanel(request,account,system,container);
             container.add("reportjpanel",report);
              CardLayout layout=(CardLayout)container.getLayout();
                layout.next(container);
             
        }else{
             JOptionPane.showMessageDialog(null, "Select Request First");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnassign;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable myJtable;
    private javax.swing.JTable reportJtable1;
    // End of variables declaration//GEN-END:variables
}
