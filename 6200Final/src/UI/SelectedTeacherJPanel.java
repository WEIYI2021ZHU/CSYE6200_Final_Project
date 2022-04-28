/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.CardLayout;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.DayCare;
import models.Teacher;



/**
 *
 * @author changningliu
 */
public class SelectedTeacherJPanel extends javax.swing.JPanel {

    private JPanel mainJPanel;
    private DayCare dayCare;
    /**
     * Creates new form TeacherJPanel
     */
    public SelectedTeacherJPanel(JPanel mainJPanel,  DayCare dayCare) {
        initComponents();
        this.mainJPanel = mainJPanel;
        this.dayCare = dayCare;
        
        refreshTable();
//        this.setSize(1000, 500);
        this.setSize(700, 500);

    }

    public void refreshTable() {

        DefaultTableModel model = (DefaultTableModel) TeacherTable.getModel();
        model.setRowCount(0);
        for (Teacher p : dayCare.getTeachers()) {
            Object row[] = new Object[7];
            row[0] = p.getId();
            row[1] = p.getName();
            row[2] = p.getAge();
            row[3] = p.getCapacity();
            row[4] = p.getCredits();
            row[5] = p.getMinStuAge();
            row[6] = p.getMaxStuAge();
            model.addRow(row);
        }
    }
    
//    private void readStudentsCSV() {
////        students.clear();
////        SimpleDateFormat timeFt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////
//        try {
////            Scanner inLine = new Scanner(new BufferedReader(new FileReader(studentCSVFile)));
////
////            while (inLine.hasNextLine()) {
////                String inputLine = inLine.nextLine();
////                Scanner in = new Scanner(inputLine);
////                in.useDelimiter(",");
////
////	            int studentId = in.nextInt();
////                int age = in.nextInt();
////                double gpa = in.nextDouble();
////                Date registerDate = timeFt.parse(in.next());
////                Date renewDate = timeFt.parse(in.next());
////                String firstName = in.next();
////                String lastName = in.next();
////                String parentFirstName = in.next();
////                String parentLastName = in.next();
////                String phone = in.next();
////                String address = in.next();
////                students.add(new Student(studentId, age, gpa, registerDate, renewDate, firstName, lastName, parentFirstName, parentLastName, phone, address));
////                in.close();
////            }
//
////            inLine.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TeacherTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        TeacherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Teacher ID", "Name", "Age", "Capacity", "Credits", "MinStuAge", "MaxStuAge"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TeacherTable);

        jLabel1.setText("Teacher List");

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<< Back to main");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(539, 539, 539)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addGap(407, 407, 407))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mainJPanel.remove(this);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.previous(mainJPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int row = TeacherTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int t = (int)TeacherTable.getValueAt(row,0);
        SelectedStudentJPanel vs = new SelectedStudentJPanel(mainJPanel, dayCare, t);
        mainJPanel.add(vs);
        CardLayout layout = (CardLayout) mainJPanel.getLayout();
        layout.next(mainJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TeacherTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}