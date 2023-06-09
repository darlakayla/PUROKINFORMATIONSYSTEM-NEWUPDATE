package internalPages;

import config.dbconfiguration;
import java.awt.Color;
import javax.swing.JOptionPane;


public class editManageResident extends javax.swing.JFrame {
    
    
    
    
    public editManageResident() {
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
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        occupation = new javax.swing.JTextField();
        add1 = new javax.swing.JPanel();
        st_label = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        resname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MANAGE RESIDENT FORM");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 280, 40));

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 40, 30));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 40, 40));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, 0, 1090, 60);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel3.setText("Resident ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 140, 70, 30);

        id.setEditable(false);
        id.setBackground(new java.awt.Color(255, 153, 153));
        id.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        id.setEnabled(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(140, 140, 350, 30);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel4.setText("Lastname:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 240, 90, 30);

        lastname.setBackground(new java.awt.Color(255, 153, 153));
        lastname.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname);
        lastname.setBounds(140, 240, 350, 30);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel5.setText("Firstname:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 290, 90, 30);

        firstname.setBackground(new java.awt.Color(255, 153, 153));
        firstname.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(firstname);
        firstname.setBounds(140, 290, 350, 30);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel6.setText("Address:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 340, 90, 30);

        address.setBackground(new java.awt.Color(255, 153, 153));
        address.setColumns(20);
        address.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 340, 350, 110);

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel7.setText("Status:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(560, 190, 110, 30);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel2.setText("Gender:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 240, 110, 30);

        jLabel8.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel8.setText("Contact No:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(560, 290, 110, 30);

        contact.setBackground(new java.awt.Color(255, 153, 153));
        contact.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact);
        contact.setBounds(650, 290, 320, 30);

        status.setBackground(new java.awt.Color(255, 153, 153));
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Widowed", "Divorced", "Separated" }));
        jPanel1.add(status);
        status.setBounds(650, 190, 320, 30);

        male.setBackground(new java.awt.Color(255, 153, 153));
        male.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male);
        male.setBounds(650, 240, 120, 30);

        female.setBackground(new java.awt.Color(255, 153, 153));
        female.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female);
        female.setBounds(790, 240, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/pis-logo-modified (1) (1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(970, 70, 90, 90);

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel10.setText("Email:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(560, 330, 110, 30);

        email.setBackground(new java.awt.Color(255, 153, 153));
        email.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(650, 330, 320, 30);

        jLabel11.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel11.setText("Occupation:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(560, 370, 110, 30);

        occupation.setBackground(new java.awt.Color(255, 153, 153));
        occupation.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationActionPerformed(evt);
            }
        });
        jPanel1.add(occupation);
        occupation.setBounds(650, 370, 320, 30);

        add1.setBackground(new java.awt.Color(255, 153, 153));
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add1MouseExited(evt);
            }
        });
        add1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        st_label.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        st_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st_label.setText("Label");
        add1.add(st_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        jPanel1.add(add1);
        add1.setBounds(860, 420, 100, 30);

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        jLabel12.setText("Resident Name:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 190, 90, 30);

        resname.setBackground(new java.awt.Color(255, 153, 153));
        resname.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        resname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resnameActionPerformed(evt);
            }
        });
        jPanel1.add(resname);
        resname.setBounds(140, 190, 350, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        male.setSelected(false);
        if(female.isSelected()){
            gender = "Female";
        }else{
            gender = null;
        }
        
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        female.setSelected(false);
        if(male.isSelected()){
            gender = "Male";
        }else{
            gender = null;
        }
    }//GEN-LAST:event_maleActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        close();
        
    }//GEN-LAST:event_exitMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationActionPerformed

    private void add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseEntered
        add1.setBackground(navcolor);
    }//GEN-LAST:event_add1MouseEntered

    private void add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseExited
        add1.setBackground(headcolor);
    }//GEN-LAST:event_add1MouseExited

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked

        if (resname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Resident Name!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(lastname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Lastname!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(firstname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Firstname!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(address.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Address!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validate JComboBox
        if (status.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please select your Status!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validate JRadioButtons
        if (!male.isSelected() && !female.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select your gender!.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    
        if (contact.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Contact!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(email.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Email!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else if(occupation.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please type your Occupation!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            JOptionPane.showMessageDialog(this, "Succesfully Save!");
        } 
  
        if(action.equals("Add")){
       
            dbconfiguration dbc = new dbconfiguration();
             int result = dbc.insertData("INSERT INTO tbl_residentrecords (rr_residentname, rr_lastname, rr_firstname, rr_address, rr_status, rr_gender, rr_contact, rr_email, rr_occupation) "
                + "VALUES ('"+resname.getText()+"','"+lastname.getText()+"', '"+firstname.getText()+"','"+address.getText()+"','"+status.getSelectedItem()+"','"+gender+"','"+contact.getText()+"','"+email.getText()+"','"+occupation.getText()+"')");        
        
        if(result == 1){
            
             close();        
             
                dashBoard db = new dashBoard();              
                manageResident mr = new manageResident();
                db.maindesktop.add(mr).setVisible(true);
                this.dispose();
             
         }else{ 
             System.out.println("Saving Data Failed!");
         }    
        }else if(action.equals("Update")){
            dbconfiguration dbc = new dbconfiguration();
            dbc.updateData("UPDATE tbl_residentrecords "
                + "SET rr_residentname = '"+resname.getText()+"', rr_lastname='"+lastname.getText()+"',, rr_firstname='"+firstname.getText()+"', "
                        + "rr_address ='"+address.getText()+"', rr_status='"+status.getSelectedItem()+"',rr_gender='"+gender+ "',rr_contact='"+contact.getText()+ "',rr_email='"+email.getText()+ "',rr_occupation='"+occupation.getText()+ "'"
                                + "WHERE rr_id = '"+id.getText()+"'");
            close();
                dashBoard db = new dashBoard();              
                manageResident mr = new manageResident();
                db.maindesktop.add(mr).setVisible(true);
        }else{
           JOptionPane.showMessageDialog(null, "No Action Selected!");
           close();
        }
    }//GEN-LAST:event_add1MouseClicked

    private void resnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resnameActionPerformed

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
            java.util.logging.Logger.getLogger(editManageResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editManageResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editManageResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editManageResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editManageResident().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add1;
    public javax.swing.JTextArea address;
    public javax.swing.JTextField contact;
    public javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    public javax.swing.JRadioButton female;
    public javax.swing.JTextField firstname;
    public javax.swing.JTextField id;
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
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField lastname;
    public javax.swing.JRadioButton male;
    private javax.swing.JLabel minimize;
    public javax.swing.JTextField occupation;
    public javax.swing.JTextField resname;
    public javax.swing.JLabel st_label;
    public javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
