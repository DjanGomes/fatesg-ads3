class Exercicio8 {
    No inicio;

    public void inserirFim(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novo;
    }

    public int menor() {
        if (inicio == null) {
            throw new RuntimeException("Lista vazia");
        }

        int menorValor = inicio.valor;
        No atual = inicio;

        while (atual != null) {
            if (atual.valor < menorValor) {
                menorValor = atual.valor;
            }
            atual = atual.proximo;
        }

        return menorValor;
    }
}