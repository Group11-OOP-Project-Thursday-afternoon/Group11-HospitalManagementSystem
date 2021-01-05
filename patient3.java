
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A.TUAN
 */
public class patient3 extends javax.swing.JFrame {

    /**
     * Creates new form patient3
     */
    Connection conn = null;
    DBconnect db = new DBconnect();
    String s;
    byte[] person_image = null;
    private String userName;
    public patient3(String userName) {
        
        initComponents();
        this.userName = userName;
        this.user.setText(userName);
        
    }

    private patient3() {
        
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
        jLabel9 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        blood = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        relative = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PATIENT'S DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 153, 204))); // NOI18N
        jPanel3.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patientdetals.png"))); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 90, 160, 160);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("PATIENT ID");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(260, 40, 170, 30);
        jPanel3.add(id);
        id.setBounds(390, 40, 370, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("NAME");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(230, 120, 80, 30);
        jPanel3.add(name);
        name.setBounds(300, 120, 280, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("AGE");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(230, 330, 40, 17);
        jPanel3.add(age);
        age.setBounds(300, 320, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("GENDER");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(650, 180, 60, 30);

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jPanel3.add(gender);
        gender.setBounds(750, 250, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("PHONE");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(220, 190, 60, 20);
        jPanel3.add(phone);
        phone.setBounds(300, 180, 280, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("ADDRESS");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(190, 450, 70, 30);
        jPanel3.add(address);
        address.setBounds(300, 450, 580, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("PATIENT TYPE");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(610, 120, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("BLOOD GROUP");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(610, 250, 110, 30);

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updateuser (2).png"))); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update);
        update.setBounds(1050, 40, 170, 59);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 153, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UPDATESMALL.png"))); // NOI18N
        jButton6.setText("SEARCH PATIENT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);
        jButton6.setBounds(780, 40, 210, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 204));
        jButton4.setText("BROWSER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(1010, 400, 110, 30);

        image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(image);
        image.setBounds(960, 150, 200, 220);

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indoor", "Outdoor" }));
        jPanel3.add(type);
        type.setBounds(750, 120, 120, 30);

        blood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));
        jPanel3.add(blood);
        blood.setBounds(750, 180, 80, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 255));
        jLabel10.setText("RELATIVES");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(180, 390, 90, 20);
        jPanel3.add(relative);
        relative.setBounds(300, 380, 570, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 255));
        jLabel11.setText("MARITIAL STATUS");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(140, 260, 140, 20);

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Others" }));
        jPanel3.add(status);
        status.setBounds(300, 250, 140, 30);

        jButton9.setForeground(new java.awt.Color(0, 102, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back (2).png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9);
        jButton9.setBounds(0, 290, 50, 50);

        user.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(user);
        user.setBounds(30, 40, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1277, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void resetForm() {
        name.setText(null);
        age.setText(null);
        phone.setText(null);

        address.setText(null);

        relative.setText(null);
    }
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("UPDATE Patient SET "
                    + "Name = ?,Age=?, Gender =?,MaritialStatus=?,PhoneNo=?,Address=?,"
                    + "PatientType=?,BloodGroup=?,"
                    + "Relatives=?,Image=? WHERE PatientID =?");
            pst.setString(1, name.getText());
            pst.setString(2, age.getText());
            pst.setString(3, (String) gender.getSelectedItem());
            pst.setString(4, (String) status.getSelectedItem());
            pst.setString(5, phone.getText());
            pst.setString(6, address.getText());
            pst.setString(7, (String) type.getSelectedItem());
            pst.setString(8, (String) blood.getSelectedItem());
            pst.setString(9, relative.getText());
            pst.setBytes(10, person_image);
            pst.setString(11, id.getText());

            pst.execute();
            JOptionPane.showMessageDialog(this, "Record Updated Sucessfully");
            resetForm();

        } catch (Exception ex) {
            Logger.getLogger(updateDoctor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Select*From Patient where PatientID = ?");
            pst.setString(1, id.getText());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                name.setText(rs.getString("Name"));
                age.setText(rs.getString("Age"));
                phone.setText(rs.getString("PhoneNo"));
                gender.setSelectedItem(rs.getString("Gender"));
                address.setText(rs.getString("Address"));
                blood.setSelectedItem(rs.getString("BloodGroup"));
                relative.setText(rs.getString("Relatives"));
                status.setSelectedItem("MaritialStatus");
                type.setSelectedItem("PatientType");
                byte[] imagedata = rs.getBytes("Image");
                ImageIcon path = new ImageIcon(imagedata);
                Image ing = path.getImage();
                ImageIcon mIcon = new ImageIcon(getScaledImage(ing, image.getWidth(), image.getHeight()));
                image.setIcon(mIcon);

            } else {
                JOptionPane.showMessageDialog(null, "No Specific Id Found");
            }

        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here
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
        DoctorActivity re = new DoctorActivity(userName);
        re.setVisible(true);
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
            java.util.logging.Logger.getLogger(patient3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> blood;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField id;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField relative;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    private javax.swing.JLabel user;
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
