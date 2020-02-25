/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Airliner;
import Business.Flight;
import Business.Seat;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ViewBestFlightDealsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBestFlightDealsJPanel
     */
    TravelAgency travelAgency;
    JPanel cardSequenceJPanel;
    

    ViewBestFlightDealsJPanel(JPanel cardSequenceJPanel,TravelAgency travelAgency) {
        initComponents();
        this.travelAgency =travelAgency;
        this.cardSequenceJPanel = cardSequenceJPanel;
      populateSourceComboBox();
      populateDestinationComboBox();
        
    }

  
       void  populateSourceComboBox(){
           DefaultComboBoxModel dm=new DefaultComboBoxModel();
           sourceComboBox.removeAllItems();
       for(Flight f:travelAgency.getFlightDirectory().getFlightList()){
           if(checkIfSourceAlreadyExists(f)==false){
              
           dm.addElement(f.getDepartureLocation()); 
           } }       
   
       sourceComboBox.setModel(dm);
   }
       
       void  populateDestinationComboBox(){
           
    DefaultComboBoxModel dm1=new DefaultComboBoxModel();
           destinationComboBox.removeAllItems();
      for(Flight f:travelAgency.getFlightDirectory().getFlightList()){
           if (checkIfDestinationAlreadyExists(f)==false){
           dm1.addElement(f.getArrivalLocation());
           }
      }       
   
       destinationComboBox.setModel(dm1);
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBestDeals = new javax.swing.JTable();
        btnBookFlight = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        basedOnComboBox = new javax.swing.JComboBox<>();
        sourceComboBox = new javax.swing.JComboBox<>();
        destinationComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Best Deals");

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
                "Airliner", "FlightID", "Departure", "Arrival", "Time of Day", "Departure Date", "Arrival Date", "Price Per seat", "Duration", "Available seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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

        jLabel2.setText("Based on : ");

        basedOnComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Price per seat", "Duration of flight" }));

        sourceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceComboBoxActionPerformed(evt);
            }
        });

        jButton1.setText("multi-city");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(365, 365, 365)
                        .addComponent(btnBookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(basedOnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sourceComboBox, 0, 181, Short.MAX_VALUE)
                            .addComponent(destinationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(basedOnComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sourceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destinationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBookFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        ArrayList<Flight> flightResult = travelAgency.getFlightDirectory().searchFlight1((String)sourceComboBox.getSelectedItem(),(String)destinationComboBox.getSelectedItem());
        
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
            
            Object row[] = new Object[10];
            row[0] = flight;
            //.getAirlineName()
            row[1] = flight.getFlightId();
            row[2] = flight.getDepartureLocation();
            row[3] = flight.getArrivalLocation();
            row[4] = flight.getTimeOfDay();
            row[5] = flight.getDepartureDate();
            row[6]=flight.getArrivalDate();
            row[7] = flight.getPerSeatRate();
            row[8] = flight.getDuration();
            int noOfSeatsAvailable=0;
             for(Seat s:flight.getSeatList()){
           if(s.getOccupied()==false){
               noOfSeatsAvailable=noOfSeatsAvailable+1;
           }
            }
            row[9]=noOfSeatsAvailable;
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
        int selectedRow = tblBestDeals.getSelectedRow();
        if(sourceComboBox.getSelectedItem().equals(destinationComboBox.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Source and destination can't be same");
            return;
        }
            
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
       else
{
            Flight fs = (Flight)tblBestDeals.getValueAt(selectedRow, 0);
            BookCustomersJPanel panel = new BookCustomersJPanel(cardSequenceJPanel, fs,travelAgency);
            cardSequenceJPanel.add("BookCustomersJPanel",panel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_btnBookFlightActionPerformed

    private void sourceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourceComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MultiCityDestinationBookingJPanel panel = new MultiCityDestinationBookingJPanel(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("MultiCityDestinationBookingJPanel", panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> basedOnComboBox;
    private javax.swing.JButton btnBookFlight;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> destinationComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sourceComboBox;
    private javax.swing.JTable tblBestDeals;
    // End of variables declaration//GEN-END:variables
}
