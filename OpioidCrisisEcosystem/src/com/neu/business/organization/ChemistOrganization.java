/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.organization;

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
    
    public ChemistOrganization() {
        super(Type.Chemist.getValue());
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ChemistRole());
        return roles;
    }
}
