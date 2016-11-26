/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.organization;

import java.util.ArrayList;
import java.util.List;
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
