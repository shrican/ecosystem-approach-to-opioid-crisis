/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.network;

import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.PharmaceuticalCompanyEnterprise;
import com.neu.business.enterprise.EnterpriseDirectory;
import com.neu.business.organization.Organization;
import com.neu.business.organization.PharmaceuticalCompanyManagerOrganization;
import com.neu.business.useraccount.UserAccount;
import com.neu.business.workqueue.PharmacySupplyWorkRequest;
import com.neu.business.workqueue.WorkRequest;

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
