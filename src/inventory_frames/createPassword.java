/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_frames;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.*;

public class createPassword extends javax.swing.JFrame {
  private File passText;
    public createPassword() {
        initComponents();
        typePassword_password.getDocument().addDocumentListener(docL);
        reTypePassword_password.getDocument().addDocumentListener(docL);
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
        create_btn = new javax.swing.JButton();
        typePassword_password = new javax.swing.JPasswordField();
        reTypePassword_password = new javax.swing.JPasswordField();
        createPassword_lbl = new javax.swing.JLabel();
        retype_lbl = new javax.swing.JLabel();
        typeError_lbl = new javax.swing.JLabel();
        retypeError_lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        create_btn.setText("Create!");
        create_btn.setEnabled(false);
        create_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btnActionPerformed(evt);
            }
        });
        create_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                create_btnKeyPressed(evt);
            }
        });

        typePassword_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        typePassword_password.setPreferredSize(new java.awt.Dimension(280, 35));
        typePassword_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                typePassword_passwordFocusGained(evt);
            }
        });
        typePassword_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                typePassword_passwordKeyPressed(evt);
            }
        });

        reTypePassword_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        reTypePassword_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reTypePassword_passwordFocusGained(evt);
            }
        });
        reTypePassword_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reTypePassword_passwordKeyPressed(evt);
            }
        });

        createPassword_lbl.setBackground(new java.awt.Color(255, 255, 255));
        createPassword_lbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        createPassword_lbl.setForeground(new java.awt.Color(255, 255, 255));
        createPassword_lbl.setText("Create Password");

        retype_lbl.setForeground(new java.awt.Color(204, 204, 204));
        retype_lbl.setText("Re-type Password");

        typeError_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        typeError_lbl.setForeground(new java.awt.Color(153, 153, 153));
        typeError_lbl.setText("   X");

        retypeError_lbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        retypeError_lbl.setForeground(new java.awt.Color(153, 153, 153));
        retypeError_lbl.setText("   X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(typeError_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(286, 286, 286))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(retypeError_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(retype_lbl)
                                .addComponent(reTypePassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(typePassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(create_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(createPassword_lbl)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(createPassword_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(typeError_lbl)
                .addGap(20, 20, 20)
                .addComponent(typePassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(retypeError_lbl)
                            .addComponent(retype_lbl)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(reTypePassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addComponent(create_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_btnActionPerformed
       passwordValidation();
    }//GEN-LAST:event_create_btnActionPerformed

    private void reTypePassword_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reTypePassword_passwordFocusGained
       reTypePassword_password.selectAll();
    }//GEN-LAST:event_reTypePassword_passwordFocusGained

    private void create_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_create_btnKeyPressed
        enterKey(evt);
    }//GEN-LAST:event_create_btnKeyPressed

    private void typePassword_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_typePassword_passwordKeyPressed
        enterKey(evt);
    }//GEN-LAST:event_typePassword_passwordKeyPressed

    private void reTypePassword_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reTypePassword_passwordKeyPressed
       enterKey(evt);
    }//GEN-LAST:event_reTypePassword_passwordKeyPressed

    private void typePassword_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_typePassword_passwordFocusGained
        typePassword_password.selectAll();
    }//GEN-LAST:event_typePassword_passwordFocusGained
 
   
    DocumentListener docL = new DocumentListener() {
        public void insertUpdate(DocumentEvent e) {nullDisabling();}
        public void removeUpdate(DocumentEvent e) {nullDisabling();}
        public void changedUpdate(DocumentEvent e) {nullDisabling();}    
    };

   public void passSave(String passW) {
       try {
           passText = new File("D:\\notPassword\\p@xzwodd.txt");
           FileOutputStream fos = new FileOutputStream(passText);
           DataOutputStream dos = new DataOutputStream(fos);
           dos.writeUTF(passW);
       }catch(Exception e) {System.out.println("Error: " + e);
   }
  }
   public void fileOut() {
       try {
           FileInputStream fis = new FileInputStream(passText);
           DataInputStream dis = new DataInputStream(fis); 
           System.out.println(dis.readUTF());
       }catch(Exception e ) {System.out.println("Error: " + e );
   }
  }
//what jPasswordField is empty the button and retypePasswordField will disabled
    public void nullDisabling() {
        String pass1 = typePassword_password.getText();
        String pass2 = reTypePassword_password.getText();
        if(!(pass1.equals(pass2))) {
           retypepassErrorLight();
           passwordNeutralLight();
        }else if(pass1.equals(pass2)) {
           retypepassNeutralLight();
           passwordNeutralLight();
        }if((!pass2.equals("")) && pass1.equals("")) {
            passwordErrorLight();
            retypepassNeutralLight();
        }
        if(pass1.equals("")) {
            create_btn.setEnabled(false); 
        }else if(pass2.equals("")) {
            create_btn.setEnabled(false);
        }
        else 
               create_btn.setEnabled(true);
               reTypePassword_password.setEnabled(true); 
    }
//a method if 'Enter' key is pressed, create_btn is activated.
    public void enterKey(KeyEvent evt) {
      int keyCode = evt.getKeyCode();
        if(keyCode == evt.VK_ENTER) {
           create_btn.doClick();
       }
  }
//password will not created unless it matched
    public void passwordValidation() {
        log_in_frame logInPage = new log_in_frame();
        String pass1 = typePassword_password.getText();
        String pass2 = reTypePassword_password.getText();
        if(pass1.equals(pass2)) {
           passSave(pass2);
           typePassword_password.setText("");
           reTypePassword_password.setText("");
           fileOut();
           JOptionPane.showMessageDialog(null, "Password Created!");
           dispose();
           logInPage.setVisible(true);
       }else  {
            retypepassErrorLight();
           JOptionPane.showMessageDialog(null, "Your password did not match");
                }
    }
    public void passwordErrorLight() {
        typePassword_password.setBorder(BorderFactory.createLineBorder(new Color(255,0,0)));
        typeError_lbl.setForeground(Color.red);
    }
    public void passwordNeutralLight() { 
        typePassword_password.setBorder(null);
        typeError_lbl.setForeground(new Color(153,153,153));
    }
    public void retypepassErrorLight() {
         retypeError_lbl.setForeground(Color.red);
         reTypePassword_password.setBorder(BorderFactory.createLineBorder(new Color(255,0,0)));
    }
    public void retypepassNeutralLight() { 
         retypeError_lbl.setForeground(new Color(153,153,153));
         reTypePassword_password.setBorder(null);
    }
 
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
            java.util.logging.Logger.getLogger(createPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createPassword().setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createPassword_lbl;
    private javax.swing.JButton create_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField reTypePassword_password;
    private javax.swing.JLabel retypeError_lbl;
    private javax.swing.JLabel retype_lbl;
    private javax.swing.JLabel typeError_lbl;
    private javax.swing.JPasswordField typePassword_password;
    // End of variables declaration//GEN-END:variables
}
