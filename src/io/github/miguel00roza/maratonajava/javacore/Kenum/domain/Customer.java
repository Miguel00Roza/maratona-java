package io.github.miguel00roza.maratonajava.javacore.Kenum.domain;

public class Customer {
    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Custumer{" +
                "name='" + name + '\'' +
                ", tipoCliente=" + customerType +
                ", tipoClienteInt=" + customerType.VALUE +
                ", PaymentType=" + paymentType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }
}
