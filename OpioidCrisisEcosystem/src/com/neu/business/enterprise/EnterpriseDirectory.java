/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business.enterprise;

import java.util.ArrayList;

/**
 *
 * @author shrikantmudholkar
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.HospitalEnterprise) {
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.PharmacyEnterprise) {
            enterprise = new PharmacyEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.PharmaceuticalCompanyEnterprise) {
            enterprise = new PharmaceuticalCompanyEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.CommunityRehabEnterprise) {
            enterprise = new CommunityRehabEnterprise(name);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.DrugEnforcementAdministrationEnterprise) {
            enterprise = new DrugEnformentAdministrationEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
