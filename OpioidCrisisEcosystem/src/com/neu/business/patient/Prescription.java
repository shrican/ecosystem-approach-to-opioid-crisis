/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.patient;

import java.util.Date;

/**
 *
 * @author Soham
 */
public class Prescription {

    private String drugName;
    private Date opdDate;
    private String id; //auto increment
    private static int count = 0;
    private Dosage dosage;
    private int noOfDays;
    private int totalOpioidsPrescribed;
    private String patientName;
    private boolean fulfilled;
    private String chemistName;
    private String doctorName;
    private Date dateOfFulfilment;
    private String patientScoreStatus;

    public String getPatientScoreStatus() {
        return patientScoreStatus;
    }

    public void setPatientScoreStatus(String patientScoreStatus) {
        this.patientScoreStatus = patientScoreStatus;
    }

    public Date getDateOfFulfilment() {
        return dateOfFulfilment;
    }

    public void setDateOfFulfilment(Date dateOfFulfilment) {
        this.dateOfFulfilment = dateOfFulfilment;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getChemistName() {
        return chemistName;
    }

    public void setChemistName(String chemistName) {
        this.chemistName = chemistName;
    }

    public boolean isFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Prescription() {
        id = String.valueOf(++count);
    }

    public enum Dosage {
        OnceADay(1),
        TwiceADay(2),
        ThriceADay(3);

        private int value;

        private Dosage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
//        
//        @Override
//        public String toString() {
//            return value;
//        }
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Date getOpdDate() {
        return opdDate;
    }

    public void setOpdDate(Date opdDate) {
        this.opdDate = opdDate;
    }

    public String getId() {
        return id;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public int getTotalOpioidsPrescribed() {
        return totalOpioidsPrescribed;
    }

    public void setTotalOpioidsPrescribed(int totalOpioidsPrescribed) {
        this.totalOpioidsPrescribed = totalOpioidsPrescribed;
    }

    public void calculateTotalOpioidsPrescribed() {

        totalOpioidsPrescribed = dosage.getValue() * noOfDays;

    }

    @Override
    public String toString() {
        return this.doctorName;//to get doctor name for prescription object in sell opioids
    }
}
