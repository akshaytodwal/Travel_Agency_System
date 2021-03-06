/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirlines;

import Business.Airline;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ListAirlines extends javax.swing.JPanel {
 private TravelAgency travelAgency;
    private JPanel userProcessContainer;
    private Airline airline;
    
    public ListAirlines(TravelAgency travelAgency,JPanel userProcessContainer) {
        initComponents();
        this.travelAgency=travelAgency;
        this.userProcessContainer=userProcessContainer;
        this.airline = airline;
        populateComboBox();
    }
    
    public void populateComboBox(){
        airlineCombobox.removeAllItems();
        Map<String, Airline> airline = travelAgency.getListOfAirline();
        airline.entrySet().forEach((e) -> {
            airlineCombobox.addItem(e.getValue().getNameOfAirline());
     });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getInfoButton = new javax.swing.JButton();
        airlineCombobox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        backButtonViewAllPlanes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        viewAirlineButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 102, 102));
        setPreferredSize(new java.awt.Dimension(950, 500));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getInfoButton.setBackground(new java.awt.Color(0, 0, 0));
        getInfoButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getInfoButton.setForeground(new java.awt.Color(255, 255, 255));
        getInfoButton.setText("Get Information");
        getInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInfoButtonActionPerformed(evt);
            }
        });
        add(getInfoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 220, 30));

        airlineCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        airlineCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlineComboboxActionPerformed(evt);
            }
        });
        add(airlineCombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 340, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please select an airline");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 360, 20));

        backButtonViewAllPlanes.setBackground(new java.awt.Color(0, 0, 0));
        backButtonViewAllPlanes.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        backButtonViewAllPlanes.setForeground(new java.awt.Color(255, 255, 255));
        backButtonViewAllPlanes.setText("Back");
        backButtonViewAllPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonViewAllPlanesActionPerformed(evt);
            }
        });
        add(backButtonViewAllPlanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("List of Airlines");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 730, -1));

        viewAirlineButton.setBackground(new java.awt.Color(0, 0, 0));
        viewAirlineButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        viewAirlineButton.setForeground(new java.awt.Color(255, 255, 255));
        viewAirlineButton.setText("View");
        viewAirlineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlineButtonActionPerformed(evt);
            }
        });
        add(viewAirlineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 220, 30));
    }// </editor-fold>//GEN-END:initComponents
    
    Airline findAirline(String selectedIndex) {
        for (Map.Entry<String,Airline> it : travelAgency.getListOfAirline().entrySet()) {
            if (it.getKey().equals(selectedIndex)) {
                return (Airline) it.getValue();
            }
        }
        return null;
        }
    
    Airline findAirlineV(String selectedIndex) {
        for (Map.Entry<String,Airline> it : travelAgency.getListOfAirline().entrySet()) {
            if (it.getValue().toString().equals(selectedIndex)) {
                return (Airline) it.getValue();
            }
        }
        return null;
        }
    
    private void getInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInfoButtonActionPerformed
        // TODO add your handling code here:
        try{
           String selectedIndex = (String) airlineCombobox.getSelectedItem();
           Airline airline = findAirlineV(selectedIndex);
           //Airline airline = (Airline)airLineTable.getValueAt(selectedRow,0);
            ViewAllPlanesPanel viewAllPlanesPanel = new ViewAllPlanesPanel(airline,userProcessContainer);
            userProcessContainer.add("ViewAllPlanesPanel",viewAllPlanesPanel);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.next(userProcessContainer); 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please select a value","Error", 0);
        }
    }//GEN-LAST:event_getInfoButtonActionPerformed

    private void airlineComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlineComboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airlineComboboxActionPerformed

    private void backButtonViewAllPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonViewAllPlanesActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonViewAllPlanesActionPerformed

    private void viewAirlineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlineButtonActionPerformed
        // TODO add your handling code here:
        try{
          String selectedIndex = (String) airlineCombobox.getSelectedItem();
          Airline airline = findAirline(selectedIndex);
          UpdateAirlines updateAirlines = new UpdateAirlines(userProcessContainer,airline);
          userProcessContainer.add("ViewAllPlanesPanel",updateAirlines);
          CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
          cardLayout.next(userProcessContainer); 
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null,"Please select a value","Error", 0);
        }
    }//GEN-LAST:event_viewAirlineButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> airlineCombobox;
    private javax.swing.JButton backButtonViewAllPlanes;
    private javax.swing.JButton getInfoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton viewAirlineButton;
    // End of variables declaration//GEN-END:variables
}
