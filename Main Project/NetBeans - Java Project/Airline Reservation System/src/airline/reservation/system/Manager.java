/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.reservation.system;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author udity
 */
public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    public Manager() {
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

        jLabel1 = new javax.swing.JLabel();
        LIST_TICKETS = new javax.swing.JButton();
        LIST_EMPLOYEES = new javax.swing.JButton();
        BOOK_TICKET = new javax.swing.JButton();
        LOG_OUT = new javax.swing.JButton();
        LIST_CUSTOMERS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGER");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGER");

        LIST_TICKETS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LIST_TICKETS.setText("LIST TICKETS");
        LIST_TICKETS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIST_TICKETSActionPerformed(evt);
            }
        });

        LIST_EMPLOYEES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LIST_EMPLOYEES.setText("LIST EMPLOYEES");
        LIST_EMPLOYEES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIST_EMPLOYEESActionPerformed(evt);
            }
        });

        BOOK_TICKET.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BOOK_TICKET.setText("BOOK TICKET");
        BOOK_TICKET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOK_TICKETActionPerformed(evt);
            }
        });

        LOG_OUT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LOG_OUT.setText("LOG OUT");
        LOG_OUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOG_OUTActionPerformed(evt);
            }
        });

        LIST_CUSTOMERS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LIST_CUSTOMERS.setText("LIST CUSTOMERS");
        LIST_CUSTOMERS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIST_CUSTOMERSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BOOK_TICKET, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(LIST_TICKETS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LIST_EMPLOYEES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LIST_CUSTOMERS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LOG_OUT)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOOK_TICKET)
                    .addComponent(LIST_EMPLOYEES))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LIST_CUSTOMERS)
                    .addComponent(LIST_TICKETS))
                .addGap(30, 30, 30)
                .addComponent(LOG_OUT)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BOOK_TICKETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOK_TICKETActionPerformed
        // TODO add your handling code here:
        new Book_Ticket().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_BOOK_TICKETActionPerformed

    private void LIST_TICKETSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIST_TICKETSActionPerformed
        // TODO add your handling code here:
        new List_Tickets().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LIST_TICKETSActionPerformed

    private void LIST_EMPLOYEESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIST_EMPLOYEESActionPerformed
        // TODO add your handling code here:
        new List_Employees().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LIST_EMPLOYEESActionPerformed

    private void LIST_CUSTOMERSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIST_CUSTOMERSActionPerformed
        // TODO add your handling code here:
        new List_Customers().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LIST_CUSTOMERSActionPerformed

    private void LOG_OUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOG_OUTActionPerformed
        // TODO add your handling code here:
        int sure = JOptionPane.showConfirmDialog(null, "Are you sure?");
        
        if(sure == JOptionPane.NO_OPTION   ||   sure == JOptionPane.CANCEL_OPTION){
            return;
        }
        
        
        AirlineReservationSystem.user = null;
        AirlineReservationSystem.email = null;
        
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LOG_OUTActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOOK_TICKET;
    private javax.swing.JButton LIST_CUSTOMERS;
    private javax.swing.JButton LIST_EMPLOYEES;
    private javax.swing.JButton LIST_TICKETS;
    private javax.swing.JButton LOG_OUT;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
