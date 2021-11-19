package estruturadados.vetor.aulas;

import estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "98137-6740", "c1@gmail.com");
        Contato c2 = new Contato("Contato 2", "2267-5283", "c2@gmail.com");
        Contato c3 = new Contato("Contato 3", "99470-6366", "c3@gmail.com");

        Contato c4 = new Contato("Contato 3", "99470-6366", "c3@gmail.com");
        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = "+vetor.tamanho());

        int pos = vetor.busca(c4);
        if (pos >-1) {
            System.out.println("Elemento existe no vetor.");
        } else {
            System.out.println("Elemento não existe no vetor.");
        }

        System.out.println(vetor);
    }
}
