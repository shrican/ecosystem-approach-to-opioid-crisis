/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.role;

import com.neu.business.EcoSystem;
import com.neu.business.enterprise.Enterprise;
import com.neu.business.network.Network;
import com.neu.business.organization.Organization;
import com.neu.business.useraccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author shrikantmudholkar
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        Receptionist("Receptionist"),
        Chemist("Chemist"),
        PhramaceuticalCompanyManager("Phramaceutical Company Manager"),
        RehabilitationManager("Rehabilitation Manager"),
        DEA("DEA");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            UserAccount account,
            Organization organization,
            Enterprise enterprise,
            Network network,
            EcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
