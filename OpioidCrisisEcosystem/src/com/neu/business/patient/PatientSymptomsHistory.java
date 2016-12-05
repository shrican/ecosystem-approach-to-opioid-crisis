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
public class PatientSymptomsHistory {
  
    private ArrayList<Symptoms> symptomHistory;
    
    public PatientSymptomsHistory(){
        this.symptomHistory = new ArrayList<>();
    }

    public ArrayList<Symptoms> getSymptomHistory() {
        return symptomHistory;
    }
     
    public void addSymptoms(Symptoms s)
    {
        symptomHistory.add(s);
    }
}
