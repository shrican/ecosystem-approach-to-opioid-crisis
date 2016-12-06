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

    /*
        Bayesian estimate:
        weighted rating (WR) = (v ÷ (v+m)) × R + (m ÷ (v+m)) × C
     */
    public float calculateBayesianOpioidAddictionScore(Patient patient) {

        float totalPatients = patientList.size(); // Total patients in the Ecosystem (var m in Bayesian Algorithm)
        float totalNoOfVisitsForAllPatients = 0; // Total no of of visits for all patients in the Ecosystem 
        float avgVisitsOfAllPatients; // Average Visits of all patients in the Ecosystem (var v in Bayesian Algorithm)
        float avgSymScoreOfAllPatients; // Average symptom score of all patients in the Ecosystem (var R in Bayesian Algorithm)
        float currentPatientTotalSymScore = 0; // Total symptom score for current patient(var C in Bayesian Algorithm)
        float totalOpioidSymScoreForAllPatients = 0; // Total Opioid Symmptom Score For All Patients

        float bayesianOpioidAddictionScore = 0;

        // Calculate total no of patients
        for (Patient p : patientList) {
            totalNoOfVisitsForAllPatients += p.getPrescriptionHistory().getPrescriptionHistoryList().size();
            totalOpioidSymScoreForAllPatients += p.getOpioidAddictionSymptomScore();
        }

        // Calculate average Visits of all patients
        avgVisitsOfAllPatients = totalNoOfVisitsForAllPatients / totalPatients;

        // Calculate average symptom score of all patients
        avgSymScoreOfAllPatients = totalOpioidSymScoreForAllPatients / totalPatients;

        // Bayesian weighted rating Algorithm
        bayesianOpioidAddictionScore = (avgVisitsOfAllPatients / (avgVisitsOfAllPatients + totalPatients)) * avgSymScoreOfAllPatients + (totalPatients / (avgVisitsOfAllPatients + totalPatients)) * currentPatientTotalSymScore;
        return bayesianOpioidAddictionScore;
    }

}
