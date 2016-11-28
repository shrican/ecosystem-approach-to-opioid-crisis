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

    private String id;
    private static int cnt = 0;

    private OpioidAbuseSymptomsHistory opioidAbuseSymptomsHistory;
    private OpioidWithdrawalSymptomsHistory opioidWithdrawalSymptomsHistory;
    private PostOpioidAddiction postOpioidAddiction;

}
