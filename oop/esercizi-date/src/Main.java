void main() {
    Scanner in = new Scanner(System.in);
    int g, m, a;
    System.out.println("Inserisci giorno, mese e anno");
    g = in.nextInt();
    m = in.nextInt();
    a = in.nextInt();
    LocalDate oggi = LocalDate.now();
    LocalDate scadenza = LocalDate.of(a, m, g);
    if (oggi.isBefore(scadenza)){
        System.out.println("IL prodotto non è scaduto");
    }
    else{
        LocalDate d = scadenza;
        int giorni = 0;
        while(!d.equals(oggi)){
            d = d.plusDays(1);
            giorni++;
        }
        System.out.println("Dalla data di scadenza del " +
                scadenza + " sono passati " + giorni + " giorni");
    }
}
