/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.*;
import javax.swing.*;

public class Booking extends javax.swing.JFrame {

    
    public Booking() {
        initComponents();
       
        fullname.setText("Enter Recipient name");
        fullname.setForeground(new java.awt.Color(153, 153, 153));
        
        emaill.setText("Enter Email");
        emaill.setForeground(new java.awt.Color(153, 153, 153));
        
        num.setText("Enter Phone number");
        num.setForeground(new java.awt.Color(153, 153, 153));
       
        airline.setText("Enter Airline name");
        airline.setForeground(new java.awt.Color(153, 153, 153));
        
        from.setText("From(Country)");
        from.setForeground(new java.awt.Color(153, 153, 153));
        
        to.setText("To(Country)");
        to.setForeground(new java.awt.Color(153, 153, 153));
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelReservation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        emaill = new javax.swing.JTextField();
        airline = new javax.swing.JTextField();
        cmbRoom = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnMakeReservation1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        to = new javax.swing.JTextField();
        from = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));

        btnCancelReservation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelReservation.setForeground(new java.awt.Color(0, 0, 102));
        btnCancelReservation.setText("Cancel ");
        btnCancelReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelReservationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("BOOK TICKET");

        fullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fullnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fullnameFocusLost(evt);
            }
        });

        num.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numFocusLost(evt);
            }
        });

        emaill.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emaillFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emaillFocusLost(evt);
            }
        });

        airline.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                airlineFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                airlineFocusLost(evt);
            }
        });

        cmbRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Class", "Economy Class", "Business Class" }));
        cmbRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoomActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Accomodation");

        btnMakeReservation1.setBackground(new java.awt.Color(153, 153, 153));
        btnMakeReservation1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        btnMakeReservation1.setText("BOOK TICKET");
        btnMakeReservation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeReservation1ActionPerformed(evt);
            }
        });

        to.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                toFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                toFocusLost(evt);
            }
        });

        from.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fromFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fromFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(206, 206, 206))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(fullname)
                    .addComponent(num)
                    .addComponent(emaill)
                    .addComponent(airline)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(219, 219, 219))
                    .addComponent(to, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addComponent(btnMakeReservation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelReservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(num, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(airline, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnMakeReservation1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnCancelReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReservationActionPerformed
        clearFields();
        Main x = new Main();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnCancelReservationActionPerformed
    private void clearFields() {
    fullname.setText("");
    num.setText("");
    emaill.setText("");
    airline.setText("");
    cmbRoom.setSelectedIndex(0);
}

    private void btnMakeReservation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeReservation1ActionPerformed
        String fname = fullname.getText().trim();
        String too = to.getText().trim();
        String fromm = from.getText().trim();
        String number = num.getText().trim();
        String email = emaill.getText().trim();
        String air = airline.getText().trim();
        String SelectedRoom = getSelectedRoom();

        boolean errorOccurred = false;

        if (fname.isEmpty() || fname.equals("Please input a fullname.")) {
            fullname.setBorder(BorderFactory.createLineBorder(Color.RED));
            fullname.setText("Please input a fullname.");
            errorOccurred = true;
        }
        if (number.isEmpty() || number.equals("Please input a contact number.")) {
            num.setBorder(BorderFactory.createLineBorder(Color.RED));
            num.setText("Please input a contact number.");
            errorOccurred = true;
        }
        if (email.isEmpty() || email.equals("Please input a email.")) {
            emaill.setBorder(BorderFactory.createLineBorder(Color.RED));
            emaill.setText("Please input a email.");
            errorOccurred = true;
        }
        if (air.isEmpty() || air.equals("Please input a address.")) {
            airline.setBorder(BorderFactory.createLineBorder(Color.RED));
            airline.setText("Please input a email address.");
            errorOccurred = true;
        }
        
        if (too.isEmpty() || too.equals("Please input a destination.")) {
            to.setBorder(BorderFactory.createLineBorder(Color.RED));
            to.setText("Please input a destination.");
            errorOccurred = true;
        }
        
        if (fromm.isEmpty() || fromm.equals("Please input your current country.")) {
            from.setBorder(BorderFactory.createLineBorder(Color.RED));
            from.setText("Please input your current country.");
            errorOccurred = true;
        }
        
        if (checkFullNameExists(fname)) {
        JOptionPane.showMessageDialog(this, "Name already exists. Please use a different name.", "Duplicate Name", JOptionPane.WARNING_MESSAGE);
        errorOccurred = true;
        }

        if (!number.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Contact number should contain only numbers.", "Invalid Contact Number", JOptionPane.WARNING_MESSAGE);
            errorOccurred = true;
        }

        if (!errorOccurred) {
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to book this Ticket?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                try {
                    String userHome = System.getProperty("user.home");
                    String relativePath = userHome + File.separator + "Documents" + File.separator + "FINAL" + File.separator + "BOOKED TICKETS" + File.separator + "BookedTicketList.txt";

                    BufferedWriter writer = new BufferedWriter(new FileWriter(relativePath, true));
                    writer.write("BOOKED TICKETS INFORMATION");
                    writer.newLine();
                    writer.write("--------------------------");
                    writer.newLine();
                    writer.write("Fullname: " + fname);
                    writer.newLine();
                    writer.write("Contact Number: " + number);
                    writer.newLine();
                    writer.write("Email: " + email + "@gmail.com");
                    writer.newLine();
                    writer.write("Airline name: " + air);
                    writer.newLine();
                    writer.write("To(Country): " + too);
                    writer.newLine();
                    writer.write("From(Country): " + fromm);
                    writer.newLine();
                    writer.write("Accomodation: " + SelectedRoom);
                    writer.newLine();
                    writer.write("--------------------------");
                    writer.newLine();
                    writer.close();
                    JOptionPane.showMessageDialog(this, "Ticket Booked Successfully", "Booked!", JOptionPane.INFORMATION_MESSAGE);
                    Main x = new Main();
                    x.show();
                    this.hide();
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error occurred while saving data!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            clearWarningText(fullname, "Please input a fullname.");
            clearWarningText(num, "Please input a contact number.");
            clearWarningText(emaill, "Please input a email.");
            clearWarningText(airline, "Please input a email address.");
            
        }
    }//GEN-LAST:event_btnMakeReservation1ActionPerformed
        
    private void cmbRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoomActionPerformed

    private void fullnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameFocusGained
        if(fullname.getText().equals("Enter Recipient name")){
            fullname.setText("");
            fullname.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_fullnameFocusGained

    private void numFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numFocusGained
        if(num.getText().equals("Enter Phone number")){
            num.setText("");
            num.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_numFocusGained

    private void emaillFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emaillFocusGained
        if(emaill.getText().equals("Enter Email")){
            emaill.setText("");
            emaill.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_emaillFocusGained

    private void airlineFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_airlineFocusGained
        if(airline.getText().equals("Enter Airline name")){
            airline.setText("");
            airline.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_airlineFocusGained

    private void fullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameFocusLost
        if(fullname.getText().equals("")){
            fullname.setText("Enter Recipient name");
            fullname.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_fullnameFocusLost

    private void numFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numFocusLost
        if(num.getText().equals("")){
            num.setText("Enter Phone number");
            num.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_numFocusLost

    private void emaillFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emaillFocusLost
        if(emaill.getText().equals("")){
            emaill.setText("Enter Email");
            emaill.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_emaillFocusLost

    private void airlineFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_airlineFocusLost
        if(airline.getText().equals("")){
            airline.setText("Enter Airline name");
            airline.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_airlineFocusLost

    private void toFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_toFocusGained
        if(to.getText().equals("To(Country)")){
            to.setText("");
            to.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_toFocusGained

    private void toFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_toFocusLost
        if(to.getText().equals("")){
            to.setText("To(Country)");
            to.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_toFocusLost

    private void fromFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fromFocusGained
        if(from.getText().equals("From(Country)")){
            from.setText("");
            from.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_fromFocusGained

    private void fromFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fromFocusLost
        if(from.getText().equals("")){
            from.setText("From(Country)");
            from.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_fromFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus
    private boolean checkFullNameExists(String fullName) {
    try {
        String userHome = System.getProperty("user.home");
        String filePath = userHome + File.separator + "Documents" + File.separator + "FINAL" + File.separator + "BOOKED TICKETS" + File.separator + "BookedTicketList.txt";

        File file = new File(filePath);


        if (!file.exists()) {
            System.err.println("File not found: BookedTicketList.txt");
            return false;
        }

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(":");
            if (parts.length >= 2 && parts[0].trim().equalsIgnoreCase("Fullname") && parts[1].trim().equalsIgnoreCase(fullName)) {
                scanner.close();
                return true;
            }
        }

        scanner.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Error occurred while checking full name existence: " + e.getMessage());
    }

    return false; 
}

    private String getSelectedRoom() {
    return cmbRoom.getSelectedItem().toString();
    }
    private void setFieldListener(JTextField textField, String warningText) {
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(warningText)) {
                    textField.setText("");
                    textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText(warningText);
                    textField.setBorder(BorderFactory.createLineBorder(Color.RED));
                }
            }
        });
    } 
    private void clearWarningText(javax.swing.JTextField textField, String warningText) {
        if (textField.getText().equals(warningText)) {
            textField.setText("");
            textField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        }
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
    private javax.swing.JTextField airline;
    private javax.swing.JButton btnCancelReservation;
    private javax.swing.JButton btnMakeReservation1;
    private javax.swing.JComboBox<String> cmbRoom;
    private javax.swing.JTextField emaill;
    private javax.swing.JTextField from;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField num;
    private javax.swing.JTextField to;
    // End of variables declaration//GEN-END:variables
}
