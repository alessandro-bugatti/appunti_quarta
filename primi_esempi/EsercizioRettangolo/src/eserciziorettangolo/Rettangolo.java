/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziorettangolo;

/**
 *
 * @author Maurizio, Mariottini, Olivari, Fogazzi
 */
public class Rettangolo {
    private Punto a;
    private Punto b;

    public Rettangolo(Punto a, Punto b) {
        this.a = a;
        this.b = b;
    }

    public Rettangolo(Rettangolo r) {
        this.a = r.a;
        this.b = r.b;
    }
    
 
    public int getArea() {
        int base = Math.abs(this.a.getX() - this.b.getX());
        int altezza = Math.abs(this.a.getY() - this.b.getY());
        return base*altezza;
    }
    
    public boolean interseca(Rettangolo r) {
        return ;
    }
    
    public boolean spostaX(int distanza) {
        this.a.setX(this.a.getX() + distanza);
        return true;
    }
    
    public boolean spostaY(int distanza) {
        return ;
    }
    
    public void ruota()
    {
        
    }
}
