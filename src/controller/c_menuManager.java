/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the sortingor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.m_menuManager;
import view.v_menuManager;
import model.m_menuAdmin;
import view.v_menuAdmin;
import controller.c_menuAdmin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_login;
import view.v_login;
import model.*;
import view.*;
import controller.*;

/**
 *
 * @author cubo69
 */
public class c_menuManager {

    String data[];
    v_menuManager vManager;
    m_menuManager mManager;

    public c_menuManager(v_menuManager vMan, m_menuManager mMan) {
        vManager = vMan;
        mManager = mMan;
        vMan.setVisible(true);
        vManager.CustomerButton(new customerListener());
        vManager.KreditanButton(new kreditanListener());
        vManager.PenjualanButton(new penjualanListener());
        vManager.logoutButton(new logoutListener());
    }

    protected class penjualanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_penjualanManager m1 = new m_penjualanManager();
            v_penjualanManager v1 = new v_penjualanManager();
            c_penjualanManager c1 = new c_penjualanManager(m1, v1, data);
            v1.setVisible(true);
        }
    }

    protected class kreditanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_motorManager m = new m_motorManager();
            v_motorManager v = new v_motorManager();
            c_motorManager c = new c_motorManager(m, v, data);
            v.setVisible(true);
        }
    }

    protected class logoutListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_login l1 = new m_login();
            v_login l2 = new v_login();
            c_login l3 = new c_login(l2, l1);
            vManager.setVisible(false);
        }

    }

    protected class customerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_customerManager l1 = new m_customerManager();
            v_customerManager l2 = new v_customerManager();
            c_customerManager l3 = new c_customerManager(l2, l1, data);

        }

    }
}
