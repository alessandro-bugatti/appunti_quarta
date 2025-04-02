import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    @Test
    @DisplayName("Aggiunta di un elemento in testa e verifica che la toString produca il risultato corretto")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void addInTesta(){
        MyLinkedList ll = new MyLinkedList();
        ll.add(12);
        ll.add(7);
        ll.add(9);
        String expectedList = "[9, 7, 12]";
        String resultList = ll.toString();
        int expectedSize = 3;
        int size = ll.size();
        assertEquals(expectedList, resultList);
        assertEquals(expectedSize, size);
    }

    @Test
    @DisplayName("Aggiunta di un elemento in posizione e verifica che la toString produca il risultato corretto")
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void addInPosizione(){
        MyLinkedList ll = new MyLinkedList();
        ll.add(12);
        ll.add(7);
        ll.add(9);
        ll.add(1, 44);
        String expectedList = "[9, 44, 7, 12]";
        String resultList = ll.toString();
        int expectedSize = 4;
        int size = ll.size();
        assertEquals(expectedList, resultList);
        assertEquals(expectedSize, size);
    }

    @Test
    void listaVuota(){
        MyLinkedList ll = new MyLinkedList();
        assertEquals("[]", ll.toString());
    }

}