package estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Teste0402 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        System.out.println("Pilha: "+ pilha);

        System.out.println("Insira o elemento que quer remover: ");
        int elementoRemover = scan.nextInt();

        for (int i = 0; i < pilha.size(); i++) {
            if (pilha.peek().equals(elementoRemover)) {
                System.out.println("Empilhando "+pilha.peek()); // teste
                pilha.pop();
            } else {
                aux.push(pilha.pop());
                System.out.println("Desempilhando "+ pilha); // teste
            }
        }

        // empilha os elementos que estavam na pilha auxiliar novamente na pilha original
        for (int i = 0; i <= aux.size(); i++) {
            pilha.push(aux.pop());
        }

        System.out.println("Pilha depois de remover o elemento escolhido: "+ pilha);

    }
}
