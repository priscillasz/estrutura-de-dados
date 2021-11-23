package estruturadados.pilha.labs;

import estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) { // Questão 1 Lista 1 EDD1
        // criação do scanner
        Scanner scan = new Scanner(System.in);

        // criação da pilha
        Pilha<Character> pilha = new Pilha<>();

        // leitura da string
        System.out.println("Insira uma string no formato xCy:");
        String xCy = scan.nextLine();

        // colocar cada caractere da string na pilha até chegar no char C
        for (int i = 0; xCy.charAt(i) != 'C'; i++) {
            pilha.empilha(xCy.charAt(i));
        }

        System.out.println(pilha); // teste

        // inicialização com 0
        int isXCY = 0;

        // pega o índice do char 'C'
        int posC = 0;
        for (int i = 0; i < xCy.length(); i++) {
            if (xCy.charAt(i) == 'C') {
                posC = i;
                break;
            }
        }

        System.out.println("posicao: "+posC); // teste

        // varre a string depois do caractere 'C' até o final, comparando com os elementos da pilha
        for (int i = posC+1; i<=xCy.length()-1; i++) {
            if (pilha.topo() == xCy.charAt(i)) {
                System.out.println("topo: "+pilha.topo()+" posicao: "+i); // teste
                pilha.desempilha();
                System.out.println((i+1)+" vezes "+pilha); // teste
                isXCY = 0;
            } else {
                isXCY = 1;
                break;
            }
        }

        // valida
        if (isXCY == 0) {
            System.out.println("é xCy");
        } else {
            System.out.println("não é xCy");
        }

            // varre a string do fim ao início, comparando com os elementos da pilha
        /*for (int i = xCy.length()-1; xCy.charAt(i) != 'C'; i--) {
            if (pilha.topo() == xCy.charAt(i)) {
                pilha.desempilha();
                System.out.println((i+1)+" vezes "+pilha);
                flag = 0;
            } else {
                flag = 1;
                break;
            }
            *//*if (pilha.topo() != xCy.charAt(i)) {
                flag = 1;
                break;
            } else {
                pilha.desempilha();
                System.out.println("top: "+pilha.topo());
                System.out.println("tamanho: ");
            }*//*
            System.out.println(xCy.charAt(i));
        }*/
    }
}
