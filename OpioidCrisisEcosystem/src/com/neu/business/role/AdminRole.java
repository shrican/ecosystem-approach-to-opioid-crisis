/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.role;

import com.neu.business.EcoSystem;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.organization.Organization;
import com.neu.business.useraccount.UserAccount;
import com.neu.userinterface.adminrole.hospital.HospitalAdminWorkAreaJPanel;
import com.neu.userinterface.adminrole.pharmacy.PharmacyAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shrikantmudholkar
 */
public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {

        if (enterprise.getEnterpriseType().getValue() == "Hospital Enterprise") {
            return new HospitalAdminWorkAreaJPanel(userProcessContainer, enterprise);
        } 
        
        else if (enterprise.getEnterpriseType().getValue() == "Pharmacy Enterprise") {
            return new PharmacyAdminWorkAreaJPanel(userProcessContainer, enterprise);
        }
        
        return null;
    }
}
