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
        
        networkJComboBox.removeAllItems();
      
        for(Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    
    }
    public void populateEnterpriseComboBox(Network network){
        
        ORGcombo.removeAllItems();
        for(Enterprise enterprise : network.getEnterprisedirectory().getEnterpriseList()){
            
            if(enterprise.getEnterprisetype().getValue().equals(Enterprise.EnterpriseType.OPO.getValue())){
                ORGcombo.addItem(enterprise.getName());
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
        ORGcombo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();

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

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRequest.setText("Send Organ Request to OPO");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        jLabel2.setText("Enterprise");

        ORGcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));

        jLabel3.setText("Network");

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ORGcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ORGcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRequest)
                .addContainerGap(306, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        
        int selecterdRow = (int)organRequestJtable.getSelectedRow();
       // String status = txtStatus.getText();
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

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
         Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ORGcombo;
    private javax.swing.JButton btnRequest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTable organRequestJtable;
    // End of variables declaration//GEN-END:variables
}
