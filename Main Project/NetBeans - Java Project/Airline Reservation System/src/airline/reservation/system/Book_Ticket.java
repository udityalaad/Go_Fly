/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.reservation.system;

import java.sql.Connection;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author udity
 */
public class Book_Ticket extends javax.swing.JFrame {
    
    Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    
    /**
     * Creates new form Book_Ticket
     */
    public Book_Ticket() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SOURCE = new javax.swing.JComboBox<>();
        DESTINATION = new javax.swing.JComboBox<>();
        DATE_OF_JOURNEY = new com.toedter.calendar.JDateChooser();
        Economy = new javax.swing.JRadioButton();
        Business = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SEARCH_FLIGHTS = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AVAILABLE_FLIGHTS_TABLE = new javax.swing.JTable();
        SUBMIT = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOK TICKET");

        jLabel1.setText("SOURCE");

        jLabel2.setText("DESTINATION");

        jLabel3.setText("DATE OF JOURNEY");

        SOURCE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Goa", "Kolkata", "Mumbai" }));

        DESTINATION.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Goa", "Kolkata", "Mumbai" }));

        buttonGroup1.add(Economy);
        Economy.setText("Economy");

        buttonGroup1.add(Business);
        Business.setText("Business");

        jLabel4.setText("CLASS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("BOOK TICKET");

        SEARCH_FLIGHTS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SEARCH_FLIGHTS.setText("SEARCH FLIGHTS");
        SEARCH_FLIGHTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_FLIGHTSActionPerformed(evt);
            }
        });

        CANCEL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CANCEL.setText("CANCEL");
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("AVAILABLE FLIGHTS");

        AVAILABLE_FLIGHTS_TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(AVAILABLE_FLIGHTS_TABLE);

        SUBMIT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SUBMIT.setText("SUBMIT");
        SUBMIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBMITActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("NOTE: We do not provide refunds on cancellation.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(SUBMIT)
                        .addGap(31, 31, 31)
                        .addComponent(CANCEL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Economy)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(Business))
                            .addComponent(SOURCE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DESTINATION, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DATE_OF_JOURNEY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(SEARCH_FLIGHTS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(456, 456, 456))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SOURCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DESTINATION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DATE_OF_JOURNEY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Business)
                            .addComponent(Economy)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEARCH_FLIGHTS)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SUBMIT)
                    .addComponent(CANCEL))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SEARCH_FLIGHTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_FLIGHTSActionPerformed
        // TODO add your handling code here:
        conn = AirlineReservationSystem.connectDB();
        
        try{
            String sql = null;
            Date currDate = new Date();
            
            
            if(SOURCE.getSelectedItem() == DESTINATION.getSelectedItem()){
                JOptionPane.showMessageDialog(null, "SOURCE and Destination cannot be same.");
                return;
            }
            
            
            int nm_currDate = (currDate.getYear() * 12)  +  currDate.getMonth();
            int nm_DOJ = (DATE_OF_JOURNEY.getDate().getYear() * 12)  +  DATE_OF_JOURNEY.getDate().getMonth();
            
            if(DATE_OF_JOURNEY.getDate() == null){
                JOptionPane.showMessageDialog(null, "Please provide the Date of Journey.");
                return;
            }
            else if(DATE_OF_JOURNEY.getDate().compareTo(currDate) < 0){
                JOptionPane.showMessageDialog(null, "Invalid Date Of Journey.");
                return;
            }
            else if((nm_DOJ - nm_currDate + 1) > 6){
                JOptionPane.showMessageDialog(null, "Reservations can be made for the flights of next 6 months only.");
                return;
            }
            
            
            AirlineReservationSystem.DOJ = DATE_OF_JOURNEY.getDate();
            
            
            if(Economy.isSelected()){
                AirlineReservationSystem.CLASS = "Economy";
                sql = "Select FLIGHT_ID, PLANE_NAME, DEPARTURE_TIME, ARRIVAL_TIME, ECONOMY_PRICE as PRICE from FLIGHT where SOURCE=? and DESTINATION=?";
            }
            else if(Business.isSelected()){
                AirlineReservationSystem.CLASS = "Business";
                sql = "Select FLIGHT_ID, PLANE_NAME, DEPARTURE_TIME, ARRIVAL_TIME, BUSINESS_PRICE as PRICE from FLIGHT where SOURCE=? and DESTINATION=?";
            }
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            
            pst.setString(1, (String) SOURCE.getSelectedItem());
            pst.setString(2, (String) DESTINATION.getSelectedItem());
            
            rs = (OracleResultSet) pst.executeQuery();
            
            
            AVAILABLE_FLIGHTS_TABLE.setModel(DbUtils.resultSetToTableModel(rs));
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_SEARCH_FLIGHTSActionPerformed

    private void SUBMITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBMITActionPerformed
        // TODO add your handling code here:
        try{
            int row = AVAILABLE_FLIGHTS_TABLE.getSelectedRow();
            
            AirlineReservationSystem.flight_id = Integer.parseInt(AVAILABLE_FLIGHTS_TABLE.getModel().getValueAt(row, 0).toString());
            
            new Passengers().setVisible(true);
            setVisible(false);
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SUBMITActionPerformed

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
        // TODO add your handling code here:
        int sure = JOptionPane.showConfirmDialog(null, "Are you sure?");
        
        if(sure == JOptionPane.NO_OPTION   ||   sure == JOptionPane.CANCEL_OPTION){
            return;
        }
        
        
        if(AirlineReservationSystem.user == "MANAGER"){
            new Manager().setVisible(true);
        }
        else if(AirlineReservationSystem.user == "EMPLOYEE"){
            new Employee().setVisible(true);
        }
        else if(AirlineReservationSystem.user == "CUSTOMER"){
            new Customer().setVisible(true);
        }

        setVisible(false);
    }//GEN-LAST:event_CANCELActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Book_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AVAILABLE_FLIGHTS_TABLE;
    private javax.swing.JRadioButton Business;
    private javax.swing.JButton CANCEL;
    private com.toedter.calendar.JDateChooser DATE_OF_JOURNEY;
    private javax.swing.JComboBox<String> DESTINATION;
    private javax.swing.JRadioButton Economy;
    private javax.swing.JButton SEARCH_FLIGHTS;
    private javax.swing.JComboBox<String> SOURCE;
    private javax.swing.JButton SUBMIT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
