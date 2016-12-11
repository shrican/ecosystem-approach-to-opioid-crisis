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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 *
 * @author shrikantmudholkar
 */
public class PharmacyEnterprise extends Enterprise {

    int opioidStock;
    
//    public void pharmacySalesDistribution(PatientDirectory patientDirectory)
//    {
//        ArrayList<Prescription> ordersSold = new ArrayList<>();
//        for(Organization organization : getOrganizationDirectory().getOrganizationList())
//        {
//            if(organization instanceof ChemistOrganization)
//            {
//                ordersSold = ((ChemistOrganization) organization).getOrdersSold();
//            }
//        }
//        
//        ArrayList<Patient> ageGroup1 = new ArrayList<>();
//        ArrayList<Patient> ageGroup2 = new ArrayList<>();
//        ArrayList<Patient> ageGroup3 = new ArrayList<>();
//        ArrayList<Patient> male = new ArrayList<>();
//        ArrayList<Patient> female = new ArrayList<>();
//        for(Patient patient : patientDirectory.getPatientList())
//        {
//            if(patient.getAge()>=20 || patient.getAge() < 40)
//            {
//                ageGroup1.add(patient);
//            }
//            else if(patient.getAge()>=40 || patient.getAge() < 60)
//            {
//                ageGroup2.add(patient);
//            }
//            else if(patient.getAge() >= 60)
//            {
//                ageGroup3.add(patient);
//            }
//            
//            if(patient.getGender().equals("Male"))
//            {
//                male.add(patient);
//            }
//            else if(patient.getGender().equals("Female"))
//            {
//                female.add(patient);
//            }
//        }
//        
//        System.out.println("20-39");
//        for(Patient patient : ageGroup1)
//        {
//            System.out.println(patient.getName());
//        }
//        
//        System.out.println("40-59");
//        for(Patient patient :ageGroup2)
//        {
//            System.out.println(patient.getName());
//        }
//        System.out.println("60+");
//        for(Patient patient : ageGroup3)
//        {
//            System.out.println(patient.getName());
//        }
//        
//        System.out.println("Males");
//        for(Patient patient : male)
//        {
//            System.out.println(patient.getName());
//        }
//        System.out.println("Females");
//        for(Patient patient : female)
//        {
//            System.out.println(patient.getName());
//        }
//    }
//    
//    public void mostDoctorPrescriptions(HospitalEnterprise hospitalEnterprise)
//    {
//        HashMap<DoctorOrganization, Integer> doctors = new HashMap<>();
//        for(Organization organization : hospitalEnterprise.getOrganizationDirectory().getOrganizationList())
//        {
//            int biggest = 0;
//            if(organization instanceof DoctorOrganization)
//            {
//                int prescriptions = organization.getWorkQueue().getWorkRequestList().size();
//                doctors.put((DoctorOrganization) organization, prescriptions);
//                if(prescriptions>biggest)
//                    biggest = prescriptions;
//            }
//            
//        }
//        
//    }

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
}
