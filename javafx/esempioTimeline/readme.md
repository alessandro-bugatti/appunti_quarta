# Utilizzo della Timeline per la gestione di timer

La **Timeline** è un classe di JavaFX pensata per la gestione di 
animazioni anche molto sofisticate. Sostanzialmente può essere 
pensata come una linea del tempo nella quale vengono inserite delle
azioni che devono verificarsi in un certo istante e che scorre in 
parallelo alla normale esecuzione del programma.

Un esempio potrebbe essere l'animazione di _fade-in_ o _fade-out_,
nella quale l'opacità di un oggetto viene variata in modo regolare
da 0 a 1 (o viceversa), per far comparire (o scomparire) un 
oggetto in un tempo di 3 secondi.

L'utilizzo che viene fatto in questo esempio è molto semplice ed
è quello che serve a "mimare" dei timer, cioè degli eventi che 
vengono scatenati a intervalli regolari senza l'intervento dell'utente.

In questo caso il codice per ottenere l'effetto desiderato è il seguente
```Java
timeline = new Timeline(new KeyFrame(
                Duration.seconds(2),
                e -> incrementa()
        ));
```
dove **timeline** è un oggetto della classe **Timeline**, che nel suo costruttore
richiede uno o più **KeyFrame** (se ne viene messo più di uno verranno eseguiti
sequenzialmente). Il costruttore del **KeyFrame** vuole invece una durata, che in questo
esempio è di 2 secondi e come secondo parametro l'azione che verrà scatenata ad ogni
momento separato dalla durata indicata, in questo esempio ogni 2 secondi.
La notazione `e -> incrementa()` è una notazione funzionale che inietta il metodo `incrementa`
all'interno del costruttore, dove questo metodo è un normale metodo privato della classe
definito da noi.

Nel caso si volessero più eventi con _scorrimento parallelo_, cioè scatenati a intervalli 
diversi e indipendenti l'uno dall'altro, si possono usare più _timeline_, come si vede+
nell'esempio.

Le Timeline non garantiscono che l'evento verrà scatenato _esattamente_ nel momento desiderato,
ma per la gestione di timer lunghi, con durata di un secondo o più, sono assolutamente
adeguate.

Come si può vedere nell'esempio una Timeline può essere fatta partire e fermata
rispettivamente con i metodi `play` e `stop`.