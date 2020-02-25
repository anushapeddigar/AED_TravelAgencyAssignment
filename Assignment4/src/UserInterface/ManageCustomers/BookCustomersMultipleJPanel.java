/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageCustomers;

import Business.Customer;
import Business.CustomerFlights;
import Business.Flight;
import Business.Seat;
import Business.TravelAgency;
import UserInterface.ManageAirliners.CreateNewFlightJPanel;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BookCustomersMultipleJPanel extends javax.swing.JPanel {
JPanel cardSequenceJPanel;
    Flight flight;
    Flight flight1;
    TravelAgency travelAgency;
    Customer customer;
    DefaultComboBoxModel dm=new DefaultComboBoxModel();
    /**
     * Creates new form BookCustomersMultipleJPanel
     */
    public BookCustomersMultipleJPanel(JPanel cardSequenceJPanel, Flight flight,Flight flight1, TravelAgency travelAgency) {
       initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.flight = flight;
        this.flight1 = flight1;
        this.travelAgency = travelAgency;
        populateAirlineDetails();
        txtAirlinerName.setEnabled(false);
        txtFlightSerialNo.setEnabled(false);
        txtSource.setEnabled(false);
        txtDestination.setEnabled(false);
        txtDepartureDate.setEnabled(false);
        TxtArrivalDate.setEnabled(false); 
         txtDepartureDate.setEnabled(false); 
        txtSeatPrice.setEnabled(false);
        TxtTimeOfDay.setEnabled(false);
        txtAirlinerName1.setEnabled(false);
        txtFlightSerialNo1.setEnabled(false);
        txtSource1.setEnabled(false);
        txtDestination1.setEnabled(false);
        txtDepartureDate1.setEnabled(false);
        TxtArrivalDate1.setEnabled(false); 
         txtDepartureDate1.setEnabled(false); 
        txtSeatPrice1.setEnabled(false);
        TxtTimeOfDay1.setEnabled(false);
        populateSeatComboBox();
        populateSeatComboBox1();
        noSeatsAvailable();
    }
    
    private void populateAirlineDetails(){
      txtAirlinerName.setText(flight.getAirlinerName());
        txtFlightSerialNo.setText(flight.getFlightId());
        txtSource.setText(flight.getDepartureLocation());
        txtDestination.setText(flight.getArrivalLocation());
        TxtTimeOfDay.setText(flight.getTimeOfDay());
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy hh mm ss aa");
        String departDate = date.format(flight.getDepartureDate()); 
       txtDepartureDate.setText(departDate);
       
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy hh mm ss aa");
        String arrivalDate = date1.format(flight.getArrivalDate()); 
       TxtArrivalDate.setText(arrivalDate);
        txtSeatPrice.setText(Integer.toString(flight.getPerSeatRate()));
        
        txtAirlinerName1.setText(flight1.getAirlinerName());
        txtFlightSerialNo1.setText(flight1.getFlightId());
        txtSource1.setText(flight1.getDepartureLocation());
        txtDestination1.setText(flight1.getArrivalLocation());
        TxtTimeOfDay1.setText(flight1.getTimeOfDay());
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy hh mm ss aa");
        String departDate1 = date2.format(flight1.getDepartureDate()); 
       txtDepartureDate1.setText(departDate1);
       
        SimpleDateFormat date3 = new SimpleDateFormat("dd/MM/yyyy hh mm ss aa");
        String arrivalDate1 = date3.format(flight1.getArrivalDate()); 
       TxtArrivalDate1.setText(arrivalDate1);
        txtSeatPrice1.setText(Integer.toString(flight1.getPerSeatRate()));
    }
    
    void  populateSeatComboBox(){
       for(Seat s:flight.getSeatList()){
           if(s.getOccupied()==false){
           dm.addElement(s); }
           
   }
       seatsComboBox.setModel(dm);
       
    
   }
    void  populateSeatComboBox1(){
       for(Seat s:flight1.getSeatList()){
           if(s.getOccupied()==false){
           dm.addElement(s); }
           
   }
       seatsComboBox1.setModel(dm);
       
    
   }
    
    void noSeatsAvailable(){
        if (seatsComboBox.getItemCount() == 0){
           JOptionPane.showMessageDialog(null, "We are sorry.!No seats are available.");
            return; 
        }
        if (seatsComboBox1.getItemCount() == 0){
           JOptionPane.showMessageDialog(null, "We are sorry.!No seats are available.");
            return; 
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAirlinerName = new javax.swing.JTextField();
        txtSource = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        TxtArrivalDate = new javax.swing.JTextField();
        txtDepartureDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtCustomerAge = new javax.swing.JTextField();
        txtPassportNumber = new javax.swing.JTextField();
        btnBookFlight = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtFlightSerialNo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSeatPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TxtTimeOfDay = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        seatsComboBox = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        TxtTimeOfDay1 = new javax.swing.JTextField();
        txtDestination1 = new javax.swing.JTextField();
        txtSource1 = new javax.swing.JTextField();
        txtFlightSerialNo1 = new javax.swing.JTextField();
        txtAirlinerName1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtDepartureDate1 = new javax.swing.JTextField();
        TxtArrivalDate1 = new javax.swing.JTextField();
        txtSeatPrice1 = new javax.swing.JTextField();
        seatsComboBox1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book multiple flights");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 420, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Source ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 120, 100, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Airliner");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 60, 100, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Departure Date");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(460, 50, 100, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Destination");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 150, 100, 31);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Arrival Date");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(460, 80, 119, 31);
        jPanel1.add(txtAirlinerName);
        txtAirlinerName.setBounds(190, 60, 184, 31);
        jPanel1.add(txtSource);
        txtSource.setBounds(190, 120, 184, 31);
        jPanel1.add(txtDestination);
        txtDestination.setBounds(190, 150, 184, 31);

        TxtArrivalDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtArrivalDateActionPerformed(evt);
            }
        });
        jPanel1.add(TxtArrivalDate);
        TxtArrivalDate.setBounds(570, 80, 184, 31);

        txtDepartureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartureDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDepartureDate);
        txtDepartureDate.setBounds(570, 50, 184, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Customer Details");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 420, 200, 38);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Age");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(470, 460, 30, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Name");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(130, 460, 86, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Gender");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(130, 490, 50, 25);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Passport Number");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(460, 490, 100, 25);
        jPanel1.add(txtCustomerName);
        txtCustomerName.setBounds(240, 460, 159, 25);

        txtCustomerAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerAgeKeyTyped(evt);
            }
        });
        jPanel1.add(txtCustomerAge);
        txtCustomerAge.setBounds(610, 460, 159, 25);
        jPanel1.add(txtPassportNumber);
        txtPassportNumber.setBounds(610, 490, 159, 25);

        btnBookFlight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBookFlight.setText("Book Flight");
        btnBookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightActionPerformed(evt);
            }
        });
        jPanel1.add(btnBookFlight);
        btnBookFlight.setBounds(370, 550, 113, 36);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Flight Id");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(90, 90, 96, 24);
        jPanel1.add(txtFlightSerialNo);
        txtFlightSerialNo.setBounds(190, 90, 180, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Price of Seat");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(450, 110, 119, 31);

        txtSeatPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtSeatPrice);
        txtSeatPrice.setBounds(570, 110, 184, 31);

        jLabel14.setText("Time of day");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(90, 180, 100, 20);
        jPanel1.add(TxtTimeOfDay);
        TxtTimeOfDay.setBounds(190, 180, 120, 26);

        jLabel15.setText("Seat List");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(480, 150, 59, 20);

        jPanel1.add(seatsComboBox);
        seatsComboBox.setBounds(570, 140, 100, 26);

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn);
        backBtn.setBounds(10, 30, 65, 29);

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Other" }));
        jPanel1.add(genderComboBox);
        genderComboBox.setBounds(240, 490, 90, 26);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Airliner");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(90, 240, 100, 31);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Flight Id");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(90, 270, 96, 24);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Source ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(90, 300, 100, 31);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Destination");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(90, 330, 100, 31);

        jLabel20.setText("Time of day");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(90, 360, 100, 20);
        jPanel1.add(TxtTimeOfDay1);
        TxtTimeOfDay1.setBounds(190, 360, 120, 26);
        jPanel1.add(txtDestination1);
        txtDestination1.setBounds(190, 330, 184, 31);
        jPanel1.add(txtSource1);
        txtSource1.setBounds(190, 300, 184, 31);
        jPanel1.add(txtFlightSerialNo1);
        txtFlightSerialNo1.setBounds(190, 270, 180, 30);
        jPanel1.add(txtAirlinerName1);
        txtAirlinerName1.setBounds(190, 240, 184, 31);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Departure Date");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(470, 240, 100, 31);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Arrival Date");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(470, 270, 119, 31);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Price of Seat");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(460, 300, 119, 31);

        jLabel24.setText("Seat List");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(490, 340, 59, 20);

        txtDepartureDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartureDate1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtDepartureDate1);
        txtDepartureDate1.setBounds(580, 240, 184, 31);

        TxtArrivalDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtArrivalDate1ActionPerformed(evt);
            }
        });
        jPanel1.add(TxtArrivalDate1);
        TxtArrivalDate1.setBounds(580, 270, 184, 31);

        txtSeatPrice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatPrice1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtSeatPrice1);
        txtSeatPrice1.setBounds(580, 300, 184, 31);

        jPanel1.add(seatsComboBox1);
        seatsComboBox1.setBounds(580, 330, 100, 26);

        jLabel25.setText("Flight-2");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(120, 210, 60, 20);

        jLabel26.setText("Flight-1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(693, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel26)
                .addContainerGap(632, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtArrivalDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtArrivalDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtArrivalDateActionPerformed

    private void txtDepartureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartureDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartureDateActionPerformed

    private void txtCustomerAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerAgeKeyTyped
        // TODO add your handling code here:
        char rate= evt.getKeyChar();
        if (!(Character.isDigit(rate) || (rate==KeyEvent.VK_BACK_SPACE) || (rate==KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCustomerAgeKeyTyped

    private void btnBookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightActionPerformed
        // TODO add your handling code here:

        customer = travelAgency.getCustomerDirectory().addCustomer();
        CustomerFlights customerFlights = customer.addCustFlights();
        CustomerFlights customerFlights1 = customer.addCustFlights();
        Date availableDate=null;
        Date availableDate1=null;

        try {
            availableDate = new SimpleDateFormat("dd/MM/yyyy hh mm ss aa").parse(TxtArrivalDate.getText());
            availableDate1 = new SimpleDateFormat("dd/MM/yyyy hh mm ss aa").parse(txtDepartureDate.getText());
        }
        catch (ParseException ex) {
            Logger.getLogger(CreateNewFlightJPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter the date in proper format");
            return;
        }
        //flight.getSeat().setSeatNumber(seatNo);
        //        int count = flight.getSeat().getSeatNumber();
        customerFlights.setArrivalDate(availableDate);
        customerFlights.setDepartureDate(availableDate1);
        customer.setCustomerName(txtCustomerName.getText());
        // customer.setSeatNum(Integer.parseInt(seatsComboBox.getSelectedItem()));
        Seat s = (Seat) (seatsComboBox.getSelectedItem());
        int seatNum=s.getSeatNumber();
        
        //////////////////////////////////////////////
        
        Date availableDate2=null;
        Date availableDate3=null;

        try {
            availableDate2 = new SimpleDateFormat("dd/MM/yyyy hh mm ss aa").parse(TxtArrivalDate1.getText());
            availableDate3 = new SimpleDateFormat("dd/MM/yyyy hh mm ss aa").parse(txtDepartureDate1.getText());
        }
        catch (ParseException ex) {
            Logger.getLogger(CreateNewFlightJPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Enter the date in proper format");
            return;
        }
        //flight.getSeat().setSeatNumber(seatNo);
        //        int count = flight.getSeat().getSeatNumber();
        customerFlights1.setArrivalDate(availableDate2);
        customerFlights1.setDepartureDate(availableDate3);
        
        // customer.setSeatNum(Integer.parseInt(seatsComboBox.getSelectedItem()));
        Seat s1 = (Seat) (seatsComboBox1.getSelectedItem());
        int seatNum1=s1.getSeatNumber();
        
        ///////////////////////////////////////////////

     Customer c=travelAgency.getCustomerDirectory().searchCustomer(Long.parseLong(txtPassportNumber.getText()));
//      //  System.out.println(c.getArrivalDate());
     //  System.out.println(availableDate1);
     
try{

for(CustomerFlights f:c.getCustFlights()){

      if (((f.getArrivalDate().compareTo(availableDate1))<0) &&((f.getArrivalDate().compareTo(availableDate3)) < 0)){
              

             JOptionPane.showMessageDialog(null, "You can't book 2 flights which have overlap");
             return;   
      }}}
    catch(Exception e){
        System.out.println(e);
    }

     
try{

for(CustomerFlights f:c.getCustFlights()){

      if (f.getArrivalDate().compareTo(availableDate1) > 0){
              

             JOptionPane.showMessageDialog(null, "You can't book 2 flights which have overlap");
             return;   
      }}}
    catch(Exception e){
        System.out.println(e);
    }
        
        customerFlights.setFlightAirlinerName(txtAirlinerName.getText());
        customerFlights.setFlightSerialNo(txtFlightSerialNo.getText());
                customerFlights.setDepartureLocation(txtSource.getText());
                customerFlights.setArrivalLocation(txtDestination.getText());
                customerFlights.setTimeOfDay(txtDepartureDate.getText());
        customerFlights.setCost(Integer.parseInt(txtSeatPrice.getText()));
                //customer.setTimeOfDay(txtDepartureDate.getText());
                
                 customerFlights1.setFlightAirlinerName(txtAirlinerName1.getText());
        customerFlights1.setFlightSerialNo(txtFlightSerialNo1.getText());
                customerFlights1.setDepartureLocation(txtSource1.getText());
                customerFlights1.setArrivalLocation(txtDestination1.getText());
                customerFlights1.setTimeOfDay(txtDepartureDate1.getText());
        customerFlights1.setCost(Integer.parseInt(txtSeatPrice1.getText()));
                
                
                customer.setCustomerAge(txtCustomerAge.getText());
                customer.setCustomerGender((String) genderComboBox.getSelectedItem());
                customer.setPassportNum(Long.parseLong(txtPassportNumber.getText()));
                customer.setCustomerName(txtCustomerName.getText());
                if (seatNum < 0 && seatNum1 < 0) {
                    JOptionPane.showMessageDialog(null, "Please select a seat");
                    return;
                }

                else{
                    Seat s2=flight.searchSeat(seatNum);
                    s2.setOccupied(true);
                    Seat s3=flight1.searchSeat(seatNum1);
                    s3.setOccupied(true);
                }
                
                
                
                
                JOptionPane.showMessageDialog(null, "Booking done successfully");

    }//GEN-LAST:event_btnBookFlightActionPerformed

    private void txtSeatPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatPriceActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtDepartureDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartureDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartureDate1ActionPerformed

    private void TxtArrivalDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtArrivalDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtArrivalDate1ActionPerformed

    private void txtSeatPrice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatPrice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatPrice1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtArrivalDate;
    private javax.swing.JTextField TxtArrivalDate1;
    private javax.swing.JTextField TxtTimeOfDay;
    private javax.swing.JTextField TxtTimeOfDay1;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnBookFlight;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> seatsComboBox;
    private javax.swing.JComboBox<String> seatsComboBox1;
    private javax.swing.JTextField txtAirlinerName;
    private javax.swing.JTextField txtAirlinerName1;
    private javax.swing.JTextField txtCustomerAge;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDepartureDate;
    private javax.swing.JTextField txtDepartureDate1;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtDestination1;
    private javax.swing.JTextField txtFlightSerialNo;
    private javax.swing.JTextField txtFlightSerialNo1;
    private javax.swing.JTextField txtPassportNumber;
    private javax.swing.JTextField txtSeatPrice;
    private javax.swing.JTextField txtSeatPrice1;
    private javax.swing.JTextField txtSource;
    private javax.swing.JTextField txtSource1;
    // End of variables declaration//GEN-END:variables
}
