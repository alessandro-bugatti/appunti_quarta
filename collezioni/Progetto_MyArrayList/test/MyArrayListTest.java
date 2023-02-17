import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    @Test
    @DisplayName("Test per l'inserimento di un intero")
    void addOneByOne() {
        MyArrayList a = new MyArrayList();
        assertEquals(0, a.size());
        a.add(13);
        assertEquals(1, a.size());
        a.add(13);
        assertEquals(2, a.size());
    }

    @Test
    @DisplayName("Aggiunta di tanti elementi per far scattare il ridimensionamento")
    void addBatch(){
        MyArrayList a = new MyArrayList();
        for (int i = 0; i < 20; i++) {
            a.add(i);
        }
        assertEquals(20, a.size());
        for (int i = 0; i < 1000; i++) {
            a.add(i);
        }
        assertEquals(1020, a.size());
    }

    @Test
    @DisplayName("Controllo che add ritorni true")
    void addReturnedValue(){
        MyArrayList a = new MyArrayList();
        assertEquals(true, a.add(1));
    }

    @Test
    @DisplayName("Verifica se gli elementi sono inseriti in ordine corretto")
    void addRightOrder(){
        MyArrayList a = new MyArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        assertEquals(1, a.get(0));
        assertEquals(2, a.get(1));
        assertEquals(3, a.get(2));

    }
}