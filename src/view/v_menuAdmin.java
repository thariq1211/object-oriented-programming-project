/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.c_customerAdmin;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import model.m_customerAdmin;

/**
 *
 * @author cubo69
 */
public class v_menuAdmin extends javax.swing.JFrame {

    private static v_menuAdmin instance = null;

    /**
     * Creates new form v_menuAdmin
     */
    public v_menuAdmin() {
        initComponents();
        setUndecorated(true);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public void DekstopPane(JInternalFrame fm) {
        panelInternal.removeAll();
        panelInternal.repaint();
        panelInternal.add(fm);
    }

    public void enableButton(boolean visible) {
        this.logoutBtn.setVisible(visible);
    }

    public void CustomerButton(ActionListener a) {
        customerBtn.addActionListener(a);
    }

    public void PenjualanButton(ActionListener a) {
        penjualanBtn.addActionListener(a);
    }

    public void PembayaranButton(ActionListener a) {
        pembayaranBtn.addActionListener(a);
    }

    public void angsuranButton(ActionListener a) {
        angsuranBtn.addActionListener(a);
    }

    public void KreditanButton(ActionListener a) {
        kreditanBtn.addActionListener(a);
    }

    public void logout(ActionListener a) {
        logoutBtn.addActionListener(a);
    }

    public static v_menuAdmin getInstance() {
        if (instance == null) {
            instance = new v_menuAdmin();
        }
        return instance;
    }

    public static v_menuAdmin getInstanceNull() {
        instance = null;
        instance = new v_menuAdmin();
        return instance;
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
        toolBarStyle1 = new usu.widget.glass.ToolBarStyle();
        label7 = new usu.widget.Label();
        customerBtn = new usu.widget.ButtonGlass();
        label6 = new usu.widget.Label();
        penjualanBtn = new usu.widget.ButtonGlass();
        label5 = new usu.widget.Label();
        pembayaranBtn = new usu.widget.ButtonGlass();
        label4 = new usu.widget.Label();
        angsuranBtn = new usu.widget.ButtonGlass();
        label3 = new usu.widget.Label();
        kreditanBtn = new usu.widget.ButtonGlass();
        label2 = new usu.widget.Label();
        logoutBtn = new usu.widget.ButtonGlass();
        label1 = new usu.widget.Label();
        label8 = new usu.widget.Label();
        panelInternal = new javax.swing.JDesktopPane();
        label11 = new usu.widget.Label();
        label9 = new usu.widget.Label();
        label10 = new usu.widget.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1368, 768));

        panel1.setBackgroundImage(new javax.swing.ImageIcon(getClass().getResource("/gambar/blurry_blue_background-wallpaper-1366x768.jpg"))); // NOI18N
        panel1.setOpaque(false);
        panel1.setOpaqueGradient(false);

        toolBarStyle1.setRollover(true);

        label7.setForeground(new java.awt.Color(77, 77, 77));
        label7.setText("-------");
        toolBarStyle1.add(label7);

        customerBtn.setForeground(new java.awt.Color(255, 255, 255));
        customerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/custICO_1.png"))); // NOI18N
        customerBtn.setText("CUSTOMER");
        customerBtn.setFocusable(false);
        customerBtn.setFont(new java.awt.Font("Roboto Lt", 1, 11)); // NOI18N
        customerBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        customerBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });
        toolBarStyle1.add(customerBtn);

        label6.setForeground(new java.awt.Color(77, 77, 77));
        label6.setText("-------------------");
        toolBarStyle1.add(label6);

        penjualanBtn.setForeground(new java.awt.Color(255, 255, 255));
        penjualanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/salesICO.png"))); // NOI18N
        penjualanBtn.setText("PENJUALAN");
        penjualanBtn.setFocusable(false);
        penjualanBtn.setFont(new java.awt.Font("Roboto Lt", 1, 11)); // NOI18N
        penjualanBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        penjualanBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarStyle1.add(penjualanBtn);

        label5.setForeground(new java.awt.Color(77, 77, 77));
        label5.setText("-------------------");
        toolBarStyle1.add(label5);

        pembayaranBtn.setForeground(new java.awt.Color(255, 255, 255));
        pembayaranBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/billICO.png"))); // NOI18N
        pembayaranBtn.setText("PEMBAYARAN");
        pembayaranBtn.setFocusable(false);
        pembayaranBtn.setFont(new java.awt.Font("Roboto Lt", 1, 11)); // NOI18N
        pembayaranBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pembayaranBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarStyle1.add(pembayaranBtn);

        label4.setForeground(new java.awt.Color(77, 77, 77));
        label4.setText("-------------------");
        toolBarStyle1.add(label4);

        angsuranBtn.setForeground(new java.awt.Color(255, 255, 255));
        angsuranBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/angsuranICO.png"))); // NOI18N
        angsuranBtn.setText("ANGSURAN");
        angsuranBtn.setFocusable(false);
        angsuranBtn.setFont(new java.awt.Font("Roboto Lt", 1, 11)); // NOI18N
        angsuranBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        angsuranBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarStyle1.add(angsuranBtn);

        label3.setForeground(new java.awt.Color(77, 77, 77));
        label3.setText("-------------------");
        toolBarStyle1.add(label3);

        kreditanBtn.setForeground(new java.awt.Color(255, 255, 255));
        kreditanBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kreditanICO.png"))); // NOI18N
        kreditanBtn.setText("PRODUK KREDIT");
        kreditanBtn.setFocusable(false);
        kreditanBtn.setFont(new java.awt.Font("Roboto Lt", 1, 11)); // NOI18N
        kreditanBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kreditanBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarStyle1.add(kreditanBtn);

        label2.setForeground(new java.awt.Color(77, 77, 77));
        label2.setText("-------------------");
        toolBarStyle1.add(label2);

        logoutBtn.setForeground(new java.awt.Color(255, 0, 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logoutICO.png"))); // NOI18N
        logoutBtn.setText("LOGOUT");
        logoutBtn.setFocusable(false);
        logoutBtn.setFont(new java.awt.Font("Roboto Lt", 1, 11)); // NOI18N
        logoutBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logoutBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBarStyle1.add(logoutBtn);

        label1.setForeground(new java.awt.Color(77, 77, 77));
        label1.setText("--------");
        toolBarStyle1.add(label1);

        label8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/adiraLogo.png"))); // NOI18N

        panelInternal.setOpaque(false);
        panelInternal.setPreferredSize(new java.awt.Dimension(1230, 461));

        label11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/KATA.png"))); // NOI18N

        javax.swing.GroupLayout panelInternalLayout = new javax.swing.GroupLayout(panelInternal);
        panelInternal.setLayout(panelInternalLayout);
        panelInternalLayout.setHorizontalGroup(
            panelInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternalLayout.createSequentialGroup()
                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelInternalLayout.setVerticalGroup(
            panelInternalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInternalLayout.createSequentialGroup()
                .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        panelInternal.setLayer(label11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        label10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/admin_1.png"))); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toolBarStyle1, javax.swing.GroupLayout.PREFERRED_SIZE, 1286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelInternal, javax.swing.GroupLayout.DEFAULT_SIZE, 1286, Short.MAX_VALUE))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addComponent(toolBarStyle1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(panelInternal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        getContentPane().add(panel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1384, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
       
    }//GEN-LAST:event_customerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(v_menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_menuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_menuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private usu.widget.ButtonGlass angsuranBtn;
    private usu.widget.ButtonGlass customerBtn;
    private usu.widget.ButtonGlass kreditanBtn;
    private usu.widget.Label label1;
    private usu.widget.Label label10;
    private usu.widget.Label label11;
    private usu.widget.Label label2;
    private usu.widget.Label label3;
    private usu.widget.Label label4;
    private usu.widget.Label label5;
    private usu.widget.Label label6;
    private usu.widget.Label label7;
    private usu.widget.Label label8;
    private usu.widget.Label label9;
    private usu.widget.ButtonGlass logoutBtn;
    private usu.widget.Panel panel1;
    public javax.swing.JDesktopPane panelInternal;
    private usu.widget.ButtonGlass pembayaranBtn;
    private usu.widget.ButtonGlass penjualanBtn;
    private usu.widget.glass.ToolBarStyle toolBarStyle1;
    // End of variables declaration//GEN-END:variables
}