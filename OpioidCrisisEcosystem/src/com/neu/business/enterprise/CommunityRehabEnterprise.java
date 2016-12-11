/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.enterprise;

import com.neu.business.patient.OpioidAbuseSymptoms;
import com.neu.business.patient.Patient;
import com.neu.business.patient.PatientDirectory;
import com.neu.business.role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author shrikantmudholkar
 */
public class CommunityRehabEnterprise extends Enterprise {

    public CommunityRehabEnterprise(String name) {
        super(name, EnterpriseType.CommunityRehabEnterprise);

    }
    
    public HashMap<String, Integer> generalSymptomsBreakdown(ArrayList<Patient> patientList)
    {
        int nauseaCount = 0;
        int chestPainCount = 0;
        int pupilaryConstrictionCount = 0;
        int bloodShotEyesCount = 0;
        int jointPainCount = 0;
        int muscleTensionCount = 0;
        int lowRespiratoryRateCount = 0;
        int selfHarmCount = 0;
        int insomniaCount = 0;
        
        for(Patient patient : patientList)
        {
            for(OpioidAbuseSymptoms abuseSymptoms : patient.getOpioidAbuseSymptomsHistory().getOpioidAbuseSysmpomsList())
            {
                if(abuseSymptoms.hasBloodshotEyes())
                    bloodShotEyesCount++;
                if(abuseSymptoms.hasChestPain())
                    chestPainCount++;
                if(abuseSymptoms.hasInsomnia())
                    insomniaCount++;
                if(abuseSymptoms.hasJointPain())
                    jointPainCount++;
                if(abuseSymptoms.hasLowRespiratoryRate())
                    lowRespiratoryRateCount++;
                if(abuseSymptoms.hasMuscleTension())
                    muscleTensionCount++;
                if(abuseSymptoms.hasNausea())
                    nauseaCount++;
                if(abuseSymptoms.hasPupilaryConstriction())
                    pupilaryConstrictionCount++;
                if(abuseSymptoms.hasSelfHarm())
                    selfHarmCount++;
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
    
    public void abuseSymptomsBreakdown(PatientDirectory patientDirectory)
    {
        //Breakdown of abuse symptoms for patients, which symptoms were seen how many times
        ArrayList<Patient> addictedPatients = new ArrayList<>();
        for(Patient patient : patientDirectory.getPatientList())
        {
            if((patient.getRehabStatus().equals("Sent to rehab")) || (patient.getRehabStatus().equals("Rehab recommended")))
            {
                addictedPatients.add(patient);
            }
        }
        int nauseaCount = 0;
        int chestPainCount = 0;
        int pupilaryConstrictionCount = 0;
        int bloodShotEyesCount = 0;
        int jointPainCount = 0;
        int muscleTensionCount = 0;
        int lowRespiratoryRateCount = 0;
        int selfHarmCount = 0;
        int insomniaCount = 0;
        
        for(Patient addictedPatient : addictedPatients)
        {
            for(OpioidAbuseSymptoms abuseSymptoms : addictedPatient.getOpioidAbuseSymptomsHistory().getOpioidAbuseSysmpomsList())
            {
                if(abuseSymptoms.hasBloodshotEyes())
                    bloodShotEyesCount++;
                if(abuseSymptoms.hasChestPain())
                    chestPainCount++;
                if(abuseSymptoms.hasInsomnia())
                    insomniaCount++;
                if(abuseSymptoms.hasJointPain())
                    jointPainCount++;
                if(abuseSymptoms.hasLowRespiratoryRate())
                    lowRespiratoryRateCount++;
                if(abuseSymptoms.hasMuscleTension())
                    muscleTensionCount++;
                if(abuseSymptoms.hasNausea())
                    nauseaCount++;
                if(abuseSymptoms.hasPupilaryConstriction())
                    pupilaryConstrictionCount++;
                if(abuseSymptoms.hasSelfHarm())
                    selfHarmCount++;
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
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
