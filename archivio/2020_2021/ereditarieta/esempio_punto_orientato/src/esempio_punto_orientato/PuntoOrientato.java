/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esempio_punto_orientato;

/**
 *
 * @author Alessandro Bugatti
 */
public class PuntoOrientato extends Punto{
    /* Gli attributi della classe padre,
    vengono automaticamente inseriti anche nella classe figlio,
    però se sono privati nel padre, non possono essere maneggiati
    direttamente nella classe figlio
    */
    private char orientamento;
    
    public PuntoOrientato(double x, double y, char orientamento)
    {
        //Non si può fare
        //this.x = x;
        //this.y = y;
        super(x,y);
        this.orientamento = orientamento;
    }
    
    public PuntoOrientato(PuntoOrientato p)
    {
        //Valido sintatticamente, ma bisogna passare dal costruttore
        //this.setX(p.getX());
        //this.setX(p.getX());
        super(p.getX(), p.getY());
        this.orientamento = p.orientamento;
    }

    public char getOrientamento() {
        return orientamento;
    }

    public void setOrientamento(char orientamento) {
        this.orientamento = orientamento;
    }

    public void ruotaDestra()
    {
        char o = this.getOrientamento();
        if (o == 'A')
            //this.orientamento = 'D';
            this.setOrientamento('D');
        else if (o == 'D')
            this.setOrientamento('B');
        else if (o == 'B')
            this.setOrientamento('S');
        else if (o == 'S')
            this.setOrientamento('A');
    }
    
    public void ruotaSinistra()
    {
        char o = this.getOrientamento();
        if (o == 'A')
            //this.orientamento = 'D';
            this.setOrientamento('S');
        else if (o == 'S')
            this.setOrientamento('B');
        else if (o == 'B')
            this.setOrientamento('D');
        else if (o == 'D')
            this.setOrientamento('A');
    }
    
    public void sposta(double distanza)
    {
        char o = this.getOrientamento();
        if (o == 'A')
            this.setY(this.getY() + distanza);
        else if (o == 'S')
            this.setX(this.getX() - distanza);
        else if (o == 'B')
            this.setY(this.getY() - distanza);
        else if (o == 'D')
            this.setX(this.getX() + distanza);
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
        final PuntoOrientato other = (PuntoOrientato) obj;
        if (this.getX() != other.getX()) {
            return false;
        }
        if (this.getY() != other.getY()) {
            return false;
        }
        if (this.orientamento != other.orientamento) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString() + //"PuntoOrientato{" +
                // "x=" +
                //super.getX() +
                //" y="+
                //super.getY() +
                "orientamento=" + 
                orientamento ;
    }
    
    
    
}
