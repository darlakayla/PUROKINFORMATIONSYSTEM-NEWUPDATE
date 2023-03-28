/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;
import javax.swing.JOptionPane;
import config.dbconfiguration;
import java.awt.Color;

/**
 *
 * @author HP
 */
public class editNewHousehold extends javax.swing.JFrame {

    /**
     * Creates new form editNewResidentForm
     */
    public editNewHousehold() {
        initComponents();
        
    }
    public void close(){
        this.dispose();
        dashBoard db = new dashBoard();
        db.setVisible(true);
        manageResident rr = new manageResident();
        db.maindesktop.add(rr).setVisible(true);
    }
    
        Color navcolor= new Color(255,102,102);
        Color headcolor= new Color(255,153,153);
        Color bodycolor = new Color(255,204,204);
    
    
    
        public String gender;
        public String action;
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        add = new javax.swing.JPanel();
        st_label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        spouse = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        status = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        birthdate = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        numbers = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        ages = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("HOUSEHOLD FORM");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 50));

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 40, 30));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 40, 40));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, 0, 910, 50);

        female.setBackground(new java.awt.Color(255, 153, 153));
        female.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female);
        female.setBounds(300, 230, 120, 30);

        add.setBackground(new java.awt.Color(255, 153, 153));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        st_label1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        st_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st_label1.setText("Label");
        add.add(st_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(add);
        add.setBounds(730, 410, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/pis-logo-modified (1) (1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(750, 70, 90, 90);

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel13.setText("Gender");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 230, 130, 30);

        fullname.setBackground(new java.awt.Color(255, 153, 153));
        fullname.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });
        jPanel1.add(fullname);
        fullname.setBounds(150, 150, 270, 30);

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel15.setText("Fullname: (HEAD)");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 150, 130, 30);

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel16.setText("Spouse Name:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 190, 130, 30);

        spouse.setBackground(new java.awt.Color(255, 153, 153));
        spouse.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        spouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spouseActionPerformed(evt);
            }
        });
        jPanel1.add(spouse);
        spouse.setBounds(150, 190, 270, 30);

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel17.setText("Household ID:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(20, 110, 130, 30);

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 153, 153));
        id.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(150, 110, 270, 30);

        male.setBackground(new java.awt.Color(255, 153, 153));
        male.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male);
        male.setBounds(150, 230, 120, 30);

        status.setBackground(new java.awt.Color(255, 153, 153));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced", "Separated", "Widowed" }));
        jPanel1.add(status);
        status.setBounds(150, 270, 270, 30);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Status:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 270, 130, 30);

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Birthdate:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 310, 130, 30);

        birthdate.setBackground(new java.awt.Color(255, 153, 153));
        birthdate.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(birthdate);
        birthdate.setBounds(150, 310, 270, 30);

        occupation.setBackground(new java.awt.Color(255, 153, 153));
        occupation.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(occupation);
        occupation.setBounds(590, 190, 260, 30);

        numbers.setBackground(new java.awt.Color(255, 153, 153));
        numbers.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(numbers);
        numbers.setBounds(590, 270, 260, 30);

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel14.setText("No. of Children (ALL)");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(450, 270, 140, 30);

        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel18.setText("Contact:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(450, 230, 140, 30);

        jLabel19.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel19.setText("Occupation:");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(450, 190, 140, 30);

        address.setBackground(new java.awt.Color(255, 153, 153));
        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 350, 270, 100);

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel10.setText("Address:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 350, 130, 30);

        ages.setBackground(new java.awt.Color(255, 153, 153));
        ages.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(ages);
        ages.setBounds(590, 310, 260, 30);

        jLabel20.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel20.setText("Their ages:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(450, 310, 140, 30);

        contact.setBackground(new java.awt.Color(255, 153, 153));
        contact.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(contact);
        contact.setBounds(590, 230, 260, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        close();

    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        male.setSelected(false);
        if(female.isSelected()){
            gender = "Female";
        }else{
            gender = null;
        }

    }//GEN-LAST:event_femaleActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if(action.equals("Add")){
            dbconfiguration dbc = new dbconfiguration();
            int result = dbc.insertData("INSERT INTO tbl_householdrecords (rr_fullname, rr_spouse, rr_gender, rr_status, rr_birthdate, rr_address, rr_occupation, rr_contact, rr_children, rr_ages) "
                + "VALUES ('"+fullname.getText()+"', '"+spouse.getText()+"','"+gender+"','"+status.getSelectedItem()+"','"+birthdate.getText()+"','"+address.getText()+"','"+occupation.getText()+"','"+contact.getText()+"','"+numbers.getText()+"','"+ages.getText()+"')");
            if(result == 1){
                JOptionPane.showMessageDialog(null, "Succesfully Save!");
                close();
            }else{
                System.out.println("Saving Data Failed!");
            }
        }else if(action.equals("Update")){
            dbconfiguration dbc = new dbconfiguration();
            dbc.updateData("UPDATE tbl_householdrecords "
                + "SET rr_fullname = '"+fullname.getText()+"', rr_spouse='"+spouse.getText()+"', "
                + "rr_gender ='"+gender+"', rr_status='"+status.getSelectedItem()+"',rr_birthdate='"+birthdate.getText()+ "',rr_address='"+address.getText()+ "',rr_occupation='"+occupation.getText()+ "',rr_contact='"+contact.getText()+ "',rr_children='"+numbers.getText()+ "',rr_ages='"+ages.getText()+ "'"
                + "WHERE hh_id = '"+id.getText()+"'");
            close();
        }else{
            JOptionPane.showMessageDialog(null, "No Action Selected!");
            close();
        }

    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(headcolor);
    }//GEN-LAST:event_addMouseExited

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void spouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spouseActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
    }//GEN-LAST:event_idActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        female.setSelected(false);
        if(male.isSelected()){
            gender = "Female";
        }else{
            gender = null;
        }
    }//GEN-LAST:event_maleActionPerformed

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
            java.util.logging.Logger.getLogger(editNewHousehold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editNewHousehold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editNewHousehold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editNewHousehold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editNewHousehold().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    public javax.swing.JTextArea address;
    public javax.swing.JTextField ages;
    public javax.swing.JTextField birthdate;
    public javax.swing.JTextField contact;
    private javax.swing.JLabel exit;
    public javax.swing.JRadioButton female;
    public javax.swing.JTextField fullname;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton male;
    private javax.swing.JLabel minimize;
    public javax.swing.JTextField numbers;
    public javax.swing.JTextField occupation;
    public javax.swing.JTextField spouse;
    public javax.swing.JLabel st_label1;
    public javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
