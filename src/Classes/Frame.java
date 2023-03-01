/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.ImageIcon;

/**
 *
 * @author alwai
 */
public class Frame {

    public ImageIcon icon;
    public int Lang;
    public int Bereit;
    public int Wahl;

    public Frame(String bilddatei, int Lang, int Bereit, int Wahl) {
        this.icon = new ImageIcon(bilddatei);
        this.Lang = Lang;
        this.Bereit = Bereit;
        this.Wahl = Wahl;
    }

    public Frame(String bilddatei, int Wahl) {
        this.icon = new ImageIcon(bilddatei);
        this.Wahl = Wahl;
    }

    public Frame(String bilddatei) {
        this.icon = new ImageIcon(bilddatei);
    }

    public Frame() {
        this.Lang = 0;
        this.Bereit = 0;
        this.Wahl = (int) (Math.random() * 42 + 1);
    }

}
