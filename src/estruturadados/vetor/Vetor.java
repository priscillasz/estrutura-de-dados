package estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    // construtor
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // ADICIONAR UM ELEMENTO AO VETOR
    // método 1: adicionar um elemento ao vetor
    /*public void adiciona(String elemento) {
        for(int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/

    // método 2
    /*public void adiciona(String elemento) throws Exception {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio. Não é possível adicionar mais elementos.");

        }
    }*/

    // método 3
    public boolean adiciona(String elemento) {
        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // #7 add elemento em qualquer posição
    public boolean adiciona(int posicao, String elemento) {
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
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos; // atribuir o novo vetor ao vetor Vetor
        }
    }
    // #5 buscar elemento em uma determinada posição
    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida.");
        }
        return this.elementos[posicao];
    }

    // #6 verificar se elemento existe no vetor
    public int busca(String elemento) {
        // busca sequencial
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
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
