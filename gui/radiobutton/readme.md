# Radio button

Sono dei bottoni con cui voglio rappresentare delle scelte mutuamente esclusive.

L'aspetto grafico è quello di cerchi vuoti, dove quello selezionato contiene un pallino.

La loro funzione è quella di permettere all'utente di fare una scelta tra N possibili, con N piccolo.

Per certi aspetti sono simili alle ChoiceBox, però:
-  le ChoiceBox sono più adatte se N è grande, perchè occupano sempre lo stesso spazio
- il vantaggio dei Radio Button è che le opzioni sono sempre visibili e ognua può essere anche molto lunga come testo

Per default, ogni bottone è indipendente dagli altri. Volendo ottenere il comportamente atteso (cioè la mutua esclusione), devono essere raggruppati in *Toggle group*, cioè devono appartenere a un gruppo con lo stesso nome. Nello Scene Builder questo lo si ottiene facilmente andando a inserire il nome del gruppo nel campo Toggle group.