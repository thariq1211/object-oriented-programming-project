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
public class m_formPenjualan {

    Connection con;

    public m_formPenjualan() {
        con = new m_koneksi().connection();
    }

    public void tambahData(String tglTransaksi, String idPelanggan, String Kredit) {
        String query = "insert into penjualan "
                + "VALUES (NULL, '" + tglTransaksi + "', '" + idPelanggan + "','" + Kredit + "')";
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
