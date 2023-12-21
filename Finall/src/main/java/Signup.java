/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Signup extends javax.swing.JFrame {

    public Signup() {
        initComponents();
        
        firstname.setText("Enter Firstname");
        firstname.setForeground(new java.awt.Color(153, 153, 153));
        
        lastname.setText("Enter Lastname");
        lastname.setForeground(new java.awt.Color(153, 153, 153));
        
        emaill.setText("Enter Email");
        emaill.setForeground(new java.awt.Color(153, 153, 153));
        
        confirmpassword.setText("Confirm Password");
        confirmpassword.setForeground(new java.awt.Color(153, 153, 153));
        confirmpassword.setEchoChar((char)0);
        
        password.setText("Enter Password");
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setEchoChar((char)0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        SIGNUP = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        emaill = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnBacktoLogin1 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        confirmpassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGNUP");
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        SIGNUP.setBackground(new java.awt.Color(255, 255, 255));
        SIGNUP.setPreferredSize(new java.awt.Dimension(815, 652));
        SIGNUP.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(815, 652));
        jPanel2.setLayout(null);

        firstname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                firstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                firstnameFocusLost(evt);
            }
        });
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel2.add(firstname);
        firstname.setBounds(430, 140, 140, 39);

        lastname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lastnameFocusLost(evt);
            }
        });
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel2.add(lastname);
        lastname.setBounds(581, 139, 140, 39);

        emaill.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emaill.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emaillFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emaillFocusLost(evt);
            }
        });
        emaill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emaillActionPerformed(evt);
            }
        });
        jPanel2.add(emaill);
        emaill.setBounds(431, 184, 290, 39);

        btnSignUp.setBackground(new java.awt.Color(153, 153, 153));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp);
        btnSignUp.setBounds(430, 330, 290, 42);

        login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        login.setText("L͟o͟g͟ i͟n͟ h͟e͟r͟e͟ .");
        login.setBorder(null);
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.setFocusPainted(false);
        login.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login);
        login.setBounds(610, 410, 83, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Sign up");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(470, 80, 128, 48);

        btnBacktoLogin1.setText("Already have an account?");
        btnBacktoLogin1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBacktoLogin1.setBorderPainted(false);
        btnBacktoLogin1.setContentAreaFilled(false);
        btnBacktoLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBacktoLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoLogin1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBacktoLogin1);
        btnBacktoLogin1.setBounds(440, 410, 190, 30);

        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        jPanel2.add(password);
        password.setBounds(431, 229, 290, 45);

        confirmpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmpasswordFocusLost(evt);
            }
        });
        jPanel2.add(confirmpassword);
        confirmpassword.setBounds(431, 280, 290, 45);

        jPanel1.setBackground(new java.awt.Color(124, 182, 124));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Your Journey begins here! ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Effortless booking");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 510);

        show.setText("Show password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel2.add(show);
        show.setBounds(430, 380, 120, 22);

        SIGNUP.add(jPanel2);
        jPanel2.setBounds(0, 0, 801, 500);

        getContentPane().add(SIGNUP);
        SIGNUP.setBounds(0, 0, 801, 500);
        SIGNUP.getAccessibleContext().setAccessibleName("SIGNUP");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        Login x = new Login();
        x.show();
        this.hide();
    }//GEN-LAST:event_loginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
         String fname = firstname.getText().trim();
         String lname = lastname.getText().trim();
         String email = emaill.getText().trim();  
         String pass = password.getText();
         String pass2 = confirmpassword.getText();


            boolean errorOccurred = false;

            if (!pass.equals(pass2)) {
                setErrorText("Passwords do not match!", confirmpassword);
                setErrorBorder(confirmpassword);
                errorOccurred = true;
            } else {
                clearErrorText(confirmpassword);
            }
            if (pass.isEmpty() || pass.equals("Password") || pass.equals("Please input a password.")) {
                setErrorText("Please input a password.", password);
                setErrorBorder(password);
                errorOccurred = true;
            } else {
                clearErrorText(password);
            }
            if (pass2.isEmpty() || pass2.equals("Confirm password") || pass2.equals("Please confirm password.")) {
                setErrorText("Please confirm password.", confirmpassword);
                setErrorBorder(confirmpassword);
                errorOccurred = true;
            } else {
                clearErrorText(confirmpassword);
            }

            if (fname.isEmpty() || fname.equals("Firstname") || fname.equals("Please input the first name.")) {
                setErrorText("Please input the first name.", firstname);
                setErrorBorder(firstname);
                errorOccurred = true;
            } else {
                clearErrorText(firstname);
            }

            if (lname.isEmpty() || lname.equals("Lastname") || lname.equals("Please input the last name.")) {
                setErrorText("Please input the last name.", lastname);
                setErrorBorder(lastname);
                errorOccurred = true;
            } else {
                clearErrorText(lastname);
            }

            if (email.isEmpty() || email.equals("Email") || email.equals("Please input an email!")) {
                setErrorText("Please input an email!", emaill);
                setErrorBorder(emaill);
                errorOccurred = true;
            } else {
                clearErrorText(emaill);
            }
            if (!errorOccurred && isEmailExists(email)) {
                JOptionPane.showMessageDialog(this, "Email already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                setErrorText("Email or already exists!", emaill);
                setErrorBorder(emaill);
                errorOccurred = true;
            }
            if (!errorOccurred) {
                try {
                    String userHome = System.getProperty("user.home");
                    String filePath = userHome + File.separator + "Documents" + File.separator + "FINAL" + File.separator + "BOOKED TICKETS" + File.separator + email + ".txt";

                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
                    writer.write("----------------------------");
                    writer.newLine();
                    writer.write("ACCOUNT INFORMATION");
                    writer.newLine();
                    writer.write("----------------------------");
                    writer.newLine();
                    writer.write("Name: " + fname + " " + lname);
                    writer.newLine();
                    writer.write("Email: " + email);
                    writer.newLine();
                    writer.write("Password: " + pass);
                    writer.newLine();
                    writer.write("--------------------------");
                    writer.newLine();
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Account created successfully!", " ", JOptionPane.INFORMATION_MESSAGE);
                    firstname.setText("");
                    lastname.setText("");
                    emaill.setText("");
                    password.setText("");
                    confirmpassword.setText("");
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error occurred while saving data!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
        Login x = new Login();
        x.show();
        this.hide();
            }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void emaillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emaillActionPerformed

    }//GEN-LAST:event_emaillActionPerformed

    private void emaillFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emaillFocusGained
        if(emaill.getText().equals("Enter Email")){
            emaill.setText("");
            emaill.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_emaillFocusGained

    private void lastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusGained
        if(lastname.getText().equals("Enter Lastname")){
            lastname.setText("");
            lastname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_lastnameFocusGained

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed

    }//GEN-LAST:event_firstnameActionPerformed

    private void firstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusGained
        if(firstname.getText().equals("Enter Firstname")){
            firstname.setText("");
            firstname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_firstnameFocusGained

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void btnBacktoLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBacktoLogin1ActionPerformed

    private void firstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_firstnameFocusLost
        if(firstname.getText().equals("")){
            firstname.setText("Enter Firstname");
            firstname.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_firstnameFocusLost

    private void lastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lastnameFocusLost
        if(lastname.getText().equals("")){
            lastname.setText("Enter Lastname");
            lastname.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_lastnameFocusLost

    private void emaillFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emaillFocusLost
        if(emaill.getText().equals("")){
            emaill.setText("Enter Email");
            emaill.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_emaillFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if(show.isSelected()){
            password.setEchoChar((char) 0);
            confirmpassword.setEchoChar((char) 0);
        }else{
            password.setEchoChar('*');
            confirmpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if(String.valueOf(password.getPassword()).equals("Enter Password")){
            password.setText("");
            password.setForeground(Color.BLACK);
            password.setEchoChar('•');
        }
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if(password.getPassword().length<1){
            password.setEchoChar((char)0);
            password.setText("Enter Password");
            password.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_passwordFocusLost

    private void confirmpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpasswordFocusGained
        if(String.valueOf(confirmpassword.getPassword()).equals("Confirm Password")){
            confirmpassword.setText("");
            confirmpassword.setForeground(Color.BLACK);
            confirmpassword.setEchoChar('•');
        }
    }//GEN-LAST:event_confirmpasswordFocusGained

    private void confirmpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpasswordFocusLost
        if(confirmpassword.getPassword().length<1){
            confirmpassword.setEchoChar((char)0);
            confirmpassword.setText("Confirm Password");
            confirmpassword.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_confirmpasswordFocusLost
    private void clearErrorText(javax.swing.JTextField textField) {
        textField.setForeground(Color.BLACK);
    }
    private void setErrorText(String message, javax.swing.JTextField textField) {
        textField.setText(message);
        textField.setForeground(Color.BLACK);
    }
    private void setErrorBorder(javax.swing.JTextField textField) {
        textField.setBorder(BorderFactory.createLineBorder(Color.RED));
    }
    private void setNormalBorder(javax.swing.JTextField textField) {
        textField.setBorder(UIManager.getLookAndFeel().getDefaults().getBorder("TextField.border"));
    }
    private boolean isEmailExists(String email) {
    boolean exists = false;
    String userHome = System.getProperty("user.home");
    String directoryPath = userHome + File.separator + "Documents" + File.separator + "FINAL" + File.separator + "BOOKED TICKETS";

    File directory = new File(directoryPath);
    File[] files = directory.listFiles();

    if (files != null) {
        for (File file : files) {
            if (file.getName().equalsIgnoreCase(email + ".txt")) {
                exists = true;
                break;
            }
        }
    }

    return exists;
}


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Login().setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SIGNUP;
    private javax.swing.JButton btnBacktoLogin1;
    private javax.swing.JButton btnSignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JTextField emaill;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables

}
