package com.flowacademy.yolo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SzamolTeszt {
    Szamol szamol = new Szamol();
    Main main = new Main();
    @Test
    public void mySimpleEqualsTest() {
        String nev = "lali";
        assertEquals(nev, "lali");
    }

    @Test
    public void testAdd1Plus1() {
        int x  = 1 ; int y = 1;
        assertEquals(2, szamol.osszead(x,y));
        assertEquals(0, szamol.kivon(x,y));
    }
    /*
    @Test
    public void JsonReadTest() {
        assertEquals(main.Employee.emp1);
    }
    */
}
