/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageTravelAgency;

import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageTravelAgencyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTravelAgencyJPanel
     */
    TravelAgency travelAgency;
    JPanel cardSequenceJPanel;
    
    public ManageTravelAgencyJPanel(JPanel cardSequenceJPanel, TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
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
        jLabel2 = new javax.swing.JLabel();
        txtDestinationLocation = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSearchFlight = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFlightNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtDepartureDate = new javax.swing.JTextField();
        sourceComboBox = new javax.swing.JComboBox<>();
        destinationComboBox = new javax.swing.JComboBox<>();
        timeOfDayComboBox = new javax.swing.JComboBox<>();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Travel Agency");
        add(jLabel1);
        jLabel1.setBounds(0, 11, 800, 35);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Departure");
        add(jLabel2);
        jLabel2.setBounds(70, 170, 121, 30);

        txtDestinationLocation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDestinationLocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDestinationLocation.setText("Destination");
        add(txtDestinationLocation);
        txtDestinationLocation.setBounds(360, 170, 146, 32);

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(353, 219, 125, 34);

        tblSearchFlight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Flight No", "Departure", "Arrival", "Time of Day", "Departure Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSearchFlight);

        add(jScrollPane1);
        jScrollPane1.setBounds(80, 280, 686, 110);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Time of day");
        add(jLabel3);
        jLabel3.setBounds(210, 80, 80, 19);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Flight Number");
        add(jLabel4);
        jLabel4.setBounds(81, 120, 90, 19);

        txtFlightNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightNoActionPerformed(evt);
            }
        });
        add(txtFlightNo);
        txtFlightNo.setBounds(200, 120, 150, 22);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Date");
        add(jLabel5);
        jLabel5.setBounds(420, 130, 50, 19);
        add(TxtDepartureDate);
        TxtDepartureDate.setBounds(510, 120, 130, 22);

        add(sourceComboBox);
        sourceComboBox.setBounds(200, 180, 130, 22);

        add(destinationComboBox);
        destinationComboBox.setBounds(510, 180, 140, 22);

        timeOfDayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning Flight", "Evening Flight" }));
        add(timeOfDayComboBox);
        timeOfDayComboBox.setBounds(310, 70, 140, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
                                                
        // TODO add your handling code here:
          if(((String)sourceComboBox.getSelectedItem()).equals((String)destinationComboBox.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Source and destination can't be equal");
            return;
        }
        
        ArrayList<Flight> flightResult = travelAgency.getFlightDirectory().
                searchFlight((String.valueOf(sourceComboBox.getSelectedItem())),String.valueOf(destinationComboBox.getSelectedItem()),txtFlightNo.getText(),TxtDepartureDate.getText(), (String) timeOfDayComboBox.getSelectedItem());
        if (flightResult == null) {
            JOptionPane.showMessageDialog(null, "No flights available","Information",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            DefaultTableModel dtm = (DefaultTableModel) tblSearchFlight.getModel();
            dtm.setRowCount(0);
        
        for(Flight flight:flightResult) {
            Object row[] = new Object[6];
            row[0] = flight.getAirlinerName();
            row[1] = flight.getFlightId();
            row[2] = flight.getDepartureLocation();
            row[3] = flight.getArrivalLocation();
            row[4] = flight.getTimeOfDay();
            row[5] = flight.getDepartureDate();
            dtm.addRow(row);
        }
      }
    
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtFlightNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtDepartureDate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> destinationComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sourceComboBox;
    private javax.swing.JTable tblSearchFlight;
    private javax.swing.JComboBox<String> timeOfDayComboBox;
    private javax.swing.JLabel txtDestinationLocation;
    private javax.swing.JTextField txtFlightNo;
    // End of variables declaration//GEN-END:variables
}
