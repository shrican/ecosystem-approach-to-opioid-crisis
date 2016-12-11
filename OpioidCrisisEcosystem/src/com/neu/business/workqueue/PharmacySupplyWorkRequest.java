

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
    private String requesterName;
    private String senderName;
    private boolean hasBeenUpdatedInStock;

    public PharmacySupplyWorkRequest() {
        ID = ++count;
    }

    public boolean isHasBeenUpdatedInStock() {
        return hasBeenUpdatedInStock;
    }

    public void setHasBeenUpdatedInStock(boolean hasBeenUpdatedInStock) {
        this.hasBeenUpdatedInStock = hasBeenUpdatedInStock;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
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
