/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DoctorOrg;

import Buisness.Organization.Organization;
import Buisness.Patient.Patient;
import Buisness.UserAccount.UserAccount;
import Buisness.Validation.ValidateStrings;
import Buisness.Validation.validateEmailid;
import Buisness.Validation.validateInteger;
import Buisness.Validation.validatePhone;
import Buisness.Validation.validateWeight;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class AddPatientDetailJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPatientDetailJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Organization organization;
    public AddPatientDetailJpanel(JPanel container, UserAccount account, Organization organization) {
        initComponents();
        this.container=container;
        this.account=account;
        this.organization=organization;
        populateBloodtypecombo();
        addInputverifiers();
       // System.out.println(organization.getUseraccountdirectory().getPatientdirectory());
        
        //System.out.println(organization.getUseraccountdirectory().getUserAccountList());
    }

    private void populateBloodtypecombo(){
       // bloodCombo.removeAllItems();
        bloodCombo.addItem("A+");
        bloodCombo.addItem("A-");
        bloodCombo.addItem("B+");
        bloodCombo.addItem("B-");
        bloodCombo.addItem("AB+");
        bloodCombo.addItem("AB-");
        bloodCombo.addItem("O+");
        bloodCombo.addItem("O-"); 
        SickCombo.addItem("Need_urgent_Transplant");
        SickCombo.addItem("Can Wait");
        TissueCombo.addItem("epithelial");
        TissueCombo.addItem("connective");
        TissueCombo.addItem("muscular");
        TissueCombo.addItem("nervous");
        OrganCombo.addItem("Heart");
        OrganCombo.addItem("Lung");
        OrganCombo.addItem("Liver");
        OrganCombo.addItem("Pancrease");
        OrganCombo.addItem("Kidney");
        OrganCombo.addItem("Intestines");
        
    }

    public void addInputverifiers(){
        
        InputVerifier stringValidation = new ValidateStrings();
        txtName.setInputVerifier(stringValidation);
        InputVerifier phonevalidation = new validatePhone();
        txtPhone.setInputVerifier(phonevalidation);
        InputVerifier emailidvalidation = new validateEmailid();
        txtEmailid.setInputVerifier(emailidvalidation);
        InputVerifier weightvalidation = new validateWeight();
        txtWeight.setInputVerifier(weightvalidation);
        InputVerifier ratevalidation = new validateInteger();
        txtrate.setInputVerifier(ratevalidation);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmailid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SickCombo = new javax.swing.JComboBox();
        TissueCombo = new javax.swing.JComboBox();
        bloodCombo = new javax.swing.JComboBox();
        OrganCombo = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtrate = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Name");

        jLabel3.setText("Email Id");

        txtEmailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailidActionPerformed(evt);
            }
        });

        jLabel4.setText("Phone Number");

        jLabel5.setText("Blood Type");

        jLabel6.setText("Weight");

        jLabel7.setText("How Sick");

        jLabel8.setText("Tissue Type");

        jLabel9.setText("Which Organ");

        jLabel10.setText("Needs To Transplant");

        SickCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        SickCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SickComboActionPerformed(evt);
            }
        });

        TissueCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        TissueCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TissueComboActionPerformed(evt);
            }
        });

        bloodCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        bloodCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodComboActionPerformed(evt);
            }
        });

        OrganCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        OrganCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganComboActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel11.setText("Respiratory Rate");

        jPanel4.setBackground(new java.awt.Color(15, 58, 59));
        jPanel4.setPreferredSize(new java.awt.Dimension(1000, 40));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Patient Details");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel13)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TissueCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmailid, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtPhone)
                                                .addComponent(txtWeight)
                                                .addComponent(txtrate)
                                                .addComponent(bloodCombo, 0, 133, Short.MAX_VALUE)
                                                .addComponent(SickCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtName))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OrganCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(171, 171, 171))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bloodCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SickCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TissueCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(OrganCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addComponent(btnSubmit)
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SickComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SickComboActionPerformed

      
    }//GEN-LAST:event_SickComboActionPerformed

    private void TissueComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TissueComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TissueComboActionPerformed

    private void bloodComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodComboActionPerformed

    private void OrganComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrganComboActionPerformed

    private void txtEmailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailidActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       
        String name = txtName.getText();
        String emailid = txtEmailid.getText();
        String phone = txtPhone.getText();
        String bloodtype = (String)bloodCombo.getSelectedItem();
        float weight = (Float.parseFloat(txtWeight.getText()));
        String howsick = (String)SickCombo.getSelectedItem();
        String tissue =(String)TissueCombo.getSelectedItem();
        String organ = (String)OrganCombo.getSelectedItem();
        int rate = Integer.parseInt(txtrate.getText());
        String flag = "eligible";
        
        if(txtName.getText().trim().isEmpty() ||
            txtEmailid.getText().trim().isEmpty() ||
            txtPhone.getText().trim().isEmpty() ||
             bloodCombo.getSelectedIndex()<0 ||
               txtWeight.getText().trim().isEmpty() ||
                SickCombo.getSelectedIndex()<0 ||
                TissueCombo.getSelectedIndex()<0||
                OrganCombo.getSelectedIndex()<0 ||
                txtrate.getText().trim().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please Enter All Field");
           return;  
        }
       
            boolean check = organization.getPatientdirectory().checkIfUsernameIsUnique(emailid);
            
            if(check == true){
            try{
            organization.getPatientdirectory().ADDPatient(name, emailid, phone, bloodtype, weight, howsick, tissue, organ,rate,flag);
            JOptionPane.showMessageDialog(null, "Patient Details Added succesfully");
            }catch(Exception e){   
            }
            }else{
                 JOptionPane.showMessageDialog(null, "Patient Already Exist"); 
            }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       container.remove(this);
         Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManagePatientJpanel sysAdminwjp = (ManagePatientJpanel) component;
        sysAdminwjp.populateTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox OrganCombo;
    private javax.swing.JComboBox SickCombo;
    private javax.swing.JComboBox TissueCombo;
    private javax.swing.JComboBox bloodCombo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtEmailid;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtrate;
    // End of variables declaration//GEN-END:variables
}
