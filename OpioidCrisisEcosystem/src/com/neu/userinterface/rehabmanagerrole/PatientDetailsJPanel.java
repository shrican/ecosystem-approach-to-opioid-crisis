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

        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAbuseSymptoms = new javax.swing.JTable();
        checkBoxQuivering = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblWithdrawalSymptoms = new javax.swing.JTable();
        checkBoxHighBloodPressure = new javax.swing.JCheckBox();
        checkBoxVomiting = new javax.swing.JCheckBox();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSymptoms = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrescriptionHistory = new javax.swing.JTable();
        checkBoxColdSweats = new javax.swing.JCheckBox();
        checkBoxEnlargedPupils = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        txtFieldGender = new javax.swing.JTextField();
        txtFieldBloodGroup = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFieldName = new javax.swing.JTextField();
        txtFieldNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        checkBoxAlcohol = new javax.swing.JCheckBox();
        checkBoxStimulant = new javax.swing.JCheckBox();
        checkBoxTobacco = new javax.swing.JCheckBox();
        checkBoxCannabis = new javax.swing.JCheckBox();
        btnSaveOtherAddictions = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSaveSymptoms = new javax.swing.JButton();
        checkBoxLowApetite = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Abuse Symptoms Records :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 497, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Patient Details");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

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

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 535, 1289, 107));

        checkBoxQuivering.setText("Quivering");
        jPanel3.add(checkBoxQuivering, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 986, -1, -1));

        jLabel7.setText("Symptoms Records :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 337, -1, -1));

        jLabel9.setText("Prescription Records :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 660, -1, -1));

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

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 861, 1289, 107));

        checkBoxHighBloodPressure.setText("High Blood Pressure");
        jPanel3.add(checkBoxHighBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 986, -1, -1));

        checkBoxVomiting.setText("Vomiting");
        jPanel3.add(checkBoxVomiting, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 986, -1, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 1033, -1, -1));

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 373, 1289, 102));

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

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 698, 1289, 107));

        checkBoxColdSweats.setText("Cold Sweats");
        jPanel3.add(checkBoxColdSweats, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 986, -1, -1));

        checkBoxEnlargedPupils.setText("Enlarged Pupils");
        jPanel3.add(checkBoxEnlargedPupils, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 986, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Patient Details"));

        jLabel3.setText("Age :");

        jLabel2.setText("Name :");

        jLabel5.setText("Blood Group :");

        jLabel6.setText("Number :");

        jLabel4.setText("Gender :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFieldNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addComponent(txtFieldBloodGroup, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldGender, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldAge, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldName, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFieldBloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 54, 660, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Other Addictions Caused by Opioids"));

        checkBoxAlcohol.setText("Alcohol Addiction");
        checkBoxAlcohol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxAlcoholActionPerformed(evt);
            }
        });

        checkBoxStimulant.setText("Stimulant Addiction");
        checkBoxStimulant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxStimulantActionPerformed(evt);
            }
        });

        checkBoxTobacco.setText("Tobacco Addiction");
        checkBoxTobacco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTobaccoActionPerformed(evt);
            }
        });

        checkBoxCannabis.setText("Cannabis Addiction");

        btnSaveOtherAddictions.setText("Save other Addictions");
        btnSaveOtherAddictions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveOtherAddictionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxStimulant, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxCannabis, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBoxAlcohol, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkBoxTobacco, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSaveOtherAddictions, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSaveOtherAddictions, checkBoxAlcohol, checkBoxCannabis, checkBoxStimulant, checkBoxTobacco});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxCannabis)
                    .addComponent(checkBoxTobacco))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxStimulant)
                    .addComponent(checkBoxAlcohol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaveOtherAddictions)
                .addGap(30, 30, 30))
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 54, 620, 263));

        btnRefresh.setText("Refresh Tables");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel3.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 1033, -1, -1));

        jLabel10.setText("Withdrawal Symptoms Records :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 823, -1, -1));

        btnSaveSymptoms.setText("Save Symptoms");
        btnSaveSymptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveSymptomsActionPerformed(evt);
            }
        });
        jPanel3.add(btnSaveSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 986, -1, -1));

        checkBoxLowApetite.setText("Low Apetite");
        jPanel3.add(checkBoxLowApetite, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 986, -1, -1));

        jScrollPane5.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1319, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
                .addGap(66, 66, 66))
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

    private void checkBoxTobaccoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxTobaccoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxTobaccoActionPerformed

    private void checkBoxAlcoholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxAlcoholActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxAlcoholActionPerformed

    private void btnSaveOtherAddictionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveOtherAddictionsActionPerformed
        // TODO add your handling code here:

        patient.getPostOpioidAddiction().setAlcoholAbuse(checkBoxAlcohol.isSelected());
        patient.getPostOpioidAddiction().setCannabisAbuse(checkBoxCannabis.isSelected());
        patient.getPostOpioidAddiction().setStimulantAbuse(checkBoxStimulant.isSelected());
        patient.getPostOpioidAddiction().setTobaccoUse(checkBoxTobacco.isSelected());

        JOptionPane.showMessageDialog(null, "Addictions caused by opioids updatded!");

    }//GEN-LAST:event_btnSaveOtherAddictionsActionPerformed

    private void checkBoxStimulantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxStimulantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxStimulantActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSaveOtherAddictions;
    private javax.swing.JButton btnSaveSymptoms;
    private javax.swing.JCheckBox checkBoxAlcohol;
    private javax.swing.JCheckBox checkBoxCannabis;
    private javax.swing.JCheckBox checkBoxColdSweats;
    private javax.swing.JCheckBox checkBoxEnlargedPupils;
    private javax.swing.JCheckBox checkBoxHighBloodPressure;
    private javax.swing.JCheckBox checkBoxLowApetite;
    private javax.swing.JCheckBox checkBoxQuivering;
    private javax.swing.JCheckBox checkBoxStimulant;
    private javax.swing.JCheckBox checkBoxTobacco;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
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
