package Exercicio10;

    public class Exercicio10 {
    public No cabeca;
    public void removerUltimo() {
    if (cabeca == null) {
        throw new RuntimeException("Lista vazia!");
    }

    if (cabeca.getProximo() == null) {
        cabeca = null;
        return;
    }

    No atual = cabeca;
    while (atual.getProximo().getProximo() != null) {
        atual = atual.getProximo();
    }

    atual.setProximo(null);
}
}
