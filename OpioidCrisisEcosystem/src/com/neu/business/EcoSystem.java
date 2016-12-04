/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business;

import com.neu.business.network.Network;
import com.neu.business.organization.Organization;
import com.neu.business.patient.PatientDirectory;
import com.neu.business.role.Role;
import com.neu.business.role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author shrikantmudholkar
 */
public class EcoSystem extends Organization {

    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    private PatientDirectory patientDirectory;

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        patientDirectory = new PatientDirectory();

    }

    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork(String name) {
        Network network = new Network(name);
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }
        return true;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
}