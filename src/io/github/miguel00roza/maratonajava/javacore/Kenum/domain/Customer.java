package io.github.miguel00roza.maratonajava.javacore.Kenum.domain;

public class Customer {
    public enum TipoPagamento {
        DEBITO, CREDITO
    }
    private String name;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Customer(String name, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.name = name;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Custumer{" +
                "name='" + name + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALUE +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }
}
