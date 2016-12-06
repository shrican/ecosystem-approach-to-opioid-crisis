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
import com.neu.business.organization.PharmaceuticalCompanyManagerOrganization;
import com.neu.business.workqueue.PharmacySupplyWorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Anmol
 */
public class OrderOpioidsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderOpioidsJPanel
     */
    
    private JPanel userProcessContainer;
    private PharmacyEnterprise enterprise;
    private ChemistOrganization organization;
    private Network network;
    private int futureStock = 0;
    
    public OrderOpioidsJPanel(JPanel userProcessContainer, PharmacyEnterprise enterprise, ChemistOrganization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        populateSupplierComboBox();
        populateCurrentStock();
    }
    
    public void populateCurrentStock()
    {
        txtFieldCurrentStock.setText(String.valueOf(organization.getStock()));
    }
    
    public void populateSupplierComboBox()
    {
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList())
        {
            if(e.getEnterpriseType().getValue().equals("Pharmaceutical Company Enterprise"))
            {
                comboBoxPharmaceuticalCompanies.addItem(e.toString());
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
        comboBoxPharmaceuticalCompanies = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtFieldOrderAmount = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtFieldCurrentStock = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFieldFutureStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCheckFuture = new javax.swing.JButton();

        jLabel1.setText("Supplier :");

        comboBoxPharmaceuticalCompanies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Order Amount :");

        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jLabel3.setText("Current Stock :");

        txtFieldCurrentStock.setEditable(false);

        jLabel4.setText("Stock after receival :");

        txtFieldFutureStock.setEditable(false);

        jLabel5.setText("Order Opioids");

        btnCheckFuture.setText("Check");
        btnCheckFuture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckFutureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxPharmaceuticalCompanies, 0, 185, Short.MAX_VALUE)
                            .addComponent(txtFieldOrderAmount)
                            .addComponent(txtFieldCurrentStock)
                            .addComponent(txtFieldFutureStock))
                        .addGap(63, 63, 63)
                        .addComponent(btnCheckFuture))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(btnOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel5)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
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
                    .addComponent(jLabel4)
                    .addComponent(txtFieldFutureStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckFuture))
                .addGap(55, 55, 55)
                .addComponent(btnOrder)
                .addContainerGap(276, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckFutureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckFutureActionPerformed
        // TODO add your handling code here:
        
        if(txtFieldOrderAmount.equals(""))
            JOptionPane.showMessageDialog(null, "Enter order amount", "Warning", JOptionPane.WARNING_MESSAGE);
        else
            txtFieldFutureStock.setText(String.valueOf(Integer.parseInt(txtFieldCurrentStock.getText()+Integer.parseInt(txtFieldOrderAmount.getText()))));
    }//GEN-LAST:event_btnCheckFutureActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        
        PharmacySupplyWorkRequest pharmacySupplyWorkRequest = new PharmacySupplyWorkRequest();
        pharmacySupplyWorkRequest.setOrderAmount(Integer.parseInt(txtFieldOrderAmount.getText()));
        
        PharmaceuticalCompanyManagerOrganization pharmaManager = (PharmaceuticalCompanyManagerOrganization) enterprise.getOrganizationDirectory().getOrganizationList().get(0);
        pharmacySupplyWorkRequest.setMessage("Opioids Order Pending");
        pharmacySupplyWorkRequest.setPharmacyEnterprise(enterprise);
        pharmaManager.getWorkQueue().getWorkRequestList().add(pharmacySupplyWorkRequest);
        enterprise.getWorkQueue().getWorkRequestList().add(pharmacySupplyWorkRequest);
    }//GEN-LAST:event_btnOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckFuture;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<String> comboBoxPharmaceuticalCompanies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtFieldCurrentStock;
    private javax.swing.JTextField txtFieldFutureStock;
    private javax.swing.JTextField txtFieldOrderAmount;
    // End of variables declaration//GEN-END:variables
}
