package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_login;
import view.v_menuAdmin;
import view.v_menuManager;
import view.v_menuDeptCol;
import model.m_login;
import model.m_menuAdmin;
import model.m_menuManager;
import model.m_menuDeptCol;
import javax.swing.JOptionPane;

/**
 *
 * @author cubo69
 */
public class c_login {
    
    v_login log;
    m_login login;
    
    public c_login(v_login logg, m_login loginn) {
        log = logg;
        login = loginn;
        log.loginBtnn(new loginListener());
        log.exit(new exitListener());
        log.setVisible(true);
    }
    
    class loginListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = log.username();
            String password = log.password();
            int level = login.cekLogin(username, password);
            
            switch (level) {
                case 1:
                    m_menuAdmin a1 = new m_menuAdmin();
                    v_menuAdmin a2 = new v_menuAdmin();
                    c_menuAdmin a3 = new c_menuAdmin(a2, a1);
                    log.setVisible(false);
                    break;
                case 2:
                    m_menuManager k1 = new m_menuManager();
                    v_menuManager k2 = new v_menuManager();
                    c_menuManager k3 = new c_menuManager(k2, k1);
                    log.setVisible(false);
                    break;
                case 3:
                    m_menuDeptCol d1 = new m_menuDeptCol();
                    v_menuDeptCol d2 = new v_menuDeptCol();
                    c_menuDeptCol d3 = new c_menuDeptCol(d2, d1);
                    log.setVisible(false);
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
    class exitListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(1);
        }
        
    }
}
