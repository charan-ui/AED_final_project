/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Charan
 */
public class RewardRequest extends WorkRequest{
    private String rewardName;
    private String rewardAge;
    private String rewardEmail;
    private String disease;
    private String gender;

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    

    public String getRewardName() {
        return rewardName;
    }

    public void setRewardName(String rewardName) {
        this.rewardName = rewardName;
    }

    public String getRewardAge() {
        return rewardAge;
    }

    public void setRewardAge(String rewardAge) {
        this.rewardAge = rewardAge;
    }

    public String getRewardEmail() {
        return rewardEmail;
    }

    public void setRewardEmail(String rewardEmail) {
        this.rewardEmail = rewardEmail;
    }

}
