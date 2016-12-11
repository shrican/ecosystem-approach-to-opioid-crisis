/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.patient;

/**
 *
 * @author Soham
 */
public class OpioidWithdrawalSymptoms {

    private boolean lowAppetite;
    private boolean highBloodPressure;
    private boolean quivering;
    private boolean vomiting;
    private boolean coldSweat;
    private boolean enlargedPupils;

    public boolean isLowAppetite() {
        return lowAppetite;
    }

    public boolean isHighBloodPressure() {
        return highBloodPressure;
    }

    public boolean isQuivering() {
        return quivering;
    }

    public void setQuivering(boolean quivering) {
        this.quivering = quivering;
    }

    public boolean isVomiting() {
        return vomiting;
    }

    public void setVomiting(boolean vomiting) {
        this.vomiting = vomiting;
    }

    public boolean isColdSweat() {
        return coldSweat;
    }

    public void setColdSweat(boolean coldSweat) {
        this.coldSweat = coldSweat;
    }

    public boolean isEnlargedPupils() {
        return enlargedPupils;
    }

    public void setEnlargedPupils(boolean enlargedPupils) {
        this.enlargedPupils = enlargedPupils;
    }

    public boolean hasLowAppetite() {
        return lowAppetite;
    }

    public void setLowAppetite(boolean lowAppetite) {
        this.lowAppetite = lowAppetite;
    }

    public boolean hasHighBloodPressure() {
        return highBloodPressure;
    }

    public void setHighBloodPressure(boolean highBloodPressure) {
        this.highBloodPressure = highBloodPressure;
    }

}
