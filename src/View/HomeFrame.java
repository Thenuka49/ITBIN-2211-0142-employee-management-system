/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.HomeBal;
import Controller.HomeBean;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sheha
 */
public class HomeFrame extends javax.swing.JFrame {
    

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        
        loadTable();
    }
    
    //method for load table
    
    public void loadAllDataIntoTable(List<HomeBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (HomeBean bean : list){
            Vector v = new Vector();
            v.add(bean.getId());
            v.add(bean.getFirstName());
            v.add(bean.getLastName());
            v.add(bean.getGender());
            v.add(bean.getCity());
            v.add(bean.getDate());
            v.add(bean.getAddress());
            
            dtm.addRow(v);
        }
    }
    
    
    public void loadTable(){
        //access those method which selecting all data
        
        HomeBal bal = new HomeBal();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    }
    
    //crete clear method
    public void clearTextFields(){
        
        FirstName.setText("");
        LastName.setText("");
        jDateChooser1.setDate(null);
        jTextAreaAddress.setText("");
       
        
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        FirstName = new javax.swing.JTextField();
        jComboBoxCity = new javax.swing.JComboBox<>();
        jComboBoxGender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(241, 241, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 660, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 660, 40));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Manage Your Employees");
        jLabel9.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jLabel9AncestorResized(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 510, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/icons8-settings-64.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, -1, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 660, 90));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Home Page"));
        jPanel4.setForeground(new java.awt.Color(255, 255, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Address");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 170, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("First Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 190, 50));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Last Name");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 130, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Gender");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 130, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("City");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 140, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Date");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 200, -1));

        LastName.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        LastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameActionPerformed(evt);
            }
        });
        jPanel4.add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 280, 40));

        FirstName.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jPanel4.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 280, 40));

        jComboBoxCity.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jComboBoxCity.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombo", "Gampaha", "Kaluthara", "Jaffa" }));
        jPanel4.add(jComboBoxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 280, 40));

        jComboBoxGender.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jComboBoxGender.setForeground(new java.awt.Color(102, 102, 102));
        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel4.add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 280, 40));

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 280, 80));

        jButtonDelete.setBackground(new java.awt.Color(255, 0, 51));
        jButtonDelete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("DELETE");
        jButtonDelete.setMargin(new java.awt.Insets(9, 14, 3, 14));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 190, 40));

        jButtonUpdate.setBackground(new java.awt.Color(0, 204, 153));
        jButtonUpdate.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("UPDATE");
        jButtonUpdate.setMargin(new java.awt.Insets(9, 14, 3, 14));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 190, 40));

        jButtonClear.setBackground(new java.awt.Color(0, 102, 102));
        jButtonClear.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("CLEAR");
        jButtonClear.setMargin(new java.awt.Insets(9, 14, 3, 14));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 620, 40));

        jButtonInsert.setBackground(new java.awt.Color(0, 153, 204));
        jButtonInsert.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("Add Employee");
        jButtonInsert.setMargin(new java.awt.Insets(9, 14, 3, 14));
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 190, 40));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 280, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 660, 680));
        jPanel4.getAccessibleContext().setAccessibleDescription("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Gender", "City", "Date", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 820, 570));

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Employees List");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/icons8-list-64.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 820, 90));

        jPanel8.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 730, 820, 40));

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, -1, -1));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 170, -1, -1));
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 700, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Department");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1345, 20, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 1940, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        
        //this means on insert button click get values from user input
        String firstName = FirstName.getText();
        String lastName = LastName.getText();
        String gender = (String) jComboBoxGender.getSelectedItem();
        String city = (String) jComboBoxCity.getSelectedItem();
        Date date = jDateChooser1.getDate();
        String address = jTextAreaAddress.getText();
        
        //object of HomeBean class
        HomeBean homeBean = new HomeBean(0, firstName, lastName, gender, city, date, address); // passing values to the constructor
        
        //object of HomeBal class
        HomeBal homeObj = new HomeBal();
        homeObj.insert(homeBean); //through object passing 
        loadTable();
        clearTextFields();
    }//GEN-LAST:event_jButtonInsertActionPerformed
        
    int id = 0; //global variable (because through this variable can make updating process)
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0) {
            JOptionPane.showMessageDialog(null, "Please select any record from table for update or delete");
            
            //this code means when there haven't any selected record from table then display this
        }else{
            id = (int) jTable1.getValueAt(row, 0); //getting id from table
            HomeBal bal = new HomeBal();
            HomeBean bean = bal.returnAllDataToTesxtFields(id); //this method has return type
            FirstName.setText(bean.getFirstName());
            LastName.setText(bean.getLastName());
            jComboBoxGender.setSelectedItem(bean.getGender());
            jComboBoxCity.setSelectedItem(bean.getCity());
            jDateChooser1.setDate(bean.getDate());
            jTextAreaAddress.setText(bean.getAddress());
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        
        String firstName = FirstName.getText();
        String lastName = LastName.getText();
        String gender = (String) jComboBoxGender.getSelectedItem();
        String city = (String) jComboBoxCity.getSelectedItem();
        Date date = jDateChooser1.getDate();
        String address = jTextAreaAddress.getText();
        HomeBean bean = new HomeBean(id, firstName, lastName, gender, city, date, address);
        HomeBal bal = new HomeBal();
        bal.updateDate(bean);
        loadTable(); // after update reload table again
        clearTextFields();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        
        HomeBal bal = new HomeBal();
        bal.deleteRecord(id);
        loadTable(); // reload table after deleting a record
        clearTextFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // call clear method 
        clearTextFields();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jLabel9AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jLabel9AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9AncestorResized

    
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.hide(); 
        DepartmentFrame jButton1Obj = new DepartmentFrame();
        jButton1Obj.show(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    *
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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxCity;
    private javax.swing.JComboBox<String> jComboBoxGender;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAddress;
    // End of variables declaration//GEN-END:variables
}
