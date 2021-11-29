package estruturadados.fila.teste;

import estruturadados.fila.Fila;

public class Aula20 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println(fila.estaVazia()); // false
        System.out.println(fila.tamanho()); // 3
        System.out.println(fila.toString());
    }
}
