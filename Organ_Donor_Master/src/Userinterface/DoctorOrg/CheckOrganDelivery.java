/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DoctorOrg;

import Buisness.Enterprise.Enterprise;
import Buisness.Organization.Organization;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.InformDoctor;
import Buisness.WorkQueue.workRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class CheckOrganDelivery extends javax.swing.JPanel {

    /**
     * Creates new form CheckOrganDelivery
     */
    
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private Organization organization;
     private InformDoctor req2;
    public CheckOrganDelivery(JPanel container, UserAccount account, Organization organization, Enterprise enterprise) {
        initComponents();
        this.container=container;
        this.account=account;
        this.enterprise=enterprise;
        this.organization=organization;
        InformTable();
    }

   public void InformTable(){
        
        DefaultTableModel model = (DefaultTableModel) informJtable.getModel();
         model.setRowCount(0);
         
         for(workRequest request : account.getWorkqueue().getInformDoctorlist()){
             req2 = (InformDoctor)request;
                        Object[] row = new Object[4];
                       
                        row[0] = request.getReceiver();
                        row[1] = req2;
                        row[2] = request.getResponse();
                        row[3] = request.getStatus();
                        model.addRow(row);
         }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        informJtable = new javax.swing.JTable();
        txtRes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        informJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Organ", "Response", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(informJtable);

        jButton1.setText("Complete");
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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        int selectedRow = (int)informJtable.getSelectedRow();
        String res = txtRes.getText();
        
        if(selectedRow>=0){
            
            
            
            InformDoctor req = (InformDoctor)informJtable.getValueAt(selectedRow,1 );
           // if(req.getStatus().equals("send")){
            req.setStatus("Complete");
            String email = req.getPatient_email();
            System.out.println(email+"req");
            req.setResponse(res);
            InformTable();
            System.out.println(organization);
            
           
            for(Patient p : organization.getPatientdirectory().getPatientdirectory()){
                
                System.out.println(p.getEmailid()+"org");
                if(p.getEmailid().equals(email)){
                    p.setFlag("complete");
                }
            }
            //organization.getPatientdirectory().changeStatus(email);
//            }else{
//                
//                JOptionPane.showMessageDialog(null, "Process Complete");  
//            }
            
        }else{
           JOptionPane.showMessageDialog(null, "Select Request first");  
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable informJtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtRes;
    // End of variables declaration//GEN-END:variables
}
