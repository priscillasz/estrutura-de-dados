package estruturadados.vetor.aulas;

import estruturadados.vetor.Lista;
import estruturadados.vetor.VetorObjetos;

public class Aula11 {
    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista<>(1);

        Contato c1 = new Contato("Contato 1", "98137-6740", "c1@gmail.com");
        vetor.adiciona(c1);
    }
}
