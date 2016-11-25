/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.organization;

import com.neu.business.employee.EmployeeDirectory;
import com.neu.business.role.Role;
import com.neu.business.useraccount.UserAccountDirectory;
import com.neu.business.workqueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Soham
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;

    public enum Type {
        Admin("Admin Organization"),
        Doctor("Doctor Organization"),
        Receptionist("Receptionist Organization"),
        Chemist("Chemist Organization"),
        PhramaceuticalCompanyManager("Phramaceutical Company Manager Organization"),
        RehabilitationManager("Rehabilitation Manager Organization"),
        DEA("DEA Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String toString() {
        return name;
    }

}
