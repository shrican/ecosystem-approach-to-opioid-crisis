/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.patient;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Soham
 */
public class OpioidAbuseSymptomsHistory {

    private List<OpioidAbuseSymptoms> opioidAbuseSysmpomsList;

    public OpioidAbuseSymptomsHistory() {
        opioidAbuseSysmpomsList = new ArrayList<>();
    }

    public List<OpioidAbuseSymptoms> getOpioidAbuseSysmpomsList() {
        return opioidAbuseSysmpomsList;
    }

    public OpioidAbuseSymptoms addAbuseSymptom() {
        OpioidAbuseSymptoms oas = new OpioidAbuseSymptoms();
        opioidAbuseSysmpomsList.add(oas);
        return oas;
    }
}
