/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.utilities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soham
 */
public class Inventory {
    
    private List<Opioids> opioidsList;
    
    public Inventory(){
        opioidsList = new ArrayList<>();
    }

    public List<Opioids> getOpioidsList() {
        return opioidsList;
    }

    public void setOpioidsList(List<Opioids> opioidsList) {
        this.opioidsList = opioidsList;
    }
    
    
    
    
}
