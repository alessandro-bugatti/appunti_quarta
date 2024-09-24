# Utilizzo dei ChoiceBox, TextField e Alert

In questo esempio vengono introdotti dei nuovi controlli per permettere l'input dell'utente, 
al momento senza interessarsi degli eventuali eventi generati.

## ChoiceBox
Graficamente è un menù a tendina, serve a mostrare una possibilità tra tante, di solito
le possibilità sono un certo numero, altrimenti possono essere più convenienti i radio button.
### Da sapere

Per riempire le scelte di un ChoiceBox si possono utilizzare due modalità:

- inserire gli elementi desiderati uno a uno, attraverso il metodo

    ```java
    choChoice.getItems().add(elemento);
    ```
    dove `choChoice` è il nome del ChoiceBox e  `elemento` è l'oggetto che si vuole inserire nel menù a tendina. La variabile `elemento` può essere un oggetto di una qualunque classe.
- inserire un vettore di oggetti, sempre di una qualsiasi classe. In questo caso è sufficiente chiamare:
    ```java
    choChoice.getItems().addAll(vettore);
    ```
    dove `choChoice` è il nome del ChoiceBox e `vettore` è il vettore di oggetti che si vuole vengano
    mostrati.

Il ChoiceBox, una volta "riempito" con un insieme di oggetti, utilizzerà il metodo ```to_string()``` per visualizzare le varie voci nel menù a tendina.

Siccome solitamente si desidera che il ChoiceBox sia già popolato al momento della creazione, 
questa o queste istruzioni verranno inserite nel codice del metodo `inizialize` del controller, che 
è un metodo che viene chiamato automaticamente quando viene istanziata l'applicazione
```java
@FXML
void initialize(){...}
```

Per assicurarsi che il primo elemento visualizzato sia il primo elemento inserito e non una stringa vuota, che è il comportamento
normale del ChoiceBox, basta aggiungere anche questa istruzione nel
metodo `initialize`:

```java
@FXML
choConversioni.getSelectionModel().selectFirst();
```


Per sapere qual è la selezione attuale del ChoiceBox basta questa linea di codice
```Java
choChoice.getSelectionModel().getSelectedItem();
```
che ritornerà l'oggetto che in quel momento si trova selezionato nel
menù a tendina. Siccome l'oggetto ritornato sarà sempre di classe `Object`, sarà necessario fare un cast alla classe corretta: supponendo, ad esempio, che gli oggetti inseriti con i metodi 
`add` o `addAll` fossero stati delle stringhe, l'istruzione sarà qualcosa come

```Java
String s = (String) choChoice.getSelectionModel().getSelectedItem();
```

## TextField
Un campo di testo per inserire del testo breve, che verrà memorizzato come stringa.
Per settare il testo ci penserà l'utente, per leggere quanto inserito basterà fare
```Java
txtTesto.getText();
```
con `txtTesto` il nome del TextBox e il valore ritornato dal metodo sarà sempre una stringa.
Se poi fosse necessario convertirla, ad esempio in un double, bisognerà usare il metodo
`Double.parseDouble`, stando attenti che potrebbe generare un'eccezione di tipo 
`NumberFormatException`.

## Alert
L'Alert fa parte di tutta una serie di controlli _predefiniti_ che sono _modali_, cioè prendono 
il controllo dell'applicazione finchè non si fa quello che chiedono, si veda
[https://code.makery.ch/blog/javafx-dialogs-official/](https://code.makery.ch/blog/javafx-dialogs-official/)
Questo controllo può essere un modo semplice di gestire l'eccezione generata da un TextBox.