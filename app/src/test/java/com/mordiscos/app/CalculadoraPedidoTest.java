package com.mordiscos.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraPedidoTest {

    @Test
    public void sumaCorrectamenteHamburguesaYPapas() {
        CalculadoraPedido calculadora = new CalculadoraPedido();
        int total = calculadora.calcularTotal(15000, 6000);
        assertEquals(21000, total);
    }
}