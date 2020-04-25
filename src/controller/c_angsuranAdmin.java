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
public class c_angsuranAdmin {

    String data[];
    m_angsuranAdmin model;
    v_angsuranAdmin view;

    public c_angsuranAdmin(m_angsuranAdmin m, v_angsuranAdmin v, String d[]) {
        model = m;
        view = v;
        data = d;
        view.Close(new closeListener());
        view.ADD(new addListener());
        view.tabelCustomer(new tabelListener());
        refreshTabel();
    }
    private int baris = -1;
    private String[] dataSelected = new String[6];

    protected class addListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            m_formAngsuran m = new m_formAngsuran();
            v_formAngsuran v = new v_formAngsuran();
            c_formAngsuran c = new c_formAngsuran(m, v, data);
            v.setVisible(true);
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

            view.setNAMA(dataSelected[0]);
            view.setPRODUK(dataSelected[1]);
            view.setNO(dataSelected[2]);
            view.setSubsidi(dataSelected[3]);
            view.setKREDIT(dataSelected[4]);
            view.setKREDIT1(dataSelected[5]);

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

    protected class closeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            view.setVisible(false);
        }
    }

    public void refreshTabel() {
        DefaultTableModel a = model.ReadData();
        view.setTabel(a);
    }
}
