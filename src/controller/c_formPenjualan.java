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
public class c_formPenjualan {

    m_formPenjualan model;
    v_formPenjualan view;
    String data[];

    public c_formPenjualan(m_formPenjualan thisModel, v_formPenjualan thisView, String d[]) {
        model = thisModel;
        view = thisView;
        data = d;
        view.buttonBatal(new BatalListener());
        view.buttonSimpan(new simpanListener());
    }

    protected class BatalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_penjualanAdmin m = new m_penjualanAdmin();
            v_penjualanAdmin v = new v_penjualanAdmin();
            c_penjualanAdmin c = new c_penjualanAdmin(m, v, data);
            v.setVisible(true);
            view.setVisible(false);
        }

    }

    protected class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String tanggal = view.getTgltransaksi();
            String id = view.getidPelanggan();
            String jmlKredit = view.getKredit();
            model.tambahData(tanggal, id, jmlKredit);
            JOptionPane.showMessageDialog(view, "Data Penjualan Berhasil Ditambahkan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            m_penjualanAdmin m = new m_penjualanAdmin();
            v_penjualanAdmin v = new v_penjualanAdmin();
            c_penjualanAdmin c = new c_penjualanAdmin(m, v, data);
            v.setVisible(true);
            view.setVisible(false);
        }
    }
}
