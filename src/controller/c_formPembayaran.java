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
public class c_formPembayaran {

    m_formPembayaran model;
    v_formPembayaran view;
    String data[];

    public c_formPembayaran(m_formPembayaran thisModel, v_formPembayaran thisView, String d[]) {
        model = thisModel;
        view = thisView;
        data = d;
        view.BatalButton(new batalListener());
        view.SimpanButton(new simpanListener());
        refreshTabel();
    }

    protected class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String tanggal = view.getTanggal();
            String noPenj = view.getNoPenj();
            String idPel = view.getidPelanggan();
            String cicilan = view.getCicilan();
            String jmlbyr = view.getJmlBayar();
            String sisa = view.getSisa();
            model.tambahData(tanggal, noPenj, idPel, cicilan, jmlbyr, sisa);
            JOptionPane.showMessageDialog(view, "Data Pembayaran Berhasil Ditambahkan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            m_pembayaranAdmin m = new m_pembayaranAdmin();
            v_pembayaranAdmin v = new v_pembayaranAdmin();
            c_pembayaranAdmin c = new c_pembayaranAdmin(m, v, data);
            v.setVisible(true);
            view.setVisible(false);
        }

    }

    protected class batalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_pembayaranAdmin m = new m_pembayaranAdmin();
            v_pembayaranAdmin v = new v_pembayaranAdmin();
            c_pembayaranAdmin c = new c_pembayaranAdmin(m, v, data);
            v.setVisible(true);
            view.setVisible(false);
        }

    }

    public void refreshTabel() {
        DefaultTableModel a = model.ReadData();
        view.setTabel(a);
    }
}
