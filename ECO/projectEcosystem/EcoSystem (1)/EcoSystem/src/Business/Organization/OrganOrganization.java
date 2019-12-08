/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BloodBankRole;
import Business.Role.OrganBankRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kiran
 */
public class OrganOrganization extends Organization{
    public OrganOrganization() {
        super(Organization.Type.OrganBank.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OrganBankRole());
        return roles;
    }
}
