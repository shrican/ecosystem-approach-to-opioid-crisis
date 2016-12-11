/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.enterprise;

import com.neu.business.patient.PatientDirectory;
import com.neu.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shrikantmudholkar
 */
public class HospitalEnterprise extends Enterprise {

    private PatientDirectory patientDirectory;
    private ArrayList<CommunityRehabEnterprise> associatedCommRehabList;

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.HospitalEnterprise);
        patientDirectory = new PatientDirectory();
        associatedCommRehabList = new ArrayList<>();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public ArrayList<CommunityRehabEnterprise> getAssociatedCommRehabList() {
        return associatedCommRehabList;
    }

    public void setAssociatedCommRehabList(ArrayList<CommunityRehabEnterprise> associatedCommRehabList) {
        this.associatedCommRehabList = associatedCommRehabList;
    }

    public void addAssociatedRehabilitation(CommunityRehabEnterprise enterprise) {
        associatedCommRehabList.add(enterprise);
    }

}
