/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.Classroom;
import models.DayCare;
import models.Student;
import models.Teacher;

/**
 *
 * @author weiyi
 */
public class StudentListJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentList
     */
    private JPanel jp;
    private DayCare dayCare;
    public StudentListJPanel(JPanel jp, DayCare dayCare) {
        initComponents();
        this.jp = jp;
        this.dayCare = dayCare;
        refreshTable();
        
        System.out.println(dayCare.getTeachers());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStudent = new javax.swing.JLabel();
        ScrollPnae = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        lblStudent.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblStudent.setText("Student List");

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Age", "Parent Name", "Phone", "Teacher", "Classroom", "Walk-in Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPnae.setViewportView(studentTable);
        if (studentTable.getColumnModel().getColumnCount() > 0) {
            studentTable.getColumnModel().getColumn(0).setResizable(false);
            studentTable.getColumnModel().getColumn(1).setResizable(false);
            studentTable.getColumnModel().getColumn(2).setResizable(false);
            studentTable.getColumnModel().getColumn(3).setResizable(false);
            studentTable.getColumnModel().getColumn(4).setResizable(false);
            studentTable.getColumnModel().getColumn(5).setResizable(false);
            studentTable.getColumnModel().getColumn(6).setResizable(false);
            studentTable.getColumnModel().getColumn(7).setResizable(false);
        }

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnBack)
                        .addGap(183, 183, 183)
                        .addComponent(lblStudent))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(ScrollPnae, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblStudent))
                .addGap(72, 72, 72)
                .addComponent(ScrollPnae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        jp.remove(this);
        CardLayout layout = (CardLayout) jp.getLayout();
        layout.previous(jp);
    }//GEN-LAST:event_btnBackActionPerformed

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) studentTable.getModel();
        model.setRowCount(0);
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        for(Classroom c: dayCare.getClassrooms()) {
            int classID = c.getId();
            for(Teacher t: c.getGroup()) {
                for(Student stu: t.getStuList()) {
                    Object[] row = new Object[8];
                    row[0] = stu.getId();
                    row[1] = stu.getName();
                    row[2] = stu.getAge();
                    row[3] = stu.getParentName();
                    row[4] = stu.getPhoneNum();
                    row[5] = t.getName();
                    row[6] = classID;
                    Date date = stu.getWalkInDate();
                    String sDate = dateFormat.format(date);
                    row[7] = sDate;
                    model.addRow(row);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPnae;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblStudent;
    private javax.swing.JTable studentTable;
    // End of variables declaration//GEN-END:variables
}
