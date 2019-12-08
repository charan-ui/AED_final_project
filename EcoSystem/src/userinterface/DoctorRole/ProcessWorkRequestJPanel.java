/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmaEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PharmaOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorAppointmentWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kiran
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private  DoctorAppointmentWorkRequest docrequest;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    

    public ProcessWorkRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, DoctorAppointmentWorkRequest docrequest, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
         this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.docrequest= docrequest;
        this.enterprise = enterprise;
        this.business = business;
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        medi_req_Jtext = new javax.swing.JTextField();
        QuantityTextfield2 = new javax.swing.JTextField();
        requestBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        doctorname_jtextfield = new javax.swing.JTextField();
        pre_btn_back = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prescription Panel");

        jLabel7.setText("MEDICINE REQUESTED");

        jLabel8.setText("QUANTITY NEEDED");

        requestBtn.setBackground(new java.awt.Color(157, 28, 28));
        requestBtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        requestBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestBtn.setText("Send To Pharmacy");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });

        jLabel9.setText("DOCTOR NAME");

        doctorname_jtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorname_jtextfieldActionPerformed(evt);
            }
        });

        pre_btn_back.setBackground(new java.awt.Color(157, 28, 28));
        pre_btn_back.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        pre_btn_back.setForeground(new java.awt.Color(255, 255, 255));
        pre_btn_back.setText("Back");
        pre_btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pre_btn_back)
                                .addGap(90, 90, 90)
                                .addComponent(requestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medi_req_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QuantityTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctorname_jtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(medi_req_Jtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuantityTextfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(doctorname_jtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pre_btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(446, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doctorname_jtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorname_jtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorname_jtextfieldActionPerformed

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        String medicineRequested = medi_req_Jtext.getText();
        int quantity = Integer.parseInt(QuantityTextfield2.getText());
        String doctorName = doctorname_jtextfield.getText();
        PharmacyWorkRequest pharmreq = new PharmacyWorkRequest();
        pharmreq.setDoctortoPharmaMedicineName(medicineRequested);
        pharmreq.setDoctortoPharmaDoctorName(doctorName);
        pharmreq.setDoctortoPharmaQuantity(quantity);
        pharmreq.setStatus("sent");
        
        Organization org = null;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof PharmaEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof PharmaOrganization) {
                            org = organization;
                            //                            System.out.println("orgname" + organization.getName());
                            org.getWorkQueue().getWorkRequestList().add(pharmreq);
                            break;
                        }
                    }
                }
            }
        }
   if (org != null) {
            userAccount.getWorkQueue().getWorkRequestList().add(pharmreq);
            JOptionPane.showMessageDialog(null, " successfully", "Information", JOptionPane.INFORMATION_MESSAGE);

        }      
    }//GEN-LAST:event_requestBtnActionPerformed

    private void pre_btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_btn_backActionPerformed
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel ftdwjp = (DoctorWorkAreaJPanel) component;
        // ftdwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_pre_btn_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField QuantityTextfield2;
    private javax.swing.JTextField doctorname_jtextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField medi_req_Jtext;
    private javax.swing.JButton pre_btn_back;
    private javax.swing.JButton requestBtn;
    // End of variables declaration//GEN-END:variables
}
