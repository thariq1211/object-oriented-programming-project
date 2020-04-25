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
import model.m_formPenjualan;
import model.m_penjualanAdmin;
import view.v_formPenjualan;
import view.v_penjualanAdmin;

/**
 *
 * @author L
 */
public class c_penjualanAdmin {

    m_penjualanAdmin model;
    v_penjualanAdmin view;
    String data[];

    public c_penjualanAdmin(m_penjualanAdmin thisModel, v_penjualanAdmin thisView, String d[]) {
        model = thisModel;
        view = thisView;
        data = d;
        view.close(new closeListener());
        view.ADD(new addListener());
        view.DEL(new deleteListener());
        view.UPDATE(new updateListener());
        view.tabelCustomer(new tabelListener());
        refreshTabel();
    }
    private int baris = -1;
    private String[] dataSelected = new String[5];

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
            baris = Integer.valueOf(isi);
            dataSelected[0] = view.getTable().getValueAt(row, 0).toString();
            dataSelected[1] = view.getTable().getValueAt(row, 1).toString();
            dataSelected[2] = view.getTable().getValueAt(row, 2).toString();
            dataSelected[3] = view.getTable().getValueAt(row, 3).toString();
//            dataSelected[4] = view.getTable().getValueAt(row, 4).toString();
//            dataSelected[5] = view.getTable().getValueAt(row, 5).toString();

//            view.setID(dataSelected[0]);
            view.setNO(dataSelected[0]);
            view.setTanggal(dataSelected[1]);
            view.setID(dataSelected[2]);
            view.setKredit(dataSelected[3]);

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

    protected class addListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_formPenjualan m = new m_formPenjualan();
            v_formPenjualan v = new v_formPenjualan();
            c_formPenjualan c = new c_formPenjualan(m, v, data);
            v.setVisible(true);
            view.setVisible(false);
        }

    }

    protected class deleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int pilihan = JOptionPane.showConfirmDialog(view, "Apa anda yakin ingin menghapus?");
            if (pilihan == JOptionPane.YES_OPTION) {
                model.DeleteData(baris);
            }
            refreshTabel();
        }
    }

    protected class updateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String tanggal = view.getTanggal();
            String idpelanggan = view.getID();
            String kredit = view.getKredit();
            String da[] = new String[5];
            da[0] = dataSelected[0];
            da[1] = tanggal;
            da[2] = idpelanggan;
            da[3] = kredit;
            model.ubahData(tanggal, idpelanggan, kredit, Integer.valueOf(da[0]));
            JOptionPane.showMessageDialog(view, "Data Penjualan Berhasil Diupdate", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            refreshTabel();
        }
    }

    public void refreshTabel() {
        DefaultTableModel a = model.ReadData();
        view.setTabel(a);
    }
}
