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
    
    private List<Prescription> prescriptionHistory;
    
    public PrescriptionHistory(){
        prescriptionHistory = new ArrayList<>();
    }

    public List<Prescription> getPrescriptionHistory() {
        return prescriptionHistory;
    }

    public void setPrescriptionHistory(List<Prescription> prescriptionHistory) {
        this.prescriptionHistory = prescriptionHistory;
    }
    
    
    
}
