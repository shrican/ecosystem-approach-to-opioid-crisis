/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.receptionistrole;

import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.HospitalEnterprise;
import com.neu.business.organization.DoctorOrganization;
import com.neu.business.organization.Organization;
import com.neu.business.organization.ReceptionOrganization;
import com.neu.business.patient.Patient;
import com.neu.business.patient.PatientDirectory;
import com.neu.business.useraccount.UserAccount;
import com.neu.business.workqueue.ScheduleAppointmentWorkRequest;
import com.neu.business.workqueue.WorkQueue;
import com.neu.business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

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
    private PatientDirectory systemPatientDirectory;
    private PatientDirectory hospitalPatientDirectory;

    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ReceptionOrganization organization, HospitalEnterprise enterprise, PatientDirectory patientDirectory) {
        initComponents();
        this.systemPatientDirectory = patientDirectory;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.hospitalPatientDirectory = enterprise.getPatientDirectory();
        populateAppointentsTable(enterprise);
    }

    public void populateAppointentsTable(Enterprise enterprise) {
        DefaultTableModel dtm = (DefaultTableModel) tblAppointments.getModel();
        dtm.setRowCount(0);
        if (enterprise instanceof HospitalEnterprise) {
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof DoctorOrganization) {
                    for (WorkRequest scheduleAppointmentWorkRequest : organization.getWorkQueue().getWorkRequestList()) {

                        Object[] row = new Object[6];

                        if (scheduleAppointmentWorkRequest instanceof ScheduleAppointmentWorkRequest) {
                            Patient patient = ((ScheduleAppointmentWorkRequest) scheduleAppointmentWorkRequest).getPatient();
                            row[0] = ((ScheduleAppointmentWorkRequest) scheduleAppointmentWorkRequest).getId();
                            row[1] = patient;
                            row[2] = patient.getAge();
                            row[3] = patient.getGender();
                            row[4] = scheduleAppointmentWorkRequest.getStatus();
                            row[5] = scheduleAppointmentWorkRequest.getReceiver().getEmployee().getName();
                            dtm.addRow(row);
                        }
                    }
                }
            }
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
        managePatientJButton = new javax.swing.JButton();
        btnScheduleAppointment = new javax.swing.JButton();
        viewPatientDetailsJButton = new javax.swing.JButton();
        btnViewAppointmentDetails = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAppointments = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Reception Work Area");

        managePatientJButton.setText("Manage Patient");
        managePatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientJButtonActionPerformed(evt);
            }
        });

        btnScheduleAppointment.setText("Schedule an appointment");
        btnScheduleAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleAppointmentActionPerformed(evt);
            }
        });

        viewPatientDetailsJButton.setText("View Patient Details");
        viewPatientDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientDetailsJButtonActionPerformed(evt);
            }
        });

        btnViewAppointmentDetails.setText("View Appointment Details");
        btnViewAppointmentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentDetailsActionPerformed(evt);
            }
        });

        tblAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Patient Name", "Age", "Gender", "Appointment Status", "Doctor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAppointments);
        if (tblAppointments.getColumnModel().getColumnCount() > 0) {
            tblAppointments.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblAppointments.getColumnModel().getColumn(2).setPreferredWidth(15);
            tblAppointments.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        btnRefresh.setText("Refresh Table");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel2.setText("Appointment details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnScheduleAppointment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnViewAppointmentDetails))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(managePatientJButton)
                                .addGap(248, 248, 248)
                                .addComponent(viewPatientDetailsJButton))
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPatientDetailsJButton)
                    .addComponent(managePatientJButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnScheduleAppointment)
                    .addComponent(btnViewAppointmentDetails))
                .addGap(40, 40, 40)
                .addComponent(btnRefresh)
                .addContainerGap(335, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void managePatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientJButtonActionPerformed
        // TODO add your handling code here:

        ManagePatientJPanel managePatientJPanel = new ManagePatientJPanel(userProcessContainer, systemPatientDirectory, hospitalPatientDirectory, enterprise);

        userProcessContainer.add("managePatientJPanel", managePatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePatientJButtonActionPerformed

    private void btnScheduleAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleAppointmentActionPerformed
        // TODO add your handling code here:
        ScheduleAppointmentJPanel scheduleAppointmentJPanel = new ScheduleAppointmentJPanel(userProcessContainer, userAccount, enterprise);
        userProcessContainer.add("scheduleAppointmentJPanel", scheduleAppointmentJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnScheduleAppointmentActionPerformed

    private void viewPatientDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientDetailsJButtonActionPerformed
        // TODO add your handling code here:
        Patient patient = (Patient) tblAppointments.getValueAt(tblAppointments.getSelectedRow(), 1);

        PatientDetailsJPanel patientDetailsJPanel = new PatientDetailsJPanel(userProcessContainer, patient, enterprise);
        userProcessContainer.add("patientDetailsJPanel", patientDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewPatientDetailsJButtonActionPerformed

    private void btnViewAppointmentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentDetailsActionPerformed
        // TODO add your handling code here:

        ViewAppointmentDetailsJPanel viewAppointmentDetailsJPanel = new ViewAppointmentDetailsJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("viewAppointmentDetailsJPanel", viewAppointmentDetailsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnViewAppointmentDetailsActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:

        populateAppointentsTable(enterprise);
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnScheduleAppointment;
    private javax.swing.JButton btnViewAppointmentDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton managePatientJButton;
    private javax.swing.JTable tblAppointments;
    private javax.swing.JButton viewPatientDetailsJButton;
    // End of variables declaration//GEN-END:variables

}
