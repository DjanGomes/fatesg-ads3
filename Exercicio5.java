public class Exercicio5 {

    public No cabeca;

    public void inserirNaPosicao(int valor, int posicao) {

        No novo = new No();
        novo.setDado(valor);

        if (posicao == 0) {
            novo.setProximo(cabeca);
            cabeca = novo;
            return;
        }

        No atual = cabeca;
        int indice = 0;

        while (atual != null && indice < posicao - 1) {
            atual = atual.getProximo(); 
            indice++;
        }

        if (atual == null) {
            System.out.println("Posição inválida");
            return;
        }

        novo.setProximo(atual.getProximo()); 
        atual.setProximo(novo);              
    }
}

