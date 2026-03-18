package fila;

/**
 * Autores:
 * 
 * Lucio Aguiar de Souza,
 * Felipe Estevão,
 * Marco Túlio Costa,
 * Gustavo Fernando
 */
public class Exercicio4 {

    private No inicio;

    public void excluir(int valor) {
        if (inicio == null) {
            return;
        }

        if (inicio.getDado() == valor) {
            inicio = inicio.getProximo();
            return;
        }

        No atual = inicio;

        while (atual.getProximo() != null && atual.getProximo().getDado() != valor) {
            atual = atual.getProximo();
        }

        if (atual.getProximo() != null) {
            atual.setProximo(atual.getProximo().getProximo());
        }
    }

}
