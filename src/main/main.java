/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import model.m_login;
import controller.c_login;
import view.v_login;

/**
 *
 * @author thor
 */
public class main {

    public static void main(String[] args) {
        m_login login = new m_login();
        v_login log = new v_login();
        c_login logg = new c_login(log, login);
    }
}
