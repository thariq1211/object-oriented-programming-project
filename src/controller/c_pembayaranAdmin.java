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
import javax.swing.table.DefaultTableModel;
import model.*;
import view.*;

/**
 *
 * @author L
 */
public class c_pembayaranAdmin {

    m_pembayaranAdmin model;
    v_pembayaranAdmin view;
    v_pembayaranDebt view1;
    String data[];

    public c_pembayaranAdmin(m_pembayaranAdmin thisModel, v_pembayaranAdmin thisView, String d[]) {
        model = thisModel;
        view = thisView;
        data = d;
        view.Close(new closeListener());
        view.ADD(new addListener());
        view.tabelCustomer(new tabelListener());
        refreshTabel();
    }

    
    private int baris = -1;
    private String[] dataSelected = new String[7];

    protected class addListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_formPembayaran m = new m_formPembayaran();
            v_formPembayaran v = new v_formPembayaran();
            c_formPembayaran c = new c_formPembayaran(m, v, data);
            v.setVisible(true);
            view.setVisible(false);
        }

    }

    protected class closeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.setVisible(false);
        }

    }

    protected class tabelListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            int row = view.getTable().getSelectedRow();
            String isi = view.getTable().getValueAt(row, 0).toString();
//            baris = Integer.valueOf(isi);
            dataSelected[0] = view.getTable().getValueAt(row, 0).toString();
            dataSelected[1] = view.getTable().getValueAt(row, 1).toString();
            dataSelected[2] = view.getTable().getValueAt(row, 2).toString();
            dataSelected[3] = view.getTable().getValueAt(row, 3).toString();
            dataSelected[4] = view.getTable().getValueAt(row, 4).toString();
            dataSelected[5] = view.getTable().getValueAt(row, 5).toString();
            dataSelected[6] = view.getTable().getValueAt(row, 6).toString();

            view.setNO(dataSelected[0]);
            view.setTanggal(dataSelected[1]);
            view.setNama(dataSelected[3]);
            view.setCicilanKe(dataSelected[4]);
            view.setJumlah(dataSelected[5]);
            view.setSisaKredit(dataSelected[6]);

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }

    public void refreshTabel() {
        DefaultTableModel a = model.ReadData();
        view.setTabel(a);
    }
}
