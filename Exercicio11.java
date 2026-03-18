package fila;
/**
 *
 Autores:
 Wyllian Mariano Nogueira,
 Cassiano Abreu,
 Gabriel Naoki,
 Alexsander Nogueira

 **/
public class Exercicio11 {

    No head = null;

    public void inverter() {

        No anterior = null;
        No atual = head;
        No proximo = null;

        if (atual == null) {
            System.out.println("A lista está vazia, nada para inverter.");
            return;
        }

        while (atual != null) {
            proximo = atual.getProximo();
            atual.setProximo(anterior);
            anterior = atual;
            atual = proximo;
        }

        head = anterior;
        System.out.println("Lista invertida com sucesso!");
    }

}
