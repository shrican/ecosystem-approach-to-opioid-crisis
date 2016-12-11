/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.organization;

import com.neu.business.patient.Prescription;
import com.neu.business.role.AdminRole;
import com.neu.business.role.ChemistRole;
import com.neu.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Soham
 */
public class ChemistOrganization extends Organization {

    private int stock;
    private ArrayList<String> stockChangeHistory;
    private ArrayList<Prescription> ordersSold;

    public ChemistOrganization() {
        super(Type.Chemist.getValue());
        stockChangeHistory = new ArrayList<>();
        ordersSold = new ArrayList<>();
    }

    public ArrayList<Prescription> getOrdersSold() {
        return ordersSold;
    }

    public void setOrdersSold(ArrayList<Prescription> ordersSold) {
        this.ordersSold = ordersSold;
    }
    
    public void addOrder(Prescription prescription)
    {
        ordersSold.add(prescription);
    }

    public ArrayList<String> getStockChangeHistory() {
        return stockChangeHistory;
    }

    public void setStockChangeHistory(ArrayList<String> stockChangeHistory) {
        this.stockChangeHistory = stockChangeHistory;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void addOrderSoldPrescription(Prescription prescription){
        ordersSold.add(prescription);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ChemistRole());
        return roles;
    }
}
