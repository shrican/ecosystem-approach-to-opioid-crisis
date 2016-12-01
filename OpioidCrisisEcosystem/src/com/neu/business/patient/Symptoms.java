/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.patient;

/**
 *
 * @author Anmol
 */
public class Symptoms {
    
    private boolean hasLowerBackPain;
    private boolean hasArthritis;
    private boolean hasHeadache;
    private boolean hasMultipleSclerosis;
    private boolean hasFibromyalgia;
    private boolean hasShingles;
    private boolean hasNerveDamage;
    private boolean hasCancer;
    private boolean hasInjury;
    private boolean hasBrokenBone;
    
    //divide these into acute and chronic pains. prescribe opioids to multiple acute pains, not to chronic
    
    private int painMeasure = 0;
    // enter pain measures for each ailment, add each to painMeasure to get total pain
    
    public boolean isHasInjury() {
        return hasInjury;
    }

    public boolean isHasBrokenBone() {
        return hasBrokenBone;
    }

    public int getPainMeasure() {
        return painMeasure;
    }

    public void setHasInjury(boolean hasInjury) {
        this.hasInjury = hasInjury;
    }

    public void setHasBrokenBone(boolean hasBrokenBone) {
        this.hasBrokenBone = hasBrokenBone;
    }

    public boolean isHasLowerBackPain() {
        return hasLowerBackPain;
    }

    public void setHasLowerBackPain(boolean hasLowerBackPain) {
        this.hasLowerBackPain = hasLowerBackPain;
    }

    public boolean isHasArthritis() {
        return hasArthritis;
    }

    public void setHasArthritis(boolean hasArthritis) {
        this.hasArthritis = hasArthritis;
    }

    public boolean isHasHeadache() {
        return hasHeadache;
    }

    public void setHasHeadache(boolean hasHeadache) {
        this.hasHeadache = hasHeadache;
    }

    public boolean isHasMultipleSclerosis() {
        return hasMultipleSclerosis;
    }

    public void setHasMultipleSclerosis(boolean hasMultipleSclerosis) {
        this.hasMultipleSclerosis = hasMultipleSclerosis;
    }

    public boolean isHasFibromyalgia() {
        return hasFibromyalgia;
    }

    public void setHasFibromyalgia(boolean hasFibromyalgia) {
        this.hasFibromyalgia = hasFibromyalgia;
    }

    public boolean isHasShingles() {
        return hasShingles;
    }

    public void setHasShingles(boolean hasShingles) {
        this.hasShingles = hasShingles;
    }

    public boolean isHasNerveDamage() {
        return hasNerveDamage;
    }

    public void setHasNerveDamage(boolean hasNerveDamage) {
        this.hasNerveDamage = hasNerveDamage;
    }

    public boolean isHasCancer() {
        return hasCancer;
    }

    public void setHasCancer(boolean hasCancer) {
        this.hasCancer = hasCancer;
    }
    
}
