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
public class m_formMotor {

    Connection con;

    public m_formMotor() {
        con = new m_koneksi().connection();
    }

    public void tambahPonsel(String merk, String tahun, String harga, String dp, String cicilan1, String cicilan2) {
        String query = "insert into produkkredit "
                + "VALUES (NULL, '" + merk + "', '" + tahun + "','" + harga + "','" + dp + "','" + cicilan1 + "','" + cicilan2 + "')";
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
