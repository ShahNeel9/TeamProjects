/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DoctorOrg;

import Buisness.Enterprise.Enterprise;
import Buisness.Organization.AdministrationOrganization;
import Buisness.Organization.Organization;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
import Buisness.WorkQueue.workRequest;
import Userinterface.AdminWorkArea.ManageTransplantEmployee;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class CreateOrganRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateOrganRequestJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    public CreateOrganRequestJpanel(JPanel container, UserAccount account, Organization organization,Enterprise enterprise) {
        initComponents();
        this.container=container;
        this.account=account;
        this.organization=organization;
        this.enterprise = enterprise;
        PopulateTable();
         populateRequestTable();
        //System.out.println(organization.getPatientdirectory().getPatientdirectory());
    }

    
    public void PopulateTable(){
        
        DefaultTableModel model = (DefaultTableModel) patientJtable.getModel();
        model.setRowCount(0);
        for(Patient p : organization.getPatientdirectory().getPatientdirectory()){
            Object row[] = new Object[6];
            row[0] = p;
            row[1] = p.getBloodType();
            row[2] = p.getTissue_type();
            row[3] = p.getOrgan();
            row[4]= p.getHow_sick();
            row[5] = p.getFlag();
           
            model.addRow(row);
            
        }

    }
    
    public void populateRequestTable(){
        
        
        
        DefaultTableModel model = (DefaultTableModel)ProcessRequestJtable.getModel();
        model.setRowCount(0);
        for(workRequest request : account.getWorkqueue().getWorkrequestList()){
            DoctorOrganRequest req = (DoctorOrganRequest)request;
            Object[] row = new Object[5];
            row[0] = req;
            row[1] = request.getRequest();
            row[2] = req.getDonor();
            row[3] = request.getResponse();
            row[4] = request.getStatus();
             model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientJtable = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProcessRequestJtable = new javax.swing.JTable();
        txtStatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        patientJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Blood Type", "Tissue Type", "Organ", "How sick", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientJtable);

        btnCreate.setText("Create Organ Request");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        ProcessRequestJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient", "Request", "Donor", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ProcessRequestJtable);

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        jLabel1.setText("My Patient Request");

        btndelete.setText("Delete ");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnCreate)
                        .addGap(105, 105, 105)
                        .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete))
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        
        //Patient p = null;
         String status = txtStatus.getText();
        int selectedRow = (int)patientJtable.getSelectedRow();
        if(selectedRow>=0){
            Patient p = (Patient)patientJtable.getValueAt(selectedRow, 0);

                if(p.getFlag().equals("eligible")){

                    DoctorOrganRequest request = new DoctorOrganRequest();
                    request.setRequest(status);
                    request.setPatient(p);
                    request.setSender(account);
                    request.setStatus("sendToAdmin");
                    request.setDonor(null);
                    request.setReceiver(null);
                    request.setResponse(null);
                    Organization org = null;
                    for(Organization org1 : enterprise.getOrganizationdirectory().getOrganizationList()){

                        if(org1 instanceof AdministrationOrganization ){
                            org = org1;
                            break;
                        }
                    }
                    try{
                        if(org!= null){
                            org.getWorkqueue().getWorkrequestList().add(request);
                            account.getWorkqueue().getWorkrequestList().add(request);
                            JOptionPane.showMessageDialog(null, "Request send succesfully");
                            p.setFlag("In Progress");
                            PopulateTable();
                            populateRequestTable();
                        }

                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Can't process Request");
                    }

            }else{
                    JOptionPane.showMessageDialog(null, "Patient Request Already in Process");
            }


    }else{
            JOptionPane.showMessageDialog(null, "Select Row first");
    } 

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        
        int selectedRow = (int)patientJtable.getSelectedRow();
        String emailid="";
        Patient p1=null;
        if(selectedRow>=0){
            
            Patient p = (Patient)patientJtable.getValueAt(selectedRow, 0);
            p1=p;
            if(p.getFlag().equals("complete")){
                
                emailid = p.getEmailid();
                
            organization.getPatientdirectory().DeletePatient(p);
            JOptionPane.showMessageDialog(null, "Patient Deleted succesfully");
            PopulateTable();
            populateRequestTable();
            
            
            }
        }
        
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        int selectedRow1 = (int)ProcessRequestJtable.getSelectedRow();
        if(selectedRow1>=0){
            
            DoctorOrganRequest request = (DoctorOrganRequest)ProcessRequestJtable.getValueAt(selectedRow1, 0);
            
           organization.getWorkqueue().DeleteDoctorOrganRequest(request);
           account.getWorkqueue().DeleteDoctorOrganRequest(request);
           populateRequestTable();
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProcessRequestJtable;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btndelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientJtable;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
