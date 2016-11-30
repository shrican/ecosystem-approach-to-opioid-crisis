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
    
    private List<Presciption> prescriptionHistory;
    
    public PrescriptionHistory(){
        prescriptionHistory = new ArrayList<>();
    }

    public List<Presciption> getPrescriptionHistory() {
        return prescriptionHistory;
    }

    public void setPrescriptionHistory(List<Presciption> prescriptionHistory) {
        this.prescriptionHistory = prescriptionHistory;
    }
    
    
    
}
