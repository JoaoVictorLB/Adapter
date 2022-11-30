package main.java.adapter;

public class ValorDolar implements IValor{
    private float dolar;

    @Override
    public float getValor(){ return this.dolar; }

    @Override
    public void setValor(float valor){ this.dolar = valor; }
}
