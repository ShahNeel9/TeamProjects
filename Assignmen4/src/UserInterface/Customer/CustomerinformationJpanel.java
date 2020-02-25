/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Buisness.AirlinerDirectory;
import Buisness.Customer;
import Buisness.Flight;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author patel
 */
public class CustomerinformationJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerinformationJpanel
     */
    //private AirlinerDirectory airlinerdirectory;
    private JPanel cardSequenceJpanel;
    private List<Customer> customerList;
    
    public CustomerinformationJpanel(JPanel CardSequenceJpanel, List <Customer> customerList) {
        initComponents();
       this.cardSequenceJpanel=CardSequenceJpanel;
       this.customerList=customerList;
        populateTable();
      
    }

   public void populateTable(){
       DefaultTableModel dtm= (DefaultTableModel) customerTbl.getModel();
       dtm.setRowCount(0);
       
       for(Customer c: customerList){
           Object[] row= new Object[dtm.getColumnCount()];
           row[0]= c.getFirstName();
           row[1]=c.getLastName();
           row[2]=c.getAge();
           row[3]=c.getPhoneNumber();
           row[4]=c.getSsn();
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
        customerTbl = new javax.swing.JTable();
        viewBookingInfoBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CUSTOMERS");

        customerTbl.setBackground(new java.awt.Color(153, 153, 153));
        customerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Age", "Phone Number", "SSN"
            }
        ));
        jScrollPane1.setViewportView(customerTbl);

        viewBookingInfoBtn.setBackground(new java.awt.Color(153, 153, 153));
        viewBookingInfoBtn.setText("View Booking Information");
        viewBookingInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewBookingInfoBtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(341, 341, 341))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(viewBookingInfoBtn)
                .addContainerGap(270, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBookingInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingInfoBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow= customerTbl.getSelectedRow();
        if(selectedRow>=0){
            System.out.println("++++++++++++++++++++++++++++" +selectedRow);
            Flight bookedFlight= customerList.get(selectedRow).getFlightBooked();
            System.out.println("+++++++++++++++++++++++++++++++++++" +bookedFlight);
            viewbookinginformationJpanel panel= new viewbookinginformationJpanel(cardSequenceJpanel,bookedFlight,customerList.get(selectedRow).getSeatBooked());
            cardSequenceJpanel.add("FlightDetailJPanel",panel);
           CardLayout layout = (CardLayout) cardSequenceJpanel.getLayout();
           layout.next(cardSequenceJpanel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        
    }//GEN-LAST:event_viewBookingInfoBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable customerTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewBookingInfoBtn;
    // End of variables declaration//GEN-END:variables
}
