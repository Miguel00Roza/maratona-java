package io.github.miguel00roza.maratonajava.javacore.Kenum.test;

import io.github.miguel00roza.maratonajava.javacore.Kenum.domain.Customer;
import io.github.miguel00roza.maratonajava.javacore.Kenum.domain.PaymentType;
import io.github.miguel00roza.maratonajava.javacore.Kenum.domain.CustomerType;

public class CustumerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tsubasa", CustomerType.PESSOA_FISICA, PaymentType.CREDITO);
        Customer customer2 = new Customer("Sakura", CustomerType.PESSOA_JURIDICA, PaymentType.DEBITO);

        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(PaymentType.CREDITO.calculateDiscount(100));
        CustomerType pessoaFisica = CustomerType.reportCustumerByName("Pessoa Fisica");
        System.out.println(pessoaFisica);
    }
}
