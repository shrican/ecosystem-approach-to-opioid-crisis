/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.receptionistrole;

import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.HospitalEnterprise;
import com.neu.business.organization.ReceptionOrganization;
import com.neu.business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shrikantmudholkar
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form receptionistWorkArea
     */
    private JPanel userProcessContainer;
    private ReceptionOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ReceptionOrganization organization, HospitalEnterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        //valueLabel.setText(enterprise.getName());
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
        managePatientJButton = new javax.swing.JButton();
        managePatientJButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scheduleSummaryJTable = new javax.swing.JTable();
        viewPatientDetailsJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Reception Work Area");

        managePatientJButton.setText("Manage Patient");
        managePatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientJButtonActionPerformed(evt);
            }
        });

        managePatientJButton1.setText("Schedule an appointment");
        managePatientJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientJButton1ActionPerformed(evt);
            }
        });

        scheduleSummaryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Patient Name", "Doctor Name", "Status", "Appointment Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(scheduleSummaryJTable);
        if (scheduleSummaryJTable.getColumnModel().getColumnCount() > 0) {
            scheduleSummaryJTable.getColumnModel().getColumn(0).setResizable(false);
            scheduleSummaryJTable.getColumnModel().getColumn(1).setResizable(false);
            scheduleSummaryJTable.getColumnModel().getColumn(2).setResizable(false);
            scheduleSummaryJTable.getColumnModel().getColumn(3).setResizable(false);
            scheduleSummaryJTable.getColumnModel().getColumn(4).setResizable(false);
        }

        viewPatientDetailsJButton.setText("View Patient Details");
        viewPatientDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientDetailsJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(managePatientJButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(managePatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(viewPatientDetailsJButton))
                    .addComponent(jScrollPane1))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {managePatientJButton, managePatientJButton1, viewPatientDetailsJButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(managePatientJButton)
                    .addComponent(viewPatientDetailsJButton))
                .addGap(32, 32, 32)
                .addComponent(managePatientJButton1)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientJButtonActionPerformed
        // TODO add your handling code here:

        ManagePatientJPanel managePatientJPanel = new ManagePatientJPanel(userProcessContainer);
        userProcessContainer.add("managePatientJPanel", managePatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePatientJButtonActionPerformed

    private void managePatientJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientJButton1ActionPerformed
        // TODO add your handling code here:
        ScheduleAppointmentJPanel scheduleAppointmentJPanel = new ScheduleAppointmentJPanel(userProcessContainer, userAccount, enterprise);
        userProcessContainer.add("scheduleAppointmentJPanel", scheduleAppointmentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_managePatientJButton1ActionPerformed

    private void viewPatientDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientDetailsJButtonActionPerformed
        // TODO add your handling code here:
        PatientDetailsJPanel patientDetailsJPanel = new PatientDetailsJPanel();
        userProcessContainer.add("patientDetailsJPanel", patientDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewPatientDetailsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton managePatientJButton;
    private javax.swing.JButton managePatientJButton1;
    private javax.swing.JTable scheduleSummaryJTable;
    private javax.swing.JButton viewPatientDetailsJButton;
    // End of variables declaration//GEN-END:variables
}
