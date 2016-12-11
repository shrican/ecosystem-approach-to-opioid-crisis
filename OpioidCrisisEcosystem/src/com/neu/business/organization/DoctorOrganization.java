/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.organization;

import com.db4o.collections.ActivatableArrayList;
import com.neu.business.patient.Patient;
import com.neu.business.role.DoctorRole;
import com.neu.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Soham
 */
public class DoctorOrganization extends Organization {

    private ArrayList<Patient> doctorRecommendations;

    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
        doctorRecommendations = new ActivatableArrayList<>();
    }

    public ArrayList<Patient> getDoctorRecommendations() {
        return doctorRecommendations;
    }

    public void addRehabRecommendations(Patient patient) {
        doctorRecommendations.add(patient);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
}
