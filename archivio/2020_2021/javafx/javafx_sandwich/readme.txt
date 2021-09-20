Brevi istruzioni per l'aggiunta di un'immagine che mostra il sandwich
richiesto

Aggiunta della image view nella GUI, si usa lo Scene Builder

Come gestire l'evento della ChoiceBox, non supportato nello Scene Builder, 
si può fare da codice
choSandwich.setOnAction(this::onSelectSandwich);
Occhio al method reference, introdotto in Java 8
Verificare che funziona

Creazione della cartella delle risorse, in cui inserire le proprie immagini

Immagine
Caricamento del file 
FileInputStream input;
Trasformazione in un'immagine in memoria
Image image = new Image(input);
Caricamento nell'image view per mostrarla all'utente
imgSandwich.setImage(image);

Completare il compito usando le classi contenitore