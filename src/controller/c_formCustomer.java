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
public class c_formCustomer {

    v_formCustomer vForm;
    m_formCustomer mForm;
    String dataa[];

    public c_formCustomer(v_formCustomer vForm1, m_formCustomer mForm1, String d[]) {
        vForm = vForm1;
        mForm = mForm1;
        dataa = d;
        vForm.BatalButton(new batalListener());
        vForm.SimpanButton(new simpanListener());
        refreshTabel();
    }

    public void refreshTabel() {
        DefaultTableModel a = mForm.ReadData();
        vForm.setTabel(a);
    }

    protected class batalListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_customerAdmin c1 = new m_customerAdmin();
            v_customerAdmin c2 = new v_customerAdmin();
            c_customerAdmin c3 = new c_customerAdmin(c1, c2, dataa);
            c2.setVisible(true);
            vForm.setVisible(false);
        }
    }

    protected class simpanListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String Nama = vForm.getNama();
            String Alamat = vForm.getAlamat();
            String Notelp = vForm.getNoTelp();
            String pekerjaan = vForm.getPekerjaan();
            String noKtp = vForm.getKTP();
            String barangKredit = vForm.getKredit();
            mForm.tambahPonsel(Nama, Alamat, Notelp, pekerjaan, noKtp, barangKredit);
            JOptionPane.showMessageDialog(vForm, "Data Customer Berhasil Ditambahkan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            m_customerAdmin m = new m_customerAdmin();
            v_customerAdmin v = new v_customerAdmin();
            c_customerAdmin c = new c_customerAdmin(m, v, dataa);
            vForm.setVisible(false);
        }

    }
}
