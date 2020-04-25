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
public class c_customerAdmin {

    String data[];
    v_customerAdmin vCAdmin;
    m_customerAdmin mCAdmin;

    public c_customerAdmin(m_customerAdmin mAdmin, v_customerAdmin vAdmin, String data1[]) {
        vCAdmin = vAdmin;
        mCAdmin = mAdmin;
        data = data1;
        vCAdmin.ADD(new addListener());
        vCAdmin.UPDATE(new updateListener());
        vCAdmin.DEL(new deleteListener());
        vCAdmin.close(new closeListener());
        vCAdmin.tabelCustomer(new tabelListener());
        vCAdmin.setVisible(true);
        refreshTabel();
//        vCAdmin.DEL(new closeListener());

    }
    private int baris = -1;
    private String[] dataSelected = new String[9];

    protected class addListener implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent ae) {
            m_formCustomer f1 = new m_formCustomer();
            v_formCustomer f2 = new v_formCustomer();
            c_formCustomer f3 = new c_formCustomer(f2, f1, data);
            f2.setVisible(true);
            vCAdmin.setVisible(false);
        }
    }

    protected class deleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int pilihan = JOptionPane.showConfirmDialog(vCAdmin, "Apa anda yakin ingin menghapus?");
            if (pilihan == JOptionPane.YES_OPTION) {
                mCAdmin.DeleteData(baris);
            }
            refreshTabel();
        }
    }

    protected class updateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String Nama = vCAdmin.getNama();
            String Alamat = vCAdmin.getAlamat();
            String Telp = vCAdmin.getTelp();
            String Pekerjaan = vCAdmin.getPekerjaan();
            String KTP = vCAdmin.getNoKTP();
            String Kredit = vCAdmin.getKredit();
            String da[] = new String[9];
            da[0] = dataSelected[0];
            da[1] = Nama;
            da[2] = Alamat;
            da[3] = Telp;
            da[4] = Pekerjaan;
            da[5] = KTP;
            da[6] = Kredit;
            mCAdmin.ubahData(Nama, Alamat, Telp, Pekerjaan, KTP, Kredit, Integer.valueOf(da[0]));
            JOptionPane.showMessageDialog(vCAdmin, "Data Customer Berhasil Diupdate", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            refreshTabel();
        }
    }

    protected class closeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vCAdmin.setVisible(false);
        }

    }

    protected class tabelListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            int row = vCAdmin.getTable().getSelectedRow();
            String isi = vCAdmin.getTable().getValueAt(row, 0).toString();
            baris = Integer.valueOf(isi);
            dataSelected[0] = vCAdmin.getTable().getValueAt(row, 0).toString();
            dataSelected[1] = vCAdmin.getTable().getValueAt(row, 1).toString();
            dataSelected[2] = vCAdmin.getTable().getValueAt(row, 2).toString();
            dataSelected[3] = vCAdmin.getTable().getValueAt(row, 3).toString();
            dataSelected[4] = vCAdmin.getTable().getValueAt(row, 4).toString();
            dataSelected[5] = vCAdmin.getTable().getValueAt(row, 5).toString();
            dataSelected[6] = vCAdmin.getTable().getValueAt(row, 6).toString();

            vCAdmin.setID(dataSelected[0]);
            vCAdmin.setNama(dataSelected[1]);
            vCAdmin.setAlamat(dataSelected[2]);
            vCAdmin.setTelp(dataSelected[3]);
            vCAdmin.setPekerjaan(dataSelected[4]);
            vCAdmin.setNoKTP(dataSelected[5]);
            vCAdmin.setKredit(dataSelected[6]);

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
        DefaultTableModel a = mCAdmin.ReadData();
        vCAdmin.setTabel(a);
    }
}
