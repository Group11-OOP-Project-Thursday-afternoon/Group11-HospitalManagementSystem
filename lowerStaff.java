/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.TUAN
 */
import java.awt.Graphics2D;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class lowerStaff extends javax.swing.JFrame {

    /**
     * Creates new form lowerStaff
     */
    DefaultTableModel tableModel;
    Connection conn = null;
    DBconnect db = new DBconnect();
    String s;
    byte[] person_image = null;
    

    public lowerStaff() {
        initComponents();
        tableModel = (DefaultTableModel) table.getModel();
        showTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        staff = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        join = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOWER STAFF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 153, 204))); // NOI18N
        jPanel3.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EMPLOYEESDETAILS.png"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 60, 160, 160);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("STAFF ID");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(260, 40, 100, 30);
        jPanel3.add(id);
        id.setBounds(390, 40, 370, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("NAME");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(230, 110, 80, 30);
        jPanel3.add(name);
        name.setBounds(300, 110, 280, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("AGE");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(630, 114, 60, 20);
        jPanel3.add(age);
        age.setBounds(680, 110, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("GENDER");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(610, 170, 60, 30);

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel3.add(gender);
        gender.setBounds(680, 170, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("PHONE");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(220, 170, 60, 20);
        jPanel3.add(phone);
        phone.setBounds(300, 170, 280, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("ADDRESS");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(200, 230, 70, 30);
        jPanel3.add(address);
        address.setBounds(300, 230, 540, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("STAFF TYPE");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(190, 290, 100, 30);
        jPanel3.add(staff);
        staff.setBounds(300, 290, 250, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("JOIN DATE");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(590, 290, 80, 30);
        jPanel3.add(join);
        join.setBounds(680, 290, 160, 30);

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add (5).png"))); // NOI18N
        add.setText("ADD ");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel3.add(add);
        add.setBounds(10, 330, 170, 60);

        delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/removeuser.png"))); // NOI18N
        delete.setText("DELETE ");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete);
        delete.setBounds(10, 410, 170, 60);

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updateuser (2).png"))); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update);
        update.setBounds(10, 490, 170, 59);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 153, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UPDATESMALL.png"))); // NOI18N
        jButton6.setText("SEARCH EMPLOYEE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(770, 40, 210, 40);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STAFF ID ", "NAME", "STAFF TYPE", "PHONE"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(220, 350, 1020, 210);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 204));
        jButton4.setText("BROWSER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(1000, 293, 110, 30);

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(image);
        image.setBounds(960, 90, 200, 190);

        jButton9.setForeground(new java.awt.Color(0, 102, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back (2).png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(10, 240, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean idCheck() throws Exception {
        int count = 0;
        conn = db.getConnection();
        PreparedStatement pst = conn.prepareStatement("Select*From LowerStaff where StaffID = ?");
        pst.setString(1, id.getText());
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            ++count;
        }
        return count == 0;
    }
    private void resetForm(){
        name.setText(null);
        age.setText(null);
        phone.setText(null);
        address.setText(null);
        staff.setText(null);
        join.setText(null);
        image.setText(null);
    }
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            if (idCheck()) {
                try {
                    conn = db.getConnection();
                    String sql = " Insert into LowerStaff(StaffID,Name,Age,PhoneNo,"
                            + "Gender,Address,StaffType,JoiningDate,Image)"
                            + "values(?,?,?,?,?,?,?,?,?)";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, id.getText());
                    pst.setString(2, name.getText());
                    pst.setString(3, age.getText());
                    pst.setString(4, phone.getText());
                    pst.setString(5, (String) gender.getSelectedItem());
                    pst.setString(6, address.getText());
                    pst.setString(7, staff.getText());
                    pst.setString(8, join.getText());
                    pst.setBytes(9, person_image);
                    pst.execute();
                    showTable();
                    resetForm();
                    
                } catch (Exception ex) {
                    Logger.getLogger(lowerStaff.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    if (conn != null) {
                        conn.close();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "ID is existing");
            }
        } catch (Exception ex) {
            Logger.getLogger(lowerStaff.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try {
            conn = db.getConnection();
            PreparedStatement pst2 = conn.prepareStatement("Delete from LowerStaff Where StaffID =?");
            pst2.setString(1, id.getText());
            pst2.execute();
            JOptionPane.showMessageDialog(this, "Delete Sucessfully");
            resetForm();
        } catch (Exception ex) {
             Logger.getLogger(lowerStaff.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("UPDATE LowerStaff SET "
                    + "Name = ?,Age=?,PhoneNo=?, Gender =?,Address=?,StaffType=?,"
                    + "JoiningDate=?,Image=? WHERE StaffID =?");

            pst.setString(1, name.getText());
            pst.setString(2, age.getText());
            pst.setString(3, phone.getText());
            pst.setString(4, (String) gender.getSelectedItem());
            pst.setString(5, address.getText());
            pst.setString(6, staff.getText());
            pst.setString(7, join.getText());
            pst.setBytes(8, person_image);
            pst.setString(9, id.getText());
            pst.execute();
            showTable();
            JOptionPane.showMessageDialog(this, "Record Updated Sucessfully");
            resetForm();
            
        } catch (Exception ex) {
            Logger.getLogger(updateDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed
    public void showTable() {
        try {
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("select StaffID, Name,StaffType,PhoneNo from LowerStaff");
            ResultSet rs = pst.executeQuery();
            tableModel.setRowCount(0);
            while (rs.next()) {
                tableModel.addRow(new Object[]{rs.getString("StaffID"), rs.getString("Name"), rs.getString("StaffType"), rs.getString("PhoneNo")});
            }

        } catch (Exception ex) {
            Logger.getLogger(lowerStaff.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (conn != null)
                try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(lowerStaff.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Select*From LowerStaff where StaffID = ?");
            pst.setString(1, id.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                name.setText(rs.getString("Name"));
                age.setText(rs.getString("Age"));
                phone.setText(rs.getString("PhoneNo"));
                gender.setSelectedItem(rs.getString("Gender"));
                address.setText(rs.getString("Address"));
                staff.setText(rs.getString("StaffType"));
                join.setText(rs.getString("JoiningDate"));
                byte[] imagedata = rs.getBytes("Image");
                ImageIcon path = new ImageIcon(imagedata);
                Image ing = path.getImage();
                ImageIcon mIcon = new ImageIcon(getScaledImage(ing, image.getWidth(), image.getHeight()));
                image.setIcon(mIcon);
                
            }else{
                JOptionPane.showMessageDialog(null,"No Specific Id Found");
            }
            
        } catch (Exception ex) {
        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        updateDoctor up = new updateDoctor();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            image.setIcon(up.ResizeImage(path));
            s = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Data");
        }
        //convert Image to byte[] array
        try {
            File image = new File(s);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum);
            }
            person_image = bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        adminPanel ad = new adminPanel();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(lowerStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lowerStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lowerStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lowerStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lowerStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField join;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField staff;
    private javax.swing.JTable table;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
private Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();

        return resizedImg;
    }
}
