
package Bank_sampah;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Sign_Up3 extends javax.swing.JFrame {

    /**
     * Creates new form Sign_Up3
     */
    public Sign_Up3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Minimize = new javax.swing.JLabel();
        jLabel_exit = new javax.swing.JLabel();
        jLabel_Minimize1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_tmpSignUp = new javax.swing.JLabel();
        jLabel_tmpFullName = new javax.swing.JLabel();
        jTextField_FullName = new javax.swing.JTextField();
        jLabel_iconFullName = new javax.swing.JLabel();
        jSeparator_FullName = new javax.swing.JSeparator();
        jLabel_tmpUsername = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel_iconUsername = new javax.swing.JLabel();
        jSeparator_Username = new javax.swing.JSeparator();
        jLabel_tmpPassword = new javax.swing.JLabel();
        jPasswordField_SignUp = new javax.swing.JPasswordField();
        jLabel_iconPassword = new javax.swing.JLabel();
        jSeparator_PassSignUp = new javax.swing.JSeparator();
        jLabel_tmpConfirmPass = new javax.swing.JLabel();
        jPasswordField_Confirm = new javax.swing.JPasswordField();
        jLabel_iconConfirmPass = new javax.swing.JLabel();
        jSeparator_ConfirmPass = new javax.swing.JSeparator();
        jButton_SignUp = new javax.swing.JButton();
        jLabel_toHome = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(360, 320));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Minimize.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel_Minimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Minimize.setText("Aplikasi Bank Sampah");
        jLabel_Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MinimizeMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 30));

        jLabel_exit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_exit.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_exit.setText("X");
        jLabel_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_exitMouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        jLabel_Minimize1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_Minimize1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Minimize1.setText("-");
        jLabel_Minimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Minimize1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel_Minimize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, -1, 25));

        jPanel3.setBackground(new java.awt.Color(51, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_tmpSignUp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel_tmpSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tmpSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tmpSignUp.setText("Sign Up");
        jPanel3.add(jLabel_tmpSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 340, -1));

        jLabel_tmpFullName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_tmpFullName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tmpFullName.setText("Full Name");
        jPanel3.add(jLabel_tmpFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 20));

        jTextField_FullName.setBackground(new java.awt.Color(51, 102, 0));
        jTextField_FullName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_FullName.setForeground(new java.awt.Color(255, 224, 0));
        jTextField_FullName.setBorder(null);
        jTextField_FullName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField_FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 190, 30));

        jLabel_iconFullName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_user_32px.png"))); // NOI18N
        jLabel_iconFullName.setText("jLabel6");
        jPanel3.add(jLabel_iconFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 30, 30));

        jSeparator_FullName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator_FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, 10));

        jLabel_tmpUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_tmpUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tmpUsername.setText("Username");
        jPanel3.add(jLabel_tmpUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, 20));

        jTextField_Username.setBackground(new java.awt.Color(51, 102, 0));
        jTextField_Username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(255, 224, 0));
        jTextField_Username.setBorder(null);
        jTextField_Username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jTextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 190, 30));

        jLabel_iconUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_user_32px.png"))); // NOI18N
        jLabel_iconUsername.setText("jLabel6");
        jPanel3.add(jLabel_iconUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 30, 30));

        jSeparator_Username.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 190, 10));

        jLabel_tmpPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_tmpPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tmpPassword.setText("Password");
        jPanel3.add(jLabel_tmpPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, 20));

        jPasswordField_SignUp.setBackground(new java.awt.Color(51, 102, 0));
        jPasswordField_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField_SignUp.setForeground(new java.awt.Color(255, 224, 0));
        jPasswordField_SignUp.setBorder(null);
        jPasswordField_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jPasswordField_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 190, 30));

        jLabel_iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_lock_32px_1_1.png"))); // NOI18N
        jLabel_iconPassword.setText("jLabel7");
        jPanel3.add(jLabel_iconPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 30, 30));

        jSeparator_PassSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator_PassSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 190, 10));

        jLabel_tmpConfirmPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_tmpConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_tmpConfirmPass.setText("Confirm Password");
        jPanel3.add(jLabel_tmpConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, -1, 20));

        jPasswordField_Confirm.setBackground(new java.awt.Color(51, 102, 0));
        jPasswordField_Confirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField_Confirm.setForeground(new java.awt.Color(255, 224, 0));
        jPasswordField_Confirm.setBorder(null);
        jPasswordField_Confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(jPasswordField_Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 190, 30));

        jLabel_iconConfirmPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_lock_32px_1_1.png"))); // NOI18N
        jLabel_iconConfirmPass.setText("jLabel7");
        jPanel3.add(jLabel_iconConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 30, 30));

        jSeparator_ConfirmPass.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator_ConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 190, 10));

        jButton_SignUp.setBackground(new java.awt.Color(32, 32, 32));
        jButton_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton_SignUp.setForeground(new java.awt.Color(255, 255, 255));
        jButton_SignUp.setText("SIGN UP");
        jButton_SignUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton_SignUp.setContentAreaFilled(false);
        jButton_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SignUpActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 240, 40));

        jLabel_toHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_toHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_toHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_toHome.setText("Already have an account? Login!");
        jLabel_toHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_toHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_toHomeMouseClicked(evt);
            }
        });
        jPanel3.add(jLabel_toHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 240, -1));

        jPanel4.setPreferredSize(new java.awt.Dimension(850, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/ffff.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 370, 570));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("\"Dulu Sampah, Sekarang Berkah\"");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, 580, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/unnamed1.jpg"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 730));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SignUpActionPerformed
        // Mendapatkan Full Name, Username, Password, dan Confrim Password
        String fullname = jTextField_FullName.getText();
        String username = jTextField_Username.getText();
        String pass = String.valueOf(jPasswordField_SignUp.getPassword());
        String confirmpass = String.valueOf(jPasswordField_Confirm.getPassword());
        
        if(cek_Fields()) {
            if(!cek_Username(username)) {
                PreparedStatement ps;
                ResultSet rs;
                // Menyimpan data inputan ke tabel user pada database
                String SignUpUserQuery = "INSERT INTO `tb_user`(`full_name`, `username`, `password`) VALUES (?,?,?)";
                
                try {
                    ps = Koneksi.getConnection().prepareStatement(SignUpUserQuery);
                    ps.setString(1, fullname);
                    ps.setString(2, username);
                    ps.setString(3, pass);
          
                    
                    if(ps.executeUpdate() != 0) {
                        // Tampilan informasi jika akun sudah berhasil dibuat
                        JOptionPane.showMessageDialog(null, "Your account has been created");
                    } else {
                        // Tampilan informasi eror
                        JOptionPane.showMessageDialog(null, "Error : Check Your Information");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Sign_Up3.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        }
    }//GEN-LAST:event_jButton_SignUpActionPerformed

    private void jLabel_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MinimizeMouseClicked
        // Berfungsi untuk minimize program
        this.setState(ICONIFIED);

    }//GEN-LAST:event_jLabel_MinimizeMouseClicked

    private void jLabel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_exitMouseClicked
        // Berfungsi sebagai tombol exit
        System.exit(0);
    }//GEN-LAST:event_jLabel_exitMouseClicked

    private void jLabel_toHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_toHomeMouseClicked
        // Berfungsi sebagai tomobol shortcut menuju for Home/Login
        Home_3 login = new Home_3();
        login.setVisible(true);
        login.pack();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel_toHomeMouseClicked

    private void jLabel_Minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Minimize1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_Minimize1MouseClicked
    
    // Method untuk melakukan verify field yang kosong
    public boolean cek_Fields() {
        String fullname = jTextField_FullName.getText();
        String username = jTextField_Username.getText();
        String pass = String.valueOf(jPasswordField_SignUp.getPassword());
        String confirmpass = String.valueOf(jPasswordField_Confirm.getPassword());
        
        // Berfungsi untuk melakukan verify field yang kosong
        if(fullname.trim().equals("") || username.trim().equals("") 
           || pass.trim().trim().equals("") || confirmpass.trim().equals("")) {
            // Tampilan peringatan jika terdapat field yang kosong tolong
            JOptionPane.showMessageDialog(null, "Please fill all required fields", "Empty Fields", 2);
            return false;
        // Berfungsi untuk verify apakah confirm password sudah sesuai dengan password
        } else if(!pass.equals(confirmpass)) {
            // Tampilan peringatan ketika confirm password tidak sesuai dengan password
            JOptionPane.showMessageDialog(null, "Password doesn't match", "Confirm password", 2);
            return false;
        } else {
            return true;
        }      
    }
    //Method untuk melakukan verify apakah username sudah digunakan sebelumnya
    public boolean cek_Username(String username) {
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `tb_user` WHERE `username` = ?";
        
        try {
            st = Koneksi.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next()) {
                username_exist = true;
                // Tampilan peringatan jika username sudah ada sebelumnya/sudah digunakan sebelumnya
                JOptionPane.showMessageDialog(null, "This username is already taken", "Username failed", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sign_Up3.class.getName()).log(Level.SEVERE, null, ex);
        }
       return username_exist;
    }
    
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
            java.util.logging.Logger.getLogger(Sign_Up3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_Up3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_Up3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_Up3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_Up3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Minimize;
    private javax.swing.JLabel jLabel_Minimize1;
    private javax.swing.JLabel jLabel_exit;
    private javax.swing.JLabel jLabel_iconConfirmPass;
    private javax.swing.JLabel jLabel_iconFullName;
    private javax.swing.JLabel jLabel_iconPassword;
    private javax.swing.JLabel jLabel_iconUsername;
    private javax.swing.JLabel jLabel_tmpConfirmPass;
    private javax.swing.JLabel jLabel_tmpFullName;
    private javax.swing.JLabel jLabel_tmpPassword;
    private javax.swing.JLabel jLabel_tmpSignUp;
    private javax.swing.JLabel jLabel_tmpUsername;
    private javax.swing.JLabel jLabel_toHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField_Confirm;
    private javax.swing.JPasswordField jPasswordField_SignUp;
    private javax.swing.JSeparator jSeparator_ConfirmPass;
    private javax.swing.JSeparator jSeparator_FullName;
    private javax.swing.JSeparator jSeparator_PassSignUp;
    private javax.swing.JSeparator jSeparator_Username;
    private javax.swing.JTextField jTextField_FullName;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
