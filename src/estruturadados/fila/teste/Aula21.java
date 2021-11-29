package estruturadados.fila.teste;

import estruturadados.fila.Fila;

public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        System.out.println(fila.espiar()); // nulo

        fila.enfileirar(1);
        fila.enfileirar(2);

        System.out.println(fila.espiar());

        System.out.println(fila.toString());
    }
}
