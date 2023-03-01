/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author alwai
 */
public class MyDB {

    public String SQL;
    public String host;
    public String uname;
    public String pass;

public MyDB(){
        this.SQL="SELECT * FROM CONNECT4SPIELER";
        this.host = "jdbc:derby://localhost:1527/connect4database";
        this.uname = "root";
        this.pass = "12345";
    }

}
