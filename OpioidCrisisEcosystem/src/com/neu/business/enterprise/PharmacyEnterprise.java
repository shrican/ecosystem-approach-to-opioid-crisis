/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.enterprise;

import com.neu.business.organization.ChemistOrganization;
import com.neu.business.organization.DoctorOrganization;
import com.neu.business.organization.Organization;
import com.neu.business.patient.Patient;
import com.neu.business.patient.PatientDirectory;
import com.neu.business.patient.Prescription;
import com.neu.business.role.Role;
import com.neu.business.workqueue.ScheduleAppointmentWorkRequest;
import com.neu.business.workqueue.WorkRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

/**
 *
 * @author shrikantmudholkar
 */
public class PharmacyEnterprise extends Enterprise {

    int opioidStock;
    
    
    
    

    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.PharmacyEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public int getOpioidStock() {
        return opioidStock;
    }

    public void setOpioidStock(int opioidStock) {
        this.opioidStock = opioidStock;
    }
    
    public void pharmacyMostBusinessFromDoctors(){
        
    }
}
