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
public class PrescriptionHistory {

    private List<Prescription> prescriptionHistoryList;

    public PrescriptionHistory() {
        prescriptionHistoryList = new ArrayList<>();
    }

    public List<Prescription> getPrescriptionHistoryList() {
        return prescriptionHistoryList;
    }

    public Prescription addPrescription() {
        Prescription prescription = new Prescription();
        prescriptionHistoryList.add(prescription);
        return prescription;
    }
}
