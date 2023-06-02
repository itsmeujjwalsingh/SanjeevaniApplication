/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevani.gui;

import Sanjeevani.dao.ReceptionistDao;
import Sanjeevani.dao.UserDao;
import Sanjeevani.pojo.ReceptionistsPojo;
import Sanjeevani.pojo.UserPojo;
import Sanjeevani.utility.PasswordDecryption;
import Sanjeevani.utility.PasswordEncryption;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class UpdateReceptionistFrame extends javax.swing.JFrame {

    List<String>recpIdList;
    ReceptionistsPojo recp;
    UserPojo user;
    private String loginId;
    private String password;
    private String cnfPassword;
    private String newName;
    public UpdateReceptionistFrame() {
        initComponents();
        loadRecpId();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        btnBack3 = new javax.swing.JButton();
        btnLogout3 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jcRecpId = new javax.swing.JComboBox<>();
        txtRecpName = new javax.swing.JTextField();
        txtLoginId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfromPassword = new javax.swing.JPasswordField();
        jcgender = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevani/icons/HomePageBG1.jpg"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Update Receptionists Frame", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sanjeevani/icons/images (2).jpg"))); // NOI18N

        btnupdate.setBackground(new java.awt.Color(255, 255, 204));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdatebtnRegisterActionPerformed(evt);
            }
        });

        btnBack3.setBackground(new java.awt.Color(255, 255, 204));
        btnBack3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack3.setText("Back");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3btnBackActionPerformed(evt);
            }
        });

        btnLogout3.setBackground(new java.awt.Color(255, 255, 204));
        btnLogout3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout3.setText("Logout");
        btnLogout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout3btnLogoutActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setText("Receptionist ID");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setText("Receptionist Name");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setText("Login ID");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel43.setText("Password");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel44.setText("ReType Passwords");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel45.setText("Gender");

        jcRecpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRecpIdjcEmployeeIdActionPerformed(evt);
            }
        });

        txtRecpName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtRecpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecpNametxtDoctorNameActionPerformed(evt);
            }
        });

        txtLoginId.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtLoginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginIdtxtLoginIdActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordtxtPwd1ActionPerformed(evt);
            }
        });

        txtConfromPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtConfromPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfromPasswordtxtPwd2ActionPerformed(evt);
            }
        });

        jcgender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jcgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jcgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcgenderjcGenderActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setText("Receptionist's Detail");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel40)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jcRecpId, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConfromPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcgender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRecpName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoginId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel50)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnBack3)
                                .addGap(50, 50, 50)
                                .addComponent(btnLogout3))
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack3)
                            .addComponent(btnLogout3))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel40)
                                    .addComponent(jcRecpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRecpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel42)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel43)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel44)
                            .addComponent(txtConfromPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jcgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdatebtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdatebtnRegisterActionPerformed
if(validateInputs()==false){
             JOptionPane.showMessageDialog(null, "Please input all the fields");
             return;
        }
        String passwordValid=matchPassword();
        if(passwordValid!=null){
            JOptionPane.showMessageDialog(null, passwordValid);
            return;
        }
        
        try
        {
            String encryptedPassword = new String(PasswordEncryption.getEncryptedPassword(password));
            
            UserPojo user = new UserPojo(loginId,newName,encryptedPassword , "RECEPTIONISTS");
            boolean res1 = UserDao.updateUser(user , recp.getReceptionistName());
            recp = new ReceptionistsPojo();
            boolean res2 = ReceptionistDao.updateReceptionist(recp);
            
            if(res1==true && res2==true)
            {
             JOptionPane.showMessageDialog(null, "Receptionist successfully updated!", "Success" , JOptionPane.INFORMATION_MESSAGE);
             jcRecpId.setSelectedIndex(0);
             return;
            }
            JOptionPane.showMessageDialog(null, "updationtion successful!"); 
            return; 
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnupdatebtnRegisterActionPerformed

    private void btnBack3btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBack3btnBackActionPerformed

    private void btnLogout3btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout3btnLogoutActionPerformed
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogout3btnLogoutActionPerformed

    private void jcRecpIdjcEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRecpIdjcEmployeeIdActionPerformed
 if(jcRecpId.getSelectedIndex() == -1) return;
        loadReceptionstDetails(jcRecpId.getSelectedItem().toString());
    }//GEN-LAST:event_jcRecpIdjcEmployeeIdActionPerformed

    private void txtRecpNametxtDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecpNametxtDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecpNametxtDoctorNameActionPerformed

    private void txtLoginIdtxtLoginIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginIdtxtLoginIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginIdtxtLoginIdActionPerformed

    private void txtPasswordtxtPwd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordtxtPwd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordtxtPwd1ActionPerformed

    private void txtConfromPasswordtxtPwd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfromPasswordtxtPwd2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfromPasswordtxtPwd2ActionPerformed

    private void jcgenderjcGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcgenderjcGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcgenderjcGenderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateReceptionistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateReceptionistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnLogout3;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jcRecpId;
    private javax.swing.JComboBox<String> jcgender;
    private javax.swing.JPasswordField txtConfromPassword;
    private javax.swing.JTextField txtLoginId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtRecpName;
    // End of variables declaration//GEN-END:variables
    private void loadRecpId() 
    {
        try
        {
            recpIdList=ReceptionistDao.getAllReceptionistIds();
            if(recpIdList.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Don't Have Any Receptionist");
                return;
            }
            for(String id:recpIdList)
            {
                jcRecpId.addItem(id);
            }
        }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,"Error In DB"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
    }
    
    
    private boolean validateInputs() 
    {
        newName = txtRecpName.getText().trim();
        this.loginId=this.txtLoginId.getText().trim();
        char[] p1=txtPassword.getPassword();
        char[] p2=txtConfromPassword.getPassword();
        if(loginId.isEmpty()||p1.length==0||p2.length==0 || newName.isEmpty())
            return false;
        password=new String(p1);
        cnfPassword=new String(p2);
        return true;
    }
    
    private String matchPassword() 
    {
        password=password.trim();
        cnfPassword=cnfPassword.trim();
        if(password.length()<3 || cnfPassword.length()<3)
            return "Passwords must be of atleast 3 characters in length";
        if(password.equals(cnfPassword)==false)
            return "Passwords do not match";
        return null;
    }
    
    private void loadReceptionstDetails(String Id) 
    {
        
        try{
            recp = ReceptionistDao.getReceptionistDetails(Id);
            txtRecpName.setText(recp.getReceptionistName());
            jcgender.setSelectedItem(recp.getGender());
            user = UserDao.getUserDetailsByName(recp.getReceptionistName());
            txtLoginId.setText(user.getLoginID());
            String pwd = PasswordDecryption.getDecryptedPassword(user.getUserpassword());
            System.out.println(password);
            txtPassword.setText(pwd);
            txtConfromPassword.setText(pwd);
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
        
    }
    

    

}
