/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageFlightSchedule;

import Buisness.Airliner;
import Buisness.AirlinerDirectory;
import Buisness.AirplaneDirectory;
import Buisness.Flight;
import Buisness.FlightDirectory;
import UserInterface.ManageAirliners.ManageAirlinersJpanel;
import UserInterface.ManageAirliners.ViewAirlinerJpanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author patel
 */
public class ManageFlightSchedule extends javax.swing.JPanel {

    /**
     * Creates new form ManageFlightSchedule
     */
    private JPanel CardSequenceJpanel;
    private AirlinerDirectory airlinerdirectory;
    private FlightDirectory flightdirectory;
    private AirplaneDirectory airplanedirectory;
    
    public ManageFlightSchedule(JPanel CardSequenceJpanel, AirlinerDirectory airlinerdirectory,FlightDirectory flightdirectory) {
        initComponents();
        this.CardSequenceJpanel=CardSequenceJpanel;
        this.airlinerdirectory=airlinerdirectory;
        this.flightdirectory = flightdirectory;
       // this.airplanedirectory = airplanedirectory;
        PopulateTable();
        
    }

   public void PopulateTable(){
       
       DefaultTableModel dtm = (DefaultTableModel)tblFlight.getModel();
        dtm.setRowCount(0);
        
         for(Flight a : flightdirectory.getFlightdirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= a;
            row[1]= a.getFlightnumber();
            row[2]= "qqq";
            row[3] = a.getSource();
            row[4] = a.getDestination();
            row[5] = a.getDepTime();
            row[6] = a.getArrTime();
            row[7] = a.getDuration();
            row[8] = a.getDate();
            row[9] = a.getTime();
            row[10] = a.getPrice();
            dtm.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlight = new javax.swing.JTable();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FLIGHT SCHEDULE");

        tblFlight.setBackground(new java.awt.Color(153, 153, 153));
        tblFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Airliner", "Flight No", "Model", "Source", "destination", "Departure Time", "Arrival Time", "Duration", "Date", "Time of  ", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblFlight);

        btnCreate.setBackground(new java.awt.Color(153, 153, 153));
        btnCreate.setText("Create Flight");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(153, 153, 153));
        btnView.setText("View Flight");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 153, 153));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 816, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate))
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(btnCreate)
                .addGap(33, 33, 33)
                .addComponent(btnView)
                .addGap(37, 37, 37)
                .addComponent(btnDelete)
                .addContainerGap(225, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateFlightSchedule panel = new CreateFlightSchedule(CardSequenceJpanel,airlinerdirectory,flightdirectory);
        CardSequenceJpanel.add("CreateFlightSchedule",panel);
        CardLayout layout = (CardLayout)CardSequenceJpanel.getLayout();
        layout.next(CardSequenceJpanel);
       /* CardLayout layout = (CardLayout)CardSequenceJpanel.getLayout();
        CardSequenceJpanel.add(new CreateFlightSchedule(CardSequenceJpanel,airlinerdirectory,flightdirectory));
        layout.next(CardSequenceJpanel);*/
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
       int selectedrow = tblFlight.getSelectedRow();
        
        if(selectedrow> -1){
            Flight flight = flightdirectory.getFlightdirectory().get(selectedrow);
            CardLayout layout = (CardLayout)CardSequenceJpanel.getLayout();
            CardSequenceJpanel.add(new ViewFlightSchedule(CardSequenceJpanel,flight));
            layout.next(CardSequenceJpanel);
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select Row First");
            return;
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = tblFlight.getSelectedRow();
        
        if(selectedrow > -1){
            
            
            Flight flight = (Flight)tblFlight.getValueAt(selectedrow,0);
            flightdirectory.removeflight(flight);
            PopulateTable();
            JOptionPane.showMessageDialog(null, "Deleted successfully");
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFlight;
    // End of variables declaration//GEN-END:variables
}
