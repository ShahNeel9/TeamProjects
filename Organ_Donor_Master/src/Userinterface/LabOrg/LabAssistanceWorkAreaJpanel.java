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

        jScrollPane1 = new javax.swing.JScrollPane();
        LabJtable = new javax.swing.JTable();
        btnFind = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        myJtable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 141, 830, 120));

        btnFind.setText("Find Perfect Donor");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 668, 244, -1));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 468, 830, 182));

        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 288, -1, -1));

        jPanel3.setBackground(new java.awt.Color(15, 58, 59));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("My Lab Assistance Work Area");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 396, -1));

        jPanel4.setBackground(new java.awt.Color(15, 58, 59));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("My Lab Test");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel10)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 396, -1));
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable myJtable;
    // End of variables declaration//GEN-END:variables
}
