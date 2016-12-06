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
public class OpioidAbuseSymptoms {

    private boolean nausea;
    private boolean chestPain;
    private boolean pupilaryConstriction;
    private boolean bloodshotEyes;
    private boolean jointPain;
    private boolean muscleTension;
    private boolean lowRespiratoryRate;
    private boolean selfHarm;
    private boolean insomnia;
    private Date date;
    private static int count = 1;
    private int ID;

    public OpioidAbuseSymptoms() {
        date = new Date();
        ID = count++;
    }

    public Date getDate() {
        return date;
    }

    public boolean hasInsomnia() {
        return insomnia;
    }

    public void setInsomnia(boolean insomnia) {
        this.insomnia = insomnia;
    }

    public boolean hasBloodshotEyes() {
        return bloodshotEyes;
    }

    public void setBloodshotEyes(boolean bloodshotEyes) {
        this.bloodshotEyes = bloodshotEyes;
    }

    public boolean hasLowRespiratoryRate() {
        return lowRespiratoryRate;
    }

    public void setLowRespiratoryRate(boolean lowRespiratoryRate) {
        this.lowRespiratoryRate = lowRespiratoryRate;
    }

    public boolean hasSelfHarm() {
        return selfHarm;
    }

    public void setSelfHarm(boolean selfHarm) {
        this.selfHarm = selfHarm;
    }

    public boolean hasNausea() {
        return nausea;
    }

    public void setNausea(boolean nausea) {
        this.nausea = nausea;
    }

    public boolean hasChestPain() {
        return chestPain;
    }

    public void setChestPain(boolean chestPain) {
        this.chestPain = chestPain;
    }

    public boolean hasPupilaryConstriction() {
        return pupilaryConstriction;
    }

    public void setPupilaryConstriction(boolean pupilaryConstriction) {
        this.pupilaryConstriction = pupilaryConstriction;
    }

    public boolean hasJointPain() {
        return jointPain;
    }

    public void setJointPain(boolean jointPain) {
        this.jointPain = jointPain;
    }

    public boolean hasMuscleTension() {
        return muscleTension;
    }

    public void setMuscleTension(boolean muscleTension) {
        this.muscleTension = muscleTension;
    }
}
