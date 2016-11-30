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
public class Patient {

    private String name;
    private String phoneNo;

    private String id;
    private static int cnt = 0;

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

    private OpioidAbuseSymptomsHistory opioidAbuseSymptomsHistory;
    private OpioidWithdrawalSymptomsHistory opioidWithdrawalSymptomsHistory;
    private PostOpioidAddiction postOpioidAddiction;

}
