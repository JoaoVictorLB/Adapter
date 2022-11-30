package main.java.adapter;

public class ValorAdapter extends ValorReal{

    private IValor valorDolar;

    public ValorAdapter(IValor valorDolar) {
        this.valorDolar = valorDolar;
    }

    public float recuperarValor() {
        valorDolar.setValor((float) (this.getReal() * 5.55));
        return valorDolar.getValor();
    }

    public void salvarValor() {
        this.setReal((float) (valorDolar.getValor() / 5.55));
    }
}
