/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PharmaOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.OrganBankRole.OrganBankWorkAreaJPanel;
import userinterface.Pharma.PharmaWorkAreaJPanel;

/**
 *
 * @author kiran
 */
public class PharmaRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmaWorkAreaJPanel(userProcessContainer,account,(PharmaOrganization)organization,enterprise,business);
    }
}
