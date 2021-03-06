/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BloodBankRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.ResearchLabEnterprise;
import Business.Network.Network;
import Business.Organization.BloodBankOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodBankWorkRequest;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author kiran
 */
public class BloodBankWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodBankWorkAreaJPanel
     */
   
    JPanel userProcessContainer;
    private BloodBankOrganization bloodBankOrganization;
   
    
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

 
    
    public BloodBankWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, BloodBankOrganization bloodBankOrganization, Enterprise enterprise, EcoSystem business ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount= userAccount;
        this.bloodBankOrganization= bloodBankOrganization;
        this.enterprise= enterprise;
        this.business = business;
        
        
        
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) bloodBankJTable.getModel();
model.setRowCount(0);
for (WorkRequest request : bloodBankOrganization.getWorkQueue().getWorkRequestList()){
        Object[] row = new Object[7];
        BloodBankWorkRequest bloodWorkRequest = (BloodBankWorkRequest) request;
        row[0] = bloodWorkRequest.getName();
        row[1] = bloodWorkRequest.getAge();
        row[2] = bloodWorkRequest.getGender();
        row[3] = bloodWorkRequest.getEmailtoBlood();
        row[4] = bloodWorkRequest.getStatus();
        row[5] = bloodWorkRequest.getBloodGroup();
        row[6] = bloodWorkRequest;
        model.addRow(row);
}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bloodBankJTable = new javax.swing.JTable();
        lab_req_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ser_BloodGroup = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 248, 248));
        setForeground(new java.awt.Color(153, 0, 0));

        bloodBankJTable.setBackground(new java.awt.Color(153, 0, 0));
        bloodBankJTable.setForeground(new java.awt.Color(255, 255, 255));
        bloodBankJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Email", "Status", "BloodGroup", "AllDetails"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bloodBankJTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bloodBankJTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(bloodBankJTable);

        lab_req_btn.setBackground(new java.awt.Color(204, 0, 0));
        lab_req_btn.setForeground(new java.awt.Color(255, 255, 255));
        lab_req_btn.setText("Lab Request");
        lab_req_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab_req_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Search");

        ser_BloodGroup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ser_BloodGroupKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Blood Bank Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(ser_BloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lab_req_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab_req_btn)
                    .addComponent(ser_BloodGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lab_req_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab_req_btnActionPerformed
        
        int selectedRow = bloodBankJTable.getSelectedRow();
        
            if(selectedRow<0)
            {
                JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
                BloodBankWorkRequest request = (BloodBankWorkRequest)bloodBankJTable.getValueAt(selectedRow, 6);
                LabTestWorkRequest labrequest = new LabTestWorkRequest();
                
                labrequest.setNameFromBloodBank(request.getName());
                labrequest.setAgeFromBloodBank(request.getAge());
                labrequest.setGenderFromBloodBank(request.getGender());
                labrequest.setStatusFromBloodBank("Sent");
                labrequest.setBloodGroupFromBloodBank(request.getBloodGroup());
                
                Organization org = null;
        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof ResearchLabEnterprise) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof LabOrganization) {
                            org = organization;
                            //                            System.out.println("orgname" + organization.getName());
                            org.getWorkQueue().getWorkRequestList().add(labrequest);
                            break;
                        }
                    }
                }

 

            }
        }
        if (org != null) {
            userAccount.getWorkQueue().getWorkRequestList().add(labrequest);
            JOptionPane.showMessageDialog(null, "Requested TO LAB SENT", "Information", JOptionPane.INFORMATION_MESSAGE);
        } 
                
                
                
            }
            
            
            
           
            
        
        
        
    }//GEN-LAST:event_lab_req_btnActionPerformed

    private void ser_BloodGroupKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ser_BloodGroupKeyReleased
        String text = ser_BloodGroup.getText();
        filter(text);
    }//GEN-LAST:event_ser_BloodGroupKeyReleased

    public void filter(String a)
    {
        DefaultTableModel model = (DefaultTableModel) bloodBankJTable.getModel();
        TableRowSorter<DefaultTableModel> dtmr = new TableRowSorter<DefaultTableModel>(model);
        bloodBankJTable.setRowSorter(dtmr);
        dtmr.setRowFilter(RowFilter.regexFilter(a));
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bloodBankJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lab_req_btn;
    private javax.swing.JTextField ser_BloodGroup;
    // End of variables declaration//GEN-END:variables
}
