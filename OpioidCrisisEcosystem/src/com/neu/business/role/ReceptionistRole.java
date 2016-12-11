/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.role;

import com.neu.business.EcoSystem;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.HospitalEnterprise;
import com.neu.business.network.Network;
import com.neu.business.organization.Organization;
import com.neu.business.organization.ReceptionOrganization;
import com.neu.business.useraccount.UserAccount;
import com.neu.userinterface.receptionistrole.ReceptionistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shrikantmudholkar
 */
public class ReceptionistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new ReceptionistWorkAreaJPanel(userProcessContainer, account, (ReceptionOrganization) organization, (HospitalEnterprise) enterprise, system.getPatientDirectory());
    }

}
