package io.github.miguel00roza.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try{
        System.out.println(division(1, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Finished code");
    }

    /**
     *
     * @param a
     * @param b Nao pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */
    private static int division(int a, int b) {
        if(b == 0) throw new IllegalArgumentException("Can't divide by 0");
        return a/b;
    }
}
