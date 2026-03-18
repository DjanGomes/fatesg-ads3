package fila;

/**
 * Autores:
 * 
 * Lucio Aguiar de Souza,
 * Felipe Estevão,
 * Marco Túlio Costa,
 * Gustavo Fernando
 */

public class Exercicio9 {

    private No inicio;

    public void removerPrimeiro() {
        if (inicio == null) {
            return;
        }

        inicio = inicio.getProximo();
    }

}
