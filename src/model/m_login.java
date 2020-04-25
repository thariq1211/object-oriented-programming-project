/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author cubo69
 */
public class m_login {
    Connection con;

    public m_login() {
        con = new m_koneksi().connection();
    }

    public int cekLogin(String username, String password) {
        String query = "select * from user where username='" + username + "' and "
                + "password ='" + password + "';";
        int level = 0;

        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                level = rs.getInt(4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return level;
    }

}
