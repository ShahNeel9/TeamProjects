/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdministartionOrg;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.AdministrationOrganization;
import Buisness.Organization.LegalOrganization;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
import Buisness.WorkQueue.adminToLegalReport;
import Buisness.WorkQueue.workRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class ManageOrganReport extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganReport
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
     private AdministrationOrganization org;
    public ManageOrganReport(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        PopulateTable();
        populateReportTable();
        
    }

   public void PopulateTable(){
        
        DefaultTableModel model = (DefaultTableModel) organRequestJtable.getModel();
        model.setRowCount(0);
        
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            
            if(organization instanceof AdministrationOrganization){
                org = (AdministrationOrganization)organization;
                for(workRequest request : org.getWorkqueue().getWorkrequestList()){
                    DoctorOrganRequest req = (DoctorOrganRequest) request;
                    
                    if(req.getStatus().equals("ApproveByDonor")){
                        Object[] row = new Object[5];
                        row[0] = request;
                        row[1] = req.getPatient().getName();
                        row[2] = req.getDonor();
                        row[3] = request.getResponse();
                        row[4] = req.getStatus();
                        model.addRow(row);
                    }
                }
                
            }
        }
    }
    
    public void populateReportTable(){
        
        DefaultTableModel model = (DefaultTableModel) reportJtable.getModel();
        model.setRowCount(0);
              
        for(workRequest request : account.getWorkqueue().getAdminToLegalReportList()){
            adminToLegalReport req = (adminToLegalReport)request;
                        Object[] row = new Object[6];
                        row[0] = request.getSender().getUsername();
                        row[1] = req.getPatient_name();
                        row[2] = req;
                        row[3] = request.getRequest();
                        row[4] = req.getResponse();
                        row[5] = request.getStatus();
                        model.addRow(row);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organRequestJtable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reportJtable = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        txtApprove = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        organRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request", "Patient", "Donor", "Responce", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organRequestJtable);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        reportJtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(reportJtable);

        btnApprove.setText("Send For Approval");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        jLabel1.setText("My Report Table");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssign)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApprove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApprove))
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        
        int selectdRow = (int)organRequestJtable.getSelectedRow();
        Organization org = null;
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            
            if(organization instanceof LegalOrganization){
                org = organization;
                break;
            }
        }
        
        if(selectdRow>=0){
            
            DoctorOrganRequest request = (DoctorOrganRequest)organRequestJtable.getValueAt(selectdRow, 0);
            adminToLegalReport req1 = new adminToLegalReport();
            req1.setSender(account);
            req1.setPatient_name(request.getPatient().getName());
            req1.setPatient_email(request.getPatient().getEmailid());
            req1.setPatient_condition(request.getPatient().getHow_sick());
            req1.setOrgan(request.getPatient().getOrgan());
            req1.setDonor_name(request.getDonor().getName());
            req1.setDoctor(request.getSender());
            System.out.println(request.getSender().getUsername());
            try{
                
                org.getWorkqueue().getAdminToLegalReportList().add(req1);
                account.getWorkqueue().getAdminToLegalReportList().add(req1);
                 JOptionPane.showMessageDialog(null, "Succesful");
                 populateReportTable();
                
            }catch(Exception e){
                
                JOptionPane.showMessageDialog(null, "can't send Request");
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Select Request First");
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
       
        int selectedRow = (int)reportJtable.getSelectedRow();
        String approve = txtApprove.getText();
       
        if(selectedRow>=0){
            
            adminToLegalReport request = (adminToLegalReport)reportJtable.getValueAt(selectedRow,2);
            request.setRequest(approve);
            request.setStatus("SendForApproval");
            JOptionPane.showMessageDialog(null, "Request send succesfully");
            populateReportTable();
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Select Request First");
        }
        
    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable organRequestJtable;
    private javax.swing.JTable reportJtable;
    private javax.swing.JTextField txtApprove;
    // End of variables declaration//GEN-END:variables
}
