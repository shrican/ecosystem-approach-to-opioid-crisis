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
public class ScheduleAppointmentWorkRequest extends WorkRequest {

    private String id;
    private static int countId = 0;

    private Patient patient;

    public ScheduleAppointmentWorkRequest() {
        id = String.valueOf(++countId);
    }

    public String getId() {
        return id;

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
