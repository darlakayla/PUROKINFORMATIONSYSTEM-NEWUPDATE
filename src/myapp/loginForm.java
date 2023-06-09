package myapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import config.login_db;
import internalPages.dashBoard;
import internalPages.dashBoardPagee;
import internalPages.manageResident;
import internalPages.settings;
import static internalPages.settings.user_name;
import java.awt.BasicStroke;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
/**
 *
 * @author HP
 */
public class loginForm extends javax.swing.JFrame {

    
    
    public loginForm() {
        initComponents();
        
        
        
    }
    
    
        Color hover = new Color(255,102,102);
        Color defbutton = new Color(255,153,153);
        
        Border empty = BorderFactory.createEmptyBorder();
        
        void buttonBorderAnimation(JPanel panel){
            panel.setBackground(hover);
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
        }
        void buttonDefaultColor(JPanel panel){
            panel.setBackground(defbutton);
            panel.setBorder(empty);
        }
        
        
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(255, 204, 204));
        username.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 14)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 14))); // NOI18N
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 330, 60));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("New user? Click here to register!");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 230, 20));

        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel3.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 30, 50));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel3.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 30, 60));

        cancel.setBackground(new java.awt.Color(255, 153, 153));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANCEL");
        cancel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 150, 50));

        password.setBackground(new java.awt.Color(255, 204, 204));
        password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 14))); // NOI18N
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 330, 60));

        login.setBackground(new java.awt.Color(255, 153, 153));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jPanel3.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 150, 50));

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel3.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 34, 30));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabel2.setText("LOGIN");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 480, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        username.setText("");
    }//GEN-LAST:event_usernameActionPerformed

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        buttonBorderAnimation(cancel);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        buttonDefaultColor(cancel);
    }//GEN-LAST:event_cancelMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        int a =JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a == JOptionPane.YES_OPTION){
        System.exit(0);
        }      
    }//GEN-LAST:event_closeMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        registerForm  rf = new registerForm();
        rf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        username.setText(null);
        password.setText(null);
    }//GEN-LAST:event_cancelMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
          password.setEchoChar('*');
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
    }//GEN-LAST:event_passwordMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        
        
        PreparedStatement st;      
        ResultSet rs;
        
        // get the username & password
        String user = username.getText();
        String pass = String.valueOf(password.getPassword());
        
        //create a select query to check if the username and the password exist in the database
        String query = "SELECT * FROM `user_db` WHERE `u_username` = ? AND `u_password` = ?";
        
        // show a message if the username or the password fields are empty
       
        if(pass.trim().equals("user"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username", 2);
        }
        else if(user.trim().equals("pass"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password", 2);
        }else
            
        {
            
            try {
            st = login_db.getConnection().prepareStatement(query);
            
            st.setString(1, user);
            st.setString(2, pass);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                // show a new form
                dashBoard db = new dashBoard();
                db.setVisible(true);
                db.pack();
                if(rs.next()){
                    
               user =rs.getString("user");
               
               dashBoard da = new dashBoard();
               da.setVisible(true);
               settings set = new settings();
               da.maindesktop.add(set).setVisible(true);                 
               set.getContentPane().add(user_name);
               set.pack();
               set.setVisible(true);
                }
                db.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();           
                
            }else{
                // error message
                JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
 
    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        buttonBorderAnimation(login);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        buttonDefaultColor(login);
    }//GEN-LAST:event_loginMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        if (username.getText().trim().toLowerCase().equals("username"))
          {
             username.setText("");  
         }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
         if (username.getText().trim().equals("") ||
               username.getText().trim().toLowerCase().equals("username"))
       {
       username.setText("username");      
       }
    }//GEN-LAST:event_usernameFocusLost

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel close;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel login;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    
}
