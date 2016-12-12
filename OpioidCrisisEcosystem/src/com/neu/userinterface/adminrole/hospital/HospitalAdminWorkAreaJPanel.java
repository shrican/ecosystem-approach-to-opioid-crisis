/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.adminrole.hospital;

import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.HospitalEnterprise;
import com.neu.business.network.Network;
import com.neu.business.patient.PatientDirectory;
import com.neu.userinterface.systemadminrole.ManageNetworkJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author shrikantmudholkar
 */
public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form adminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private PatientDirectory patientDirectory;
    private Network network;

    public HospitalAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.network = network;

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
        manageHospitalOrgJButton = new javax.swing.JButton();
        manageHospitalEmpJButton = new javax.swing.JButton();
        manageHospitalUsersJButton = new javax.swing.JButton();
        manageHospitalRehabAssoJButton = new javax.swing.JButton();
        btnSymptomsBreakdown = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Admin Work Area");

        manageHospitalOrgJButton.setText("Manage Organization");
        manageHospitalOrgJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHospitalOrgJButtonActionPerformed(evt);
            }
        });

        manageHospitalEmpJButton.setText("Manage Employee");
        manageHospitalEmpJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHospitalEmpJButtonActionPerformed(evt);
            }
        });

        manageHospitalUsersJButton.setText("Manage User Account");
        manageHospitalUsersJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHospitalUsersJButtonActionPerformed(evt);
            }
        });

        manageHospitalRehabAssoJButton.setText("Manage Rehabilitation Association");
        manageHospitalRehabAssoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHospitalRehabAssoJButtonActionPerformed(evt);
            }
        });

        btnSymptomsBreakdown.setText("Symptoms Breakdown");
        btnSymptomsBreakdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSymptomsBreakdownActionPerformed(evt);
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
                    .addComponent(manageHospitalOrgJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageHospitalUsersJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageHospitalRehabAssoJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageHospitalEmpJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSymptomsBreakdown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(616, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(manageHospitalOrgJButton)
                .addGap(70, 70, 70)
                .addComponent(manageHospitalEmpJButton)
                .addGap(70, 70, 70)
                .addComponent(manageHospitalUsersJButton)
                .addGap(70, 70, 70)
                .addComponent(manageHospitalRehabAssoJButton)
                .addGap(70, 70, 70)
                .addComponent(btnSymptomsBreakdown)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, manageHospitalOrgJButton});

    }// </editor-fold>//GEN-END:initComponents

    private void manageHospitalOrgJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHospitalOrgJButtonActionPerformed
        // TODO add your handling code here:

        ManageHospitalOrganizationJPanel manageHospitalOrganizationJPanel = new ManageHospitalOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageHospitalOrganizationJPanel", manageHospitalOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageHospitalOrgJButtonActionPerformed

    private void manageHospitalEmpJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHospitalEmpJButtonActionPerformed
        // TODO add your handling code here:

        if (enterprise.getOrganizationDirectory().getOrganizationList().size() == 0) {
            JOptionPane.showMessageDialog(null, "Cannot create an Employee without creating an Organization", "Error", JOptionPane.ERROR_MESSAGE);
        }

        ManageHospitalEmployeeJPanel manageHospitalEmployeeJPanel = new ManageHospitalEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageHospitalEmployeeJPanel", manageHospitalEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageHospitalEmpJButtonActionPerformed

    private void manageHospitalUsersJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHospitalUsersJButtonActionPerformed
        // TODO add your handling code here:

        if (enterprise.getOrganizationDirectory().getOrganizationList().size() == 0) {
            JOptionPane.showMessageDialog(null, "Cannot create a user account without creating an Organization", "Error", JOptionPane.ERROR_MESSAGE);
        }

        ManageHospitalUserAccountJPanel manageHospitalUserAccountJPanel = new ManageHospitalUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageHospitalUserAccountJPanel", manageHospitalUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageHospitalUsersJButtonActionPerformed

    private void manageHospitalRehabAssoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHospitalRehabAssoJButtonActionPerformed
        // TODO add your handling code here:

        ManageHospitalRehabAssociationJPanel manageHospitalRehabAssociationJPanel = new ManageHospitalRehabAssociationJPanel(userProcessContainer, enterprise, network);
        userProcessContainer.add("manageHospitalRehabAssociationJPanel", manageHospitalRehabAssociationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageHospitalRehabAssoJButtonActionPerformed

    private void btnSymptomsBreakdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSymptomsBreakdownActionPerformed
        // TODO add your handling code here:

        HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) enterprise;

        HospitalReportsJPanel symptomsBreakdown = new HospitalReportsJPanel(userProcessContainer, hospitalEnterprise.getPatientDirectory());
        userProcessContainer.add("SymptomsBreakdownJPanel", symptomsBreakdown);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnSymptomsBreakdownActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSymptomsBreakdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageHospitalEmpJButton;
    private javax.swing.JButton manageHospitalOrgJButton;
    private javax.swing.JButton manageHospitalRehabAssoJButton;
    private javax.swing.JButton manageHospitalUsersJButton;
    // End of variables declaration//GEN-END:variables
}
