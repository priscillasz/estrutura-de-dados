package estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Teste05 {
    public static void main(String[] args) { // Questão 5 da Lista 1 de EDD1
        Scanner scan = new Scanner(System.in);

        Stack<Character> stack = new Stack<>();
        String sequencia;

        char abre1 = '(';
        char abre2 = '[';
        char abre3 = '{';

        char fecha1 = ')';
        char fecha2 = ']';
        char fecha3 = '}';

        System.out.println("Insira uma sequência de caracteres: ");
        sequencia = scan.nextLine();

        boolean ehBalanceado = true;
        for (int i = 0; i < sequencia.length(); i++) {
            //
            if (sequencia.charAt(i) == abre1) {
                stack.push(abre1);
            } else if (sequencia.charAt(i) == abre2) {
                stack.push(abre2);
            } else if (sequencia.charAt(i) == abre3) {
                stack.push(abre3);
            }

            //
            else if (sequencia.charAt(i) == fecha1) {
                if (stack.isEmpty() || stack.pop() != abre1) {
                    ehBalanceado = false;
                    break;
                }
            }

            //
            else if (sequencia.charAt(i) == fecha2 || stack.pop() != abre2) {
                if (stack.isEmpty()) {
                    ehBalanceado = false;
                    break;
                }
            }

            //
            else if (sequencia.charAt(i) == fecha3) {
                if (stack.isEmpty() || stack.pop() != abre3) {
                    ehBalanceado = false;
                    break;
                }
            }
        }

        //
        if (ehBalanceado) {
            System.out.println("A sequência está balanceada.");
        } else {
            System.out.println("A sequência não está balanceada.");
        }

    }
}
