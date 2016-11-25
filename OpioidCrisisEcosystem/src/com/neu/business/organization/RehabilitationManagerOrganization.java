/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.organization;

import com.neu.business.role.ReceptionistRole;
import com.neu.business.role.RehabilitationManagerRole;
import com.neu.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Soham
 */
public class RehabilitationManagerOrganization extends Organization {

    public RehabilitationManagerOrganization() {
        super(Type.RehabilitationManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RehabilitationManagerRole());
        return roles;
    }
}
