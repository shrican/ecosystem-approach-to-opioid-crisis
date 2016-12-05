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
public class OpioidWithdrawalSymptomsHistory {

    private List<OpioidWithdrawalSymptoms> opioidWithdrawalSymptomsList;

    public OpioidWithdrawalSymptomsHistory() {
        opioidWithdrawalSymptomsList = new ArrayList<>();
    }

    public List<OpioidWithdrawalSymptoms> getOpioidWithdrawalSymptomsList() {
        return opioidWithdrawalSymptomsList;
    }

    public OpioidWithdrawalSymptoms addWithdrawalSymptom() {
        OpioidWithdrawalSymptoms ows = new OpioidWithdrawalSymptoms();
        opioidWithdrawalSymptomsList.add(ows);
        return ows;
    }
}
