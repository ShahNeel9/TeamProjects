/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.AdministartionOrg;

import Buisness.EcoSystem;
import Buisness.Enterprise.Enterprise;
import Buisness.UserAccount.UserAccount;
import Userinterface.DoctorOrg.ProcessRequestJpanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class AdministrationJpanel extends javax.swing.JPanel {

    /**
     * Creates new form AdministrationJpanel
     */
    private JPanel container;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    public AdministrationJpanel(JPanel container, UserAccount account, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.container = container;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        
    }

    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOrganrequest = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOrganrequest.setText("Manage Organ Request");
        btnOrganrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganrequestActionPerformed(evt);
            }
        });
        add(btnOrganrequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 269, -1));

        btnReport.setText("Manage Organ Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 269, -1));

        jButton1.setText("Manage Organ Transplant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 269, -1));

        jButton2.setText("Check Organ Delivery");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 269, -1));

        jPanel1.setBackground(new java.awt.Color(15, 58, 59));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\patel\\Desktop\\New folder\\TeamProjects\\Organ_Donor_Master\\src\\Icons\\icons8-businessman.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administration Organization");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(540, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrganrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrganrequestActionPerformed
        
        ManageOrganRequestJpanel process = new ManageOrganRequestJpanel(container,account,enterprise,system);
            container.add("manageTransplantEmployee", process);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        
    }//GEN-LAST:event_btnOrganrequestActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        
            ManageOrganReport process = new ManageOrganReport(container,account,enterprise,system);
            container.add("manageOrganReport", process);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
    }//GEN-LAST:event_btnReportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
            ManageOrganTransplant process = new ManageOrganTransplant(container,account,enterprise,system);
            container.add("manageOrganReport", process);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            ManageDeliveryJpanel process = new ManageDeliveryJpanel(container,account,enterprise,system);
            container.add("manageOrganReport", process);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrganrequest;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
