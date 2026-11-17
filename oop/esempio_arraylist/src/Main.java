void main() {
    ArrayList<Lampadina> l = new ArrayList<Lampadina>();
    l.add(new Lampadina(80));
    System.out.println(l.get(0));
    for (int i = 0; i < 50; i++) {
        l.add(new Lampadina(i * 2 + 10));
    }
    for( Lampadina i : l){
        i.accendi();
    }
}
