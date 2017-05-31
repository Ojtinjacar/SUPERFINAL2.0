/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoodefinitivo;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/**
 *
 * @author oscar
 */
public class Portero extends Jugador {

    private int PosX;
    private int PosY;

    public Portero(String Nombre, int Numero, int x, int y) {
        super(Nombre, Numero, x, y);
        PosX = getX();
        PosY = getY();
    }

    public void mover() {
        x += dx;
        if (y == getY()) {
            y -= 10;
            if (y == 220) {
                y = 410;
            }
        }
    }

    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        if (tecla == KeyEvent.VK_LEFT) {
            dx = -10;
        }
        if (tecla == KeyEvent.VK_RIGHT) {
            dx = 10;
        }
        if (tecla == KeyEvent.VK_UP) {
            dy = -10;
        }
        if (tecla == KeyEvent.VK_DOWN) {
            dy = +10;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }
        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(getX(), getY(), 60, 60);
    }

    @Override
    public void MoverPosicionInicial() {
        x = PosX;
        y = PosY;
    }

    @Override
    public void keyReleased1(KeyEvent e) {
    }

    @Override
    public void keyPressed1(KeyEvent e) {
    }
}
