/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.OPOWorkArea;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.LabOrganization;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
import Buisness.WorkQueue.opoDoctorToDonorRequest;
import Buisness.WorkQueue.opoDoctorToLabRequest;
import Buisness.WorkQueue.workRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class DonorNotificationJpanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorNotificationJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private  EcoSystem system;
    private DonorOrganization org;
    public DonorNotificationJpanel(JPanel container, UserAccount account, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system=system;
        PopulateTable();
        populateNotifyTable();
       
       
    }
    public void PopulateTable(){
        
        DefaultTableModel model = (DefaultTableModel) opodoctorJtable.getModel();
        model.setRowCount(0);
        
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            
            if(organization instanceof DonorOrganization){
                org = (DonorOrganization)organization;
                for(workRequest request : org.getWorkqueue().getWorkrequestList()){
                    DoctorOrganRequest req = (DoctorOrganRequest) request;
                    if(req.getDonor()!=null){
                        
                        Object[] row = new Object[5];
                        row[0] = req;
                        row[1] = request.getRequest(); 
                        row[2] = req.getDonor();
                        row[3] = request.getResponse();
                        row[4] = req.getStatus();

                        model.addRow(row);
                    }
                    
                }
                
            }
        }
    }
    
    public void populateNotifyTable(){
        
        DefaultTableModel model = (DefaultTableModel) DonorJtable.getModel();
        model.setRowCount(0);
        
       
               for(workRequest request : account.getWorkqueue().getOpoDoctorTodonorlist()){
                    opoDoctorToDonorRequest req = (opoDoctorToDonorRequest) request;
                    Object[] row = new Object[5];
                    row[0] = request.getSender();
                    row[1] = request.getRequest();
                    row[2] = req.getD().getName();
                    row[3] = request.getResponse();
                    row[4] = request.getStatus();
                    model.addRow(row);
               }
            }
        
        
    
   
//    public void populateRequestTable(){
//        
//        DefaultTableModel model = (DefaultTableModel) LabtestJtable.getModel();
//        model.setRowCount(0);
//        
//        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
//            
//            if(organization instanceof LabOrganization){
//                //org1 = (LabOrganization)organization;
//                for(workRequest request : organization.getWorkqueue().getWorkrequestList()){
//                    opoDoctorToLabRequest req = (opoDoctorToLabRequest) request;
//                    Object[] row = new Object[6];
//                    row[0] = req.getPatient().getName();
//                    row[1] = request.getRequest();
//                    row[2] = req.getDonor().getName();
//                    row[3] = req.getPatient().getOrgan();
//                    row[4] = request.getResponse();
//                    row[5] = request.getStatus();
//                    model.addRow(row);
//                }
//                
//            }
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        DonorJtable = new javax.swing.JTable();
        btnInform = new javax.swing.JButton();
        txtInform = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        opodoctorJtable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DonorJtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Request", "Donor Name", "Response", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(DonorJtable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 970, 163));

        btnInform.setText("Notify Donor");
        btnInform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformActionPerformed(evt);
            }
        });
        add(btnInform, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, 173, -1));
        add(txtInform, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 278, -1));

        opodoctorJtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(opodoctorJtable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 217, 970, 138));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Donor Notification");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\git clone\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-hospital.png")); // NOI18N
        jLabel10.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addContainerGap(659, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/organ-donation-logo.jpg"))); // NOI18N
        jLabel8.setText("jLabel2");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformActionPerformed
        
         int selectedrow = (int)opodoctorJtable.getSelectedRow();
         String inform = txtInform.getText();
        Organization org = null;
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
                if(organization instanceof DonorOrganization){
                    
                    org = organization;
                    break;
                }   
            }
        if(selectedrow>=0){
            
            DoctorOrganRequest request = (DoctorOrganRequest)opodoctorJtable.getValueAt(selectedrow,1);
            
            if(request.getStatus().equals("completed")){
                
                if(request.getDonor()!=null){
                
                    opoDoctorToDonorRequest req = new opoDoctorToDonorRequest();
                    req.setSender(account);
                    req.setRequest(inform);
                    req.setStatus("sendToDonor");
                    req.setD(request.getDonor());
                    req.setP(request.getPatient());
                    
                    try{
                          account.getWorkqueue().getOpoDoctorTodonorlist().add(req);
                          System.out.println(account.getRole().toString());
                         // org.getWorkqueue().getOpoDoctorTodonorlist().add(req);
                        JOptionPane.showMessageDialog(null, "Request sent succesfully");
                        populateNotifyTable();
                        
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "not sent request");
                        System.out.println(e);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Donor not Found");
                }        
            
            } else{
                
                JOptionPane.showMessageDialog(null, "Request is not Completed"); 
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Select request First"); 
    }
        
//         int selectedRow = (int)LabtestJtable.getSelectedRow();
//        String inform = txtInform.getText();
//
//        Organization org3 = null;
//        for(Organization org1 : enterprise.getOrganizationdirectory().getOrganizationList()){
//            
//            if(org1 instanceof DonorOrganization){
//                org3 = org1;
//                break;
//            }  
//        }
//        if(selectedRow>=0){
//        opoDoctorToLabRequest request = (opoDoctorToLabRequest)LabtestJtable.getValueAt(selectedRow, 0);
//        opoDoctorToDonorRequest req = new opoDoctorToDonorRequest();
//        req.setSender(account);
//        req.setRequest(inform);
//        req.setD(request.getDonor());
//        req.setStatus("send to donor");
//        req.setP(request.getPatient());
//        
//        try{
//                 if(org3!=null){
//                     org3.getWorkqueue().getWorkrequestList().add(req);
//                     account.getWorkqueue().getWorkrequestList().add(req);
//                     JOptionPane.showMessageDialog(null, "Request send succesfully");
//                     //populateDonorTable();
//                     //PopulateTable();
//                     //populateRequestTable();
//                 }
//             }catch(Exception e){
//                 JOptionPane.showMessageDialog(null, "Can't send Request");
//             }
//        }else{
//            JOptionPane.showMessageDialog(null, "Please select Row");
//        }
//                
//        
//        
    }//GEN-LAST:event_btnInformActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DonorJtable;
    private javax.swing.JButton btnInform;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable opodoctorJtable;
    private javax.swing.JTextField txtInform;
    // End of variables declaration//GEN-END:variables
}
