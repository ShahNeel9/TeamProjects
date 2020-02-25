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
    
    public ManageFlightSchedule(JPanel CardSequenceJpanel, AirlinerDirectory airlinerdirectory,FlightDirectory flightdirectory,AirplaneDirectory airplanedirectory) {
        initComponents();
        this.CardSequenceJpanel=CardSequenceJpanel;
        this.airlinerdirectory=airlinerdirectory;
        this.flightdirectory = flightdirectory;
        this.airplanedirectory = airplanedirectory;
        PopulateTable();
        
    }

   public void PopulateTable(){
       
       DefaultTableModel dtm = (DefaultTableModel)tblFlight.getModel();
        dtm.setRowCount(0);
        
         for(Flight a : flightdirectory.getFlightdirectory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]= a;
            row[1]= a.getFlightnumber();
            //row[2]= "";
            row[2] = a.getSource();
            row[3] = a.getDestination();
            row[4] = a.getDepTime();
            row[5] = a.getArrTime();
            row[6] = a.getDuration();
            row[7] = a.getDate();
            row[8] = a.getTime();
            row[9] = a.getPrice();
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

        jLabel1.setText("Flight Schedule");

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

        btnCreate.setText("Create Flight");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View Flight");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

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
                .addGap(363, 363, 363)
                .addComponent(jLabel1)
                .addContainerGap(376, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnCreate)
                .addGap(26, 26, 26)
                .addComponent(btnView)
                .addGap(30, 30, 30)
                .addComponent(btnDelete)
                .addContainerGap(235, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateFlightSchedule panel = new CreateFlightSchedule(CardSequenceJpanel,airlinerdirectory,flightdirectory,airplanedirectory);
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
