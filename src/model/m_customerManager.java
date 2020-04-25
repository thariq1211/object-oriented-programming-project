/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class m_customerManager extends m_super {

    Connection con;

    public m_customerManager() {
        con = new m_koneksi().connection();
    }

    @Override
    public DefaultTableModel ReadData() {
        DefaultTableModel hasil = null;
        Vector<Vector<String>> hasilquery = new Vector<Vector<String>>();
        Statement stmt = null;
        String query = "SELECT c.Nama,c.Alamat,c.NoTelp,c.Pekerjaan,c.NoKTP,pk.merkBarang,p.SisaKredit "
                + "FROM pembayaran p JOIN penjualan p1 ON p.NoPenjualan=p1.NoPenjualan "
                + "JOIN customer c ON c.idPelanggan=p.idPelanggan "
                + "JOIN produkkredit pk ON c.Produk_Kredit=pk.idBarang";
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
//                satuBaris.add(String.valueOf(rs.getInt(1)));
                satuBaris.add(rs.getString(1));
                satuBaris.add(rs.getString(2));
                satuBaris.add(rs.getString(3));
                satuBaris.add(rs.getString(4));
                satuBaris.add(rs.getString(5));
                satuBaris.add(rs.getString(6));
                satuBaris.add(rs.getString(7));
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
