package net.imparando;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGame {

    @Test
    void TestPrimoQuindici()
    {
        Game a = new Game();
        a.puntoGiocatoreUno();
        String expected = "Game: 15 - 0";
        Assertions.assertEquals(expected, a.toString());
    }
}
