package estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> { // T significa class Type

    private T[] elementos;
    private int tamanho;

    // construtor (muito mais simples que a segunda forma)
    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    /*public Lista(int capacidade) {
        this.elementos = new T[capacidade]; -> Java não permite fazer isso
        this.tamanho = 0;
    }*/

    // segunda forma de fazer o construtor
    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    // método 3
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // #7 add elemento em qualquer posição
    public boolean adiciona(int posicao, T elemento) {
        // verifica se a posição é válida ou não
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        this.aumentaCapacidade();

        // mover todos os elementos
        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }

        // atribuir o elemento à posição
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    // #8 aumentar capacidade do vetor
    // private pq vai ser utilizado apenas internamente na classe Vetor
    private void aumentaCapacidade(){ // só é executado quando o tamanho do vetor atinge a capacidade
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos; // atribuir o novo vetor ao vetor Vetor
        }
    }

    public T obtem(int posicao) {
        return this.busca(posicao);
    }

    // #5 buscar elemento em uma determinada posição
    public T busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        return this.elementos[posicao];
    }

    // #6 verificar se elemento existe no vetor
    public int busca(T elemento) {
        // busca sequencial
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // ultimo indice - ex2
    public int ultimoIndice(T elemento) {
        for (int i = this.tamanho-1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    // contém - ex1
    public boolean contem(T elemento) {
        return busca(elemento) > -1; // >= 0

        /* ou
        int pos = busca(elemento);
        if (pos > -1) {
            return true;
        }
        return false;*/
    }

    // #9 remover elemento do vetor através da posição que ele está
    public void remove(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }

        for (int i = posicao; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }

        this.tamanho--;
    }

    // ex3
    public void remove(T elemento) {
        int pos = this.busca(elemento);
        if (pos > -1) {
            this.remove(pos);
        }
    }

    // ex5 - remover todos os elementos (clear)
    public void limpar() {
        // as três opções são válidas
        // opção 1
        // this.elementos = (T[]) new Object[this.elementos.length];

        // opção 2 -> resetar o tamanho
        // this.tamanho = 0;

        // opção 3
        for (int i = 0; i < this.tamanho; i++) {
            this.elementos[i] = null;
        }
        this.tamanho = 0;
    }

    // getTamanho
    public int tamanho() {
        return this.tamanho;
    }

    // imprimir os elementos do vetor
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");
        return s.toString();
    }
}
