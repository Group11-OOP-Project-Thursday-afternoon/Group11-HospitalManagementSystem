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
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class searchDoctor extends javax.swing.JFrame {

    /**
     * Creates new form searchDoctor
     */
    Connection conn = null;
    Statement st = null;
    DBconnect db = new DBconnect();
    public searchDoctor() {
        initComponents();
        combo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void combo(){
    try{
            
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement( "SELECT * FROM Doctor");       
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                  department.addItem(rs.getString("Department"));
                  gender.addItem(rs.getString("Gender"));
                  Blood.addItem(rs.getString("BloodGroup"));
                  maritial.addItem(rs.getString("MaritialStatus"));
             }
            
              pst.execute();
             
    }   catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        DocID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        days = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Blood = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cnic = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        maritial = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        city = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        joiningdate = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        visiting = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        doctorImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DOCTOR DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 153, 204))); // NOI18N
        jPanel1.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/removeuser.png"))); // NOI18N
        jButton2.setText("DELETE ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 170, 170, 60);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updateuser (2).png"))); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 270, 170, 59);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchuser.png"))); // NOI18N
        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 370, 170, 60);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewuser.png"))); // NOI18N
        jButton5.setText("VIEW");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 470, 170, 60);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add (5).png"))); // NOI18N
        jButton1.setText("ADD ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 70, 170, 60);

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEARCH DOCTORS");

        jButton7.setForeground(new java.awt.Color(0, 102, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back (2).png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(406, 406, 406))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(220, 20, 1040, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("DOCTOR ID ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 100, 120, 30);
        jPanel1.add(DocID);
        DocID.setBounds(350, 100, 230, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText(" Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 160, 70, 20);
        jPanel1.add(name);
        name.setBounds(350, 150, 230, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("Days");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(650, 150, 50, 30);
        jPanel1.add(days);
        days.setBounds(710, 150, 210, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("Age");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 220, 40, 17);
        jPanel1.add(age);
        age.setBounds(350, 210, 230, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(640, 220, 80, 20);

        gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(gender);
        gender.setBounds(710, 210, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 204));
        jLabel7.setText("Blood Group");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(230, 270, 100, 30);

        jPanel1.add(Blood);
        Blood.setBounds(350, 270, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 204));
        jLabel8.setText("Department");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(610, 270, 100, 30);

        jPanel1.add(department);
        department.setBounds(710, 270, 210, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 204));
        jLabel9.setText("Address");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(260, 330, 70, 30);
        jPanel1.add(address);
        address.setBounds(350, 330, 580, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 204));
        jLabel10.setText("CNIC");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 400, 50, 20);
        jPanel1.add(cnic);
        cnic.setBounds(350, 390, 220, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("Maritial Status");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(600, 400, 100, 20);

        jPanel1.add(maritial);
        maritial.setBounds(710, 390, 220, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("Phone No");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(240, 460, 70, 20);
        jPanel1.add(phone);
        phone.setBounds(350, 450, 220, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 204));
        jLabel13.setText("City");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(660, 460, 60, 20);
        jPanel1.add(city);
        city.setBounds(710, 450, 220, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 204));
        jLabel14.setText("Joining Date");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(230, 510, 90, 30);
        jPanel1.add(joiningdate);
        joiningdate.setBounds(350, 510, 220, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 204));
        jLabel15.setText("Visit Timing");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(610, 510, 90, 30);
        jPanel1.add(visiting);
        visiting.setBounds(710, 510, 220, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 153, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UPDATESMALL.png"))); // NOI18N
        jButton6.setText("SEARCH DOCTOR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(710, 100, 200, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 204));
        jLabel16.setText("User");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(980, 460, 40, 20);
        jPanel1.add(user);
        user.setBounds(1030, 450, 190, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 204));
        jLabel17.setText("Passworld");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(950, 514, 70, 20);
        jPanel1.add(pass);
        pass.setBounds(1030, 500, 190, 30);

        doctorImage.setForeground(new java.awt.Color(153, 255, 255));
        doctorImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(doctorImage);
        doctorImage.setBounds(1000, 170, 210, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1249, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            conn = db.getConnection();
            PreparedStatement pst = conn.prepareStatement("Select*From Doctor where DoctorID = ?");
            pst.setString(1, DocID.getText());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                String dname = rs.getString("Name");
                name.setText(dname);
                String dage =  rs.getString("Age");
                age.setText(dage);
                String blood = rs.getString("BloodGroup");
                Blood.setSelectedItem(blood);
                String daddress = rs.getString("Address");
                address.setText(daddress);
                String dCNIC = rs.getString("CNIC");
                cnic.setText(dCNIC);
                String phoneNO = rs.getString("PhoneNo");
                phone.setText(phoneNO);
                String jDate = rs.getString("JoinDate");
                joiningdate.setText(jDate);
                String day = rs.getString("Days");
                days.setText(day);
                String dgender = rs.getString("Gender");
                gender.setSelectedItem(dgender);
                String ddepartment = rs.getString("Department");
                department.setSelectedItem(ddepartment);
                String status = rs.getString("MaritialStatus");
                maritial.setSelectedItem(status);
                String dcity = rs.getString("City");
                city.setText(dcity);
                String dtiming = rs.getString("VisitTiming");
                visiting.setText(dtiming);
                String duser = rs.getString("Users");
                user.setText(duser);
                String dpass = rs.getString("Password");
                pass.setText(dpass);
                byte[] imagedata = rs.getBytes("Image");
                ImageIcon path = new ImageIcon(imagedata);
                Image ing = path.getImage();
                ImageIcon mIcon = new ImageIcon(getScaledImage(ing, doctorImage.getWidth(), doctorImage.getHeight()));
                doctorImage.setIcon(mIcon);
            }else{
                JOptionPane.showMessageDialog(null,"No Specific Id Found");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        adminPanel ad = new adminPanel();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here
        viewDoctor view = new viewDoctor();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        addDoctor a = new addDoctor();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        deleteDoctor delete = new deleteDoctor();
        delete.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        updateDoctor up = new updateDoctor();
        up.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        searchDoctor s = new searchDoctor();
        s.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(searchDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Blood;
    public javax.swing.JTextField DocID;
    private javax.swing.JTextField address;
    public javax.swing.JTextField age;
    private javax.swing.JTextField city;
    private javax.swing.JTextField cnic;
    private javax.swing.JTextField days;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JLabel doctorImage;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField joiningdate;
    private javax.swing.JComboBox<String> maritial;
    public javax.swing.JTextField name;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField user;
    private javax.swing.JTextField visiting;
    // End of variables declaration//GEN-END:variables
public ImageIcon ResizeImage(String imgPath){
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(doctorImage.getWidth(), doctorImage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
 private Image getScaledImage(Image srcImg, int w, int h) {
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = resizedImg.createGraphics();
        
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        
        return resizedImg;
    }
}
