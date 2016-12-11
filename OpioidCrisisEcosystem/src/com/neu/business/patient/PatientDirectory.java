/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.patient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Soham
 */
public class PatientDirectory {

    private List<Patient> patientList;
    private ArrayList<Prescription> prescriptionList;

    public PatientDirectory() {
        patientList = new ArrayList<>();
        prescriptionList = new ArrayList<>();
    }

    public ArrayList<Prescription> getPrescriptionList() {
        for (Patient patient : patientList) {
            for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {
                if (prescriptionList.contains(prescription) == false) {
                    prescriptionList.add(prescription);
                }
            }
        }
        return prescriptionList;
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

        float totalPatients = 0; // Total patients in the Ecosystem (var m in Bayesian Algorithm)
        float totalNoOfVisitsForAllPatients = 0; // Total no of of visits for all patients in the Ecosystem 
        float avgVisitsOfAllPatients; // Average Visits of all patients in the Ecosystem (var v in Bayesian Algorithm)
        float currentPatientTotalSymScore = 0; // Total symptom score for current patient(var C in Bayesian Algorithm)*****************c*************
        float avgOpioidSymScoreForAPatient = 0; // Total Opioid Symmptom Score For All Patients
        float totalOpioidAvgScoreForAllPatients = 0; // Average symptom score of all patients in the Ecosystem (var R in Bayesian Algorithm)**************R******************
        float bayesianOpioidAddictionScore = 0;
        float patientCnt = 0;
        // Calculate total no of patients
        for (Patient p : patientList) {
            if (!p.getOpioidAbuseSymptomsHistory().getOpioidAbuseSysmpomsList().isEmpty()) {
                patientCnt++;
                totalNoOfVisitsForAllPatients += p.getPrescriptionHistory().getPrescriptionHistoryList().size();

                avgOpioidSymScoreForAPatient = 0;

                for (OpioidAbuseSymptoms opioidAbuseSymptoms : p.getOpioidAbuseSymptomsHistory().getOpioidAbuseSysmpomsList()) {
                    avgOpioidSymScoreForAPatient += opioidAbuseSymptoms.getOpioidAddictionSymptomScore();
                }

                avgOpioidSymScoreForAPatient /= p.getOpioidAbuseSymptomsHistory().getOpioidAbuseSysmpomsList().size();

                totalOpioidAvgScoreForAllPatients += avgOpioidSymScoreForAPatient;
            }
        }

        totalPatients = patientCnt;

        //*************R****************
        totalOpioidAvgScoreForAllPatients /= patientList.size();

        // Calculate average Visits of all patients ******************************v************************
        avgVisitsOfAllPatients = totalNoOfVisitsForAllPatients / totalPatients;

        // Total symptom score for current patient(var C in Bayesian Algorithm)
        for (OpioidAbuseSymptoms opioidAbuseSymptoms : patient.getOpioidAbuseSymptomsHistory().getOpioidAbuseSysmpomsList()) {
            currentPatientTotalSymScore += opioidAbuseSymptoms.getOpioidAddictionSymptomScore();
        }

        float rv = totalOpioidAvgScoreForAllPatients * avgVisitsOfAllPatients;
        float cm = currentPatientTotalSymScore * totalPatients;
        float vplusm = avgVisitsOfAllPatients + totalPatients;

        float no = (rv + cm) / vplusm;

        if (currentPatientTotalSymScore != 0) {
            // Bayesian weighted rating Algorithm
            bayesianOpioidAddictionScore = (avgVisitsOfAllPatients / (avgVisitsOfAllPatients + totalPatients)) * totalOpioidAvgScoreForAllPatients + (totalPatients / (avgVisitsOfAllPatients + totalPatients)) * currentPatientTotalSymScore;
            patient.setBayesianOpioidAddictionScore(bayesianOpioidAddictionScore);
        }

        return bayesianOpioidAddictionScore;
    }

    /*
        Finds Patient's baysian score wise highest symptoms that patient at each level (low, medium, high) showed
     */
    public void patientScoreStatusWiseHigestAbuseSymptoms() {

        Map<String, Integer> lowBaysianScoreAbuseSymptomCntMap = new HashMap<>();
        Map<String, Integer> mediumBaysianScoreAbuseSymptomCntMap = new HashMap<>();
        Map<String, Integer> highBaysianScoreAbuseSymptomCntMap = new HashMap<>();
        
        int nauseaCount = 0;
        int chestPainCount = 0;
        int pupilaryConstrictionCount = 0;
        int bloodShotEyesCount = 0;
        int jointPainCount = 0;
        int muscleTensionCount = 0;
        int lowRespiratoryRateCount = 0;
        int selfHarmCount = 0;
        int insomniaCount = 0;
        
        
        for (Patient patient : patientList) {
            for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {

            }
        }
    }

}
