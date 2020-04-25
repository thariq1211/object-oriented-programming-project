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
public class c_motorManager {

    String data[];
    v_motorManager vMotor;
    m_motorManager mMotor;

    public c_motorManager(m_motorManager mMotorM, v_motorManager vMotorM, String d[]) {
        vMotor = vMotorM;
        mMotor = mMotorM;
        data = d;
        vMotor.ADD(new addListener());
        vMotor.DEL(new deleteListener());
        vMotor.UPDATE(new updateListener());
        vMotor.tabelCustomer(new tabelListener());
        vMotor.setVisible(true);
        vMotor.close(new closeListener());
        refreshTabel();
    }
    private int baris = -1;
    private String[] dataSelected = new String[9];

    protected class tabelListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            int row = vMotor.getTable().getSelectedRow();
            String isi = vMotor.getTable().getValueAt(row, 0).toString();
            baris = Integer.valueOf(isi);
            dataSelected[0] = vMotor.getTable().getValueAt(row, 0).toString();
            dataSelected[1] = vMotor.getTable().getValueAt(row, 1).toString();
            dataSelected[2] = vMotor.getTable().getValueAt(row, 2).toString();
            dataSelected[3] = vMotor.getTable().getValueAt(row, 3).toString();
            dataSelected[4] = vMotor.getTable().getValueAt(row, 4).toString();
            dataSelected[5] = vMotor.getTable().getValueAt(row, 5).toString();
            dataSelected[6] = vMotor.getTable().getValueAt(row, 6).toString();

            vMotor.setID(dataSelected[0]);
            vMotor.setMerk(dataSelected[1]);
            vMotor.setTahun(dataSelected[2]);
            vMotor.setHarga(dataSelected[3]);
            vMotor.setDP(dataSelected[4]);
            vMotor.setCicilan1(dataSelected[5]);
            vMotor.setCicilan2(dataSelected[6]);

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
            m_formMotor f1 = new m_formMotor();
            v_formMotor f2 = new v_formMotor();
            c_formMotor f3 = new c_formMotor(f1, f2, data);
            f2.setVisible(true);
            vMotor.setVisible(false);
        }
    }

    protected class updateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String merk = vMotor.getMerk();
            String thn = vMotor.getTahun();
            String harga = vMotor.getHarga();
            String dp = vMotor.getDP();
            String cicilan1 = vMotor.getCicilan1();
            String cicilan2 = vMotor.getCicilan2();
            String da[] = new String[9];
            da[0] = dataSelected[0];
            da[1] = merk;
            da[2] = thn;
            da[3] = harga;
            da[4] = dp;
            da[5] = cicilan1;
            da[6] = cicilan2;
            mMotor.ubahData(merk, thn, harga, dp, cicilan1, cicilan2, Integer.valueOf(da[0]));
            JOptionPane.showMessageDialog(vMotor, "Data Produk Berhasil Diupdate", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            refreshTabel();
        }
    }

    protected class deleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            int pilihan = JOptionPane.showConfirmDialog(vMotor, "Apa anda yakin ingin menghapus?");
            if (pilihan == JOptionPane.YES_OPTION) {
                mMotor.DeleteData(baris);
            }
            refreshTabel();
        }
    }

    protected class closeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vMotor.setVisible(false);
        }
    }

    public void refreshTabel() {
        DefaultTableModel a = mMotor.ReadData();
        vMotor.setTabel(a);
    }
}
