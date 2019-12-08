/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.BloodBank.getValue())){
            organization = new BloodBankOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Government.getValue())){
            organization = new GovernmentOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new MortuaryOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OrganBank.getValue())){
            organization = new OrganOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Pharma.getValue())){
            organization = new PharmaOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.User.getValue())){
            organization = new UserOrganization();
            organizationList.add(organization);
        }
        return organization;
       

        
    }
    
}