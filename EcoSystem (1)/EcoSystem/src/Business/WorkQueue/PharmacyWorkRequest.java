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
public class PharmacyWorkRequest extends WorkRequest {
     private String doctortoPharmaMedicineName;
     private String doctortoPharmaDoctorName;
     private int    doctortoPharmaQuantity;

    public String getDoctortoPharmaMedicineName() {
        return doctortoPharmaMedicineName;
    }

    public void setDoctortoPharmaMedicineName(String doctortoPharmaMedicineName) {
        this.doctortoPharmaMedicineName = doctortoPharmaMedicineName;
    }

    public String getDoctortoPharmaDoctorName() {
        return doctortoPharmaDoctorName;
    }

    public void setDoctortoPharmaDoctorName(String doctortoPharmaDoctorName) {
        this.doctortoPharmaDoctorName = doctortoPharmaDoctorName;
    }

    public int getDoctortoPharmaQuantity() {
        return doctortoPharmaQuantity;
    }

    public void setDoctortoPharmaQuantity(int doctortoPharmaQuantity) {
        this.doctortoPharmaQuantity = doctortoPharmaQuantity;
    }
     
}
