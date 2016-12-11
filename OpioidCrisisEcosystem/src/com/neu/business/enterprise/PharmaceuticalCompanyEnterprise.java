/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.enterprise;

import com.neu.business.opioids.Opioids;
import com.neu.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shrikantmudholkar
 */
public class PharmaceuticalCompanyEnterprise extends Enterprise {

    private int stock;
    private String opioidName;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getOpioidName() {
        return opioidName;
    }

    public void setOpioidName(String opioidName) {
        this.opioidName = opioidName;
    }

    public PharmaceuticalCompanyEnterprise(String name) {
        super(name, EnterpriseType.PharmaceuticalCompanyEnterprise);
        stock = 5000;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
