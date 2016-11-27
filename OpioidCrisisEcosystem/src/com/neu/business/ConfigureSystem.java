/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business;

import com.neu.business.employee.Employee;
import com.neu.business.role.SystemAdminRole;
import com.neu.business.useraccount.UserAccount;

/**
 *
 * @author shrikantmudholkar
 */
public class ConfigureSystem {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Employee employee = system.getEmployeeDirectory().createEmployee("World Health Organization");

        UserAccount userAccount = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        return system;
    }
}
