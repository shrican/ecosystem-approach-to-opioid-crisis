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
public class PostOpioidAddiction {

    private boolean tobaccoUse;
    private boolean alcoholAbuse;
    private boolean cannabisAbuse;
    private boolean stimulantAbuse;

    public boolean isTobaccoUse() {
        return tobaccoUse;
    }

    public void setTobaccoUse(boolean tobaccoUse) {
        this.tobaccoUse = tobaccoUse;
    }

    public boolean isAlcoholAbuse() {
        return alcoholAbuse;
    }

    public void setAlcoholAbuse(boolean alcoholAbuse) {
        this.alcoholAbuse = alcoholAbuse;
    }

    public boolean isCannabisAbuse() {
        return cannabisAbuse;
    }

    public void setCannabisAbuse(boolean cannabisAbuse) {
        this.cannabisAbuse = cannabisAbuse;
    }

    public boolean isStimulantAbuse() {
        return stimulantAbuse;
    }

    public void setStimulantAbuse(boolean stimulantAbuse) {
        this.stimulantAbuse = stimulantAbuse;
    }
}
