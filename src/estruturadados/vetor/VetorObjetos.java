package estruturadados.vetor;

public class VetorObjetos {
    private Object[] elementos;
    private int tamanho;

    // construtor
    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    // método 3
    public boolean adiciona(Object elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // #7 add elemento em qualquer posição
    public boolean adiciona(int posicao, Object elemento) {
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
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos; // atribuir o novo vetor ao vetor Vetor
        }
    }

    // #5 buscar elemento em uma determinada posição
    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        return this.elementos[posicao];
    }

    // #6 verificar se elemento existe no vetor
    public int busca(Object elemento) {
        // busca sequencial
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
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
