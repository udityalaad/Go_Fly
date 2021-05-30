/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.reservation.system;

import java.sql.Connection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.OraclePreparedStatement;
import oracle.jdbc.OracleResultSet;

/**
 *
 * @author udity
 */
public class List_Tickets extends javax.swing.JFrame {
    
    Connection conn = null;
    OraclePreparedStatement pst = null;
    OracleResultSet rs = null;
    int result = 0;
    
    /**
     * Creates new form List_Tickets
     */
    public List_Tickets() {
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

        SEARCH = new javax.swing.JTextField();
        CANCEL_TICKET = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BOOKED_TICKETS_TABLE = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        GO_BACK_TO_PREVIOUS_MENU = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIST TICKETS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        SEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SEARCHKeyReleased(evt);
            }
        });

        CANCEL_TICKET.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CANCEL_TICKET.setText("CANCEL TICKET");
        CANCEL_TICKET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCEL_TICKETActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BOOKED TICKETS");

        BOOKED_TICKETS_TABLE.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(BOOKED_TICKETS_TABLE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("<-- SEARCH");

        GO_BACK_TO_PREVIOUS_MENU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GO_BACK_TO_PREVIOUS_MENU.setText("GO BACK TO PREVIOUS MENU");
        GO_BACK_TO_PREVIOUS_MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GO_BACK_TO_PREVIOUS_MENUActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(2);
        jTextArea1.setText("NOTE: Search & select cannot not be used together for\nupdation of mobile number or cancellation of a ticket.");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(565, 565, 565)
                .addComponent(jLabel1)
                .addContainerGap(628, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(GO_BACK_TO_PREVIOUS_MENU)
                        .addGap(246, 246, 246)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(CANCEL_TICKET))
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(GO_BACK_TO_PREVIOUS_MENU)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(CANCEL_TICKET)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CANCEL_TICKETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCEL_TICKETActionPerformed
        // TODO add your handling code here:
        int sure = JOptionPane.showConfirmDialog(null, "Are you sure?");
        
        if(sure == JOptionPane.NO_OPTION   ||   sure == JOptionPane.CANCEL_OPTION){
            return;
        }
        
        
        conn = AirlineReservationSystem.connectDB();
        
        try{
            int row = BOOKED_TICKETS_TABLE.getSelectedRow();
            
            Date currDate = new Date(), DOJ = (Date) BOOKED_TICKETS_TABLE.getModel().getValueAt(row, 2);
            
            if(DOJ.compareTo(currDate) < 0){
                JOptionPane.showMessageDialog(null, "Selected ticket cannot be cancelled, since the the Date of Journey has gone by.");
                return;
            }
            
            String sql = "Update TICKET set STATUS=? where TICKET_ID=?";
            
            pst = (OraclePreparedStatement) conn.prepareStatement(sql);
            
            pst.setString(1, "Cancelled");
            pst.setString(2, BOOKED_TICKETS_TABLE.getModel().getValueAt(row, 0).toString());
            
            result = pst.executeUpdate();

            if(result != 0){
                JOptionPane.showMessageDialog(null, "Ticket Cancelled Succesfully.");
                
                new List_Tickets().setVisible(true);
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "There was a problem cancelling the Ticket.");
            }
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_CANCEL_TICKETActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        conn = AirlineReservationSystem.connectDB();
        
        try{
            String sql = null;
            
            if(AirlineReservationSystem.user == "MANAGER"){
                sql = "Select TICKET_ID, FLIGHT_ID,DATE_OF_JOURNEY, CLASS, USER_EMAIL, FIRST_NAME, MIDDLE_NAME, LAST_NAME, GENDER, AGE, MOBILE_NO, PRICE, PLANE_NAME, SOURCE, DESTINATION, DEPARTURE_TIME, ARRIVAL_TIME, ECONOMY_PRICE as PRICE "
                        + "from TICKET natural join FLIGHT "
                        + "where STATUS=? "
                        + "order by TICKET_ID";
                
                pst = (OraclePreparedStatement) conn.prepareStatement(sql);
                pst.setString(1, "Booked");
            }
            else if(AirlineReservationSystem.user == "EMPLOYEE"){
                 sql = "Select TICKET_ID, FLIGHT_ID,DATE_OF_JOURNEY, CLASS, USER_EMAIL, FIRST_NAME, MIDDLE_NAME, LAST_NAME, GENDER, AGE, MOBILE_NO, PRICE, PLANE_NAME, SOURCE, DESTINATION, DEPARTURE_TIME, ARRIVAL_TIME, ECONOMY_PRICE as PRICE "
                        + "from TICKET natural join FLIGHT "
                        + "where STATUS=? "
                        + "order by TICKET_ID";
                
                pst = (OraclePreparedStatement) conn.prepareStatement(sql);
                pst.setString(1, "Booked");
            }
            else if(AirlineReservationSystem.user == "CUSTOMER"){
                 sql = "Select TICKET_ID, FLIGHT_ID,DATE_OF_JOURNEY, CLASS, USER_EMAIL, FIRST_NAME, MIDDLE_NAME, LAST_NAME, GENDER, AGE, MOBILE_NO, PRICE, PLANE_NAME, SOURCE, DESTINATION, DEPARTURE_TIME, ARRIVAL_TIME, ECONOMY_PRICE as PRICE "
                        + "from TICKET natural join FLIGHT "
                        + "where USER_EMAIL=? and STATUS=? "
                        + "order by TICKET_ID";
                
                pst = (OraclePreparedStatement) conn.prepareStatement(sql);
                
                pst.setString(1, AirlineReservationSystem.email);
                pst.setString(2, "Booked");
            }
            
            rs = (OracleResultSet) pst.executeQuery();
            
            BOOKED_TICKETS_TABLE.setModel(DbUtils.resultSetToTableModel(rs));
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void GO_BACK_TO_PREVIOUS_MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GO_BACK_TO_PREVIOUS_MENUActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_GO_BACK_TO_PREVIOUS_MENUActionPerformed

    private void SEARCHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SEARCHKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) BOOKED_TICKETS_TABLE.getModel();
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        BOOKED_TICKETS_TABLE.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(SEARCH.getText()));
    }//GEN-LAST:event_SEARCHKeyReleased

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
            java.util.logging.Logger.getLogger(List_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List_Tickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List_Tickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BOOKED_TICKETS_TABLE;
    private javax.swing.JButton CANCEL_TICKET;
    private javax.swing.JButton GO_BACK_TO_PREVIOUS_MENU;
    private javax.swing.JTextField SEARCH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
