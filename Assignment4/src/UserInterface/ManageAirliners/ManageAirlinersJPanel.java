/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersJPanel
     */
    
    //AirlinerDirectory airlinerDirectory;
    JPanel cardSequenceJPanel;
    TravelAgency travelAgency;
    AirlinerDirectory airlinerDirectory;
    
  
    public ManageAirlinersJPanel(JPanel cardSequenceJPanel, TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
        this.airlinerDirectory=travelAgency.getAirlinerDirectory();
        populateTable();
    }

    public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblAirliner.getModel();
        dtm.setRowCount(0);
        for(Airliner airliner:travelAgency.getAirlinerDirectory().getAirliners()) {
            Object row[] = new Object[5];
            row[0] = airliner;
            row[1] = airliner.getAirlinerId();
            row[2] = airliner.getAirlinerAddress();
            row[3]=airliner.getFleet().size();
                        int flightCount=0;
            for(Flight flight:travelAgency.getFlightDirectory().getFlightList()){
            if(flight.getAirlinerName().equals(airliner.getAirlinerName())){
                flightCount++;
            }}
            row[4] = flightCount;
            //row[4] = airliner.getFlightDir().getFlightList().size();
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
        tblAirliner = new javax.swing.JTable();
        btnNewAirliner = new javax.swing.JButton();
        btnUpdateAirliner = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearchAirliner = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSearchAirliner = new javax.swing.JTable();
        btnManageFlights = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Airliners");
        add(jLabel1);
        jLabel1.setBounds(0, 23, 790, 29);

        tblAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Airliner ID", "Address", "Airplanes", "No of Flights/day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAirliner);

        add(jScrollPane1);
        jScrollPane1.setBounds(110, 100, 550, 115);

        btnNewAirliner.setText("New Airliner >>");
        btnNewAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAirlinerActionPerformed(evt);
            }
        });
        add(btnNewAirliner);
        btnNewAirliner.setBounds(700, 140, 150, 30);

        btnUpdateAirliner.setText("Update Airliner");
        btnUpdateAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAirlinerActionPerformed(evt);
            }
        });
        add(btnUpdateAirliner);
        btnUpdateAirliner.setBounds(250, 220, 150, 32);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALL Airliners");
        add(jLabel2);
        jLabel2.setBounds(200, 60, 279, 26);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Airliner");
        add(jLabel3);
        jLabel3.setBounds(60, 290, 80, 30);

        txtSearchAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchAirlinerActionPerformed(evt);
            }
        });
        add(txtSearchAirliner);
        txtSearchAirliner.setBounds(150, 290, 420, 30);

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSearch.setText("Search Airliner");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch);
        btnSearch.setBounds(270, 330, 118, 32);

        tblSearchAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Airliner ID", "Address", "Airplanes", "No of Flights/day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSearchAirliner);

        add(jScrollPane2);
        jScrollPane2.setBounds(110, 370, 700, 98);

        btnManageFlights.setText("Manage Flights");
        btnManageFlights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFlightsActionPerformed(evt);
            }
        });
        add(btnManageFlights);
        btnManageFlights.setBounds(260, 480, 160, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAirlinerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirliner.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            Airliner vs = (Airliner)tblAirliner.getValueAt(selectedRow, 0);
            UpdateAirlinerJPanel panel = new UpdateAirlinerJPanel(cardSequenceJPanel, vs);
            cardSequenceJPanel.add("UpdateAirlinerJPanel",panel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_btnUpdateAirlinerActionPerformed

    private void btnNewAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAirlinerActionPerformed
        // TODO add your handling code here:
        CreateNewAirlinerJPanel panel = new CreateNewAirlinerJPanel(cardSequenceJPanel, travelAgency);
        cardSequenceJPanel.add("CreateNewAirlinerJPanel",panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
        
    }//GEN-LAST:event_btnNewAirlinerActionPerformed

    private void txtSearchAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchAirlinerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchAirlinerActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Airliner result = travelAgency.getAirlinerDirectory().searchAirliner(txtSearchAirliner.getText());
        if (result == null) {
            JOptionPane.showMessageDialog(null, "Airliner entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE);
            DefaultTableModel dtm = (DefaultTableModel) tblSearchAirliner.getModel();
            dtm.setRowCount(0);
        }
        else{
            DefaultTableModel dtm = (DefaultTableModel) tblSearchAirliner.getModel();
            dtm.setRowCount(0);
        
//    for(Airliner airliner:airlinerDirectory.getAirliners()) {
            Object row[] = new Object[5];
            row[0] = result;
            row[1] = result.getAirlinerId();
            
            row[2] = result.getAirlinerAddress();
            row[3]=result.getFleet().size();
                    
            row[4] = result.getFlightDir().getFlightList().size();
            dtm.addRow(row);
        //}
      }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnManageFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFlightsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSearchAirliner.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        else{
            Airliner vs = (Airliner)tblSearchAirliner.getValueAt(selectedRow, 0);
            ManageFlightJPanel panel = new ManageFlightJPanel(cardSequenceJPanel,vs,travelAgency);
            cardSequenceJPanel.add("ManageFlightJPanel", panel);
            CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
            layout.next(cardSequenceJPanel);
        }
    }//GEN-LAST:event_btnManageFlightsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageFlights;
    private javax.swing.JButton btnNewAirliner;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateAirliner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAirliner;
    private javax.swing.JTable tblSearchAirliner;
    private javax.swing.JTextField txtSearchAirliner;
    // End of variables declaration//GEN-END:variables
}
