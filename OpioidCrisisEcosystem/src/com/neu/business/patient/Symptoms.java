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
    private boolean hasBrokenBones;
    
    private int id;
    private static int count = 1;
    
    public Symptoms()
    {
        id = count++;
    }

    public boolean isHasIntestinalDisorder() {
        return hasIntestinalDisorder;
    }

    public void setHasIntestinalDisorder(boolean hasIntestinalDisorder) {
        this.hasIntestinalDisorder = hasIntestinalDisorder;
    }

    public boolean isHasInfection() {
        return hasInfection;
    }

    public void setHasInfection(boolean hasInfection) {
        this.hasInfection = hasInfection;
    }

    public boolean isHasSprain() {
        return hasSprain;
    }

    public void setHasSprain(boolean hasSprain) {
        this.hasSprain = hasSprain;
    }

    public boolean isHasMuscleSpasm() {
        return hasMuscleSpasm;
    }

    public void setHasMuscleSpasm(boolean hasMuscleSpasm) {
        this.hasMuscleSpasm = hasMuscleSpasm;
    }
    private boolean hasAbdominalPain;
    private boolean hasIntestinalDisorder;
    private boolean hasInfection;
    private boolean hasSprain;
    private boolean hasMuscleSpasm;

    public boolean isHasAbdominalPain() {
        return hasAbdominalPain;
    }

    public void setHasAbdominalPain(boolean hasAbdominalPain) {
        this.hasAbdominalPain = hasAbdominalPain;
    }
    
    //divide these into acute and chronic pains. prescribe opioids to multiple acute pains, not to chronic
    
    private int painMeasure = 0;
    // enter pain measures for each ailment, add each to painMeasure to get total pain
    
    public boolean isHasInjury() {
        return hasInjury;
    }

    public boolean isHasBrokenBones() {
        return hasBrokenBones;
    }

    public int getPainMeasure() {
        return painMeasure;
    }

    public void setHasInjury(boolean hasInjury) {
        this.hasInjury = hasInjury;
    }

    public void setHasBrokenBones(boolean hasBrokenBones) {
        this.hasBrokenBones = hasBrokenBones;
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
