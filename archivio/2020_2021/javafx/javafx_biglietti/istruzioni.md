# Istruzioni per il programma per la stampa dei biglietti della Metro.

L'interfaccia deve essere simile a quella proposta, che viene mostrata nell'immagine **interfaccia.png** in questo repository, le regole logiche sono le seguenti:

- ogni biglietto può essere di una zona, 1, 2 o 3, dove zona 1 costo base 1.2 euro, zona 2 costo base 1.4 euro, zona 3 costo base 1.8 euro
- il sistema permette di comprare fino a 4 biglietti contemporaneamente
- se un utente ne ha diritto può selezionare queste agevolazioni:
    - over 70: sconto del 50%
    - disabile: sconto del 50%
    - nel caso un utente abbia diritto ad entrambe, il costo è 0 euro. 
  
- le agevolazioni vengono applicate a tutti i biglietti selezionati



Il bottone **Inserisci moneta**, quando premuto, aggiunge il valore mostrato nel campo di testo al totale finora inserito, mostrando nella label successiva la situazione attuale. Per rendere l'applicazione migliore si possono fare questi tre controlli:

- se il valore inserito non è quello di una delle possibili monete esistenti, il sistema deve mostrare un messaggio d'errore
- anche nel caso non sia stato inserito niente deve mostrare un messaggio d'errore
- quando il totale inserito supera quanto dovuto il bottone si disattiva per evitare l'inserimento di ulteriori monete.

Il bottone **Emetti il biglietto**, quando premuto, stampa nel box sottostante le informazioni relative alla scelta fatta e anche il valore dell'eventuale resto.

Per tutto quanto non specificato potete procedere come meglio credete, ogni modifica sostanziale all'interfaccia grafica va motivata.

