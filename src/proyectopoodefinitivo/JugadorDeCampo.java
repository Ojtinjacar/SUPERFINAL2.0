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
public class JugadorDeCampo extends Jugador {

    private int PosX;
    private int PosY;
    private int dxB;
    private int dyB;
    private int velocidad;

    public JugadorDeCampo(String Nombre, int Numero, int x, int y) {
        super(Nombre, Numero, x, y);
        PosY = getY();
        PosX = getX();
    }

    public void mover() {
        x += dx;
        y += dy;
    }

   
    public Rectangle getBounds() {
        return new Rectangle(getX(), getY(), 60, 60);
    }

    public void volverPosicionInicial() {
        x = getX();
        y = getY();
    }

    @Override
    public void MoverPosicionInicial() {
        x = PosX;
        y = PosY;
    }

   public void keyPressed1(KeyEvent e) {

        int tecla = e.getKeyCode();
        if(tecla == KeyEvent.VK_Y){
            velocidad = 10;
        }
        if(tecla == KeyEvent.VK_J){
            velocidad = -5;
        }
        if (tecla == KeyEvent.VK_A) {
            dx = -Math.abs(10+velocidad);
        }
        if (tecla == KeyEvent.VK_D) {
            dx = 10;
        }
        if (tecla == KeyEvent.VK_W) {
            dy = -Math.abs(10+velocidad);
        }
        if (tecla == KeyEvent.VK_S) {
            dy = 10;
        }
    }

    public void keyReleased1(KeyEvent e) {
        int tecla = e.getKeyCode();

        if (tecla == KeyEvent.VK_A) {
            dx = 0;
        }
        if (tecla == KeyEvent.VK_D) {
            dx = 0;
        }
        if (tecla == KeyEvent.VK_W) {
            dy = 0;
        }
        if (tecla == KeyEvent.VK_S) {
            dy = 0;
        }
    }

    @Override
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
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();
        if(tecla == KeyEvent.VK_O){
            velocidad = 10;
        }
        if(tecla == KeyEvent.VK_C){
            velocidad = -5;
        }
        if (tecla == KeyEvent.VK_LEFT) {  
                dx = -Math.abs(10+velocidad); 
        }
        if (tecla == KeyEvent.VK_RIGHT) {
            dx = 10+velocidad;
        }
        if (tecla == KeyEvent.VK_UP) {
            dy = -Math.abs(10+velocidad);
        }
        if (tecla == KeyEvent.VK_DOWN) {
            dy = 10+velocidad;
        }
    }

}

        
    

    