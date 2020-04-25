/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.m_menuAdmin;
import model.m_customerAdmin;
import view.v_menuAdmin;
import view.v_customerAdmin;
import controller.c_menuAdmin;
import controller.c_customerAdmin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import view.*;

/**
 *
 * @author cubo69
 */
public class c_menuAdmin {

    String data[];
    v_menuAdmin admin1;
    m_menuAdmin adminn1;

    public c_menuAdmin(v_menuAdmin admin, m_menuAdmin adminn) {
        admin1 = admin;
        adminn1 = adminn;
        admin1.setVisible(true);
        admin1.CustomerButton(new custListener());
        admin1.KreditanButton(new produkKreditListener());
        admin1.angsuranButton(new angsuranListener());
        admin1.PenjualanButton(new penjualanListener());
        admin1.PembayaranButton(new pembayaranListener());
        admin1.logout(new logout());
    }

    protected class pembayaranListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_pembayaranAdmin m = new m_pembayaranAdmin();
            v_pembayaranAdmin v = new v_pembayaranAdmin();
            c_pembayaranAdmin c = new c_pembayaranAdmin(m, v, data);
            v.setVisible(true);
        }

    }

    protected class penjualanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_penjualanAdmin m = new m_penjualanAdmin();
            v_penjualanAdmin v = new v_penjualanAdmin();
            c_penjualanAdmin c = new c_penjualanAdmin(m, v, data);
            v.setVisible(true);
        }

    }

    protected class angsuranListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_angsuranAdmin ma = new m_angsuranAdmin();
            v_angsuranAdmin va = new v_angsuranAdmin();
            c_angsuranAdmin c = new c_angsuranAdmin(ma, va, data);
            va.setVisible(true);
        }
    }

    protected class custListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_customerAdmin cAdmin = new m_customerAdmin();
            v_customerAdmin vAdmin = new v_customerAdmin();
            c_customerAdmin cCAdmin = new c_customerAdmin(cAdmin, vAdmin, data);
            vAdmin.setVisible(true);
        }

    }

    protected class produkKreditListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_motorAdmin m = new m_motorAdmin();
            v_motorAdmin v = new v_motorAdmin();
            c_motorAdmin c = new c_motorAdmin(m, v, data);
            v.setVisible(true);
        }

    }

    protected class logout implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_login l1 = new m_login();
            v_login l2 = new v_login();
            c_login l3 = new c_login(l2, l1);
            admin1.setVisible(false);

        }
    }

}
