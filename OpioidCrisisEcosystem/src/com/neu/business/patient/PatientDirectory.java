/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.patient;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.HashSet;

import java.util.HashSet;

import java.util.List;

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

    public HashMap<String, Integer> generalSymptomsBreakdown(ArrayList<Patient> patientList) {
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
            for (OpioidAbuseSymptoms abuseSymptoms : patient.getOpioidAbuseSymptomsHistory().getOpioidAbuseSysmpomsList()) {
                if (abuseSymptoms.hasBloodshotEyes()) {
                    bloodShotEyesCount++;
                }
                if (abuseSymptoms.hasChestPain()) {
                    chestPainCount++;
                }
                if (abuseSymptoms.hasInsomnia()) {
                    insomniaCount++;
                }
                if (abuseSymptoms.hasJointPain()) {
                    jointPainCount++;
                }
                if (abuseSymptoms.hasLowRespiratoryRate()) {
                    lowRespiratoryRateCount++;
                }
                if (abuseSymptoms.hasMuscleTension()) {
                    muscleTensionCount++;
                }
                if (abuseSymptoms.hasNausea()) {
                    nauseaCount++;
                }
                if (abuseSymptoms.hasPupilaryConstriction()) {
                    pupilaryConstrictionCount++;
                }
                if (abuseSymptoms.hasSelfHarm()) {
                    selfHarmCount++;
                }
            }
        }

        HashMap<String, Integer> breakdown = new HashMap<>();

        breakdown.put("Nausea count", nauseaCount);
        breakdown.put("Chest Pain count", chestPainCount);
        breakdown.put("Pupilary Constriction count", pupilaryConstrictionCount);
        breakdown.put("Bloodshot Eyes count", bloodShotEyesCount);
        breakdown.put("Joint Pain count", jointPainCount);
        breakdown.put("Muscle Tension count", muscleTensionCount);
        breakdown.put("Low Respiratory Rate count", lowRespiratoryRateCount);
        breakdown.put("Self Harm Count", selfHarmCount);
        breakdown.put("Insomnia count", insomniaCount);

        return breakdown;
    }

    public HashMap<String, Integer> mostDoctorPrescriptions() {
        String mostPrescribingDoctor = "";

        int prescriptions = 0;

        HashSet<String> doctorName = new HashSet<>();

        int mostPrescriptions = 0;

        HashMap<String, Integer> mostPrescriptionsDoctorMap = new HashMap<>();
        for (Patient patient : patientList) {

            for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {

                doctorName.add(prescription.getDoctorName());

            }

        }
        for (String doctor : doctorName) {

            prescriptions = 0;

            for (Patient patient : patientList) {

                for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {

                    if (prescription.getDoctorName().equals(doctor)) {
                        prescriptions++;
                    }

                }

            }

            mostPrescriptionsDoctorMap.put(doctor, prescriptions);

            if (prescriptions > mostPrescriptions) {

                mostPrescriptions = prescriptions;

                mostPrescribingDoctor = doctor;

            }

        }
        return mostPrescriptionsDoctorMap;
    }

    public HashMap<String, Integer> fraudDoctorReport() {

        int badPrescriptions = 0;
        HashSet<String> doctorName = new HashSet<>();

        HashMap<String, Integer> fraudDoctorMap = new HashMap<>();
        for (Patient patient : patientList) {

            for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {

                if (prescription.getPatientScoreStatus().equals("High")) {

                    doctorName.add(prescription.getDoctorName());

                }
            }

        }
        for (String doctor : doctorName) {

            badPrescriptions = 0;

            for (Patient patient : patientList) {

                for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {

                    if (prescription.getPatientScoreStatus().equals("High") && prescription.getDoctorName().equals(doctor)) {
                        badPrescriptions++;

                    }

                }
            }

            fraudDoctorMap.put(doctor, badPrescriptions);
        }

        return fraudDoctorMap;
    }

    public HashMap<String, Integer> popularChemist() {
        int prescriptionCount;

        HashSet<String> chemistName = new HashSet<>();

        HashMap<String, Integer> mostSellingChemistMap = new HashMap<>();

        for (Patient patient : patientList) {

            if (patient.getRehabStatus().equals("Sent to rehab") || patient.getRehabStatus().equals("Rehab recommended")) {

                for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {

                    if (prescription.isFulfilled()) {

                        chemistName.add(prescription.getChemistName());

                    }

                }
            }
        }
        for (String chemist : chemistName) {
            prescriptionCount = 0;
            for (Patient patient : patientList) {
                for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {
                    if (prescription.getChemistName().equals(chemist)) {

                        prescriptionCount++;

                    }
                }
            }
            mostSellingChemistMap.put(chemist, prescriptionCount);//            if (prescriptions > mostPrescriptions) {

//
//                mostPrescriptions = prescriptions;
//
//                mostPrescribingDoctor = doctor;
//
//            }
        }

        return mostSellingChemistMap;

    }

    public HashMap<String, Integer> mostPrescribedSymptom() {

        int lowerBackPainOpioids = 0;
        int arthritisOpioids = 0;
        int headacheOpioids = 0;
        int multipleSclerosisOpioids = 0;
        int fibromyalgiaOpioids = 0;
        int shinglesOpioids = 0;
        int nerveDamageOpioids = 0;
        int cancerOpioids = 0;
        int injuryOpioids = 0;
        int brokenBonesOpioids = 0;
        int abdominalPainOpioids = 0;
        int intestinalDisorderOpioids = 0;
        int infectionOpioids = 0;
        int sprainOpioids = 0;
        int muscleSpasmOpioids = 0;

        for (Patient patient : patientList) {

            for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {
                Symptoms diagnosis = prescription.getSymptoms();

                if (diagnosis.isHasAbdominalPain()) {
                    abdominalPainOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasArthritis()) {
                    arthritisOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasBrokenBones()) {
                    brokenBonesOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasCancer()) {
                    cancerOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasFibromyalgia()) {
                    fibromyalgiaOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasHeadache()) {
                    headacheOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasInfection()) {
                    infectionOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasInjury()) {
                    injuryOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasIntestinalDisorder()) {
                    intestinalDisorderOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasLowerBackPain()) {
                    lowerBackPainOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasMultipleSclerosis()) {
                    multipleSclerosisOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasMuscleSpasm()) {
                    muscleSpasmOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasNerveDamage()) {
                    nerveDamageOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasShingles()) {
                    shinglesOpioids += prescription.getTotalOpioidsPrescribed();
                }
                if (diagnosis.isHasSprain()) {
                    sprainOpioids += prescription.getTotalOpioidsPrescribed();
                }
            }
        }

        HashMap<String, Integer> symptomsPrescription = new HashMap<>();
        symptomsPrescription.put("Abdominal Pain Count", abdominalPainOpioids);
        symptomsPrescription.put("Arthritis Count", arthritisOpioids);
        symptomsPrescription.put("Broken Bones Count", brokenBonesOpioids);
        symptomsPrescription.put("Cancer Count", cancerOpioids);
        symptomsPrescription.put("Fibromyalgia Count", fibromyalgiaOpioids);
        symptomsPrescription.put("Headache Count", headacheOpioids);
        symptomsPrescription.put("Infection Count", infectionOpioids);
        symptomsPrescription.put("Injury Count", injuryOpioids);
        symptomsPrescription.put("Intestinal Disorder", intestinalDisorderOpioids);
        symptomsPrescription.put("Lower Back Pain Count", lowerBackPainOpioids);
        symptomsPrescription.put("Multiple Sclerosis Count", multipleSclerosisOpioids);
        symptomsPrescription.put("Muscle Spasm Count", muscleSpasmOpioids);
        symptomsPrescription.put("Nerve Damage Count", nerveDamageOpioids);
        symptomsPrescription.put("Shingles Count", shinglesOpioids);
        symptomsPrescription.put("Sprain Count", sprainOpioids);

        return symptomsPrescription;

    }

}
