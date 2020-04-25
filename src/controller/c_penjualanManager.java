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
import model.m_penjualanManager;
import view.v_penjualanManager;

/**
 *
 * @author L
 */
public class c_penjualanManager {

    String data[];
    m_penjualanManager mPenjManager;
    v_penjualanManager vPenjManager;

    public c_penjualanManager(m_penjualanManager m, v_penjualanManager v, String d[]) {
        mPenjManager = m;
        vPenjManager = v;
        data = d;
        vPenjManager.Close(new closeListener());
        vPenjManager.tabelCustomer(new tabelListener());
        vPenjManager.setVisible(true);
        refreshTabel();

    }
    private int baris = -1;
    private String[] dataSelected = new String[9];

    protected class closeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            vPenjManager.setVisible(false);
        }
    }

    protected class tabelListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            int row = vPenjManager.getTable().getSelectedRow();
            String isi = vPenjManager.getTable().getValueAt(row, 0).toString();
            baris = Integer.valueOf(isi);
            dataSelected[0] = vPenjManager.getTable().getValueAt(row, 0).toString();
            dataSelected[1] = vPenjManager.getTable().getValueAt(row, 1).toString();
            dataSelected[2] = vPenjManager.getTable().getValueAt(row, 2).toString();
            dataSelected[3] = vPenjManager.getTable().getValueAt(row, 3).toString();
            dataSelected[4] = vPenjManager.getTable().getValueAt(row, 4).toString();
//            dataSelected[5] = vPenjManager.getTable().getValueAt(row, 5).toString();

//            vPenjManager.setID(dataSelected[0]);
            vPenjManager.setNO(dataSelected[0]);
            vPenjManager.setNAMA(dataSelected[1]);
            vPenjManager.setPRODUK(dataSelected[2]);
            vPenjManager.setTANGGAL(dataSelected[3]);
            vPenjManager.setKREDIT(dataSelected[4]);

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
        DefaultTableModel a = mPenjManager.ReadData();
        vPenjManager.setTabel(a);
    }
}
