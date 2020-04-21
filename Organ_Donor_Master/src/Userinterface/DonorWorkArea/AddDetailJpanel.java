/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.DonorWorkArea;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.Organization.Organization;
import Buisness.UserAccount.UserAccount;
import Buisness.Validation.ValidateStrings;
import Buisness.Validation.validateEmailid;
import Buisness.Validation.validateInteger;
import Buisness.Validation.validatePhone;
import Buisness.Validation.validateWeight;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */

public class AddDetailJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDetailJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private Organization organization;
            
    public AddDetailJpanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        populateCombo();
        addInputverifiers();
        txtName.setEnabled(false);
        txtName.setText(account.getUsername());
        //System.out.println(organization.getDonorlist().getDonorlist());
    }

    public void populateCombo(){
        
        bloodCombo.addItem("A+");
        bloodCombo.addItem("A-");
        bloodCombo.addItem("B+");
        bloodCombo.addItem("B-");
        bloodCombo.addItem("AB+");
        bloodCombo.addItem("AB-");
        bloodCombo.addItem("O+");
        bloodCombo.addItem("O-"); 
        
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
        txtemailid.setInputVerifier(emailidvalidation);
        InputVerifier weightvalidation = new validateWeight();
        txtWeight.setInputVerifier(weightvalidation);
        InputVerifier ratevalidation = new validateInteger();
        txtRate.setInputVerifier(ratevalidation);
        InputVerifier bpvalidate = new validateWeight();
        txtpressure.setInputVerifier(bpvalidate);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtemailid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        bloodCombo = new javax.swing.JComboBox<>();
        TissueCombo = new javax.swing.JComboBox<>();
        txtRate = new javax.swing.JTextField();
        txtpressure = new javax.swing.JTextField();
        OrganCombo = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Email_id");

        jLabel3.setText("Phone");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        jLabel4.setText("Weight");

        jLabel5.setText("Blood Group");

        jLabel6.setText("Tissue Type");

        jLabel7.setText("Respiratory rate");

        jLabel8.setText("Blood Presure");

        jLabel9.setText("Which Organ");

        jLabel10.setText("Wants to Donate");

        bloodCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));

        TissueCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));

        OrganCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(txtemailid, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(bloodCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TissueCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRate)
                                    .addComponent(txtpressure)
                                    .addComponent(OrganCombo, 0, 217, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtemailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bloodCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TissueCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtpressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(OrganCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(40, 40, 40)
                .addComponent(btnSubmit)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
       String name = txtName.getText();
       String emailid = txtemailid.getText();
       String phone = txtPhone.getText();
       int rate = Integer.parseInt(txtRate.getText());
       int bp = Integer.parseInt(txtpressure.getText());
       float weight = Float.parseFloat(txtWeight.getText());
       String bloodgrp = (String)bloodCombo.getSelectedItem();
       String tissue = (String)TissueCombo.getSelectedItem();
       String organ = (String)OrganCombo.getSelectedItem();
        if(txtName.getText().trim().isEmpty() ||
                txtemailid.getText().trim().isEmpty() ||
                txtPhone.getText().trim().isEmpty() ||
                txtRate.getText().trim().isEmpty() ||
                txtWeight.getText().trim().isEmpty() ||
                txtpressure.getText().trim().isEmpty() ||
                bloodCombo.getSelectedIndex()<0 ||
                TissueCombo.getSelectedIndex()<0 ||
                OrganCombo.getSelectedIndex() < 0){
            
            JOptionPane.showMessageDialog(null, "Please Enter All Field");
           return;  
        }
        boolean result = organization.getDonorlist().checkIfUsernameIsUnique(name);
        if(result == true){
            try{
            
            organization.getDonorlist().AddDonor(name, emailid, phone, weight, bloodgrp, tissue, rate, bp, organ);
            
            
            JOptionPane.showMessageDialog(null, "Details added succesfully");
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Something went wrong");
          
            }  
        }else{
            JOptionPane.showMessageDialog(null, "User Already exist");
        }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
         container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> OrganCombo;
    private javax.swing.JComboBox<String> TissueCombo;
    private javax.swing.JComboBox<String> bloodCombo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtpressure;
    // End of variables declaration//GEN-END:variables
}
