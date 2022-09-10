package net.imparando;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestPunto {
    @Test
    void TestCostruttore()
    {
        Punto a = new Punto(1,1);
        Assertions.assertEquals(1, a.getX());
        Assertions.assertEquals(1, a.getY());
    }

    @Test
    void TestEquals()
    {
        Punto a = new Punto(1,1);
        Punto b = new Punto(1, 1);
        Assertions.assertEquals(a, b);
    }

    @Test
    void TestPuntoMedioUguali()
    {
        Punto a = new Punto(1,1);
        Punto b = new Punto(1, 1);
        Punto medio = a.medio(b);
        Punto expected = new Punto(1,1);
        Assertions.assertEquals(expected, medio);
    }

    @Test
    void TestPuntoMedioDiversi()
    {
        Punto a = new Punto(1,1);
        Punto b = new Punto(2, 3);
        Punto medio = a.medio(b);
        Punto expected = new Punto(1.5,2);
        Assertions.assertEquals(expected, medio);
    }

    @Test
    void TestDistanzaOrigine()
    {
        Punto a = new Punto(1, 1);
        double expected = Math.sqrt(2);
        Assertions.assertEquals(expected, a.distanzaOrigine());
    }


}
