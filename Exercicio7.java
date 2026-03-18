//Nomes dos alunos
//Lucas Esposito, Gabriel Oliveira, Gabriel Santiago, Daniel

public class Exercicío7 {

    private No head;

    public int getMaior() {
        if (head == null) {
            throw new RuntimeException("Lista vazia");
        }

        int maior = head.getDado();
        No atual = head;

        while (atual != null) {
            if (atual.getDado() > maior) {
                maior = atual.getDado();
            }
            atual = atual.getProximo();
        }

        return maior;
    }
}
