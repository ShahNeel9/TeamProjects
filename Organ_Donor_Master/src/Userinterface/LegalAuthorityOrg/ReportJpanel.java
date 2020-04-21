/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.LegalAuthorityOrg;

import Buisness.EcoSystem;
import Buisness.UserAccount.UserAccount;
import Buisness.WorkQueue.adminToLegalReport;
import Userinterface.SystemAdninWorkArea.SystemAdminWorkAreaJPanel;
import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author patel
 */
public class ReportJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportJpanel
     */
    private adminToLegalReport request;
    private UserAccount account;
    private EcoSystem system;
    private JPanel container;
    public ReportJpanel(adminToLegalReport request, UserAccount account, EcoSystem system, JPanel container) {
        initComponents();
        this.request = request;
        this.account = account;
        this.system = system;
        this.container = container;
        populateCombobox();
        populateLable();
    }

    public void sendEmail(String recipient, String details) throws IOException{
        
    Email from = new Email("sapna.patel.01993@gmail.com");
    String subject = "Report";
    Email to = new Email(recipient);
    Content content = new Content("text/plain", details);
    Mail mail = new Mail(from, subject, to, content);

    SendGrid sg = new SendGrid("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");
    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sg.api(request);
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody());
      System.out.println(response.getHeaders());
    } catch (IOException ex) {
      throw ex;
    }
        
    }
    public void populateCombobox(){
        
        responseCombo.addItem("Approve");
        responseCombo.addItem("Decline");
    }
 
    public void populateLable(){
        
        p_namelable.setText(request.getPatient_name());
        p_emaillable.setText(request.getPatient_email());
        p_conlable.setText(request.getPatient_condition());
        d_namelable.setText(request.getDonor_name());
        organLable.setText(request.getOrgan());
        doctorlable.setText(request.getDoctor().getUsername());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        p_namelable = new javax.swing.JLabel();
        doctorlable = new javax.swing.JLabel();
        doctorlable3 = new javax.swing.JLabel();
        doctorlable4 = new javax.swing.JLabel();
        p_emaillable = new javax.swing.JLabel();
        p_conlable = new javax.swing.JLabel();
        p_conlable1 = new javax.swing.JLabel();
        d_namelable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        organLable = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        responseCombo = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        mail = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(745, 800));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Doctor Name");

        p_namelable.setText("<value>");

        doctorlable.setText("<value>");

        doctorlable3.setText("Patient Email id");

        doctorlable4.setText("Patient Condition");

        p_emaillable.setText("<value>");

        p_conlable.setText("<value>");

        p_conlable1.setText("Donor Name");

        d_namelable.setText("<value>");

        jLabel4.setText("Organ");

        organLable.setText("<value>");

        jLabel2.setText("Patient Name");

        jLayeredPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(p_namelable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(doctorlable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(doctorlable3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(doctorlable4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(p_emaillable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(p_conlable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(p_conlable1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(d_namelable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(organLable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addComponent(doctorlable, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(doctorlable4, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(doctorlable3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(p_conlable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_emaillable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d_namelable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(organLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_conlable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(57, 57, 57))
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(p_namelable, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(doctorlable))
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_namelable)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorlable3)
                    .addComponent(p_emaillable))
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorlable4)
                    .addComponent(p_conlable))
                .addGap(32, 32, 32)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p_conlable1)
                    .addComponent(d_namelable))
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(organLable))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jButton1.setText("Send Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Response");

        responseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        mail.setText("Mail Report");
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(61, 61, 61)
                                .addComponent(responseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(30, 30, 30)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(104, 104, 104)
                        .addComponent(jButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(responseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mail)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String res = responseCombo.getSelectedItem().toString();
        try{
            
            request.setResponse(res);
            request.setStatus("complete");
            JOptionPane.showMessageDialog(null, "Report send succesfully");
                    
            
        }catch(Exception e){
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        manageRequestJpanel sysAdminwjp = (manageRequestJpanel) component;
        sysAdminwjp.populateReportTable();
        sysAdminwjp.mypopulateTable();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        
        String details = "Report Generated";
        
        String email = request.getPatient_email();
        try {
            sendEmail(email, details);
            JOptionPane.showMessageDialog(null, "Report mail send successfully");
        } catch (IOException ex) {
            Logger.getLogger(ReportJpanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_mailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel d_namelable;
    private javax.swing.JLabel doctorlable;
    private javax.swing.JLabel doctorlable3;
    private javax.swing.JLabel doctorlable4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JButton mail;
    private javax.swing.JLabel organLable;
    private javax.swing.JLabel p_conlable;
    private javax.swing.JLabel p_conlable1;
    private javax.swing.JLabel p_emaillable;
    private javax.swing.JLabel p_namelable;
    private javax.swing.JComboBox<String> responseCombo;
    // End of variables declaration//GEN-END:variables
}
