/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface.chemistrole;

import com.neu.business.EcoSystem;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.PharmaceuticalCompanyEnterprise;
import com.neu.business.enterprise.PharmacyEnterprise;
import com.neu.business.network.Network;
import com.neu.business.organization.ChemistOrganization;
import com.neu.business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Soham
 */
public class ChemistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ChemistWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private ChemistOrganization organization;
    private PharmacyEnterprise enterprise;
    private EcoSystem system;
    
    public ChemistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ChemistOrganization organization, PharmacyEnterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        
        populateStock();
    }
    
    public void populateStock()
    {
         txtFieldChemistStock.setText(String.valueOf(organization.getStock()));
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
        txtFieldChemistStock = new javax.swing.JTextField();
        btnOrderOpioids = new javax.swing.JButton();
        btnSellOpioids = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Chemist Work Area");

        jLabel2.setText("Stock remaining: ");

        btnOrderOpioids.setText("Order Opioids");
        btnOrderOpioids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderOpioidsActionPerformed(evt);
            }
        });

        btnSellOpioids.setText("Sell Opioids");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(716, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFieldChemistStock, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSellOpioids)
                        .addGap(140, 140, 140)
                        .addComponent(btnOrderOpioids)))
                .addGap(320, 320, 320))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFieldChemistStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSellOpioids)
                    .addComponent(btnOrderOpioids))
                .addContainerGap(384, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderOpioidsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderOpioidsActionPerformed
        // TODO add your handling code here:
        
        Network currentNetwork;
        PharmaceuticalCompanyEnterprise pharmaEnterprise = new PharmaceuticalCompanyEnterprise("Pharmaceutical Company Enterprise");
        
        for(Network network : system.getNetworkList())
        {
            for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(e.getName().equals(enterprise.getName()))
                {
                    currentNetwork = network;// getting which network the current chemist and pharmaceutical company are in
                    
                    if(e instanceof PharmaceuticalCompanyEnterprise)
                        pharmaEnterprise = (PharmaceuticalCompanyEnterprise) e;
                    OrderOpioidsJPanel orderOpioidsJPanel = new OrderOpioidsJPanel(userProcessContainer, pharmaEnterprise, enterprise, organization, currentNetwork, userAccount);
                    userProcessContainer.add("OrderOpioidsJPanel", orderOpioidsJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        }
  
        
        
    }//GEN-LAST:event_btnOrderOpioidsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderOpioids;
    private javax.swing.JButton btnSellOpioids;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtFieldChemistStock;
    // End of variables declaration//GEN-END:variables
}
