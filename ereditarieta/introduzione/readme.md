# Esempi di ereditarietà già visti

- Contenitori di libreria (Collection, Map e compagnia bella)
- Eccezioni (fanno parte di una gerarchia di ereditarietà)
- Le classi JavaFX in generale fanno parte di una gerarchia. Ogni nostra applicazione eredita da una classe Application.
- Le classi per l'IO, sia da console/tastiera che da file sono sottoclassi di classi più generali.
- La parola chiave *implements* in qualche modo è legata all'ereditarietà
- La parola chiave *override* indica proprio che stiamo ridefinendo qualcosa che esiste già in una classe da cui si eredità, nei casi visti perchè si ridefiniscono i metodi della classe Object

# Cosa abbiamo imparato da questo esempio

- Una classe che erdita da un'altra, al suo interno contiene tutti gli attributi e i metodi della classe da cui eredita
- Se un attributo o un metodo sono privati nella classe padre, la classe figlio li contiene, ma non può accedere direttamente
- La parola chiave per indicare che una classe B eredita da una classe A è `extends` e si usa in questo modo
    ```java
  public class B extends A
    ```
- All'interno della classe che eredita, ci si può riferire alla classe padre attraverso la parola chiave `super`, ad esempio per "attivare" il costruttore, oppure per accedere a un metodo della classe padre
- Quando costruisco un oggetto della classe figlio, viene chiamato implicitamente il costruttore della classe padre
- Alcuni metodi della classe padre devono essere specializzati per avere senso nella classe figlio, quindi si fa *overriding* usando l'annotazione `@Override`. Attenzione che *overriding* non è *overloading*.
- Se il figlio vuole aggiungere nuovi attributi o metodi, questi sono presenti solo nella sua classe, non nel padre
- Nella gerarchia di ereditarietà di una serie di classi, le classi *in alto* sono più generali, le classi *in basso* sono via via più specializzate
  