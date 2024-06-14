/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.DepBal;
import Controller.DepBean;
import javax.swing.*;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class DepartmentFrame extends javax.swing.JFrame {
   
    
    public DepartmentFrame() {
        initComponents();
        
        loadTable();
    }
 
    public void loadAllDataIntoTable(List<DepBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (DepBean bean : list){
            Vector v = new Vector();
            v.add(bean.getId());
            v.add(bean.getDepName());
            v.add(bean.getDepLocation());
    
            
            dtm.addRow(v);
        }
    }
    
    
        public void loadTable(){
        //access those method which selecting all data
        
        DepBal bal = new DepBal();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    }
    
    //crete clear method
    public void clearTextFields(){
        
        DName.setText("");
        DLocation.setText("");
     
       
        
    }
   
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DLocation = new javax.swing.JTextField();
        DName = new javax.swing.JTextField();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        employee = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Manage Your Departments");
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Department");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 190, 50));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Location");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, -1));

        DLocation.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        DLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DLocationActionPerformed(evt);
            }
        });
        jPanel4.add(DLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 280, 40));

        DName.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jPanel4.add(DName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 280, 40));

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
        jPanel4.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 190, 40));

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
        jPanel4.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 190, 40));

        jButtonInsert.setBackground(new java.awt.Color(0, 153, 204));
        jButtonInsert.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("Add Department");
        jButtonInsert.setMargin(new java.awt.Insets(9, 14, 3, 14));
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 190, 40));

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Departments List");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 380, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/icons8-list-64.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Department", "Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
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

        employee.setBackground(new java.awt.Color(0, 204, 204));
        employee.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        employee.setForeground(new java.awt.Color(255, 255, 255));
        employee.setText("Employee");
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(33, Short.MAX_VALUE)
                        .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DLocationActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        DepBal bal = new DepBal();
        bal.deleteRecord(id);
        loadTable(); // reload table after deleting a record
        clearTextFields();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // call clear method
        clearTextFields();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed

        //this means on insert button click get values from user input
        String dName = DName.getText();
        String dLocation = DLocation.getText();
        
        
        //object of HomeBean class
        DepBean depBean = new DepBean(0, dName, dLocation); // passing values to the constructor
        
        //object of HomeBal class
        DepBal depObj = new DepBal();
        depObj.insert(depBean); //through object passing 
        loadTable();
        clearTextFields();
    }//GEN-LAST:event_jButtonInsertActionPerformed
 int id = 0; 
    private void jLabel9AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jLabel9AncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9AncestorResized

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0) {
            JOptionPane.showMessageDialog(null, "Please select any record from table for update or delete");

            //this code means when there haven't any selected record from table then display this
        }else{
            id = (int) jTable1.getValueAt(row, 0); //getting id from table
            DepBal bal = new DepBal();
            DepBean bean = bal.returnAllDataToTesxtFields(id); //this method has return type
            DName.setText(bean.getDepName());
            DLocation.setText(bean.getDepLocation());
            

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        this.hide();
        HomeFrame jButton1Obj = new HomeFrame();
        jButton1Obj.show();
    }//GEN-LAST:event_employeeActionPerformed

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
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DLocation;
    private javax.swing.JTextField DName;
    private javax.swing.JButton employee;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
