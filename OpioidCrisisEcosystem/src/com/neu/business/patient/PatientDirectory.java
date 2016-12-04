/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soham
 */
public class PatientDirectory {

    private List<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public Patient addPatient() {
        Patient patient = new Patient();
        patientList.add(patient);
        return patient;
    }

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }
}
