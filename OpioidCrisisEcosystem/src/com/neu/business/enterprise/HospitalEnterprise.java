/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.enterprise;

import com.neu.business.patient.Patient;
import com.neu.business.patient.PatientDirectory;
import com.neu.business.patient.Symptoms;
import com.neu.business.role.Role;
import java.util.ArrayList;
import java.util.HashMap;

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
    
    public void symptomsBreakdown(PatientDirectory patientDirectory)
    {
        //Breakdown of diagnosed symptoms, which symptoms were seen in patients how many times
        ArrayList<Patient> diagnosedPatients = new ArrayList<>();
        
        for(Patient patient : patientDirectory.getPatientList())
        {
            if(patient.getPrescriptionHistory().getPrescriptionHistoryList().size() > 0)
                diagnosedPatients.add(patient);
        }
        
        int lowerBackPainCount = 0;
        int arthritisCount = 0;
        int headacheCount = 0;
        int multipleSclerosisCount = 0;
        int fibromyalgiaCount = 0;
        int shinglesCount = 0;
        int nerveDamageCount = 0;
        int cancerCount = 0;
        int injuryCount = 0;
        int brokenBonesCount = 0;
        int abdominalPainCount = 0;
        int intestinalDisorderCount = 0;
        int infectionCount = 0;
        int sprainCount = 0;
        int muscleSpasmCount = 0;
        
        for(Patient diagnosedPatient : diagnosedPatients)
        {
            for(Symptoms symptoms : diagnosedPatient.getSymptomsHistory().getSymptomHistory())
            {
                if(symptoms.isHasAbdominalPain())
                    abdominalPainCount++;
                if(symptoms.isHasArthritis())
                    arthritisCount++;
                if(symptoms.isHasBrokenBones())
                    brokenBonesCount++;
                if(symptoms.isHasCancer())
                    cancerCount++;
                if(symptoms.isHasFibromyalgia())
                    fibromyalgiaCount++;
                if(symptoms.isHasHeadache())
                    headacheCount++;
                if(symptoms.isHasInfection())
                    infectionCount++;
                if(symptoms.isHasInjury())
                    injuryCount++;
                if(symptoms.isHasIntestinalDisorder())
                    intestinalDisorderCount++;
                if(symptoms.isHasLowerBackPain())
                    lowerBackPainCount++;
                if(symptoms.isHasMultipleSclerosis())
                    multipleSclerosisCount++;
                if(symptoms.isHasMuscleSpasm())
                    muscleSpasmCount++;
                if(symptoms.isHasNerveDamage())
                    nerveDamageCount++;
                if(symptoms.isHasShingles())
                    shinglesCount++;
                if(symptoms.isHasSprain())
                    sprainCount++;
            }
        }
        
        HashMap<String, Integer> symptomsBreakdown = new HashMap<>();
        symptomsBreakdown.put("Abdominal Pain Count", abdominalPainCount);
        symptomsBreakdown.put("Arthritis Count", arthritisCount);
        symptomsBreakdown.put("Broken Bones Count", brokenBonesCount);
        symptomsBreakdown.put("Cancer Count", cancerCount);
        symptomsBreakdown.put("Fibromyalgia Count", fibromyalgiaCount);
        symptomsBreakdown.put("Headache Count", headacheCount);
        symptomsBreakdown.put("Infection Count", infectionCount);
        symptomsBreakdown.put("Injury Count", injuryCount);
        symptomsBreakdown.put("Intestinal Disorder", intestinalDisorderCount);
        symptomsBreakdown.put("Lower Back Pain Count", lowerBackPainCount);
        symptomsBreakdown.put("Multiple Sclerosis Count", multipleSclerosisCount);
        symptomsBreakdown.put("Nerve Damage Count", nerveDamageCount);
        symptomsBreakdown.put("Shingles Count", shinglesCount);
        symptomsBreakdown.put("Sprain Count", sprainCount);
    }

}
