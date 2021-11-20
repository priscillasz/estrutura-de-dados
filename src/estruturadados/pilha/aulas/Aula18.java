package estruturadados.pilha.aulas;

import estruturadados.pilha.Pilha;

import java.util.Stack;

public class Aula18 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        // verifica se a pilha está vazia
        System.out.println(stack.isEmpty());

        // empilhar
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        System.out.println(stack);

        // ver o elemento que está no topo
        System.out.println(stack.peek());

        // desempilhar
        System.out.println(stack.pop());

        System.out.println(stack);
    }
}
