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
public class Patient {

    //TODO: calculate opioidAddictionSymptomScore
    private String id;
    private static int count = 0;
    private String name;
    private String phoneNo;
    private int age;
    private String bloodGroup;
    private String gender;
    private Date registrationDate;
    //private float opioidAddictionSymptomScore; // check method to store and retrieve 

    private OpioidAbuseSymptomsHistory opioidAbuseSymptomsHistory;
    private OpioidWithdrawalSymptomsHistory opioidWithdrawalSymptomsHistory;
    private PostOpioidAddiction postOpioidAddiction;
    private PrescriptionHistory prescriptionHistory;
    private PatientSymptomsHistory symptomsHistory;
    private float bayesianOpioidAddictionScore;

    public PatientSymptomsHistory getSymptomsHistory() {
        return symptomsHistory;
    }

    public Patient() {
        //auto increment
        id = String.valueOf(++count);
        registrationDate = new Date();
        opioidAbuseSymptomsHistory = new OpioidAbuseSymptomsHistory();
        opioidWithdrawalSymptomsHistory = new OpioidWithdrawalSymptomsHistory();
        postOpioidAddiction = new PostOpioidAddiction();
        prescriptionHistory = new PrescriptionHistory();
        symptomsHistory = new PatientSymptomsHistory();
    }

    public float getBayesianOpioidAddictionScore() {
        return bayesianOpioidAddictionScore;
    }

    public void setBayesianOpioidAddictionScore(float bayesianOpioidAddictionScore) {
        this.bayesianOpioidAddictionScore = bayesianOpioidAddictionScore;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public OpioidAbuseSymptomsHistory getOpioidAbuseSymptomsHistory() {
        return opioidAbuseSymptomsHistory;
    }

    public void setOpioidAbuseSymptomsHistory(OpioidAbuseSymptomsHistory opioidAbuseSymptomsHistory) {
        this.opioidAbuseSymptomsHistory = opioidAbuseSymptomsHistory;
    }

    public OpioidWithdrawalSymptomsHistory getOpioidWithdrawalSymptomsHistory() {
        return opioidWithdrawalSymptomsHistory;
    }

    public void setOpioidWithdrawalSymptomsHistory(OpioidWithdrawalSymptomsHistory opioidWithdrawalSymptomsHistory) {
        this.opioidWithdrawalSymptomsHistory = opioidWithdrawalSymptomsHistory;
    }

    public PostOpioidAddiction getPostOpioidAddiction() {
        return postOpioidAddiction;
    }

    public void setPostOpioidAddiction(PostOpioidAddiction postOpioidAddiction) {
        this.postOpioidAddiction = postOpioidAddiction;
    }

    public PrescriptionHistory getPrescriptionHistory() {
        return prescriptionHistory;
    }

    public void setPrescriptionHistory(PrescriptionHistory prescriptionHistory) {
        this.prescriptionHistory = prescriptionHistory;
    }

//    public float getOpioidAddictionSymptomScore() {
//        return opioidAddictionSymptomScore;
//    }
//
//    public void setOpioidAddictionSymptomScore(float opioidAddictionSymptomScore) {
//        this.opioidAddictionSymptomScore = opioidAddictionSymptomScore;
//    }

    @Override
    public String toString() {
        return name;
    }
}
