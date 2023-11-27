# Lettura/scrittura su file

 I concetti sono gli stessi già visti lo scorso anno,
 gli strumenti sono differenti.
 
## La classe FileReader

Questa classe serve ad aprire il file che si vuole leggere.
L'apertura avverrà all'atto della creazione con il costruttore.

Il costruttore però può lanciare un'eccezione di tipo Managed (da gestire).
Il programmatore ha due possibilità, non può ignorarla:
- rilanciare l'eccezione
- farsene carico tramite il costrutto `try-catch`

## La classe BufferedReader
Serve per la lettura vera e propria. Il costruttore ha come parametro l'oggetto di classe FileReader creato in precedenza.
Per la lettura, si legge riga per riga finchè ce ne sono. L'idioma tipica:
```java
while ((riga = br.readLine()) != null)
```