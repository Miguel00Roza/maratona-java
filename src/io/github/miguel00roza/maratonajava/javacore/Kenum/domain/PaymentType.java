package io.github.miguel00roza.maratonajava.javacore.Kenum.domain;

public enum PaymentType {
        DEBITO{
            @Override
            public double calculateDiscount(double valor){
                return valor * 0.1; // 10%
            }
        }, CREDITO{
        @Override
        public double calculateDiscount(double valor){
            return valor * 0.05; // 5%
        }
    };

    public double calculateDiscount(double value){
            return 0;
    }
}
