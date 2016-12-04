/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.organization;

import com.neu.business.enterprise.Enterprise;
import java.util.ArrayList;
import com.neu.business.organization.Organization.Type;

/**
 *
 * @author Soham
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public ArrayList<Organization.Type> getRelevantOrganizations(Enterprise enterprise) {
        ArrayList<Organization.Type> relevantOrganizations = new ArrayList<>();
        if(enterprise.getEnterpriseType().getValue().equals("Hospital Enterprise"))
        {
            relevantOrganizations.add(Organization.Type.Doctor);
            relevantOrganizations.add(Organization.Type.Receptionist);
        }
        else if(enterprise.getEnterpriseType().getValue().equals("Pharmacy Enterprise"))
        {
            relevantOrganizations.add(Organization.Type.Chemist);
        }
        else if(enterprise.getEnterpriseType().getValue().equals("Pharmaceutical Company Enterprise"))
        {
            relevantOrganizations.add(Type.PharmaceuticalCompanyManager);
        }
        else if(enterprise.getEnterpriseType().getValue().equals("Drug Enforcement Administration Enterprise"))
        {
            relevantOrganizations.add(Type.DEA);
        }
        else if(enterprise.getEnterpriseType().getValue().equals("Community Rehab Enterprise"))
        {
            relevantOrganizations.add(Type.RehabilitationManager);
        }
        return relevantOrganizations;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Receptionist.getValue())) {
            organization = new ReceptionOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Chemist.getValue())) {
            organization = new ChemistOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.PharmaceuticalCompanyManager.getValue())) {
            organization = new PharmaceuticalCompanyManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DEA.getValue())) {
            organization = new DEAOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.RehabilitationManager.getValue())) {
            organization = new RehabilitationManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Admin.getValue())) {
            organization = new AdminOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
