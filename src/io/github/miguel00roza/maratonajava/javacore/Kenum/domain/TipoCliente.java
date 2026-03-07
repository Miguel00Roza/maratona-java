package io.github.miguel00roza.maratonajava.javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALUE;
    TipoCliente(int value) {
        this.VALUE = value;
    }
}
