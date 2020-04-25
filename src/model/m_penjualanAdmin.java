/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author L
 */
public class m_penjualanAdmin extends m_super {

    @Override
    public DefaultTableModel ReadData() {
        DefaultTableModel hasil = null;
        Vector<Vector<String>> hasilquery = new Vector<Vector<String>>();
        Statement stmt = null;
        String query = "SELECT * FROM penjualan";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();

            Vector<String> namaKolom = new Vector<>();
            for (int i = 1; i <= 4; i++) {
                namaKolom.add(meta.getColumnName(i));
            }
            while (rs.next()) {
                Vector<String> satuBaris = new Vector<String>();
                satuBaris.add(String.valueOf(rs.getInt(1)));
                satuBaris.add(rs.getString(2));
                satuBaris.add(String.valueOf(rs.getInt(3)));
                satuBaris.add(rs.getString(4));
                hasilquery.add(satuBaris);
            }
            hasil = new DefaultTableModel(hasilquery, namaKolom);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hasil;
    }

    @Override
    public void DeleteData(int id) {
        String query = "DELETE FROM penjualan WHERE NoPenjualan = " + id + "";
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void ubahData(String tanggal, String idpelanggan, String kredit, int id) {
        String query = "UPDATE penjualan SET TglTransaksi='" + tanggal + "', idPelanggan='" + idpelanggan + "', "
                + "Kredit='" + kredit + "' WHERE NoPenjualan = " + id + "";
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
