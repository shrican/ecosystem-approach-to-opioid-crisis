/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.network;

import com.neu.business.enterprise.EnterpriseDirectory;

/**
 *
 * @author Soham
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(String name) {
        enterpriseDirectory = new EnterpriseDirectory();
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    

    @Override
    public String toString() {
        return name;
    }
}
