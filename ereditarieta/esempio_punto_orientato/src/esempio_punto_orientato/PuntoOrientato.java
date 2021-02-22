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
