/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.LabOrg;

import Buisness.Donor.Donor;
import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.LabOrganization;
import Buisness.Organization.Organization;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
import Buisness.WorkQueue.opoDoctorToLabRequest;
import Buisness.WorkQueue.workRequest;
import Userinterface.DoctorOrg.AddPatientDetailJpanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class LabAssistanceWorkAreaJpanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistanceWorkAreaJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private LabOrganization org;
    private Organization organization;
    private DonorOrganization org1;
    public LabAssistanceWorkAreaJpanel(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system,Organization organization) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        populateTable();
        mypopulateTable();
        
    }

   public void populateTable(){
       
       DefaultTableModel model = (DefaultTableModel) LabJtable.getModel();
        model.setRowCount(0);
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            
            if(organization instanceof LabOrganization){
               org = (LabOrganization)organization;
               for(workRequest request : org.getWorkqueue().getWorkrequestList()){
                   DoctorOrganRequest req = (DoctorOrganRequest)request;
                   Object[] row = new Object[5];
                   row[0] = req.getPatient().getName();
                   row[1] = request;
                   row[2] = req.getDonor();
                   row[3] = request.getResponse();
                   row[4] = request.getStatus();
                    model.addRow(row);
               }
            }
        }
   }
   
   public void mypopulateTable(){
       
       DefaultTableModel model = (DefaultTableModel) myJtable.getModel();
       model.setRowCount(0);
       
       for(workRequest request : account.getWorkqueue().getWorkrequestList()){
           DoctorOrganRequest req = (DoctorOrganRequest)request;
           Object[] row = new Object[6];
                   row[0] = request.getReceiver().getUsername();
                   row[1] = req.getPatient().getName();
                   row[2] = request;
                   row[3] = request.getResponse();
                   row[4] = req.getDonor();
                   row[5] = request.getStatus();
                    model.addRow(row);
       }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LabJtable = new javax.swing.JTable();
        btnFind = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        myJtable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Lab Assistance Work Area ");

        LabJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Request", "Donor", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LabJtable);

        btnFind.setText("Find Perfect Donor");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        myJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Receiver", "Patient Name", "Request", "Response", "Donor", "Status"
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

        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jLabel2.setText("My Lab Test");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAssign)
                                .addComponent(jScrollPane1)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssign)
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFind)
                .addContainerGap(260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        
        int selectedRow = (int)myJtable.getSelectedRow();
        if(selectedRow>=0){
            
           // opoDoctorToLabRequest request = (opoDoctorToLabRequest)LabJtable.getValueAt(selectedRow, 0);
            DoctorOrganRequest request = (DoctorOrganRequest)myJtable.getValueAt(selectedRow, 2);
            Patient p = (Patient)request.getPatient();
            Donor donor = null;
            //System.out.println(p);
            
           for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            
                if(organization instanceof DonorOrganization){
                    org1 = (DonorOrganization)organization;
                
                        for(Donor d : org1.getDonorlist().getDonorlist()){
                   
                            if((d.getOrgan().equals(p.getOrgan())) && (d.getBloodgroup().equals(p.getBloodType())) &&
                           (d.getTissue().equals(p.getTissue_type()))){
                                donor = d;
                                break;
                            }
                        }
                }
            }
        FindMatchJpanel add = new FindMatchJpanel(container, account,request,donor,p);
        container.add("Addpatientdetail", add);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
        }else{
            JOptionPane.showMessageDialog(null, "Please select Patient");
        }
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        
        int selectedrow = (int)LabJtable.getSelectedRow();
        if(selectedrow>=0){
            
            DoctorOrganRequest request = (DoctorOrganRequest)LabJtable.getValueAt(selectedrow, 1);
            request.setReceiver(account);
            account.getWorkqueue().getWorkrequestList().add(request);
            mypopulateTable();
            
            
        }else{
            
            JOptionPane.showMessageDialog(null, "Select Request First"); 
        }
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LabJtable;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable myJtable;
    // End of variables declaration//GEN-END:variables
}
