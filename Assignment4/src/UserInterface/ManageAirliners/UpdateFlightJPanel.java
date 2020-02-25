/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.Airplane;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vikram
 */
public class UpdateFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateFlightJPanel
     */
    TravelAgency travelAgency;
    Flight flight;
    JPanel cardSequenceJPanel;
    Airliner airliner;

    UpdateFlightJPanel(JPanel cardSequenceJPanel, Flight flight,TravelAgency travelAgency,Airliner airliner) {
        initComponents();
        this.flight = flight;
        this.travelAgency = travelAgency;
        this.airliner = airliner;
        this.cardSequenceJPanel = cardSequenceJPanel;
        populateFlightDetails();
        txtAirlinerName.setText(airliner.getAirlinerName());
        txtAirlinerName.setEnabled(false);
        txtFlightSerialNo.setEnabled(false);
        txtFlightDeparture.setEnabled(false);
        txtFlightArrival.setEnabled(false);
        txtFlightDepartureDate.setEnabled(false);
        txtPricePerSeat.setEnabled(false);
        TxtArrivalDate.setEnabled(false);
        txtFlightSerialNo.setEnabled(false);
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true); 
        
    }
    
    private void populateFlightDetails(){
        
        txtFlightSerialNo.setText(flight.getFlightId());
        txtFlightDeparture.setText(flight.getDepartureLocation());
        txtFlightArrival.setText(flight.getArrivalLocation());
        SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy hh mm ss");
        String departDate = date.format(flight.getDepartureDate());
        txtFlightDepartureDate.setText(String.valueOf(departDate));
         SimpleDateFormat date1 = new SimpleDateFormat("dd/mm/yyyy hh mm ss");
        String arrivalDate = date1.format(flight.getArrivalDate());
        TxtArrivalDate.setText(String.valueOf(arrivalDate));
        txtPricePerSeat.setText(String.valueOf(flight.getPerSeatRate()));
        txtAirplaneId.setText(flight.getAirPlaneNumber());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        txtAirlinerName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        timeComboBox = new javax.swing.JComboBox<>();
        txtFlightSerialNo = new javax.swing.JTextField();
        txtFlightDepartureDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFlightArrival = new javax.swing.JTextField();
        txtFlightDeparture = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtPricePerSeat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAirplaneId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtArrivalDate = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 144, 37));

        txtAirlinerName.setEnabled(false);
        txtAirlinerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlinerNameActionPerformed(evt);
            }
        });
        add(txtAirlinerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 155, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Departure");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 198, 104, 27));

        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning Flight", "Day Flight", "Evening Flight", " " }));
        timeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeComboBoxActionPerformed(evt);
            }
        });
        add(timeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 275, 153, 29));
        add(txtFlightSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 155, 155, 27));

        txtFlightDepartureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightDepartureDateActionPerformed(evt);
            }
        });
        add(txtFlightDepartureDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 315, 155, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Airliner");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 72, 29));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Departure Date");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 315, -1, 29));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View/Update Flight");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Time of Day");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 273, 99, 29));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Arrival");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 238, 140, 27));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Flight Number");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 154, 96, 24));
        add(txtFlightArrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 155, 27));
        add(txtFlightDeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 200, 155, 27));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 116, 37));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 144, 37));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Price Per Seat");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 130, 27));

        txtPricePerSeat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPricePerSeatKeyTyped(evt);
            }
        });
        add(txtPricePerSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 155, 27));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Airplane Id");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        txtAirplaneId.setEnabled(false);
        txtAirplaneId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirplaneIdActionPerformed(evt);
            }
        });
        add(txtAirplaneId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Arrival Date ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, 30));

        TxtArrivalDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtArrivalDateActionPerformed(evt);
            }
        });
        add(TxtArrivalDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //txtAirlinerName.setText(airliner.getAirlinerName());
        Date availableDate = null;

        String serialNo = txtFlightSerialNo.getText();
        String departure = txtFlightDeparture.getText();
        String arrival = txtFlightArrival.getText();
        String flightTime = timeComboBox.getSelectedItem().toString();
        int pricePerSeat = Integer.parseInt(txtPricePerSeat.getText());
        if((txtFlightDeparture.getText()).equalsIgnoreCase(txtFlightArrival.getText())){
            JOptionPane.showMessageDialog(null, "Departure and arrival locations can't be same");
            return ;
         }
        try {
            availableDate = new SimpleDateFormat("dd/mm/yyyy hh mm ss").parse(txtFlightDepartureDate.getText());
        }
        catch (ParseException ex) {
            Logger.getLogger(CreateNewFlightJPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter the date in proper format");
            return;
        }
        
         Date availableDate1=null;
          try {
            availableDate1 = new SimpleDateFormat("dd/mm/yyyy hh mm ss").parse(TxtArrivalDate.getText());
        }
        catch (ParseException ex1) {
            Logger.getLogger(CreateNewFlightJPanel.class.getName()).log(Level.SEVERE, null, ex1);
            JOptionPane.showMessageDialog(null, "Enter the Arrival date in proper format");
            return;
        }
           if(availableDate.compareTo(availableDate1)>0){
               JOptionPane.showMessageDialog(null, "Departure date can't be greater than arrival date");
            return;
          }
           
          
          
        if (serialNo.equals("") || departure.equals("") || arrival.equals("") || flightTime.equals("Select") || availableDate.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
            return;
        }
        else{
             long diff= availableDate1.getTime()-availableDate.getTime();
            int diffhours=(int)(diff/(60*60*1000));
            flight.setAirlinerName(airliner.getAirlinerName());
            flight.setFlightId(serialNo);
            flight.setDepartureLocation(departure);
            flight.setArrivalLocation(arrival);
            flight.setTimeOfDay(flightTime);
            flight.setDepartureDate(availableDate);
            flight.setPricePerSeat(pricePerSeat);
             flight.setArrivalDate(availableDate1);
            flight.setDuration(diffhours);
            
            for(Airplane a: airliner.getFleet()){
                if(a.getPlaneId().equals(txtAirplaneId.getText())){
                      for (Flight f :a.getFlightList()){
                          if(f.getFlightId().equals(txtFlightSerialNo.getText())){
                             f.setDepartureLocation(departure);
            f.setArrivalLocation(arrival);
            f.setTimeOfDay(flightTime);
             f.setDuration(diffhours);
           f.setDepartureDate(availableDate);
            f.setArrivalDate(availableDate1);
            f.setPricePerSeat(pricePerSeat);
                          }
                      }
            
                   } 
                }
            
            for(Flight f1:airliner.getFlightDir().getFlightList()){
                if(f1.getFlightId().equals(txtFlightSerialNo.getText())){
                             f1.setDepartureLocation(departure);
            f1.setArrivalLocation(arrival);
            f1.setTimeOfDay(flightTime);
             f1.setDuration(diffhours);
           f1.setDepartureDate(availableDate);
            f1.setArrivalDate(availableDate1);
            f1.setPricePerSeat(pricePerSeat);
            }}
         
        }
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Flight updated successfully");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAirlinerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlinerNameActionPerformed
        // TODtxtPricePerSeatdling code here:
    }//GEN-LAST:event_txtAirlinerNameActionPerformed

    private void timeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeComboBoxActionPerformed

    private void txtFlightDepartureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightDepartureDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightDepartureDateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:.
        txtFlightSerialNo.setEnabled(false);
        txtFlightDeparture.setEnabled(true);
        txtFlightArrival.setEnabled(true);
        txtFlightDepartureDate.setEnabled(true);
        TxtArrivalDate.setEnabled(true);
        txtPricePerSeat.setEnabled(true);
        
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPricePerSeatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPricePerSeatKeyTyped
        // TODO add your handling code here:
        char rate= evt.getKeyChar();
      //  if (!(txtPricePerSeat(rate) || (rate==KeyEvent.VK_BACK_SPACE) || (rate==KeyEvent.VK_DELETE))) {
         //  evt.consume();
      //  }
    }//GEN-LAST:event_txtPricePerSeatKeyTyped

    private void txtAirplaneIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirplaneIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirplaneIdActionPerformed

    private void TxtArrivalDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtArrivalDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtArrivalDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtArrivalDate;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> timeComboBox;
    private javax.swing.JTextField txtAirlinerName;
    private javax.swing.JTextField txtAirplaneId;
    private javax.swing.JTextField txtFlightArrival;
    private javax.swing.JTextField txtFlightDeparture;
    private javax.swing.JTextField txtFlightDepartureDate;
    private javax.swing.JTextField txtFlightSerialNo;
    private javax.swing.JTextField txtPricePerSeat;
    // End of variables declaration//GEN-END:variables
}
