package model.services;

public class CartaoCredito implements FormaPagamento{

	private final static Double PORCENTAGEM = 0.05;

    @Override
    public Double calcularPagamento(Double amount, Integer parcela) {
        return amount / parcela;
    }

    @Override
    public Double taxa(Double amount) {
        if (PORCENTAGEM == null) {
            throw new IllegalStateException("A porcentagem não foi inicializada corretamente.");
        }
        return amount * PORCENTAGEM;
    }

}
