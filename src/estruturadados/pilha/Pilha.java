package estruturadados.pilha;

import estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
       /*this.aumentaCapacidade();

       this.elementos[tamanho] = elemento;
       tamanho++;*/
        super.adiciona(elemento);
    }

    // retorna o elemento do topo da pilha
    public T topo() {
        if (this.estaVazia())
            return null;
        return this.elementos[tamanho-1];
    }

    // desempilha - pop
    public T desempilha() {

        if (this.estaVazia()) {
            return null;
        }

        /*T elemento = this.elementos[tamanho-1];
        tamanho--;

        return elemento;*/
        // de forma resumida
        return this.elementos[--tamanho];
    }
}
