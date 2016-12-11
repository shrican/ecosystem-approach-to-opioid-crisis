/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.rehabmanagerrole;

import com.neu.business.patient.OpioidAbuseSymptoms;
import com.neu.business.patient.OpioidWithdrawalSymptoms;
import com.neu.business.patient.Patient;
import com.neu.business.patient.PatientDirectory;
import com.neu.business.patient.Prescription;
import com.neu.business.patient.Symptoms;
import com.neu.userinterface.receptionistrole.ReceptionistWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anmol
 */
public class PatientDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientDetailsJPanel
     */
    private JPanel userProcessContainer;
    private Patient patient;
    private PatientDirectory ecosystemPatientDirectory;

    public PatientDetailsJPanel(JPanel userProcessContainer, Patient patient, PatientDirectory ecosystemPatientDirectory) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        this.ecosystemPatientDirectory = ecosystemPatientDirectory;

        populatePatientDetails();
        populateSymptoms();
        populateAbuseSymptoms();
        populatePrescriptions();
        populateWithdrawalSymptoms();
    }

    public void populatePatientDetails() {
        txtFieldName.setText(patient.getName());
        txtFieldAge.setText(String.valueOf(patient.getAge()));
        txtFieldBloodGroup.setText(patient.getBloodGroup());
        txtFieldGender.setText(patient.getGender());
        txtFieldNumber.setText(patient.getPhoneNo());
    }

    public void populateSymptoms() {
        DefaultTableModel dtm = (DefaultTableModel) tblSymptoms.getModel();
        dtm.setRowCount(0);
        for (Symptoms symptoms : patient.getSymptomsHistory().getSymptomHistory()) {
            Object[] row = new Object[15];
            row[0] = symptoms.isHasLowerBackPain();
            row[1] = symptoms.isHasArthritis();
            row[2] = symptoms.isHasHeadache();
            row[3] = symptoms.isHasMultipleSclerosis();
            row[4] = symptoms.isHasFibromyalgia();
            row[5] = symptoms.isHasShingles();
            row[6] = symptoms.isHasNerveDamage();
            row[7] = symptoms.isHasCancer();
            row[8] = symptoms.isHasInjury();
            row[9] = symptoms.isHasBrokenBones();
            row[10] = symptoms.isHasAbdominalPain();
            row[11] = symptoms.isHasIntestinalDisorder();
            row[12] = symptoms.isHasInfection();
            row[13] = symptoms.isHasSprain();
            row[14] = symptoms.isHasMuscleSpasm();
            dtm.addRow(row);
        }
    }

    public void populateAbuseSymptoms() {
        DefaultTableModel dtm = (DefaultTableModel) tblAbuseSymptoms.getModel();
        dtm.setRowCount(0);

        for (OpioidAbuseSymptoms abuseSymptoms : patient.getOpioidAbuseSymptomsHistory().getOpioidAbuseSysmpomsList()) {
            Object[] row = new Object[9];
            row[0] = abuseSymptoms.hasNausea();
            row[1] = abuseSymptoms.hasChestPain();
            row[2] = abuseSymptoms.hasPupilaryConstriction();
            row[3] = abuseSymptoms.hasBloodshotEyes();
            row[4] = abuseSymptoms.hasJointPain();
            row[5] = abuseSymptoms.hasMuscleTension();
            row[6] = abuseSymptoms.hasLowRespiratoryRate();
            row[7] = abuseSymptoms.hasSelfHarm();
            row[8] = abuseSymptoms.hasInsomnia();
            dtm.addRow(row);
        }
    }

    public void populatePrescriptions() {
        DefaultTableModel dtm = (DefaultTableModel) tblPrescriptionHistory.getModel();
        dtm.setRowCount(0);

        for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {
            Object[] row = new Object[4];
            row[0] = prescription.getOpdDate();
            row[1] = prescription.getDoctorName();
            row[2] = prescription.getChemistName();
            row[3] = prescription.getTotalOpioidsPrescribed();
            dtm.addRow(row);
        }
    }

    public void populateWithdrawalSymptoms() {
        DefaultTableModel dtm = (DefaultTableModel) tblWithdrawalSymptoms.getModel();
        dtm.setRowCount(0);

        for (OpioidWithdrawalSymptoms withdrawalSymptoms : patient.getOpioidWithdrawalSymptomsHistory().getOpioidWithdrawalSymptomsList()) {
            Object[] row = new Object[6];
            row[0] = withdrawalSymptoms.isLowAppetite();
            row[1] = withdrawalSymptoms.isHighBloodPressure();
            row[2] = withdrawalSymptoms.isQuivering();
            row[3] = withdrawalSymptoms.isVomiting();
            row[4] = withdrawalSymptoms.isColdSweat();
            row[5] = withdrawalSymptoms.isEnlargedPupils();
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
        jLabel2 = new javax.swing.JLabel();
        txtFieldName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFieldAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldGender = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFieldBloodGroup = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFieldNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSymptoms = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAbuseSymptoms = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrescriptionHistory = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblWithdrawalSymptoms = new javax.swing.JTable();
        checkBoxLowApetite = new javax.swing.JCheckBox();
        checkBoxHighBloodPressure = new javax.swing.JCheckBox();
        checkBoxQuivering = new javax.swing.JCheckBox();
        checkBoxVomiting = new javax.swing.JCheckBox();
        checkBoxColdSweats = new javax.swing.JCheckBox();
        checkBoxEnlargedPupils = new javax.swing.JCheckBox();
        btnSaveSymptoms = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Patient Details");

        jLabel2.setText("Name :");

        jLabel3.setText("Age :");

        jLabel4.setText("Gender :");

        jLabel5.setText("Blood Group :");

        jLabel6.setText("Number :");

        jLabel7.setText("Symptoms Records :");

        tblSymptoms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Back Pain", "Arthritis", "Headache", "Multiple Sclerosis", "Fibromyalgia", "Shingles", "Nerve Damage", "Cancer", "Injury", "Broken Bones", "Abdominal Pain", "Intestinal Disorder", "Infection", "Sprain", "Muscle Spasm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSymptoms);

        jLabel8.setText("Abuse Symptoms Records :");

        tblAbuseSymptoms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nausea", "Chest Pain", "Pupilary Constriction", "Bloodshot Eyes", "Joint Pain", "Muscle Tension", "Low Respiratory Rate", "Self Harm", "Insomnia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAbuseSymptoms);

        jLabel9.setText("Prescription Records :");

        tblPrescriptionHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Prescribing Doctor", "Pharmacy", "Opioids prescribed"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPrescriptionHistory);

        btnRefresh.setText("Refresh Tables");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel10.setText("Withdrawal Symptoms Records :");

        tblWithdrawalSymptoms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Low Apetite", "High Blood Pressure", "Quivering", "Vomiting", "Cold Sweats", "Enlarged Pupils"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
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
        jScrollPane4.setViewportView(tblWithdrawalSymptoms);

        checkBoxLowApetite.setText("Low Apetite");

        checkBoxHighBloodPressure.setText("High Blood Pressure");

        checkBoxQuivering.setText("Quivering");

        checkBoxVomiting.setText("Vomiting");

        checkBoxColdSweats.setText("Cold Sweats");

        checkBoxEnlargedPupils.setText("Enlarged Pupils");

        btnSaveSymptoms.setText("Save Symptoms");
        btnSaveSymptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSymptomsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(147, 147, 147)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtFieldNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                            .addComponent(txtFieldBloodGroup, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFieldGender, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFieldAge, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFieldName, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnBack)
                                                .addGap(33, 33, 33)
                                                .addComponent(btnRefresh))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(checkBoxLowApetite)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkBoxHighBloodPressure)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkBoxQuivering)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkBoxVomiting)
                                                .addGap(18, 18, 18)
                                                .addComponent(checkBoxColdSweats)))
                                        .addGap(18, 18, 18)
                                        .addComponent(checkBoxEnlargedPupils)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSaveSymptoms)))
                                .addGap(0, 208, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFieldBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxLowApetite)
                    .addComponent(checkBoxHighBloodPressure)
                    .addComponent(checkBoxQuivering)
                    .addComponent(checkBoxVomiting)
                    .addComponent(checkBoxColdSweats)
                    .addComponent(checkBoxEnlargedPupils)
                    .addComponent(btnSaveSymptoms))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRefresh))
                .addGap(308, 308, 308))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        com.neu.userinterface.rehabmanagerrole.RehabManagerWorkAreaJPanel rehabManagerwjp = (RehabManagerWorkAreaJPanel) component;
        rehabManagerwjp.populateRehabTable(ecosystemPatientDirectory);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveSymptomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveSymptomsActionPerformed
        // TODO add your handling code here:
        OpioidWithdrawalSymptoms withdrawalSymptoms = new OpioidWithdrawalSymptoms();
        withdrawalSymptoms.setColdSweat(checkBoxColdSweats.isSelected());
        withdrawalSymptoms.setEnlargedPupils(checkBoxEnlargedPupils.isSelected());
        withdrawalSymptoms.setHighBloodPressure(checkBoxHighBloodPressure.isSelected());
        withdrawalSymptoms.setLowAppetite(checkBoxLowApetite.isSelected());
        withdrawalSymptoms.setQuivering(checkBoxQuivering.isSelected());
        withdrawalSymptoms.setVomiting(checkBoxVomiting.isSelected());

        patient.getOpioidWithdrawalSymptomsHistory().getOpioidWithdrawalSymptomsList().add(withdrawalSymptoms);

        JOptionPane.showMessageDialog(null, patient.getName() + "'s Withdrawal symptoms saved");
        populateWithdrawalSymptoms();

    }//GEN-LAST:event_btnSaveSymptomsActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSaveSymptoms;
    private javax.swing.JCheckBox checkBoxColdSweats;
    private javax.swing.JCheckBox checkBoxEnlargedPupils;
    private javax.swing.JCheckBox checkBoxHighBloodPressure;
    private javax.swing.JCheckBox checkBoxLowApetite;
    private javax.swing.JCheckBox checkBoxQuivering;
    private javax.swing.JCheckBox checkBoxVomiting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblAbuseSymptoms;
    private javax.swing.JTable tblPrescriptionHistory;
    private javax.swing.JTable tblSymptoms;
    private javax.swing.JTable tblWithdrawalSymptoms;
    private javax.swing.JTextField txtFieldAge;
    private javax.swing.JTextField txtFieldBloodGroup;
    private javax.swing.JTextField txtFieldGender;
    private javax.swing.JTextField txtFieldName;
    private javax.swing.JTextField txtFieldNumber;
    // End of variables declaration//GEN-END:variables
}
