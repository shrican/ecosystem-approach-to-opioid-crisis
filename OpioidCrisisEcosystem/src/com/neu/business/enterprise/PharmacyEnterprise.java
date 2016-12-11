/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.enterprise;

import com.neu.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shrikantmudholkar
 */
public class PharmacyEnterprise extends Enterprise {

    int opioidStock;

    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.PharmacyEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public int getOpioidStock() {
        return opioidStock;
    }

    public void setOpioidStock(int opioidStock) {
        this.opioidStock = opioidStock;
    }
}
