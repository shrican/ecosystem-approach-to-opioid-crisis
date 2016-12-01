/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.role;

import com.neu.business.EcoSystem;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.HospitalEnterprise;
import com.neu.business.organization.Organization;
import com.neu.business.organization.DoctorOrganization;
import com.neu.business.useraccount.UserAccount;
import com.neu.userinterface.doctorrole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shrikantmudholkar
 */
public class DoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, account, (DoctorOrganization)organization, (HospitalEnterprise)enterprise);
    }
    
}
