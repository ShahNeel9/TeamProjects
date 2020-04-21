/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdministartionOrg;


import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Network.Network;
import Buisness.Organization.AdministrationOrganization;
import Buisness.Organization.DonorOrganization;
import Buisness.Organization.Organization;
import static Buisness.Organization.Organization.Type.Administration;
import static Buisness.Organization.Organization.Type.Donor;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.DoctorOrganRequest;
import Buisness.WorkQueue.workRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class ManageOrganRequestJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganRequestJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private AdministrationOrganization org;
    private EcoSystem system;
    private Enterprise ent;
    public ManageOrganRequestJpanel(JPanel container, UserAccount account, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        //System.out.println(enterprise.getEnterprisetype());
        PopulateTable();
        populatecombo();
        //populateTableMyRequest();
    }

    public void populatecombo(){
        
        networkJComboBox1.removeAllItems();
      
        for(Network network : system.getNetworkList()){
            networkJComboBox1.addItem(network);
        }
    
    }
    public void populateEnterpriseComboBox(Network network){
        
        enterprisecombo.removeAllItems();
        for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
            
            if(enterprise.getEnterprisetype().getValue().equals(Enterprise.EnterpriseType.OPO.getValue())){
                enterprisecombo.addItem(enterprise);
            }
        }
        
    }
   
    public void PopulateTable(){
        
        DefaultTableModel model = (DefaultTableModel) organRequestJtable.getModel();
        model.setRowCount(0);
        
        for(Organization organization : enterprise.getOrganizationdirectory().getOrganizationList()){
            
            if(organization instanceof AdministrationOrganization){
                org = (AdministrationOrganization)organization;
                for(workRequest request : org.getWorkqueue().getWorkrequestList()){
                    DoctorOrganRequest req = (DoctorOrganRequest) request;
                    
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

//    public void populateTableMyRequest(DoctorOrganRequest request){
//        
//        DefaultTableModel model = (DefaultTableModel) myJtable.getModel();
//        model.setRowCount(0);
//        
//        
//            DoctorOrganRequest req = (DoctorOrganRequest) request;
//                    Object[] row = new Object[7];
//                    row[0] = request;
//                    row[1] = request.getRequest();
//                    row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//                    row[3] = request.getResponse();
//                    row[4] = req.getPatient().getName();
//                    row[5] = req.getPatient().getOrgan();
//                    row[6] = request.getStatus();
//                    model.addRow(row);
//        
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        organRequestJtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        enterprisecombo = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox1 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 680, 127));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 103, -1));

        btnRequest.setText("Send Organ Request to OPO");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 247, -1));

        jLabel2.setText("Enterprise");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 106, -1));

        jLabel3.setText("Network");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 100, -1));

        enterprisecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterprisecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterprisecomboActionPerformed(evt);
            }
        });
        add(enterprisecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 174, -1));

        jPanel1.setBackground(new java.awt.Color(15, 58, 59));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Organ Request");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\New folder\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-medical_heart.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(665, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1000, 40));

        networkJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBox1ActionPerformed(evt);
            }
        });
        add(networkJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 174, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        
        int selecterdRow = (int)organRequestJtable.getSelectedRow();
       // String status = txtStatus.getText();
        Organization org2 = null;
        Enterprise ent1 = (Enterprise)enterprisecombo.getSelectedItem();
         for(Network network : system.getNetworkList()){
             for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
                 if(enterprise.equals(ent1)){
                     
                 for(Organization organization : ent1.getOrganizationdirectory().getOrganizationList()){
                     
                     if(organization instanceof DonorOrganization){
                         
                         org2 = organization;
                         break;
                     }
                 }
             }
                
         }
         }
        if(selecterdRow>=0){
            
            DoctorOrganRequest req1 = (DoctorOrganRequest)organRequestJtable.getValueAt(selecterdRow, 0);
            
           // req1.setSender(account);
            //req1.setRequest(status);
            req1.setStatus("sendToOPO");
//            JOptionPane.showMessageDialog(null, "Request send succesfully");
//            PopulateTable();
            try{
                   if(org2!=null){
                    org2.getWorkqueue().getWorkrequestList().add(req1);
                    //account.getWorkqueue().getWorkrequestList().add(req1);
                    JOptionPane.showMessageDialog(null, "Request send succesfully");
                    PopulateTable();
                   }
                   
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "can't send Request");
            }
            
           
        }else{
            JOptionPane.showMessageDialog(null, "Select Request First");
        }
            
            
       
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void enterprisecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterprisecomboActionPerformed
//        // TODO add your handling code here:
//         Network network = (Network) enterprisecombo.getSelectedItem();
//        if (network != null){
//            populateEnterpriseComboBox(network);
//        }

    }//GEN-LAST:event_enterprisecomboActionPerformed

    private void networkJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBox1ActionPerformed
        // TODO add your handling code here:
          Network network = (Network) networkJComboBox1.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox enterprisecombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkJComboBox1;
    private javax.swing.JTable organRequestJtable;
    // End of variables declaration//GEN-END:variables
}
