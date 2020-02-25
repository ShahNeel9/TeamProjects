/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Buisness.Airliner;
import Buisness.AirlinerDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class CreateNewAirlinerJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerJpanel
     */
    private JPanel CardSequenceJpanel;
    private AirlinerDirectory airlinerDirectory;
    public CreateNewAirlinerJpanel() {
        initComponents();
    }

    CreateNewAirlinerJpanel(JPanel CardSequenceJpanel, AirlinerDirectory airlinerdirectory) {
        initComponents();
        this.CardSequenceJpanel=CardSequenceJpanel;
        this.airlinerDirectory=airlinerdirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAirid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNum_flight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtorigin = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        txtCancle = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE NEW AIRLINER");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        txtName.setBackground(new java.awt.Color(153, 153, 153));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Airliner_id");

        txtAirid.setBackground(new java.awt.Color(153, 153, 153));
        txtAirid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAiridActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fleet Size");

        txtNum_flight.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Origin Country");

        txtorigin.setBackground(new java.awt.Color(153, 153, 153));
        txtorigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoriginActionPerformed(evt);
            }
        });

        btnCreate.setBackground(new java.awt.Color(153, 153, 153));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtCancle.setBackground(new java.awt.Color(153, 153, 153));
        txtCancle.setText("Back");
        txtCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtCancle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(txtAirid)
                    .addComponent(txtNum_flight)
                    .addComponent(txtorigin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreate)
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(188, 188, 188))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtCancle)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAirid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNum_flight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtorigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(141, 141, 141))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAiridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAiridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAiridActionPerformed

    private void txtoriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoriginActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String name=txtName.getText();
        String air_id = txtAirid.getText();
        String origin_c=txtorigin.getText();
       // int num_op = Integer.parseInt(txtC_operated.getText());
        //int num_flight = Integer.parseInt(txtNum_flight.getText());
        
        Pattern p = Pattern.compile("^[a-zA-Z_]*$");
            Matcher m = p.matcher(name);
            Matcher m2 = p.matcher(origin_c);
           Pattern p1 = Pattern.compile("^[a-zA-Z0-9]+$");
            Matcher m1 = p1.matcher(air_id); 
        
        if(name == null & name == " "){
          
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Name");
            return;
        }/*else if((m.matches())== false){
            txtName.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter valid Name");
            return;
            
        }*/else{
            txtName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel2.setBackground(Color.BLACK);
        }
        
        if(air_id == null & air_id == " "){
            
            txtAirid.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Airliner_id");
            return;
        }else if(((m1.matches())==false)){
            
            txtAirid.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please valid enter Airliner_id");
            return;
        }
        
        else{
            txtAirid.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel3.setBackground(Color.BLACK);
        }
        
        if(origin_c == null & origin_c == " "){
            
            txtorigin.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Origin Country");
            return;
        }else if(((m2.matches())==false)){
             txtorigin.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Valid Origin Country");
            return;
        }
        else{
            txtorigin.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setBackground(Color.BLACK);
        }
        
       /* try{
            Double.parseDouble(txtC_operated.getText());
            txtC_operated.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel6.setForeground(Color.BLACK);
        }
        catch(Exception e){
            txtC_operated.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel6.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter number for Countries operated");
            return;
        }
        */
        try{
            Double.parseDouble(txtNum_flight.getText());
            txtNum_flight.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel4.setForeground(Color.BLACK);
        }
        catch(Exception e){
            txtNum_flight.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter number for Number of Flights");
            return;
        }
        
        Airliner airliner = airlinerDirectory.addAirlinear();
        airliner.setName(name);
        airliner.setAirlinecode(air_id);
        airliner.setNumofFlight(Integer.parseInt(txtNum_flight.getText()));
        //airliner.setCountryOperated(Integer.parseInt(txtC_operated.getText()));
        airliner.setOrigin_country(origin_c);
        //airlinerDirectory.addAirline(airliner);
        JOptionPane.showMessageDialog(null, "Airliner Created Sucessfully");
        
        txtName.setText("");
        txtAirid.setText("");
        //txtC_operated.setText("");
        txtNum_flight.setText("");
        txtorigin.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancleActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
        txtAirid.setText("");
        //txtC_operated.setText("");
        txtNum_flight.setText("");
        txtorigin.setText("");
        
        CardSequenceJpanel.remove(this);
        CardLayout layout = (CardLayout)CardSequenceJpanel.getLayout();
        
        Component[] components = CardSequenceJpanel.getComponents();
        for(Component component: components){
            if(component instanceof ManageAirlinersJpanel){
                ManageAirlinersJpanel manage = (ManageAirlinersJpanel) component;
                manage.PopulateTable();
            }
            
        }
        
    }//GEN-LAST:event_txtCancleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAirid;
    private javax.swing.JButton txtCancle;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNum_flight;
    private javax.swing.JTextField txtorigin;
    // End of variables declaration//GEN-END:variables
}
