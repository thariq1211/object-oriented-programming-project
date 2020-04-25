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
import model.*;
import view.*;

/**
 *
 * @author L
 */
public class c_angsuranDept {
    
    String data[];
    m_angsuranDept model;
    v_angsuranDept view;
    
    public c_angsuranDept(m_angsuranDept m, v_angsuranDept v, String d[]) {
        model = m;
        view = v;
        data = d;
        view.buttonBatal(new batalListener());
        view.buttonSimpan(new simpanListener());
        view.buttonExit(new exit());
        refreshTabel();
    }
    
    protected class exit implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            view.setVisible(false);
        }
        
    }
    
    protected class batalListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            m_angsuranDept c1 = new m_angsuranDept();
            v_angsuranDept c2 = new v_angsuranDept();
            c_angsuranDept c3 = new c_angsuranDept(c1, c2, data);
            c2.setVisible(true);
            view.setVisible(false);
        }
    }
    
    protected class simpanListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent ae) {
            String noPenj = view.getNoPenjualan();
            String subsidi = view.getSubsidi();
            String bunga = view.getBunga();
            String totKredit = view.getTotalKredit();
            int id = Integer.parseInt(view.getID());
            
            model.UpdateData(noPenj, subsidi, bunga, totKredit, id);
            JOptionPane.showMessageDialog(view, "Data Angsuran Berhasil Ditambahkan", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            view.setVisible(false);
        }
    }
    
    public void refreshTabel() {
        DefaultTableModel a = model.ReadData();
        view.setTabel(a);
    }
    
}
