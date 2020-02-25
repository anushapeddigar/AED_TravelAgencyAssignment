/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class MultiCityDestinationBookingJPanel extends javax.swing.JPanel {
TravelAgency travelAgency;
    JPanel cardSequenceJPanel;
    /**
     * Creates new form MultiCityDestinationBooking
     */
    public MultiCityDestinationBookingJPanel(JPanel cardSequenceJPanel,TravelAgency travelAgency) {
        initComponents();
        initComponents();
        this.travelAgency =travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
      populateSourceComboBox();
      populateDestinationComboBox();
    }
 void  populateSourceComboBox(){
           DefaultComboBoxModel dm=new DefaultComboBoxModel();
           DefaultComboBoxModel dm2=new DefaultComboBoxModel();
           sourceComboBox.removeAllItems();
           sourceComboBox1.removeAllItems();
       for(Flight f:travelAgency.getFlightDirectory().getFlightList()){
           if(checkIfSourceAlreadyExists(f)==false){
              
           dm.addElement(f.getDepartureLocation());
           
           dm2.addElement(f.getDepartureLocation());
           } }       
   
       sourceComboBox.setModel(dm);
       
       sourceComboBox1.setModel(dm2);
   }
       
       void  populateDestinationComboBox(){
           
    DefaultComboBoxModel dm1=new DefaultComboBoxModel();
    
    DefaultComboBoxModel dm3=new DefaultComboBoxModel();
           destinationComboBox.removeAllItems();
           destinationComboBox1.removeAllItems();
      for(Flight f:travelAgency.getFlightDirectory().getFlightList()){
           if (checkIfDestinationAlreadyExists(f)==false){
           dm1.addElement(f.getArrivalLocation());
           
           dm3.addElement(f.getArrivalLocation());
           }
      }       
   
       destinationComboBox.setModel(dm1);
       destinationComboBox1.setModel(dm3);
   }
    
       boolean checkIfDestinationAlreadyExists(Flight f){
           for (int i=0;i<destinationComboBox.getItemCount();i++){
               if(f.getDepartureLocation().equals(destinationComboBox.getItemAt(i))){
                   return true;
               }
           }
           return false;
       }
       
       boolean checkIfSourceAlreadyExists(Flight f){
           for (int i=0;i<destinationComboBox.getItemCount();i++){
               if(f.getDepartureLocation().equals(destinationComboBox.getItemAt(i))){
                   return true;
               }
           }
           return false;
       }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        basedOnComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBestDeals = new javax.swing.JTable();
        btnBookFlight = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sourceComboBox = new javax.swing.JComboBox<>();
        destinationComboBox = new javax.swing.JComboBox<>();
        sourceComboBox1 = new javax.swing.JComboBox<>();
        destinationComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Multi City Destinations");

        jLabel2.setText("Based on : ");

        basedOnComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Price per seat", "Duration of flight" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Source");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Destination");

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblBestDeals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "FlightID", "Departure", "Arrival", "Time of Day", "Date of Departure", "Price Per seat", "Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblBestDeals);

        btnBookFlight.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBookFlight.setText("Book");
        btnBookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Source");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Destination");

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(btnBookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(basedOnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sourceComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sourceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(destinationComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(destinationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(basedOnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        ArrayList<Flight> flightResult = travelAgency.getFlightDirectory().searchFlight1((String)sourceComboBox.getSelectedItem(),(String)destinationComboBox.getSelectedItem(),(String)sourceComboBox1.getSelectedItem(),(String)destinationComboBox1.getSelectedItem());

        if(!((String)sourceComboBox1.getSelectedItem()).equals((String)destinationComboBox.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Source of first flight should be equal to destination of next flight");
            return;
        }
        if(((String)sourceComboBox1.getSelectedItem()).equals((String)destinationComboBox1.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Source and destination can't be equal");
            return;
        }
         if(((String)sourceComboBox.getSelectedItem()).equals((String)destinationComboBox.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Source and destination can't be equal");
            return;
        }
        if (flightResult == null) {
            JOptionPane.showMessageDialog(null, "No flights available","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else{

            if (basedOnComboBox.getSelectedItem()=="Price per seat"){
                DefaultTableModel dtm = (DefaultTableModel) tblBestDeals.getModel();
                dtm.setRowCount(0);

                Collections.sort(flightResult, new Comparator<Flight>() {
                    @Override
                    public int compare(Flight o1, Flight o2) {
                        return o1.getPerSeatRate()- o2.getPerSeatRate();
                    }
                });

                for(Flight flight:flightResult) {

                    Object row[] = new Object[8];
                    row[0] = flight;
                    //.getAirlineName()
                    row[1] = flight.getFlightId();
                    row[2] = flight.getDepartureLocation();
                    row[3] = flight.getArrivalLocation();
                    row[4] = flight.getTimeOfDay();
                    row[5] = flight.getDepartureDate();
                    row[6] = flight.getPerSeatRate();
                    row[7] = flight.getDuration();
                    dtm.addRow(row);
                }
            }

            else
            if (basedOnComboBox.getSelectedItem()=="Duration of flight"){
                DefaultTableModel dtm1 = (DefaultTableModel) tblBestDeals.getModel();
                dtm1.setRowCount(0);

                Collections.sort(flightResult, new Comparator<Flight>() {
                    @Override
                    public int compare(Flight o1, Flight o2) {
                        return o1.getDuration()- o2.getDuration();
                    }
                });
                for(Flight flight:flightResult) {

                    Object row[] = new Object[8];
                    row[0] = flight;
                    //.getAirlineName()
                    row[1] = flight.getFlightId();
                    row[2] = flight.getDepartureLocation();
                    row[3] = flight.getArrivalLocation();
                    row[4] = flight.getTimeOfDay();
                    row[5] = flight.getDepartureDate();
                    row[6] = flight.getPerSeatRate();
                    row[7] = flight.getDuration();
                    dtm1.addRow(row);
                }

            }

        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightActionPerformed
        // TODO add your handling code here:
        try{
            tblBestDeals.setRowSelectionInterval(0,1);
        }
        
        catch (Exception exception) {
            // Catch expected IllegalArgumentExceptions.
            //System.out.println(exception);
        } 
        int[] selectedRows = tblBestDeals.getSelectedRows();
        if(((String)sourceComboBox.getSelectedItem()).equals((String)destinationComboBox.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Source and destination can't be same");
            return;
        }
        if(((String)sourceComboBox1.getSelectedItem()).equals((String)destinationComboBox1.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Source and destination can't be same");
            return;
        }
         

        if (selectedRows[0] < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        else
        {
            Flight fs = (Flight)tblBestDeals.getValueAt(selectedRows[0], 0);
            Flight fs1 = (Flight)tblBestDeals.getValueAt(selectedRows[1], 0);
            BookCustomersMultipleJPanel panel = new BookCustomersMultipleJPanel(cardSequenceJPanel, fs,fs1,travelAgency);
            cardSequenceJPanel.add("BookCustomersMultipleJPanel",panel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_btnBookFlightActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> basedOnComboBox;
    private javax.swing.JButton btnBookFlight;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> destinationComboBox;
    private javax.swing.JComboBox<String> destinationComboBox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sourceComboBox;
    private javax.swing.JComboBox<String> sourceComboBox1;
    private javax.swing.JTable tblBestDeals;
    // End of variables declaration//GEN-END:variables

}
