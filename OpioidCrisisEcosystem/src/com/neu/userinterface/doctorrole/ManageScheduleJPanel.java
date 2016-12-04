/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.doctorrole;

import com.neu.business.enterprise.Enterprise;
import com.neu.business.organization.DoctorOrganization;
import com.neu.business.patient.Patient;
import com.neu.business.useraccount.UserAccount;
import com.neu.business.workqueue.ScheduleAppointmentWorkRequest;
import com.neu.business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Soham
 */
public class ManageScheduleJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization doctorOrganization;
    private UserAccount userAccount;

    /**
     * Creates new form ManageScheduleJPanel
     */
    public ManageScheduleJPanel(JPanel userProcessContainer, UserAccount userAccount, DoctorOrganization doctorOrganization) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.doctorOrganization = doctorOrganization;
        this.userAccount = userAccount;

        populateScheduleTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        doctorScheduleJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        doctorScheduleJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Patient ID", "Patient Name", "Scheduled Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctorScheduleJTable);
        if (doctorScheduleJTable.getColumnModel().getColumnCount() > 0) {
            doctorScheduleJTable.getColumnModel().getColumn(0).setResizable(false);
            doctorScheduleJTable.getColumnModel().getColumn(1).setResizable(false);
            doctorScheduleJTable.getColumnModel().getColumn(2).setResizable(false);
            doctorScheduleJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Doctor Schedule");

        backJButton1.setText("<< Back");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backJButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(backJButton1)
                .addContainerGap(195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateScheduleTable() {
        DefaultTableModel model = (DefaultTableModel) doctorScheduleJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            Patient patient = ((ScheduleAppointmentWorkRequest) request).getPatient();
            row[0] = request;
            row[1] = patient.getId();
            row[2] = patient.getName();
            row[3] = request.getRequestDate();
            
            model.addRow(row);

        }
    }


    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JTable doctorScheduleJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
