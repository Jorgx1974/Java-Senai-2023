public class Moto {
    int cilindradas;
    String combustivel;
    boolean ligada;
    double velocidadeMaxima = 30;
    double velocidadeAtual;

    void ligar() {
        ligada = true;
        System.out.println("A moto está ligada");
    }

    void desligar() {
        ligada = false;
        System.out.println("A moto está desligada");
    }

    void buzinar() {
        System.out.println("Barulho de buzina");
    }

    int acelerar(double quantidade) {
        double velocidadeAtualizada = velocidadeAtual + quantidade;
        if (velocidadeAtualizada > velocidadeMaxima) {
            System.out.println("A moto capotou,aproveite o show do tim maia");
            return 0;
        } else {
            velocidadeAtual = velocidadeAtualizada;
            System.out.println("Ta sussa parça");
            return 1;
        }
    }
}
