/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdministartionOrg;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organization.DoctorOrganization;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import Buisness.Organization.TransportOrganization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorToDriverRequest;
import Buisness.WorkQueue.InformDoctor;
import Buisness.WorkQueue.workRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class ManageDeliveryJpanel extends javax.swing.JPanel {

    
    
    private JPanel container;
    private UserAccount account ;
    private Enterprise enterprise;
    private EcoSystem system;
    private TransportOrganization org;
    private DoctorToDriverRequest req1;
    private InformDoctor req2;
    public ManageDeliveryJpanel(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container=container;
        this.account=account;
        this.enterprise = enterprise;
        this.system= system;
        populateTable();
        InformTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) driverJtable.getModel();
         model.setRowCount(0);
         
         for(Network network : system.getNetworkList()){
             for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                     
                     if(organization instanceof TransportOrganization){
                         
                         org = (TransportOrganization)organization;
                         break;
                     }
                 }
             }
                
         }
         
                 for(workRequest request : org.getWorkqueue().getDoctorToDriverList()){
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
             
         

    public void InformTable(){
        
        DefaultTableModel model = (DefaultTableModel) informJtable.getModel();
         model.setRowCount(0);
         
         for(workRequest request : account.getWorkqueue().getInformDoctorlist()){
             req2 = (InformDoctor)request;
                        Object[] row = new Object[5];
                        row[0] = request.getSender().getUsername();
                        row[1] = request.getReceiver();
                        row[2] = req2.getOrgan();
                        row[3] = request.getResponse();
                        row[4] = request.getStatus();
                        model.addRow(row);
         }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        driverJtable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        informJtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();

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

        informJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "sender", "Receiver", "Organ", "Response", "status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(informJtable);

        jButton1.setText("Inform Doctor");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int selectedRow = (int)driverJtable.getSelectedRow();
        
        Organization org1 = null;
        for(Organization org : enterprise.getOrganizationdirectory().getOrganizationList()){
            if(org instanceof DoctorOrganization){
                org1=org;
                break;
            }
        }
        if(selectedRow>=0){
            
            DoctorToDriverRequest request = (DoctorToDriverRequest)driverJtable.getValueAt(selectedRow, 1);
            
            if(request.getStatus().equals("Delivered")){
                
                InformDoctor req = new InformDoctor();
                req.setDoctor(request.getDoctor());
                req.setOrgan(request.getOrgan());
                req.setPatient_name(request.getPatient_name());
                req.setPatient_email(request.getPatient_email());
                System.out.println(request.getPatient_email()+"at delivery");
                UserAccount doctor = request.getDoctor();
                req.setReceiver(doctor);
                req.setSender(account);
                req.setStatus("send");
                
                //try{
                    org1.getWorkqueue().getInformDoctorlist().add(req);
                    account.getWorkqueue().getInformDoctorlist().add(req);
                    doctor.getWorkqueue().getInformDoctorlist().add(req);
                    JOptionPane.showMessageDialog(null, "Send Successfully"); 
                    InformTable();
                    
                    
//                }catch(Exception e){
//                    
//                }
                
            }else{
               JOptionPane.showMessageDialog(null, "Organ is not delivered"); 
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Select Row first");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable driverJtable;
    private javax.swing.JTable informJtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
