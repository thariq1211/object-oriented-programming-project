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
public class c_motorAdmin {

    String data[];
    m_motorAdmin model;
    v_motorAdmin view;

    public c_motorAdmin(m_motorAdmin m, v_motorAdmin v, String d[]) {
        model = m;
        view = v;
        data = d;
        view.tabelCustomer(new tabelListener());
        view.close(new closeListener());
        refreshTabel();
    }
    private int baris = -1;
    private String[] dataSelected = new String[9];

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
            dataSelected[4] = view.getTable().getValueAt(row, 4).toString();
            dataSelected[5] = view.getTable().getValueAt(row, 5).toString();
            dataSelected[6] = view.getTable().getValueAt(row, 6).toString();

            view.setID(dataSelected[0]);
            view.setMerk(dataSelected[1]);
            view.setTahun(dataSelected[2]);
            view.setHarga(dataSelected[3]);
            view.setDP(dataSelected[4]);
            view.setCicilan1(dataSelected[5]);
            view.setCicilan2(dataSelected[6]);

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
