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
public class c_customerManager {

    String data[];
    v_customerManager vCManager;
    m_customerManager mCManager;

    public c_customerManager(v_customerManager vCMan, m_customerManager mCMan, String d[]) {
        data = d;
        vCManager = vCMan;
        mCManager = mCMan;
        vCManager.tabelCustomer(new tabelListener());
        vCManager.Close(new closeListener());
        vCManager.setVisible(true);
        refreshTabel();
    }
    private int baris = -1;
    private String[] dataSelected = new String[9];

    class closeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            vCManager.setVisible(false);
        }
    }

    class tabelListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            int row = vCManager.getTable().getSelectedRow();
            String isi = vCManager.getTable().getValueAt(row, 0).toString();
//            baris = Integer.valueOf(isi);
            dataSelected[0] = vCManager.getTable().getValueAt(row, 0).toString();
            dataSelected[1] = vCManager.getTable().getValueAt(row, 1).toString();
            dataSelected[2] = vCManager.getTable().getValueAt(row, 2).toString();
            dataSelected[3] = vCManager.getTable().getValueAt(row, 3).toString();
            dataSelected[4] = vCManager.getTable().getValueAt(row, 4).toString();
            dataSelected[5] = vCManager.getTable().getValueAt(row, 5).toString();
            dataSelected[6] = vCManager.getTable().getValueAt(row, 6).toString();
            
            vCManager.setNama(dataSelected[0]);
            vCManager.setAlamat(dataSelected[1]);
            vCManager.setTelp(dataSelected[2]);
            vCManager.setPekerjaan(dataSelected[3]);
            vCManager.setNoKTP(dataSelected[4]);
            vCManager.setKredit(dataSelected[5]);
            vCManager.setKredit1(dataSelected[6]);
            
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
        DefaultTableModel a = mCManager.ReadData();
        vCManager.setTabel(a);
    }
}
