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

/**
 *
 * @author vikram
 */
public class BookCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookCustomersJPanel
     */
    JPanel cardSequenceJPanel;
    Flight flight;
    TravelAgency travelAgency;
    Customer customer;
    DefaultComboBoxModel dm=new DefaultComboBoxModel();
    BookCustomersJPanel(JPanel cardSequenceJPanel, Flight flight, TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.flight = flight;
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
        populateSeatComboBox();
        noSeatsAvailable();
    }
    
    private void populateAirlineDetails(){
      txtAirlinerName.setText(flight.getAirlinerName());
        txtFlightSerialNo.setText(flight.getFlightId());
        txtSource.setText(flight.getArrivalLocation());
        txtDestination.setText(flight.getDepartureLocation());
        TxtTimeOfDay.setText(flight.getTimeOfDay());
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy hh mm ss");
        String departDate = date.format(flight.getDepartureDate()); 
       txtDepartureDate.setText(departDate);
       
        SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy hh mm ss");
        String arrivalDate = date1.format(flight.getArrivalDate()); 
       TxtArrivalDate.setText(arrivalDate);
        txtSeatPrice.setText(Integer.toString(flight.getPerSeatRate()));
    }
    
    void  populateSeatComboBox(){
       for(Seat s:flight.getSeatList()){
           if(s.getOccupied()==false){
           dm.addElement(s); }
           
   }
       seatsComboBox.setModel(dm);
       
    
   }
    
    void noSeatsAvailable(){
        if (seatsComboBox.getItemCount() == 0){
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

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Book a Flight");
        add(jLabel1);
        jLabel1.setBounds(70, 10, 700, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Source ");
        add(jLabel2);
        jLabel2.setBounds(116, 139, 100, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Airliner");
        add(jLabel3);
        jLabel3.setBounds(116, 66, 100, 31);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Departure Date");
        add(jLabel4);
        jLabel4.setBounds(460, 70, 100, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Destination");
        add(jLabel5);
        jLabel5.setBounds(116, 178, 100, 31);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Arrival Date");
        add(jLabel6);
        jLabel6.setBounds(440, 110, 119, 31);
        add(txtAirlinerName);
        txtAirlinerName.setBounds(234, 68, 184, 31);
        add(txtSource);
        txtSource.setBounds(234, 141, 184, 31);
        add(txtDestination);
        txtDestination.setBounds(234, 178, 184, 31);

        TxtArrivalDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtArrivalDateActionPerformed(evt);
            }
        });
        add(TxtArrivalDate);
        TxtArrivalDate.setBounds(570, 110, 184, 31);

        txtDepartureDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartureDateActionPerformed(evt);
            }
        });
        add(txtDepartureDate);
        txtDepartureDate.setBounds(570, 70, 184, 31);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Customer Details");
        add(jLabel7);
        jLabel7.setBounds(340, 280, 200, 38);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Age");
        add(jLabel8);
        jLabel8.setBounds(450, 330, 30, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Name");
        add(jLabel9);
        jLabel9.setBounds(140, 330, 86, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Gender");
        add(jLabel10);
        jLabel10.setBounds(140, 370, 50, 25);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Passport No");
        add(jLabel11);
        jLabel11.setBounds(450, 370, 100, 25);
        add(txtCustomerName);
        txtCustomerName.setBounds(230, 330, 159, 25);

        txtCustomerAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCustomerAgeKeyTyped(evt);
            }
        });
        add(txtCustomerAge);
        txtCustomerAge.setBounds(570, 330, 159, 25);
        add(txtPassportNumber);
        txtPassportNumber.setBounds(570, 370, 159, 25);

        btnBookFlight.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBookFlight.setText("Book Flight");
        btnBookFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookFlightActionPerformed(evt);
            }
        });
        add(btnBookFlight);
        btnBookFlight.setBounds(360, 430, 113, 36);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Flight Id");
        add(jLabel12);
        jLabel12.setBounds(118, 105, 96, 24);
        add(txtFlightSerialNo);
        txtFlightSerialNo.setBounds(232, 106, 186, 27);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Price of Seat");
        add(jLabel13);
        jLabel13.setBounds(440, 150, 119, 31);

        txtSeatPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatPriceActionPerformed(evt);
            }
        });
        add(txtSeatPrice);
        txtSeatPrice.setBounds(570, 150, 184, 31);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Time of day");
        add(jLabel14);
        jLabel14.setBounds(130, 230, 80, 20);
        add(TxtTimeOfDay);
        TxtTimeOfDay.setBounds(230, 230, 180, 26);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Seat List");
        add(jLabel15);
        jLabel15.setBounds(480, 210, 51, 17);

        add(seatsComboBox);
        seatsComboBox.setBounds(570, 200, 180, 26);

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(10, 30, 65, 29);

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Other" }));
        add(genderComboBox);
        genderComboBox.setBounds(240, 370, 90, 26);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepartureDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartureDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartureDateActionPerformed

    private void TxtArrivalDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtArrivalDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtArrivalDateActionPerformed

    private void btnBookFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookFlightActionPerformed
        // TODO add your handling code here:
     
        customer = travelAgency.getCustomerDirectory().addCustomer();
        CustomerFlights customerFlights = customer.addCustFlights();
        Date availableDate=null;
        Date availableDate1=null;
       
        try {
            availableDate = new SimpleDateFormat("dd/MM/yyyy hh mm ss").parse(TxtArrivalDate.getText());
             availableDate1 = new SimpleDateFormat("dd/MM/yyyy hh mm ss").parse(txtDepartureDate.getText());
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
      
      
      
      ///////////////////////////////////////////////////////////
      
      
      
     Customer c=travelAgency.getCustomerDirectory().searchCustomer(Long.parseLong(txtPassportNumber.getText()));
//      //  System.out.println(c.getArrivalDate());
     //  System.out.println(availableDate1);
     
try{

for(CustomerFlights f:c.getCustFlights()){

      if (f.getArrivalDate().compareTo(availableDate1) < 0){
              

             JOptionPane.showMessageDialog(null, "You can't book 2 flights which have overlap");
             return;   
      }}}
    catch(Exception e){
        System.out.println(e);
    }

       //////////////////////////////////////////////////////////////////
       
       
       
       customerFlights.setFlightAirlinerName(txtAirlinerName.getText());
        customerFlights.setFlightSerialNo(txtFlightSerialNo.getText());
        customerFlights.setDepartureLocation(txtSource.getText());
        customerFlights.setArrivalLocation(txtDestination.getText());
        customerFlights.setTimeOfDay(txtDepartureDate.getText());
        customerFlights.setCost(Integer.parseInt(txtSeatPrice.getText()));
        customer.setCustomerAge(txtCustomerAge.getText());
        customer.setCustomerGender((String) genderComboBox.getSelectedItem());
        customer.setPassportNum(Long.parseLong(txtPassportNumber.getText()));
        customer.setCustomerName(txtCustomerName.getText());
        if (seatNum < 0) {
            JOptionPane.showMessageDialog(null, "Please select a seat");
            return;
        }
      
        else{
            Seat s1=flight.searchSeat(seatNum);
            s1.setOccupied(true);
            }
        JOptionPane.showMessageDialog(null, "Booking done successfully");
        
        
    }//GEN-LAST:event_btnBookFlightActionPerformed

    private void txtSeatPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatPriceActionPerformed

    private void txtCustomerAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerAgeKeyTyped
        // TODO add your handling code here:
        char rate= evt.getKeyChar();
        if (!(Character.isDigit(rate) || (rate==KeyEvent.VK_BACK_SPACE) || (rate==KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCustomerAgeKeyTyped

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtArrivalDate;
    private javax.swing.JTextField TxtTimeOfDay;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> seatsComboBox;
    private javax.swing.JTextField txtAirlinerName;
    private javax.swing.JTextField txtCustomerAge;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtDepartureDate;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtFlightSerialNo;
    private javax.swing.JTextField txtPassportNumber;
    private javax.swing.JTextField txtSeatPrice;
    private javax.swing.JTextField txtSource;
    // End of variables declaration//GEN-END:variables
}
