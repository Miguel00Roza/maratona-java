package io.github.miguel00roza.maratonajava.javacore.Hheranca.tests;

import io.github.miguel00roza.maratonajava.javacore.Hheranca.domain.Endereco;
import io.github.miguel00roza.maratonajava.javacore.Hheranca.domain.Funcionario;
import io.github.miguel00roza.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 123");
        endereco.setCep("012345-209");

        Pessoa pessoa = new Pessoa("Gojou Satoru");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.print();
        System.out.println("-----------------------------");
        Funcionario funcionario = new Funcionario("Sasuke Uchiha");
        funcionario.setCpf("676767676767");
        funcionario.setEndereco(endereco);
        funcionario.setSalary(4500.0);
        funcionario.print();
    }
}
