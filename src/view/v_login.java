/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;

/**
 *
 * @author cubo69
 */
public class v_login extends javax.swing.JFrame {

    /**
     * Creates new form v_login
     */
    public v_login() {
        initComponents();
        setUndecorated(true);
        this.setVisible(true);

    }

    public void exit(ActionListener a) {
        exitBtn.addActionListener(a);
    }

    public void loginBtnn(ActionListener a) {
        loginBtn.addActionListener(a);
        //this.setVisible(false);
    }

    public String username() {
        return isiUsername.getText();
    }

    public void setUsername(String kata) {
        isiUsername.setText(kata);
    }

    public String password() {
        return isiPassword.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new usu.widget.Panel();
        isiUsername = new usu.widget.glass.TextBoxGlass();
        isiPassword = new usu.widget.glass.PasswordBox();
        loginBtn = new usu.widget.ButtonGlass();
        label2 = new usu.widget.Label();
        label3 = new usu.widget.Label();
        label1 = new usu.widget.Label();
        label4 = new usu.widget.Label();
        exitBtn = new usu.widget.ButtonGlass();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(480, 640));
        setPreferredSize(new java.awt.Dimension(480, 640));

        panel1.setBackground(new java.awt.Color(255, 255, 0));
        panel1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/gambar/ui.png"))); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        isiUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        isiUsername.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        panel1.add(isiUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 420, 80));

        isiPassword.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        panel1.add(isiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 420, 80));

        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("LOGIN");
        loginBtn.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        panel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 410, 70));

        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("PASSWORD :");
        label2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        panel1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("USERNAME : ");
        label3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        panel1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        label1.setForeground(new java.awt.Color(80, 58, 45));
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("PT ADIRA FINANCE");
        label1.setFont(new java.awt.Font("Arial Narrow", 0, 34)); // NOI18N
        panel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 470, 60));

        label4.setForeground(new java.awt.Color(80, 58, 45));
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("SISTEM PENGELOLAAN KREDIT");
        label4.setFont(new java.awt.Font("Arial Narrow", 0, 34)); // NOI18N
        panel1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 470, 50));

        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("EXIT");
        exitBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 410, 30));

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(496, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(v_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass exitBtn;
    private usu.widget.glass.PasswordBox isiPassword;
    private usu.widget.glass.TextBoxGlass isiUsername;
    private usu.widget.Label label1;
    private usu.widget.Label label2;
    private usu.widget.Label label3;
    private usu.widget.Label label4;
    private usu.widget.ButtonGlass loginBtn;
    private usu.widget.Panel panel1;
    // End of variables declaration//GEN-END:variables

}
