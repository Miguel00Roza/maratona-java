package io.github.miguel00roza.maratonajava.javacore.Kenum.domain;

public enum CustomerType {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALUE;
    private String nameReport;
    CustomerType(int value, String nameReport) {
        this.VALUE = value;
        this.nameReport = nameReport;
    }

    public static CustomerType reportCustumerByName(String nameReport){
        for (CustomerType custumerType: values()){
            if(custumerType.getNameReport() == nameReport){
                return custumerType;
            }
        }
        return null;
    }

    public int getVALUE() {
        return VALUE;
    }

    public String getNameReport() {
        return nameReport;
    }
}
