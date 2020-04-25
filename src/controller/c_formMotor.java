/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.*;
import model.*;

/**
 *
 * @author L
 */
public class c_formMotor {

    String data[];
    m_formMotor mFMotor;
    v_formMotor vFMotor;

    public c_formMotor(m_formMotor mMotor, v_formMotor vformMotor, String d[]) {
        mFMotor = mMotor;
        vFMotor = vformMotor;
        data = d;
        vFMotor.BatalButton(new batalListener());
        vFMotor.SimpanButton(new simpanListener());
    }

    protected class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String merk = vFMotor.getMerk();
            String tahun = vFMotor.getTahun();
            String harga = vFMotor.getHArga();
            String dp = vFMotor.getDP();
            String cicilan1 = vFMotor.getCicilan1();
            String cicilan2 = vFMotor.getCicilan2();
            mFMotor.tambahPonsel(merk, tahun, harga, dp, cicilan1, cicilan2);
            JOptionPane.showMessageDialog(vFMotor, "Data Motor Berhasil Ditambahkan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            m_motorManager m = new m_motorManager();
            v_motorManager v = new v_motorManager();
            c_motorManager c = new c_motorManager(m, v, data);
            vFMotor.setVisible(false);
        }
    }

    protected class batalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_motorManager m = new m_motorManager();
            v_motorManager v = new v_motorManager();
            c_motorManager c = new c_motorManager(m, v, data);
            v.setVisible(true);
            vFMotor.setVisible(false);
        }
    }
}

