package io.github.miguel00roza.maratonajava.javacore.Kenum.test;

import io.github.miguel00roza.maratonajava.javacore.Kenum.domain.Customer;
import io.github.miguel00roza.maratonajava.javacore.Kenum.domain.Customer.TipoPagamento;
import io.github.miguel00roza.maratonajava.javacore.Kenum.domain.TipoCliente;

public class CustumerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Customer customer2 = new Customer("Sakura", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(customer1);
        System.out.println(customer2);
    }
}
