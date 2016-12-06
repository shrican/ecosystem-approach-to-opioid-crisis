/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.workqueue;

import com.neu.business.enterprise.PharmacyEnterprise;

/**
 *
 * @author Anmol
 */
public class PharmacySupplyWorkRequest extends WorkRequest {
    
    private static int count = 0;
    private int ID;
    private int orderAmount;
    private PharmacyEnterprise pharmacyEnterprise;

    public PharmacyEnterprise getPharmacyEnterprise() {
        return pharmacyEnterprise;
    }

    public void setPharmacyEnterprise(PharmacyEnterprise pharmacyEnterprise) {
        this.pharmacyEnterprise = pharmacyEnterprise;
    }

    public int getID() {
        return ID;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }
    
    
    
}
