/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.io.*;
import java.nio.file.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Main extends javax.swing.JFrame {
    private String loggedinEmail;
    private Object[][] originalData;
    private Object[][] modifiedData;
    private int[] selectedRows;
    private int[] selectedColumns;

    public Main() {
        initComponents();
        displayTickets();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        btnAddproduct = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHome = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBackground(new java.awt.Color(124, 182, 124));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Airlines Online Booking System");

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        btnLogout.setBackground(new java.awt.Color(124, 182, 124));
        btnLogout.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setContentAreaFilled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnAddproduct.setBackground(new java.awt.Color(124, 182, 124));
        btnAddproduct.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAddproduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddproduct.setText("BOOK");
        btnAddproduct.setBorder(null);
        btnAddproduct.setBorderPainted(false);
        btnAddproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddproductActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(124, 182, 124));
        btnUpdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE ");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(124, 182, 124));
        btnDelete.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE ");
        btnDelete.setBorderPainted(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(185, 185, 185)
                .addComponent(btnLogout)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Booked Ticket List");

        tableHome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Recipient", "Contact No.", "Email", "Airlines", "To(Country)", "From(Country)", "Accomodation"
            }
        ));
        tableHome.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableHome);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(358, 358, 358))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void transferEmailNum(String emailNum) {
        loggedinEmail = emailNum;
    }
private void displayTickets() {
    DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
    String userHome = System.getProperty("user.home");
    String relativePath = userHome + File.separator + "Documents" + File.separator + "FINAL" + File.separator + "BOOKED TICKETS" + File.separator + "BookedTicketList.txt";
    Path filePath = Paths.get(relativePath);

    if (Files.exists(filePath)) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Fullname:")) {
                    String[] info = new String[7];
                    for (int i = 0; i < 7; i++) {
                        String[] parts = line.split(": ", 2);
                        if (parts.length == 2) {
                            info[i] = parts[1];
                        } else {
                            info[i] = "N/A";
                        }
                        line = br.readLine();
                    }
                    model.addRow(info);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error reading BookedTicketList.txt");
        }
    } else {
        System.err.println("BookedTicketList.txt does not exist");
    }
}

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login x = new Login();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddproductActionPerformed
        Booking x = new Booking();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddproductActionPerformed
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
        selectedRows = tableHome.getSelectedRows();
        selectedColumns = tableHome.getSelectedColumns();

        if (selectedRows.length > 0 && selectedColumns.length > 0) {
            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to change the data in the table?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                if (originalData == null) {
                    originalData = new Object[selectedRows.length][selectedColumns.length];
                    for (int i = 0; i < selectedRows.length; i++) {
                        for (int j = 0; j < selectedColumns.length; j++) {
                            originalData[i][j] = model.getValueAt(selectedRows[i], selectedColumns[j]);
                        }
                    }
                }
                modifiedData = new Object[selectedRows.length][selectedColumns.length];
                for (int i = 0; i < selectedRows.length; i++) {
                    for (int j = 0; j < selectedColumns.length; j++) {
                        modifiedData[i][j] = getUpdatedDataFromTable(selectedRows[i], selectedColumns[j]);
                    }
                }
                for (int selectedRow : selectedRows) {
                    for (int selectedColumn : selectedColumns) {
                        String updatedData = getUpdatedDataFromTable(selectedRow, selectedColumn);

                        if (updatedData != null) {
                            model.setValueAt(updatedData, selectedRow, selectedColumn);
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to retrieve the updated data.", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }

                updateTicketFile(model);
                JOptionPane.showMessageDialog(this, "Booked Ticket updated successfully!", "Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (originalData != null && modifiedData != null) {
                    for (int i = 0; i < selectedRows.length; i++) {
                        for (int j = 0; j < selectedColumns.length; j++) {
                            model.setValueAt(originalData[i][j], selectedRows[i], selectedColumns[j]);
                        }
                    }
                    modifiedData = null;
                }
                JOptionPane.showMessageDialog(this, "Update canceled.", "Canceled", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select cell(s) to update.", "No Cell Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
        int rowCount = tableHome.getRowCount();

        if (rowCount > 0) {
            int choice = JOptionPane.showOptionDialog(this, "What data do you want to delete?", "Delete",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Delete All Data", "Delete Selected Row(s) Data"}, "Delete All Data");

            if (choice == JOptionPane.YES_OPTION) {
                int confirmDelete = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete all data?",
                        "Delete All", JOptionPane.YES_NO_OPTION);
                if (confirmDelete == JOptionPane.YES_OPTION) {
                    model.setRowCount(0);
                    deleteAllDataFromFile();
                    JOptionPane.showMessageDialog(this, "All data deleted successfully!", "Delete Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (choice == JOptionPane.NO_OPTION) {
                int[] selectedRows = tableHome.getSelectedRows();
                if (selectedRows.length > 0) {
                    int confirmDelete = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the selected row(s)?",
                            "Confirm Delete Selected Rows", JOptionPane.YES_NO_OPTION);
                    if (confirmDelete == JOptionPane.YES_OPTION) {
                        deleteSelectedRows(selectedRows);
                        JOptionPane.showMessageDialog(this, "Selected row(s) deleted successfully!", "Delete Successful", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please select row(s) to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No data to delete.", "Empty Table", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus
    private void reloadTableData() {
    DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
    
    model.setRowCount(0);
    displayTickets();
    }
    private String getUpdatedDataFromTable(int rowIndex, int columnIndex) {
        DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
        return String.valueOf(model.getValueAt(rowIndex, columnIndex));
    }

private void updateTicketFile(DefaultTableModel model) {
    try {
        String userHome = System.getProperty("user.home");
        String relativePath = userHome + File.separator + "Documents" + File.separator + "FINAL" + File.separator + "BOOKED TICKETS" + File.separator + "BookedTicketList.txt";

        Path filePath = Paths.get(relativePath);

        StringBuilder content = new StringBuilder();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        content.append("TICKET LIST INFORMATION\n");
        content.append("--------------------------\n");

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                String columnName = model.getColumnName(j);
                String cellValue = String.valueOf(model.getValueAt(i, j));
                content.append(columnName).append(": ").append(cellValue).append("\n");
            }
            content.append("--------------------------\n");
        }

        Files.write(filePath, content.toString().getBytes());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    private void deleteSelectedRows(int[] rowsToDelete) {
    DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
    Arrays.sort(rowsToDelete);

    for (int i = rowsToDelete.length - 1; i >= 0; i--) {
        int row = rowsToDelete[i];
        model.removeRow(row);
    }
    updateFileFromTableModel();
}

    private void deleteAllDataFromFile() {
        try {
            String userHome = System.getProperty("user.home");
            String relativePath = userHome + File.separator + "Documents" + File.separator + "FINAL" + File.separator + "BOOKED TICKETS" + File.separator + "BookedTicketList.txt";

            Path filePath = Paths.get(relativePath);
            Files.deleteIfExists(filePath); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateFileFromTableModel() {
        try {
            String userHome = System.getProperty("user.home");
            String relativePath = userHome + File.separator + "Documents" + File.separator + "FINAL" + File.separator + "BOOKED TICKETS" + File.separator + "BookedTicketList.txt";

            Path filePath = Paths.get(relativePath);
            StringBuilder content = new StringBuilder();
            DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
            int rowCount = model.getRowCount();
            int columnCount = model.getColumnCount();

            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    String columnName = model.getColumnName(j);
                    String cellValue = String.valueOf(model.getValueAt(i, j));
                    content.append(columnName).append(": ").append(cellValue).append("\n");
                }
                content.append("--------------------------\n");
            }

            Files.write(filePath, content.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
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
    private javax.swing.JButton btnAddproduct;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHome;
    // End of variables declaration//GEN-END:variables
}
