package estruturadados.vetor;

import estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

    public Lista2(int capacidade) {
        super(capacidade);
    }

    @Override
    protected boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }

    @Override
    protected boolean adiciona(int posicao, T elemento) {
        return super.adiciona(posicao, elemento);
    }
}
