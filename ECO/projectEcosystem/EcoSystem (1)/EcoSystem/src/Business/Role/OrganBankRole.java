/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.OrganOrganization;
import Business.Organization.Organization;
import Business.Organization.UserOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BloodBankRole.BloodBankWorkAreaJPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import userinterface.OrganBankRole.OrganWorkAreaJPanel;

/**
 *
 * @author kiran
 */
public class OrganBankRole extends Role{
     @Override
  
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new OrganWorkAreaJPanel(userProcessContainer, account, (OrganOrganization)organization, enterprise,business);
    }
    
    @Override
    public String toString() {
        return RoleType.OrganBank.getValue();
    }

  
}
