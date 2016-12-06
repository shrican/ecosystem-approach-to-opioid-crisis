/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.organization;

import com.neu.business.role.ChemistRole;
import com.neu.business.role.PharmaceuticalCompanyManagerRole;
import com.neu.business.role.Role;
import com.neu.business.workqueue.PharmacySupplyWorkRequest;
import com.neu.business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Soham
 */
public class PharmaceuticalCompanyManagerOrganization extends Organization {

    private WorkQueue pharmaWorkQueue;
    
    public PharmaceuticalCompanyManagerOrganization() {
        super(Type.PharmaceuticalCompanyManager.getValue());
        pharmaWorkQueue = new WorkQueue();
    }
    
    public WorkQueue addOpioidsOrder(PharmacySupplyWorkRequest pharmaWorkRequest)
    {
        pharmaWorkQueue.getWorkRequestList().add(pharmaWorkRequest);
        return pharmaWorkQueue;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new PharmaceuticalCompanyManagerRole());
        return roles;
    }
}
