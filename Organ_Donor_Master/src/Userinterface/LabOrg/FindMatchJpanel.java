/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.LabOrg;

import Buisness.Donor.Donor;
import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
import Buisness.WorkQueue.opoDoctorToLabRequest;
import Userinterface.DoctorOrg.ManagePatientJpanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class FindMatchJpanel extends javax.swing.JPanel {

    /**
     * Creates new form FindMatchJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Donor donor;
    private Patient p;
    private DoctorOrganRequest request;
    public FindMatchJpanel(JPanel container,UserAccount account,DoctorOrganRequest request,Donor donor,Patient p) {
        initComponents();
        this.container = container;
        this.account = account;
        this.donor = donor;
        this.request=request; 
        this.p=p;
        
        if(donor!=null){
            resultJlable.setText("Match found");
            populateTable();
        }else{
            resultJlable.setText("Not found appropriate Donor");
        }
        
    }

   public void populateTable(){
       
        DefaultTableModel model = (DefaultTableModel) donorJtable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6];
        row[0]= donor.getName();
        row[1] = donor.getEmailid();
        row[2] = donor.getOrgan();
        row[3] = donor.getTissue();
        row[4] = donor.getBloodgroup();
        row[5] = donor.getRe_rate();
        model.addRow(row);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        donorJtable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        resultJlable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResponse = new javax.swing.JTextField();
        btnResponse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        donorJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Emailid", "Organ", "Tissue Type", "Blood Group", "Respiratory Rate"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donorJtable);

        jLabel1.setText("Lab Test Result :");

        resultJlable.setText("<value>");

        jLabel2.setText("Response");

        btnResponse.setText("send Report");
        btnResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponseActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(txtResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(resultJlable, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultJlable))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtResponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResponse))
                .addContainerGap(360, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponseActionPerformed
        
        String response = txtResponse.getText();
        
        if(txtResponse.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please Add Response");
            
        }else{
            if(donor!=null){
            
                request.setDonor(donor);
                request.setPatient(p);
                request.setResponse(response);
                request.setStatus("completed"); 
            }else{
                
                request.setDonor(null);
                request.setPatient(p);
                request.setResponse(response);
                request.setStatus("completed");
            }
        
       
       JOptionPane.showMessageDialog(null, "Send Report Succesfully");
        }
    }//GEN-LAST:event_btnResponseActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
         container.remove(this);
         Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistanceWorkAreaJpanel sysAdminwjp = (LabAssistanceWorkAreaJpanel) component;
        sysAdminwjp.populateTable();
        sysAdminwjp.mypopulateTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnResponse;
    private javax.swing.JTable donorJtable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel resultJlable;
    private javax.swing.JTextField txtResponse;
    // End of variables declaration//GEN-END:variables
}
