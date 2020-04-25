/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
import controller.*;
import controller.c_menuAdmin;
import controller.c_customerAdmin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_login;
import view.v_angsuranDept;
import view.v_login;
import view.v_menuDeptCol;
import view.v_pembayaranDebt;

/**
 *
 * @author L
 */
public class c_menuDeptCol {

    String data[];
    v_menuDeptCol vColl;
    m_menuDeptCol mColl;

    public c_menuDeptCol(v_menuDeptCol vMenu, m_menuDeptCol mMenu) {
        vColl = vMenu;
        mColl = mMenu;
        vColl.setVisible(true);
        vColl.LogoutButton(new logoutListener());
        vColl.AngsuranButton(new angsuranListener());
        vColl.PembayaranButton(new pembayaranListener());
    }

    protected class pembayaranListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_pembayaranAdmin m = new m_pembayaranAdmin();
            v_pembayaranDebt v1 = new v_pembayaranDebt();
            c_pembayaranDebt c = new c_pembayaranDebt(m, v1, data);
            v1.setVisible(true);
        }

    }

    protected class angsuranListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_angsuranDept m = new m_angsuranDept();
            v_angsuranDept v = new v_angsuranDept();
            c_angsuranDept c = new c_angsuranDept(m, v, data);
            v.setVisible(true);
        }

    }

    protected class logoutListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_login l1 = new m_login();
            v_login l2 = new v_login();
            c_login l3 = new c_login(l2, l1);
            vColl.setVisible(false);
        }
    }
}
