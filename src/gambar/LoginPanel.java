/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package img;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

/**
 *
 * @author L
 */
public class LoginPanel extends JPanel {

    private Image img;

    public LoginPanel() {
        img = new ImageIcon(getClass().getResource("/img/LoginUI.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.
        Graphics2D gd = (Graphics2D) grphcs.create();
        gd.drawImage(img, 0, 0, null);
        gd.dispose();
    }
}
