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
public class c_formAngsuran {

    v_formAngsuran view;
    m_formAngsuran model;
    String data[];

    public c_formAngsuran(m_formAngsuran m, v_formAngsuran v, String d[]) {
        model = m;
        view = v;
        data = d;
        view.buttonBatal(new batalListener());
        view.buttonSimpan(new simpanListener());
    }

    protected class batalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_angsuranAdmin c1 = new m_angsuranAdmin();
            v_angsuranAdmin c2 = new v_angsuranAdmin();
            c_angsuranAdmin c3 = new c_angsuranAdmin(c1, c2, data);
            c2.setVisible(true);
            view.setVisible(false);
        }
    }

    protected class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String Nopenjualan = view.getNoPenjualan();
            String subsidi = view.getSubsidi();
            String bunga = view.getBunga();
            String totKredit = view.getTotalKredit();
            model.tambahAngsuran(Nopenjualan, subsidi, bunga, totKredit);
            JOptionPane.showMessageDialog(view, "Data Angsuran Berhasil Ditambahkan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            m_customerAdmin m = new m_customerAdmin();
            v_customerAdmin v = new v_customerAdmin();
            c_customerAdmin c = new c_customerAdmin(m, v, data);
            view.setVisible(false);
        }
    }
}
