# Programmazione GUI

Cos'è la programmazione GUI?

Per programmazione GUI si intende la scrittura
di programmi che utilizzano l'interfaccia grafica
del computer (**G**raphics **U**ser **I**nterface)

Ogni linguaggio permette di scrivere questo
genere di applicazioni, solitamente usando delle
librerie. Nel caso di Java la libreria che
utilizzeremo si chiama JavaFX.

Nel caso della nostra libreria è ovviamente 
orientata agli oggetti, quindi ci saranno una 
serie di classi per rappresentare gli oggetti
grafici (ad esempio bottoni, menù, campi di testo,
label, ecc.), ognuna delle quali avrà i propri
metodi.

Nella programmazione GUI inoltre viene utilizzato
anche un altro paradigma che è quello della 
programmazione orientata agli eventi.

## Struttura di un programma di base con JavaFX

### File presenti nel progetto

- HelloApplication: contiene il `main`, non va toccato se non per cambiare il titolo della finestra con il metodo `setTitle` o per piccole cose
- HelloController: contiene la logica dell'applicazione e le azioni che vengono scatenate dagli eventi
- hello-view.fxml: è un file XML che contiene la descrizione dell'interfaccia grafica

## Eventi
Sono tutti gli eventi che possono essere 
scatenati dall'utente (es. click del mouse, pressione di un tasto, drag 'n' drop, ecc.) oppure dal sistema (timer, pacchetti di rete in arrivo, ecc.)

## Azioni 
Sono dei metodi che vengono "agganciati" a un evento, in modo che al verificarsi
di un evento, venga chiamato il metodo "agganciato". Es. clicco su un bottone (evento) -> stampa una scritta in una label

## Cosa fare quando si crea un nuovo progetto

- Scegliere come template iniziale per il nuovo progetto il template JavaFX
- Scegliere un nome ragionevole e una posizione di salvataggio altrettanto ragionevole, eventualmente modificare il Group per un package diverso, es. cognome.nome
- Modifico i nomi dei tre file che ci sono sempre in modo da adattarli al progetto, utilizzando la funzionalità Refactoring dell'IDE
- Si crea l'interfaccia grafica utilizzando Scene Builder (click con tasto destro su il file .fxml)
- si aggiungono eventuali controlli grafici, adattandoli per posizione, dimensione, font... a quello che serve, inserendoli dentro dei contenitori
- se serve riferirsi a un controllo dal codice di un metodo del controller, gli si da un nome indicandolo nella tab Code nel campo di testo fx:id e poi andare nel file .fxml, trovare il nome inserito e con ALt + Invio inserirlo nel controller
- se serve agganciare un evento a un metodo, sempre nello stesso tab, si sceglie l'evento (spesso sarà on Action) e nel campo di testo si inserisce il nome del metodo che verrà agganciato, ad es. onSalutaButtonClick()
- se aggiungo degli eventi, dopo aver salvato in SceneBuilder, torno in IntelliJ e vado nel file .fxml. Ci sarà il nome del metodo in rosso, con Alt+Invio sul nome del metodo, faccio creare dall'IDE il metodo corrispondente nel controller, dove potrò inserire il codice che desidero

## Controlli grafici

I controlli grafici, o semplicemente i controlli, sono quegli oggetti che permettono interazione con l'utente (in lettura, scrittura o entrambe) 

### Label
Permette di scrivere del testo nella finestra, in generale è monolinea

### Button
Rappresenta un bottone, il cui evento naturale è la pressione sul tasto, scatenata da un click del mouse oppure da Invio se il bottone ha il focus. Inizialmente sarà l'oggetto che attiva le azioni che faremo

### TextField
Rappresenta un campo di input per input brevi (un numero, un nome, una frase corta, poco più). Al suo interno viene inserita comunque una stringa, che eventualmente va "trasformata" se ad esempio rappresenta un numero.