/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.*;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CreateNewFlightJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlightJPanel
     */
    JPanel cardSequenceJPanel;
    Airplane airPlane;
    TravelAgency travelAgency;
    Flight flight;
    Airliner airliner;
    
    public CreateNewFlightJPanel(JPanel cardSequenceJPanel,Airplane airPlane,Airliner airliner, TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.airPlane = airPlane;  
        this.airliner = airliner;
        this.travelAgency = travelAgency;
        
       
        txtAirlinerName.setText(airPlane.getAirlinerName());
        txtAirlinerName.setEnabled(false);
        txtAirplaneId.setText(airPlane.getPlaneId());
        txtAirplaneId.setEnabled(false);
        
    
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
        txtFlightNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAirlinerName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtFlightDeparture = new javax.swing.JTextField();
        txtFlightArrival = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDepartureDate = new javax.swing.JTextField();
        timeComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPricePerSeat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAirplaneId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TxtArrivalDate = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Flight");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Airliner");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Departure ");

        txtAirlinerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlinerNameActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreate.setText("Create New Flight");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtFlightDeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFlightDepartureActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Flight Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Arrival ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Time of Day");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Departure Date");

        txtDepartureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartureDateActionPerformed(evt);
            }
        });

        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning Flight", "Evening Flight", " " }));
        timeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Per Seat Rate");

        txtPricePerSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPricePerSeatActionPerformed(evt);
            }
        });
        txtPricePerSeat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPricePerSeatKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Airplane Id");

        txtAirplaneId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirplaneIdActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Arrival Date ");

        TxtArrivalDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtArrivalDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(199, 199, 199)
                            .addComponent(jLabel10)
                            .addGap(235, 235, 235))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addGap(74, 74, 74)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAirplaneId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFlightDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFlightArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(timeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtDepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(235, 235, 235)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPricePerSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(169, 169, 169))
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAirplaneId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlightNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightDeparture, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFlightArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartureDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtArrivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txtPricePerSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        //txtAirlinerName.setText(airliner.getAirlinerName());
        
          Pattern p=Pattern.compile("AM");
        Matcher m=p.matcher(txtDepartureDate.getText());
        if(m.matches()){
            if(((String)timeComboBox.getSelectedItem()).equals("Evening Flight")){
            JOptionPane.showMessageDialog(null, "Doesn't match time of day");
            return ;  
        }}
        
          Pattern p1=Pattern.compile("PM");
        Matcher m1=p1.matcher(txtDepartureDate.getText());
        if(m1.matches()){
            
        if(((String)timeComboBox.getSelectedItem()).equals("Morning Flight")){
            JOptionPane.showMessageDialog(null, "Doesn't match time of day");
            return ;  
        }
            
        }
        String flightNumber = txtFlightNo.getText();
        for (Flight f:travelAgency.getFlightDirectory().getFlightList()){
            if (flightNumber.equals(f.getFlightId())){
                 JOptionPane.showMessageDialog(null, "Flight already exists.Give unique ID");
            return ;  
            }
        }
        String departure = txtFlightDeparture.getText();
        String arrival = txtFlightArrival.getText();
        String flightTime = timeComboBox.getSelectedItem().toString();
        int pricePerSeat= Integer.parseInt(txtPricePerSeat.getText());
        //String arrivalDate=TxtArrivalDate.getText();
         String departureDate=TxtArrivalDate.getText();
        // int duration=Integer.parseInt(txtDuration.getText());
         Date availableDate=null;
         if((txtFlightDeparture.getText()).equalsIgnoreCase(txtFlightArrival.getText())){
            JOptionPane.showMessageDialog(null, "Departure and arrival locations can't be same");
            return ;
         }
         try {
            availableDate = new SimpleDateFormat("dd/mm/yyyy hh mm ss aa").parse(txtDepartureDate.getText());
        }
        catch (ParseException ex) {
           // Logger.getLogger(CreateNewFlightJPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter the Departure date in proper format");
            return;
        }
         Date availableDate1=null;
          try {
            availableDate1 = new SimpleDateFormat("dd/mm/yyyy hh mm ss aa").parse(TxtArrivalDate.getText());
        }
        catch (ParseException ex1) {
           // Logger.getLogger(CreateNewFlightJPanel.class.getName()).log(Level.SEVERE, null, ex1);
            JOptionPane.showMessageDialog(null, "Enter the Arrival date in proper format");
            return;
        }
          for ( Flight f: airliner.getFlightDir().getFlightList()){
              try{
              if(f.getAirPlaneNumber().equals(txtAirplaneId.getText())){
                  if(((availableDate.compareTo(f.getDepartureDate()))>0)&&((f.getArrivalDate().compareTo(availableDate))>0)){
                       JOptionPane.showMessageDialog(null, "An   airplane   can’t   be   assigned   to   two   flights   which   have   overlaps");
            return;
                  }
              }}
              catch(Exception e){
                  
              }
          }
          if(availableDate.compareTo(availableDate1)>0){
               JOptionPane.showMessageDialog(null, "Departure date can't be greater than arrival date");
            return;
          }
        
         
        if (txtFlightNo.getText().equals("") || departure.equals("") || arrival.equals("") || flightTime.equals("Select") || txtPricePerSeat.getText().equals("")||TxtArrivalDate.getText().equals("")||departureDate.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
            return;
        }
        else{
            long diff= availableDate1.getTime()-availableDate.getTime();
            int diffhours=(int)(diff/(60*60*1000));

            MasterFlightDirectory fd = travelAgency.getFlightDirectory();
          flight=fd.addFlight(airPlane.getSeatRows(),airPlane.getSeatCols());
            flight.setAirlinerName(airPlane.getAirlinerName());
            flight.setFlightId(txtFlightNo.getText());
            flight.setDepartureLocation(departure);
            flight.setArrivalLocation(arrival);
            flight.setTimeOfDay(flightTime);
            flight.setAirPlaneNumber(airPlane.getPlaneId());
            flight.setDuration(diffhours);
           flight.setDepartureDate(availableDate);
            flight.setArrivalDate(availableDate1);
            flight.setPricePerSeat(pricePerSeat);
            
            Flight f=airPlane.addFlight(airPlane.getSeatRows(),airPlane.getSeatCols());
            f.setAirlinerName(airPlane.getAirlinerName());
            f.setFlightId(txtFlightNo.getText());
            f.setDepartureLocation(departure);
            f.setArrivalLocation(arrival);
            f.setTimeOfDay(flightTime);
            f.setAirPlaneNumber(airPlane.getPlaneId());
             f.setDuration(diffhours);
           f.setDepartureDate(availableDate);
            f.setArrivalDate(availableDate1);
            f.setPricePerSeat(pricePerSeat);
            
            Flight f1 = airliner.getFlightDir().addFlight(airPlane.getSeatRows(),airPlane.getSeatCols());
             f1.setAirlinerName(airPlane.getAirlinerName());
            f1.setFlightId(txtFlightNo.getText());
            f1.setDepartureLocation(departure);
            f1.setArrivalLocation(arrival);
            f1.setTimeOfDay(flightTime);
            f1.setAirPlaneNumber(airPlane.getPlaneId());
             f1.setDuration(diffhours);
             f1.setDepartureDate(availableDate);
            f1.setArrivalDate(availableDate1);
            f1.setPricePerSeat(pricePerSeat);
            JOptionPane.showMessageDialog(null, "Flight created successfully");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAirlinerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlinerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlinerNameActionPerformed

    private void txtDepartureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartureDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartureDateActionPerformed

    private void timeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeComboBoxActionPerformed

    private void txtPricePerSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPricePerSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPricePerSeatActionPerformed

    private void txtPricePerSeatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPricePerSeatKeyTyped
        // TODO add your handling code here:
        char rate= evt.getKeyChar();
        if (!(Character.isDigit(rate) || (rate==KeyEvent.VK_BACK_SPACE) || (rate==KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPricePerSeatKeyTyped

    private void txtAirplaneIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirplaneIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirplaneIdActionPerformed

    private void TxtArrivalDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtArrivalDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtArrivalDateActionPerformed

    private void txtFlightDepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFlightDepartureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFlightDepartureActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtArrivalDate;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
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
    private javax.swing.JTextField txtDepartureDate;
    private javax.swing.JTextField txtFlightArrival;
    private javax.swing.JTextField txtFlightDeparture;
    private javax.swing.JTextField txtFlightNo;
    private javax.swing.JTextField txtPricePerSeat;
    // End of variables declaration//GEN-END:variables
}
