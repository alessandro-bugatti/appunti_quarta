# Progetto Tennis

Creare una o più classi che servano per gestire il punteggio di una partita di tennis.

In una partita di tennis ci sono:

- **game**: un game ha un punteggio che varia all'interno dei valori 0, 15, 30, 40. Chi fa il punto dopo il 40 vince il game, a meno che anche l'altro giocatore non sia a 40. 
In tal caso si va ai *vantaggi*, cioè vince il primo giocatore che si trova in vantaggio di due punti.
- **set**: ogni volta che si vince un game si guadagna un punto, quando si arriva a 6 punti si vince il set, a meno che l'altro giocatore non sia a 5. 
In tal caso se uno dei due fa 7 a 5 vince lui e il set finisce, se invece vanno sul 6 pari si fa il *tie-break*. Nel tie-break vince il primo che arriva a 7, se si è sul 6 pari vince il primo che va in vantaggio di due punti.
- **match**: un match può essere al meglio dei 3 o dei 5 set. Nel caso dei 3 set vince il primo giocatore che ne conquista 2, nel caso dei 5 set vince il primo giocatore che ne conquista 3.

Scopo delle classi è liberare il programmatore che dovrà scrivere un programma per la gestione del tabellone da tutte le complicazioni del punteggio. Un ipotetico arbitro che dovesse questo programma si limiterà a dire chi ha fatto punto, il programma aggiornerà il punteggio di conseguenza.

Per semplificare il programma non tiene memoria di tutti i punteggi, ma solo di quelli attuali per game, set e match.