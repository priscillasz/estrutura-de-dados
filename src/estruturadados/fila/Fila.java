package estruturadados.fila;

import estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    // construtor -> inicializa a fila com 10 elementos
    public Fila() {
        super();
    }

    // construtor -> inicializa a fila com a qtd do input
    public Fila(int capacidade) {
        super(capacidade);
    }

    // enfileirar
    public void enfileirar(T elemento) {
        // this.elementos[this.tamanho] = elemento;
        // this.tamanho++;

        // this.elementos[this.tamanho++] = elemento;

        super.adiciona(elemento);
    }

    // espiar - peek
    public T espiar() {
        if (this.estaVazia()) { // só pra deixar mais completo... n é necessário
            return null;
        }
        return this.elementos[0];
    }

    // desenfileirar
    public T desenfileirar() {
        final int POS = 0;

        if (this.estaVazia()) {
            return null;
        }

        T elementoASerRemovido = this.elementos[POS];

        this.remove(POS);

        // OU
        /*for (int i = POS; i<tamanho-1; i++) {
            elementos[i] = elementos[i+1];
        }
        tamanho--;*/

        return elementoASerRemovido;
    }
}
