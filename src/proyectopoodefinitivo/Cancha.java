/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoodefinitivo;

import java.awt.Rectangle;

/**
 *
 * @author JoseLuis
 */
public class Cancha {
    private int x;
    private int y;
    private int xf;
    private int yf;

    public Cancha(int x, int y, int xf, int yf) {
        this.x = x;
        this.y = y;
        this.xf = xf;
        this.yf = yf;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXf() {
        return xf;
    }

    public int getYf() {
        return yf;
    }

    public Rectangle getBounds(){
        return new Rectangle (getX(), getY(), getXf(), getYf());
    }
}
