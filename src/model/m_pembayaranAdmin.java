/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static model.m_koneksi.con;

/**
 *
 * @author L
 */
public class m_pembayaranAdmin extends m_super {

    Connection con;

    public m_pembayaranAdmin() {
        con = new m_koneksi().connection();
    }

    public void ubahData(String tanggal, String cicilan, String jmlBayar, String Sisa, int id) {
        String query = "UPDATE pembayaran SET TglPembayaran='" + tanggal + "', CicilanKe='" + cicilan + "', "
                + "JmlBayar='" + jmlBayar + "',SisaKredit='" + Sisa + "' WHERE NoFaktur = " + id + "";
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public DefaultTableModel ReadData() {
        DefaultTableModel hasil = null;
        Vector<Vector<String>> hasilquery = new Vector<Vector<String>>();
        Statement stmt = null;
        String query = "SELECT p.NoFaktur, p.TglPembayaran,c.idPelanggan,c.Nama,"
                + "p.CicilanKe,p.JmlBayar,p.SisaKredit FROM pembayaran p JOIN customer c "
                + "ON p.idPelanggan=c.idPelanggan";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();

            Vector<String> namaKolom = new Vector<>();
            for (int i = 1; i <= 7; i++) {
                namaKolom.add(meta.getColumnName(i));
            }
            while (rs.next()) {
                Vector<String> satuBaris = new Vector<String>();
                satuBaris.add(String.valueOf(rs.getInt(1)));
                satuBaris.add(rs.getString(2));
                satuBaris.add(String.valueOf(rs.getInt(3)));
                satuBaris.add(rs.getString(4));
                satuBaris.add(String.valueOf(rs.getInt(5)));
                satuBaris.add(String.valueOf(rs.getInt(6)));
                satuBaris.add(String.valueOf(rs.getInt(7)));
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
