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
import java.awt.CardLayout;
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
        btnInitiate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transplantJtable = new javax.swing.JTable();
        txtrequest = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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

        txtrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrequestActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(15, 58, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("My Request");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\New folder\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-medical_heart.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Approved Report");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\New folder\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-medical_heart.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Legal Organization Report");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(78, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel5)
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtrequest, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(btnInitiate, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInitiate)
                    .addComponent(txtrequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInitiate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable reportJtable;
    private javax.swing.JTable transplantJtable;
    private javax.swing.JTextField txtrequest;
    // End of variables declaration//GEN-END:variables
}
