package org.example.classes;

public class exercico06 {

    No cabeca;

    public int contar() {

        int contador = 0;
        No atual = cabeca;

        while (atual != null) {
            contador++;
            atual = atual.getProximo();
        }
        return contador;
    }
}
