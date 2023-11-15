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