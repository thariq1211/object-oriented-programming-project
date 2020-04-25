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
public abstract class m_super {

    Connection con;

    public m_super() {
        con = new m_koneksi().connection();
    }

    abstract public DefaultTableModel ReadData();

    abstract public void DeleteData(int id);

}
