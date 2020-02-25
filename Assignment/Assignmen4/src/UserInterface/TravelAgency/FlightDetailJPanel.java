/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Buisness.Customer;
import Buisness.CustomerDirectory;
import Buisness.Flight;
import Buisness.Seats;
import UserInterface.Customer.CustomerinformationJpanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Swati
 */
public class FlightDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FlightDetailJPanel
     */
    private JPanel cardSequenceJPanel;
    private Flight selectedFlight;
    private Seats seat1;
    
    public FlightDetailJPanel(JPanel cardSequenceJPanel, Flight selectedFlight, Seats seat1) {
        initComponents();
        this.cardSequenceJPanel=cardSequenceJPanel;
        this.selectedFlight= selectedFlight;
        this.seat1=seat1;
        flightNumbTF.setText(selectedFlight.getFlightnumber());
        priceTF.setText(Double.toString(selectedFlight.getPrice()));
        
        seatSelection();
    }
    
    public void seatSelection(){
        DefaultComboBoxModel cbm= new DefaultComboBoxModel();
        cbm.addElement("Select Seat");
        //System.out.println("++++++++++++++++++++++++++++++++++++++@@@@@@@@@@@@@@@@@@@@@@@@@@" + );
        System.out.println("==================================================================" +seat1);
        System.out.println("+++++++++++++++++++++++++++++++++++" +seat1.getSeat().size());
        for (int i=0; i< seat1.getSeat().size();i++){
            cbm.addElement(seat1.getSeat().get(i));
        }
        seatComboBox.setModel(cbm);
        
        //seatComboBox.setModel(new DefaultComboBoxModel<Seats>());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        ssnTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        flightNumbTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        seatComboBox = new javax.swing.JComboBox<>();
        bookBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));

        backBtn.setBackground(new java.awt.Color(153, 153, 153));
        backBtn.setText("Cancel");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FirstName");

        firstNameTF.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LastName");

        lastNameTF.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Age");

        ageTF.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SSN");

        phoneTF.setBackground(new java.awt.Color(153, 153, 153));

        ssnTF.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price");

        priceTF.setBackground(new java.awt.Color(153, 153, 153));
        priceTF.setEnabled(false);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FlightNumber");

        flightNumbTF.setBackground(new java.awt.Color(153, 153, 153));
        flightNumbTF.setEnabled(false);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Seat Choice");

        seatComboBox.setBackground(new java.awt.Color(153, 153, 153));
        seatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Seat" }));
        seatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatComboBoxActionPerformed(evt);
            }
        });

        bookBtn.setBackground(new java.awt.Color(153, 153, 153));
        bookBtn.setText("Confirm Booking");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("BOOKING PAGE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ssnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(flightNumbTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bookBtn)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ssnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(flightNumbTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(seatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookBtn)
                    .addComponent(backBtn))
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        Component[] components = cardSequenceJPanel.getComponents();
        for(Component component: components){
            if(component instanceof FlightFoundJPanel){
                FlightFoundJPanel mpp = (FlightFoundJPanel) component;
                mpp.populateTable();
            }
        }
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed
    
    
    private void seatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatComboBoxActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        if(firstNameTF.getText().equals(""))
        {
            firstNameTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel1.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter First Name");
            return;
        }
        else{
            firstNameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel1.setForeground(Color.BLACK);
        }

        if(lastNameTF.getText().equals(""))
        {
            lastNameTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Last Name");
            return;
        }
        else{
            lastNameTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel2.setForeground(Color.BLACK);
        }

        if(ageTF.getText().equals(""))
        {
            ageTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter your age");
            return;
        }
        try{
            ageTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel3.setForeground(Color.BLACK);
            Integer.parseInt(ageTF.getText());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter number for age");
            return;
        }
        if(phoneTF.getText().equals(""))
        {
            phoneTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter your phone number");
            return;
        }
        else{
            phoneTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel4.setForeground(Color.BLACK);
        }

        if(ssnTF.getText().equals(""))
        {
            ssnTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter your SSN");
            return;
        }
        else{
            ssnTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setForeground(Color.BLACK);
        }

        try{
            ssnTF.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setForeground(Color.BLACK);
            Integer.parseInt(ssnTF.getText());
        }
        catch(Exception e){
            ssnTF.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter number for SSN");
            return;
        }
        if(seatComboBox.getSelectedItem().equals("Select Seat")){
            JOptionPane.showMessageDialog(null, "Please select a seat");
            return;
        }
        Customer newCustomer = new Customer();
        newCustomer.setFirstName(firstNameTF.getText());
        newCustomer.setLastName(lastNameTF.getText());
        newCustomer.setAge(Integer.parseInt(ageTF.getText()));
        newCustomer.setPhoneNumber(phoneTF.getText());
        newCustomer.setSsn(ssnTF.getText());
        newCustomer.setFlightBooked(selectedFlight);
        newCustomer.setSeatBooked(seatComboBox.getSelectedItem().toString());
        //newCustomer.setPrice(Integer.parseInt(priceTF.getText()));
        //CustomerDirectory customerDir = new CustomerDirectory();
        CustomerDirectory.customerdirectory.add(newCustomer);
        

        // removing seat which has been booked
        seat1.getSeat().remove(seatComboBox.getSelectedItem());
        CustomerinformationJpanel panel = new CustomerinformationJpanel(cardSequenceJPanel, (List<Customer>) seat1);
        cardSequenceJPanel.add("CustomerinformationJpanel",panel);
        CardLayout layout = (CardLayout)cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
        
/*
        JOptionPane.showMessageDialog(null, "Flight Ticket Booked");
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        Component[] components = cardSequenceJPanel.getComponents();
        for(Component component: components){
            if(component instanceof FlightFoundJPanel){
                FlightFoundJPanel mpp = (FlightFoundJPanel) component;
                mpp.populateTable();
            }
        }
        layout.previous(cardSequenceJPanel);*/
    }//GEN-LAST:event_bookBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JTextField flightNumbTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField priceTF;
    private javax.swing.JComboBox<String> seatComboBox;
    private javax.swing.JTextField ssnTF;
    // End of variables declaration//GEN-END:variables
}
