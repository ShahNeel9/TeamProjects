/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Buisness.Flight;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class viewbookinginformationJpanel extends javax.swing.JPanel {
    private JPanel cardSequenceJPanel;
    private Flight bookedFlight;
    private String seatBooked;
    
    /**
     * Creates new form viewbookinginformationJpanel
     */
    public viewbookinginformationJpanel(JPanel cardSequenceJPanel, Flight bookedFlight, String seatBooked) {
        initComponents();
        this.cardSequenceJPanel=cardSequenceJPanel;
        this.bookedFlight=bookedFlight;
        this.seatBooked=seatBooked;
        populateTextFields();
        enable();
    }
    
    private void populateTextFields(){
        airlinerTextField.setText(bookedFlight.getAirline());
        flightNumTextField.setText(bookedFlight.getFlightnumber());
        destinationTextField.setText(bookedFlight.getDestination());
        sourceTextField.setText(bookedFlight.getSource());
        arrTimeTextField.setText(Double.toString(bookedFlight.getArrTime()));
        depTimeTextField.setText(Double.toString(bookedFlight.getDepTime()));
        durationTextField.setText(Integer.toString(bookedFlight.getDuration()));
        todTextField.setText(bookedFlight.getTime());
        txtPrice.setText(Double.toString(bookedFlight.getPrice()));
        String strDate = "";
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            strDate = dateFormat.format(bookedFlight.getDate());
            //System.out.println("Converted String: " + strDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        timeTextField.setText(strDate);
        seatTextField.setText(seatBooked);
    }
    
    public void enable(){
        airlinerTextField.setEnabled(false);
        flightNumTextField.setEnabled(false);
        destinationTextField.setEnabled(false);
        sourceTextField.setEnabled(false);
        arrTimeTextField.setEnabled(false);
        depTimeTextField.setEnabled(false);
        durationTextField.setEnabled(false);
        todTextField.setEnabled(false);
        timeTextField.setEnabled(false);
        seatTextField.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        airlinerTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        flightNumTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sourceTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        destinationTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        depTimeTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        arrTimeTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        durationTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        todTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        seatTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        timeTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Booking Information");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Airliner");

        jLabel3.setText("Flight Number");

        jLabel4.setText("Source");

        jLabel5.setText("Destination");

        destinationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Departure Time");

        jLabel7.setText("Arrival Time");

        jLabel8.setText("Duration");

        jLabel9.setText("Operated Time Of Day");

        jLabel10.setText("Seat");

        jLabel11.setText("Date");

        jLabel12.setText("price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(airlinerTextField)
                            .addComponent(flightNumTextField)
                            .addComponent(sourceTextField)
                            .addComponent(destinationTextField)
                            .addComponent(depTimeTextField)
                            .addComponent(arrTimeTextField)
                            .addComponent(durationTextField)
                            .addComponent(todTextField)
                            .addComponent(seatTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(timeTextField)
                            .addComponent(txtPrice))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(durationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(airlinerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(flightNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sourceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(destinationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(depTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(arrTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(todTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(timeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(seatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void destinationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationTextFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout= (CardLayout) cardSequenceJPanel.getLayout();
        
        Component[] components = cardSequenceJPanel.getComponents();
        for(Component component: components){
            if(component instanceof CustomerinformationJpanel){
                CustomerinformationJpanel panel= (CustomerinformationJpanel) component;
                panel.populateTable();
            }
        }
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerTextField;
    private javax.swing.JTextField arrTimeTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField depTimeTextField;
    private javax.swing.JTextField destinationTextField;
    private javax.swing.JTextField durationTextField;
    private javax.swing.JTextField flightNumTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField seatTextField;
    private javax.swing.JTextField sourceTextField;
    private javax.swing.JTextField timeTextField;
    private javax.swing.JTextField todTextField;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}