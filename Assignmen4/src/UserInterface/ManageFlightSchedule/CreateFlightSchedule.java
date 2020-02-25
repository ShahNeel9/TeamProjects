/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageFlightSchedule;

import Buisness.Airliner;
import Buisness.AirlinerDirectory;
import Buisness.Airplane;
import Buisness.AirplaneDirectory;
import Buisness.Flight;
import Buisness.FlightDirectory;
import UserInterface.ManageAirliners.ManageAirlinersJpanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author patel
 */
public class CreateFlightSchedule extends javax.swing.JPanel {

    /**
     * Creates new form CreateFlightSchedule
     */
   private JPanel CardSequenceJpanel;
    private AirlinerDirectory airlinerDirectory;
    private FlightDirectory flightdirectory;
    private AirplaneDirectory airplanedirectory;
   List<Airplane> list = new ArrayList<Airplane>();
    public CreateFlightSchedule(JPanel CardSequenceJpanel,AirlinerDirectory airlinerDirectory,FlightDirectory flightdirectory) {
        initComponents();
        this.CardSequenceJpanel=CardSequenceJpanel;
        this.airlinerDirectory=airlinerDirectory;
        this.flightdirectory = flightdirectory;
        this.airplanedirectory = new AirplaneDirectory();
       //  list.add(airplanedirectory.getAirplanedirectory());
        for(Airliner a : this.airlinerDirectory.getAirlinedirectory()){
             //a.getName();
             airlinecombo.addItem(a.getName());
             //modelcombo.addItem(a.getAirplanelist().toString());
        }
        
      /*  for(Airplane a1 :this.airplanedirectory.getAirplanedirectory()){
        
            airlinecombo.addItem(a1.getModel());
    }*/
      
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSource = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDestination = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDeparture = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtArrival = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        airlinecombo = new javax.swing.JComboBox<>();
        jXDatePicker = new org.jdesktop.swingx.JXDatePicker();
        timecombo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        modelcombo = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE FLIGHT SCHEDULE");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Airliner");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Flight Number");

        txtFlightNumber.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Source");

        txtSource.setBackground(new java.awt.Color(153, 153, 153));
        txtSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSourceActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Destination");

        txtDestination.setBackground(new java.awt.Color(153, 153, 153));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Departure Time");

        txtDeparture.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Arrival Time");

        txtArrival.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Duration");

        txtDuration.setBackground(new java.awt.Color(153, 153, 153));
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Operated Time Of Day");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Model");

        btnCreate.setBackground(new java.awt.Color(153, 153, 153));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        airlinecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jXDatePicker.setBackground(new java.awt.Color(153, 153, 153));

        timecombo.setBackground(new java.awt.Color(153, 153, 153));
        timecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Morning", "Afternoon", "Evening", "Night" }));
        timecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timecomboActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Price");

        txtPrice.setBackground(new java.awt.Color(153, 153, 153));

        btnBack.setBackground(new java.awt.Color(153, 153, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        modelcombo.setBackground(new java.awt.Color(153, 153, 153));
        modelcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSource)
                                    .addComponent(txtFlightNumber)
                                    .addComponent(airlinecombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jXDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(txtDuration)
                                    .addComponent(txtDestination)
                                    .addComponent(timecombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDeparture)
                                    .addComponent(txtArrival)
                                    .addComponent(txtPrice)
                                    .addComponent(modelcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnCreate)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addComponent(airlinecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSource, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtArrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(modelcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnCreate)
                .addContainerGap(130, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSourceActionPerformed

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationActionPerformed

    private void timecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timecomboActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
    
        String airliner = airlinecombo.getSelectedItem().toString();
        String Flightnumber = txtFlightNumber.getText();
       // String model = airlinecombo.getSelectedItem().toString();
        String source = txtSource.getText();
        String destination = txtDestination.getText();
      //  double deptime = txtDeparture.getText();
       // double Aritime = txtArrival.getText();
        int duration = Integer.parseInt(txtDuration.getText());
        Date date = jXDatePicker.getDate();
        String optd = timecombo.getSelectedItem().toString();
        double price = Double.parseDouble(txtPrice.getText());
        
        Pattern p1 = Pattern.compile("^[a-zA-Z0-9]+$");
            Matcher m1 = p1.matcher(Flightnumber); 
            Pattern p = Pattern.compile("^[a-zA-Z]+$");
           // Matcher m = p.matcher(source);
            Matcher m4 = p.matcher(destination);
           Pattern p2 = Pattern.compile("^[0-9]");
            //Matcher m2 = p2.matcher(Aritime); 
            //Matcher m3 = p2.matcher(deptime);
        if((airlinecombo.getSelectedIndex()) == 0){
            
            airlinecombo.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Select Airliner");
            return;
        }
        else{
            airlinecombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel2.setBackground(Color.BLACK);
        }
        
        if(Flightnumber == null & Flightnumber == " "){
            
            txtFlightNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please Enter Flight Number");
            return;
        }else if(((m1.matches())==false)){
           txtFlightNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please Enter valid Flight Number");
            return; 
        }
        else{
            txtFlightNumber.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel3.setBackground(Color.BLACK);
        }
        
       /* if(model == null & model == " "){
            
            txtModel.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel11.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Model");
            return;
        }
        else{
            txtModel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel11.setBackground(Color.BLACK);
        }
        */
        if(source == null & source == " "){
            
            txtSource.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Source");
            return;
        }/*else if(((m.matches())== false)){
            txtSource.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "you can't enter number");
            return;
        }*/
        
        else{
            txtSource.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel4.setBackground(Color.BLACK);
        }
        if(destination == null & destination == " "){
            
            txtDestination.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Destination");
            return;
        }else if(((m4.matches())== false)){
            txtDestination.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "you can't enter number");
            return;
        }
        else{
            txtDestination.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel5.setBackground(Color.BLACK);
        }
        
        if(txtArrival.getText() == null & txtArrival.getText() == " "){
            
            txtArrival.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel7.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Arrival Time");
            return;
        }/*else if(((m2.matches())== false)){
            txtArrival.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel7.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Time Can't be Number");
            return;
        }*/
        else{
            txtArrival.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel7.setBackground(Color.BLACK);
        }
        if(txtDeparture.getText() == null & txtDeparture.getText() == " "){
            
            txtDeparture.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel6.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Departure Time");
            return;
        }/*else if(((m3.matches())== false))
        {
            txtDeparture.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel6.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Time Can't be Number");
            return;
        }*/
        else{
            txtDeparture.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel6.setBackground(Color.BLACK);
        }
        
        if((timecombo.getSelectedIndex()) == '0'){
            
            timecombo.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel10.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Select Operated Time Of Day");
            return;
        }else{
            timecombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel10.setBackground(Color.BLACK);
        }
        if(source == destination){
            txtDestination.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setBackground(Color.RED);
            txtSource.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Source Destination can't be same");
        }
        try{
           Integer.parseInt(txtDuration.getText());
            txtDuration.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel8.setForeground(Color.BLACK);
        }
        catch(Exception e){
            txtDuration.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel8.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Duration");
            return;
        }
        
        try{
            Double.parseDouble(txtPrice.getText());
            txtPrice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel12.setForeground(Color.BLACK);
        }
        catch(Exception e){
            txtPrice.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel12.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter Price");
            return;
        }
        
        if(jXDatePicker.getDate().equals( " " )){
            jXDatePicker.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel9.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Select Date");
            return;
        }else{
            jXDatePicker.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            jLabel9.setBackground(Color.BLACK);
        }
        
        Flight f = new Flight();
        f.setAirline(airliner);
        f.setFlightnumber(Flightnumber);
       // f.setModel(model);
        f.setSource(source);
        f.setDestination(destination);
        f.setArrTime(Double.parseDouble(txtArrival.getText()));
        f.setDepTime(Double.parseDouble(txtDeparture.getText()));
        f.setDate(date);
        f.setDuration(duration);
        f.setTime(optd);
        f.setPrice(price);
        flightdirectory.addFlight(f);
        
        airlinecombo.setSelectedIndex(0);
        txtFlightNumber.setText("");
        airlinecombo.setSelectedIndex(0);
        txtSource.setText("");
        txtDestination.setText("");
        txtArrival.setText("");
        txtDeparture.setText("");
        txtDuration.setText("");
        txtPrice.setText("");
        timecombo.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         CardSequenceJpanel.remove(this);
        CardLayout layout = (CardLayout)CardSequenceJpanel.getLayout();
        
        Component[] components = CardSequenceJpanel.getComponents();
        for(Component component: components){
            if(component instanceof ManageFlightSchedule){
                ManageFlightSchedule manage = (ManageFlightSchedule) component;
                manage.PopulateTable();
            }
            
        }
        layout.previous(CardSequenceJpanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> airlinecombo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
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
    private org.jdesktop.swingx.JXDatePicker jXDatePicker;
    private javax.swing.JComboBox<String> modelcombo;
    private javax.swing.JComboBox<String> timecombo;
    private javax.swing.JTextField txtArrival;
    private javax.swing.JTextField txtDeparture;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables
}
