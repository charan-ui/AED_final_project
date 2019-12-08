/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private String nameFromBloodBank;
    private String ageFromBloodBank;
    private String genderFromBloodBank;
    private String statusFromBloodBank;
    private String bloodGroupFromBloodBank;

    public String getNameFromBloodBank() {
        return nameFromBloodBank;
    }

    public void setNameFromBloodBank(String nameFromBloodBank) {
        this.nameFromBloodBank = nameFromBloodBank;
    }

    public String getAgeFromBloodBank() {
        return ageFromBloodBank;
    }

    public void setAgeFromBloodBank(String ageFromBloodBank) {
        this.ageFromBloodBank = ageFromBloodBank;
    }

    public String getGenderFromBloodBank() {
        return genderFromBloodBank;
    }

    public void setGenderFromBloodBank(String genderFromBloodBank) {
        this.genderFromBloodBank = genderFromBloodBank;
    }

    public String getStatusFromBloodBank() {
        return statusFromBloodBank;
    }

    public void setStatusFromBloodBank(String statusFromBloodBank) {
        this.statusFromBloodBank = statusFromBloodBank;
    }

    public String getBloodGroupFromBloodBank() {
        return bloodGroupFromBloodBank;
    }

    public void setBloodGroupFromBloodBank(String bloodGroupFromBloodBank) {
        this.bloodGroupFromBloodBank = bloodGroupFromBloodBank;
    }
    

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
