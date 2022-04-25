/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author HP
 */
public class StudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private JPanel mainJPanel;
    //Student student;
    
    public StudentJPanel(JPanel mainJPanel) {
        this.mainJPanel = mainJPanel;
        initComponents();
       //this.student = student;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblOwnName = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblOwnTel = new javax.swing.JLabel();
        txtPName = new javax.swing.JTextField();
        lblEmailAdd = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Student Portal");

        lblBrand.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBrand.setText("Name:");

        lblModel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblModel.setText("Age:");

        lblColor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblColor.setText("Phone Number:");

        lblOwnName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOwnName.setText("ID:");

        lblOwnTel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOwnTel.setText("Parent`s Name:");

        lblEmailAdd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailAdd.setText("Address:");

        btnSave.setText("Continue");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblColor)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblModel)
                                        .addComponent(lblBrand)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblOwnTel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblEmailAdd))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addComponent(lblOwnName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSave))
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitle)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBrand)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnName)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnTel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailAdd)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnSave)
                .addContainerGap(303, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String name = txtName.getText();
        String phone = txtPhone.getText();
        String age = txtAge.getText();        
        String ID = txtID.getText();
        String address = txtAddress.getText();
        String pName = txtPName.getText();
        
//        student.setName(name);
//        student.setPhone(phone);
//        student.setAddress(address);
//        student.setAge(age);
//        student.setID(ID);
//        student.setpName(pName);
        
        // to ensure owner name does not contain digital number
        if (name.equals("")){
            JOptionPane.showMessageDialog(this, "Name is Empty!!");
        }
        
        if (phone.equals("")){
            JOptionPane.showMessageDialog(this, "Phone is Empty!!");
        }
        
        if (age.equals("")){
            JOptionPane.showMessageDialog(this, "Age is Empty!!");
        }
        
        if (ID.equals("")){
            JOptionPane.showMessageDialog(this, "ID is Empty!!");
        }
        else if(ID.length()!=2||!isNumeric(ID)){
                JOptionPane.showMessageDialog(this,"Invalid enter of ID!");
            }
        
        if (pName.equals("")){
            JOptionPane.showMessageDialog(this, "Parents` Name is Empty!!");
        }
        
        if (address.equals("")){
            JOptionPane.showMessageDialog(this, "Address is Empty!!");
        }
        
        JOptionPane.showMessageDialog(this, "Student Information Saved!");
        
        StudentImmunizationJPanel sip = new StudentImmunizationJPanel(mainJPanel);
        mainJPanel.add(sip);
        CardLayout layout = (CardLayout)mainJPanel.getLayout();
        layout.next(mainJPanel);
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEmailAdd;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblOwnName;
    private javax.swing.JLabel lblOwnTel;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

    private boolean isNumeric(String ID) {
        for (int i = ID.length(); --i>=0; ){    
            if (!Character.isDigit(ID.charAt(i))){  
                return false;  
            }  
        }  
        return true;          
    }
}



 
