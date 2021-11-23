package estruturadados.pilha.labs;

import estruturadados.pilha.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Teste06 {
    public static void reverteFrase(String frase) {
        Stack<Character> pilha = new Stack<>();

        char[] fraseInvertida = new char[frase.length()];
        int count = 0;

        // TODO: 22/11/2021 consertar o erro de não conseguir retornar a frase pra main
        for (int i = 0; i < frase.length(); i++) {
            // empilha as letras de uma palavra de cada vez
            for (; i < frase.length() && frase.charAt(i) != ' '; i++) {
                pilha.push(frase.charAt(i));
            }

            // desempilha em seguida
            while (!pilha.isEmpty()) {
                if (frase.charAt(count) != ' ') {
                    fraseInvertida[count] = pilha.pop();
                } else {
                    fraseInvertida[count] = ' ';
                }
                count++;
            }
        }
        System.out.println(fraseInvertida);
    }

    public static void main(String[] args) { // Ex06 da Lista 1 de EDD1
        Scanner scan = new Scanner(System.in);

        // Pilha<Character> invertida = new Pilha<>();

        String frase;

        System.out.println("Frase a ser invertida: ");
        frase = scan.nextLine();

        reverteFrase(frase);

        // chamar o método, passando a frase por parâmetro
        // System.out.println("Frase invertida: "+reverteFrase(frase));



        /////////////////////////
        // char[] fraseInvertida = new char[frase.length()];
        // int count = 0;
        /*for (int i = 0; i < frase.length(); i++) {
            // empilha as letras de uma palavra de cada vez
            for (; i < frase.length() && frase.charAt(i) != ' '; i++) {
                invertida.empilha(frase.charAt(i));
            }

            // desempilha em seguida
            while (!invertida.estaVazia()) {
                if (frase.charAt(count) != ' ') {
                    fraseInvertida[count] = invertida.desempilha();
                } else {
                    fraseInvertida[count] = ' ';
                }
                count++;
            }
        }
        System.out.println(fraseInvertida);*/
    }
}
