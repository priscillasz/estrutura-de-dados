package estruturadados.vetor.labs;

import estruturadados.vetor.Lista;
import estruturadados.vetor.aulas.Contato;

import java.util.Scanner;

public class Ex07 extends Ex06 {
    public static void main(String[] args) {
        // criação das variáveis
        Scanner scan = new Scanner(System.in);

        // criar o vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<>(20);

        // criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        // criar um menu para que o usuário escolha a opção
        int opcao = 1;
        while (opcao != 0) {
            opcao = obterOpcaoMenu(scan);

            switch (opcao) {
                case 1: // addiciona contato no final do vetor
                    adicionarContatoFinal(scan, lista);
                    break;
                case 2: // adiciona contato em uma posição específica
                    adicionarContatoPosicao(scan, lista);
                    break;
                case 3: // obtem contato de uma posição específica
                    obtemContatoPosicao(scan, lista);
                    break;
                case 4: // consulta contato
                    obtemContato(scan, lista);
                    break;
                case 5: // consulta ultimo indice do contato
                    pesquisarUltimoIndice(scan, lista);
                    break;
                case 6: // verifica se contato existe
                    pesquisarContatoExiste(scan, lista);
                    break;
                case 7: // excluir por posição
                    excluirPorPosicao(scan, lista);
                    break;
                case 8: // excluir contato
                    excluirContato(scan, lista);
                    break;
                case 9: // verifica tamanho do vetor
                    imprimeTamanhoVetor(lista);
                    break;
                case 10: // excluir todos os contatos da lista
                    limparVetor(lista);
                    break;
                case 11: // imprime vetor
                    imprimirVetor(lista);
                    break;
                default:
                    break;
            }
        }

        System.out.println("Usuário digitou 0, programa finalizado.");
    }

    // 11- imprimir vetor
    private static void imprimirVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }

    // 10- excluir todos os contatos da lista
    private static void limparVetor(Lista<Contato> lista) {
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram removidos.");
    }

    // 9- verifica tamanho do vetor
    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor é de: "+ lista.tamanho());
    }

    // 8- excluir contato
    private static void excluirContato(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            Contato contato = lista.busca(pos);
            lista.remove(contato);

            System.out.println("Contato excluído");
        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }
    }

    // 7- excluir contato por posição
    private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser removida", scan);

        try {
            lista.remove(pos);
            System.out.println("Contato excluído");
        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }
    }

    // 6- verificar se o contato existe
    private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            boolean existe = lista.contem(contato);
            if (existe) {
                System.out.println("Contato existe, seguem dados:");
                System.out.println(contato);
            } else {
                System.out.println("Contato não existe.");
            }
        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }
    }

    // 5- consulta ultimo indice do contato
    private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.ultimoIndice(contato);
            System.out.println("Contato encontrado no índice "+ pos);
        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }
    }

    // 4- obtem contato
    private static void obtemContato(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.busca(contato);
            System.out.println("Contato encontrado na posição "+ pos);
        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }
    }

    // 3- obtem contato de uma posição específica
    private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {
        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", scan);

        try {
            Contato contato = lista.busca(pos);
            System.out.println("Contato existe, seguem dados:");
            System.out.println(contato);

        } catch (Exception e) {
            System.out.println("Posição inválida.");
        }
    }

    // 1- adiciona contato no final do vetor
    private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato... Entre com as informações:");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o email", scan);
        String email = leInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    // 2- adiciona contato em uma posição específica
    private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
        System.out.println("Criando um contato... Entre com as informações:");
        String nome = leInformacao("Entre com o nome", scan);
        String telefone = leInformacao("Entre com o email", scan);
        String email = leInformacao("Entre com o email", scan);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato", scan);

        try {
            lista.adiciona(pos, contato);
            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        } catch (Exception e) {
            System.out.println("Posição inválida, contato não adicionado.");
        }
    }

    // criar e adicionar 30 contatos
    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato;

        for (int i = 1; i <= quantidade; i++) {
            contato = new Contato();
            contato.setNome("Contato "+ i);
            contato.setTelefone("1111111"+i);
            contato.setEmail("contato"+i+"@email.com");

            lista.adiciona(contato);
        }
    }
}
