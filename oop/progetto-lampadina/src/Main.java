public class Main{
    public static void main(String[] args){
        Lampadina l, n;
        //Esempi di utilizzo per capire la differenza tra riferimento e oggetto
        /*l = new Lampadina();
        l.potenza = 30;
        System.out.println(l.potenza);
        n = l;
        System.out.println(n.potenza);
        l.potenza = 40;
        System.out.println(n.potenza);
        System.out.println(l.potenza);
        l = new Lampadina();
        l.potenza = 50;
        System.out.println(l.potenza);
        System.out.println(n.potenza);
        n = l;
        System.out.println(l.potenza);
        System.out.println(n.potenza);*/
        l = new Lampadina(30);
        System.out.println(l);


    }
}
