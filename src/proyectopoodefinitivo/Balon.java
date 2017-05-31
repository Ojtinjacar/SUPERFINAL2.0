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
public class Balon implements Runnable {

    private final int dd = 10;
    private int x;
    private int y;
    private int xa=15;
    private int ya=15;  
    
    private JugadorDeCampo jugadorDeCampo;
    private Partido cotejo;
    private Jugador jugador;
    private static Thread thread;
    
    public Balon(int x, int y, int xa, int ya, Jugador jugador) {
        this.x = x;
        this.y = y;
        this.jugador=jugador;
    }
    
    public void keyPressed(KeyEvent e){
        int boton = e.getKeyCode();
        int distancia=2;
        if(boton == KeyEvent.VK_K){
            if(jugadorDeCampo.getX()+40 - x<distancia){
                xa=20;
                ya=20;
            }
            if(jugadorDeCampo.getX()- x+10< distancia){
                xa=20;
                ya=20; 
            }
            if(jugadorDeCampo.getY()- y+20<distancia){
                xa=20;
                ya=20;
            }
            if(y - jugadorDeCampo.getY()+40<distancia){
                xa=20;
                ya=20;
            }
        }
    }
    public void keyReleased(KeyEvent e){
        int boton= e.getKeyCode();
        int distancia=2;
        if(boton== KeyEvent.VK_K){
            if(jugadorDeCampo.getX()+40 - x<distancia){
                xa=20;
                ya=20;
            }
            else if(jugadorDeCampo.getX()- x+1<distancia){
                xa=20;
                ya=20; 
            }
            else if(jugadorDeCampo.getY()- y+20<distancia){
                xa=20;
                ya=20;
            }
            else if(y - jugadorDeCampo.getY()+40<distancia){
                xa=20;
                ya=20;
            }
    }
    }
    /*
    public Balon(int x, int y) {
        this.x = x;
        this.y = y;
    }
    */

    public int getXa() {
        return xa;
    }

    public void setXa(int xa) {
        this.xa = xa;
    }

    public int getYa() {
        return ya;
    }

    public void setYa(int ya) {
        this.ya = ya;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moverfrente() {
        x = getX();
        x = x + dd;
    }

    public void moverAtras() {
        x = getX();
        x = x - dd;
    }

    public void moverIzquierda() {
        y = getY();
        y = y - dd;
    }

    public void moverderecha() {
        y = getY();
        y = y + dd;
    }
    
    public void iniciar(){
       thread= new Thread(this,"movi"); 
       thread.start();
    }
    
    public void patearFrente(){
    }
    
    public void patearAtras(){
        
    }
    
    public void patearDerecha(){
        
    }
    
    public void patearIzquierda(){
        
    }
    public Rectangle getBounds() {
        return new Rectangle(getX(), getY(), 30, 30);
    }

    @Override
    public void run() {
        this.move();
    }

    public void move(){
        if (x + xa < 0){
	    xa = 15;//la pelota se mueve hacia la derecha
	}
	if (x + xa >=1030  - 20){//para que la pelota no se salga del panel y cambie su direccion
            xa = -15;//la pelota se mueve hacia la izquierda 
	}
	if (y + ya < 0){
            ya = 15;//la pelota se mueve hacia abajo 
	}
	if (y + ya > 720 - 20){
            ya = -15;//la pelota se mueve hacia arriba
			//panel.gameOver();
	} 
                /*if(cotejo.checkCollisions()){
                    xa=0;
                    ya=0;
                }*/       
        x = x + xa;
	y = y + ya;       
    }

}
