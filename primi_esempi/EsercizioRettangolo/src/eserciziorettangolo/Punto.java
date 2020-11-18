/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziorettangolo;



/**
 *
 * @author Maurizio, Olivari, Mariottini, Fogazzi
 */
public class Punto {
    
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }
    
    public Punto(Punto a) {
        this.setX(a.x);
        this.setY(a.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 800)
            x = 0;
        if (x < 0)
            x = 0;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    double distanza(Punto a) {
        return Math.sqrt((this.x - a.x)*(this.x - a.x)+(this.y - a.y)*(this.y - a.y));   
    }
    
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Punto other = (Punto) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
    
        
    
    
}
