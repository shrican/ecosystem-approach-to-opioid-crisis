/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.workqueue;

import com.neu.business.patient.Patient;

/**
 *
 * @author Soham
 */
public class SendToRehabilitationWorkRequest extends WorkRequest {
 
    private Patient patient;
    
    public SendToRehabilitationWorkRequest(){}

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
}
