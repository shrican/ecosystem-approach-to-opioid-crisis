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

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.HospitalEnterprise);

        patientDirectory = new PatientDirectory();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

}
