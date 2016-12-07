/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.chemistrole;

import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.PharmaceuticalCompanyEnterprise;
import com.neu.business.enterprise.PharmacyEnterprise;
import com.neu.business.network.Network;
import com.neu.business.organization.ChemistOrganization;
import com.neu.business.organization.Organization;
import com.neu.business.organization.PharmaceuticalCompanyManagerOrganization;
import com.neu.business.useraccount.UserAccount;
import com.neu.business.workqueue.PharmacySupplyWorkRequest;
import com.neu.business.workqueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anmol
 */
public class OrderOpioidsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderOpioidsJPanel
     */
    private JPanel userProcessContainer;
    private ChemistOrganization chemistOrganization;
    private Network network;
    private int futureStock = 0;
    private UserAccount userAccount;

    public OrderOpioidsJPanel(JPanel userProcessContainer, Network network, ChemistOrganization chemistOrganization, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.chemistOrganization = chemistOrganization;
        this.network = network;
        this.userAccount = userAccount;
        populateSupplierComboBox();
        populateCurrentStock();
        populateOrderTable();
        calculateStock();
    }

    public void calculateStock() {

        for (WorkRequest workRequest : chemistOrganization.getWorkQueue().getWorkRequestList()) {
            if (((PharmacySupplyWorkRequest) workRequest).isHasBeenUpdatedInStock() == false) {
                int chemistStock = chemistOrganization.getStock();
                chemistOrganization.setStock(chemistStock + ((PharmacySupplyWorkRequest) workRequest).getOrderAmount());
                ((PharmacySupplyWorkRequest) workRequest).setHasBeenUpdatedInStock(true);
            }
        }

    }

    public void populateCurrentStock() {
        txtFieldCurrentStock.setText(String.valueOf(chemistOrganization.getStock()));
    }

    public void populateSupplierComboBox() {
        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType().getValue().equals("Pharmaceutical Company Enterprise")) {
                comboBoxPharmaceuticalCompanies.addItem(e);
            }
        }
    }

    public void populateOrderTable() {

        DefaultTableModel model = (DefaultTableModel) tblChemistOrderSummary.getModel();

        model.setRowCount(0);
        int count = 0;

        for (WorkRequest workRequest : chemistOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[6];
            row[0] = count++;
            row[1] = ((PharmacySupplyWorkRequest) workRequest).getSenderName();
            row[2] = ((PharmacySupplyWorkRequest) workRequest).getOrderAmount();
            row[3] = workRequest;
            row[4] = workRequest.getRequestDate();
            row[5] = (workRequest.getStatus()).equals("Order Completed") ? workRequest.getResolveDate() : "Processing";

            model.addRow(row);
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
        comboBoxPharmaceuticalCompanies = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtFieldOrderAmount = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFieldCurrentStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChemistOrderSummary = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("Supplier :");

        comboBoxPharmaceuticalCompanies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPharmaceuticalCompaniesActionPerformed(evt);
            }
        });

        jLabel2.setText("Order Amount :");

        btnOrder.setText("Place Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jLabel3.setText("Current Stock :");

        txtFieldCurrentStock.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Order Opioids");

        tblChemistOrderSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Company Name", "Order Quantity", "Status", "Requested Date", "Completed Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblChemistOrderSummary);
        if (tblChemistOrderSummary.getColumnModel().getColumnCount() > 0) {
            tblChemistOrderSummary.getColumnModel().getColumn(0).setResizable(false);
            tblChemistOrderSummary.getColumnModel().getColumn(1).setResizable(false);
            tblChemistOrderSummary.getColumnModel().getColumn(2).setResizable(false);
            tblChemistOrderSummary.getColumnModel().getColumn(3).setResizable(false);
            tblChemistOrderSummary.getColumnModel().getColumn(4).setResizable(false);
            tblChemistOrderSummary.getColumnModel().getColumn(5).setResizable(false);
        }

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxPharmaceuticalCompanies, 0, 185, Short.MAX_VALUE)
                            .addComponent(txtFieldOrderAmount)
                            .addComponent(txtFieldCurrentStock))))
                .addGap(315, 315, 315))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBoxPharmaceuticalCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFieldCurrentStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldOrderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrder)
                    .addComponent(btnBack))
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:

        Enterprise pharmaceuticalCompanyEnterprise = null;
        Organization pharmaceuticalCompanyManagerOrganization = null;

        PharmacySupplyWorkRequest pharmacySupplyWorkRequest = new PharmacySupplyWorkRequest();
        pharmacySupplyWorkRequest.setOrderAmount(Integer.parseInt(txtFieldOrderAmount.getText()));
        pharmacySupplyWorkRequest.setStatus("Opioids Order Pending");
        pharmacySupplyWorkRequest.setSender(userAccount);
        pharmacySupplyWorkRequest.setRequesterName(chemistOrganization.getName());
        pharmacySupplyWorkRequest.setSenderName(comboBoxPharmaceuticalCompanies.getSelectedItem().toString());

        userAccount.getWorkQueue().getWorkRequestList().add(pharmacySupplyWorkRequest);
        chemistOrganization.getWorkQueue().getWorkRequestList().add(pharmacySupplyWorkRequest);

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof PharmaceuticalCompanyEnterprise) {
                pharmaceuticalCompanyEnterprise = enterprise;
                break;
            }

        }

        for (Organization organization : pharmaceuticalCompanyEnterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PharmaceuticalCompanyManagerOrganization) {
                pharmaceuticalCompanyManagerOrganization = organization;
                break;
            }
        }

        if (pharmaceuticalCompanyManagerOrganization != null) {
            pharmaceuticalCompanyManagerOrganization.getWorkQueue().getWorkRequestList().add(pharmacySupplyWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(pharmacySupplyWorkRequest);
            for (UserAccount account : pharmaceuticalCompanyManagerOrganization.getUserAccountDirectory().getUserAccountList()) {
                {
                    account.getWorkQueue().getWorkRequestList().add(pharmacySupplyWorkRequest);
                    pharmacySupplyWorkRequest.setReceiver(account);

                }
            }
        }

        populateOrderTable();
    }//GEN-LAST:event_btnOrderActionPerformed

    private void comboBoxPharmaceuticalCompaniesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPharmaceuticalCompaniesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPharmaceuticalCompaniesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton backJButton2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<Object> comboBoxPharmaceuticalCompanies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblChemistOrderSummary;
    private javax.swing.JTextField txtFieldCurrentStock;
    private javax.swing.JTextField txtFieldOrderAmount;
    // End of variables declaration//GEN-END:variables
}
