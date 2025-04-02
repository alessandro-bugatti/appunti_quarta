public class Main {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        //Test del metodo add(elemento)
        l.add(1);
        l.add(7);
        l.add(3);
        //Test del metodo toString
        System.out.println(l);
        System.out.println(l);
        //Test del metodo add(indice, elemento)
        l.add(1, 6);
        System.out.println(l);
        l.add(0, 4);
        System.out.println(l);
        l.add(l.size(), 9);
        System.out.println(l);
        l.clear();
        l.add(0, 5);
        System.out.println(l);
        l.add(3, 14);
        System.out.println(l);




    }
}