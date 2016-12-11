/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.organization;

import com.neu.business.patient.Patient;
import com.neu.business.patient.PatientDirectory;
import com.neu.business.role.ReceptionistRole;
import com.neu.business.role.RehabilitationManagerRole;
import com.neu.business.role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Soham
 */
public class RehabilitationManagerOrganization extends Organization {

    private PatientDirectory patientDirectory;

    public RehabilitationManagerOrganization() {
        super(Type.RehabilitationManager.getValue());

        patientDirectory = new PatientDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    /*
     * Other addictions caused by opioids abuse
     */
    public HashMap<String, Integer> otherAddictionsCausedByOpioidAbuse() {

        int alcoholAbuseCnt = 0;
        int cannabisAbuseCnt = 0;
        int stimulantAbuseCnt = 0;
        int tobaccoUseCnt = 0;

        for (Patient patient : patientDirectory.getPatientList()) {
            if (patient.getPostOpioidAddiction() != null) {
                if (patient.getPostOpioidAddiction().isAlcoholAbuse()) {
                    alcoholAbuseCnt++;
                }
                if (patient.getPostOpioidAddiction().isCannabisAbuse()) {
                    cannabisAbuseCnt++;
                }
                if (patient.getPostOpioidAddiction().isStimulantAbuse()) {
                    stimulantAbuseCnt++;
                }
                if (patient.getPostOpioidAddiction().isTobaccoUse()) {
                    tobaccoUseCnt++;
                }
            }
        }

        HashMap<String, Integer> otherAddictionsCausedByOpioidAbuseMap = new HashMap<>();
        otherAddictionsCausedByOpioidAbuseMap.put("Alcohol Addiction", alcoholAbuseCnt);
        otherAddictionsCausedByOpioidAbuseMap.put("Cannabis Addiction", cannabisAbuseCnt);
        otherAddictionsCausedByOpioidAbuseMap.put("Stimulant Addiction", stimulantAbuseCnt);
        otherAddictionsCausedByOpioidAbuseMap.put("Tobacco Addiction", tobaccoUseCnt);

        return otherAddictionsCausedByOpioidAbuseMap;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RehabilitationManagerRole());
        return roles;
    }
}
