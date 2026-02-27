package io.github.miguel00roza.maratonajava.javacore.Fmodificadorstatic.domain;

public class Car {
    private String name;
    private double topSpeed;
    private static double speedLimit = 250;
    // quando temos o modificador static, ao alteramos a propriedade ele altera a classe toda
    // modificando o valor de todas os objetos e não apenas do objeto que alterou essa propriedade em si

    // resumo: Faz o atributo pertencer à classe e todos os objetos vao compartilhar o mesmo valor

    public Car(String name, double topSpeed) {
        this.name = name;
        this.topSpeed = topSpeed;
    }

    public void print() {
        System.out.println("-----------------");
        System.out.println("Name: " + this.name);
        System.out.println("Top speed: " + this.topSpeed);
        System.out.println("Speed limit: " + Car.speedLimit);
        // Como speedLimit é static, não seria certo acessar com this, pois esta propriedade agora pertence
        // a todos os objetos do tipo Car
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    // Parte 2: Metodos estaticos

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
        // não podemos utilizar this dentro de métodos estáticos, pois o this se referencia no objeto
        // e como o metodo é estático, ele pode ser chamado sem a criação de um objeto, portanto
        // devemos nos referenciar usando a classe em si com NomeDaClasse. e não ao objeto com this.
    }

    public static double getSpeedLimit(){
        return Car.speedLimit;
    }
}
