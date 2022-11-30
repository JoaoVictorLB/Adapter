package main.java.adapter;

public class Carteira {

    IValor dinheiro;
    ValorAdapter conversor;

    public Carteira(){
        dinheiro = new ValorDolar();
        conversor = new ValorAdapter(dinheiro);
    }

    public void setValor(float valor) {
        dinheiro.setValor(valor);
        conversor.salvarValor();
    }

    public float getValor() {
        return conversor.recuperarValor();
    }

    // Método apenas para mostrar que está convertendo real para dolar através do adaptador
    public float getValorReal() {
        return conversor.getReal();
    }
}
