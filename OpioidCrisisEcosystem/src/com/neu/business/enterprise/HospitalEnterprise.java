/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.enterprise;

import com.neu.business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author shrikantmudholkar
 */
public class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.HospitalEnterprise);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
