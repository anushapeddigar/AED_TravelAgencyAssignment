/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.Flight;
import Business.MasterFlightDirectory;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vikram
 */
public class ViewFlightsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightsJPanel
     */
    JPanel cardSequenceJPanel;
    Airliner airliner;
    TravelAgency travelAgency;
    //Flight flight;

    ViewFlightsJPanel(JPanel cardSequenceJPanel,Airliner airliner,TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.airliner = airliner;
        this.travelAgency = travelAgency;
        populateTable();
        txtAirlinerName.setText(airliner.getAirlinerName());
        txtAirlinerName.setEnabled(false);
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
        txtAirlinerName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlights = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        BtnCancelFlight = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Flights");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Airliner");

        txtAirlinerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlinerNameActionPerformed(evt);
            }
        });

        tblFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight No", "Departure", "Arrival", "Time of Day", "Departure Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFlights);

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnView.setText("View Flight");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        BtnCancelFlight.setText("Delete flight");
        BtnCancelFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelFlightActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelFlight))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCancelFlight))
                .addGap(282, 282, 282))
        );
    }// </editor-fold>//GEN-END:initComponents

        private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblFlights.getModel();
        dtm.setRowCount(0);
        ArrayList<Flight> flightNew = new ArrayList(); 
        for(Flight flight:travelAgency.getFlightDirectory().getFlightList()){
            if(flight.getAirlinerName().equals(airliner.getAirlinerName())){
                flightNew.add(flight);
            }
        }
        for(Flight flight:flightNew) {
            Object row[] = new Object[5];
            row[0] = flight;
            row[1] = flight.getDepartureLocation();
            row[2] = flight.getArrivalLocation();
            row[3] = flight.getTimeOfDay();
            row[4] = flight.getDepartureDate();
            dtm.addRow(row);
        }
    }
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlights.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            Flight fs = (Flight)tblFlights.getValueAt(selectedRow, 0);
            UpdateFlightJPanel panel = new UpdateFlightJPanel(cardSequenceJPanel, fs,travelAgency,airliner);
            cardSequenceJPanel.add("UpdateAirlinerJPanel",panel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void BtnCancelFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelFlightActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblFlights.getSelectedRow();
        if (selectedRow >= 0) {
            Flight fs = (Flight)tblFlights.getValueAt(selectedRow, 0);
            int dialogButton=0;
        int dialogResult=JOptionPane.showConfirmDialog (null, "Are you sure you want to delete selected row","Warning",dialogButton);

    if (dialogResult == JOptionPane.YES_OPTION) { 
         MasterFlightDirectory fd = travelAgency.getFlightDirectory();
          fd.deleteFlight(fs);
          airliner.getFlightDir().deleteFlight(fs);
    }
JOptionPane.showMessageDialog(null,"Deleted successfully");
          populateTable();} 
      else{
JOptionPane.showMessageDialog(null,"Please select a row");
        
        }
           
    }//GEN-LAST:event_BtnCancelFlightActionPerformed

    private void txtAirlinerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlinerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlinerNameActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelFlight;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFlights;
    private javax.swing.JTextField txtAirlinerName;
    // End of variables declaration//GEN-END:variables
}
