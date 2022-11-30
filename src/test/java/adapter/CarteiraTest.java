package test.java.adapter;

import main.java.adapter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarteiraTest {

    @Test
    void deveRetornarValorDolar(){
        Carteira carteira = new Carteira();
        carteira.setValor(1.00f);
        assertEquals(1.00f, carteira.getValor());
    }

    @Test
    void deveRetornaValorReal(){
        Carteira carteira = new Carteira();
        carteira.setValor(5.55f);
        assertEquals(1.00f, carteira.getValorReal());
    }
}
