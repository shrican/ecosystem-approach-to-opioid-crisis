/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.network;

import com.neu.business.enterprise.Enterprise;
import com.neu.business.enterprise.PharmaceuticalCompanyEnterprise;
import com.neu.business.enterprise.EnterpriseDirectory;
import com.neu.business.enterprise.HospitalEnterprise;
import com.neu.business.enterprise.PharmacyEnterprise;
import com.neu.business.organization.ChemistOrganization;
import com.neu.business.organization.Organization;
import com.neu.business.organization.PharmaceuticalCompanyManagerOrganization;
import com.neu.business.patient.Patient;
import com.neu.business.patient.Prescription;
import com.neu.business.useraccount.UserAccount;
import com.neu.business.workqueue.PharmacySupplyWorkRequest;
import com.neu.business.workqueue.WorkQueue;
import com.neu.business.workqueue.WorkRequest;

/**
 *
 * @author Soham
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public Network(String name) {
        enterpriseDirectory = new EnterpriseDirectory();
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

    public double pharmacyStockDiscrepancy(ChemistOrganization checkChemistOrganization) {
        double estimatedStock = 0;
        int pharmacyCurrentStock = 0;
        int pharmacyOrdersTotal = 0;
        int pharmacyPrescriptionsTotal = 0;
        int pharmacyInitialStock = 0;

        for (Enterprise enterprise : enterpriseDirectory.getEnterpriseList()) {
            if (enterprise instanceof PharmaceuticalCompanyEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof PharmaceuticalCompanyManagerOrganization) {
                        WorkQueue workQueue = organization.getWorkQueue();
                        for (WorkRequest workRequest : workQueue.getWorkRequestList()) {

                            if (workRequest instanceof PharmacySupplyWorkRequest) {
                                pharmacyOrdersTotal += ((PharmacySupplyWorkRequest) workRequest).getOrderAmount();
                            }
                        }
                    }
                }
            }

            if (enterprise instanceof PharmacyEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof ChemistOrganization) {
                        String name = checkChemistOrganization.getName();
                        if (organization.getName().equals(name)) {
                            pharmacyInitialStock = ((PharmacyEnterprise) enterprise).getInitialPharmacyStock(); //Anmol to take care of this
                            pharmacyCurrentStock = ((ChemistOrganization) organization).getStock();
                        }
                    }
                }
            }
            if (enterprise instanceof HospitalEnterprise) {
                for (Patient patient : ((HospitalEnterprise) enterprise).getPatientDirectory().getPatientList()) {
                    for (Prescription prescription : patient.getPrescriptionHistory().getPrescriptionHistoryList()) {
                        if (prescription.isFulfilled()) {
                            if (prescription.getChemistName().equals(checkChemistOrganization.getName())) {
                                pharmacyPrescriptionsTotal += prescription.getTotalOpioidsPrescribed();
                            }
                        }
                    }
                }
            }
        }

        estimatedStock = pharmacyInitialStock + pharmacyOrdersTotal - pharmacyPrescriptionsTotal;
        double discrepancy = 0;
        if (estimatedStock > pharmacyCurrentStock) {
            discrepancy = estimatedStock - pharmacyCurrentStock;
        } else if (estimatedStock == pharmacyCurrentStock) {
            discrepancy = 0;
        }
        return discrepancy;
    }
}
