import java.util.Scanner;

public class TestaMoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Moto yamaha = new Moto();
        yamaha.velocidadeMaxima = 120;
        yamaha.velocidadeAtual = 25;

        Moto kawasaki = new Moto();
        kawasaki.velocidadeMaxima = 110;
        kawasaki.velocidadeAtual = 20;

        Moto ducati = new Moto();
        ducati.velocidadeMaxima = 100;
        ducati.velocidadeAtual = 15;

        System.out.println("Escolha uma das motos (1-Yamaha, 2-kawasaki, 3-ducati): ");
        int escolha = sc.nextInt();

        Moto motoSelecionada = null;

        switch (escolha) {
            case 1:
                motoSelecionada = yamaha;
                break;
            case 2:
                motoSelecionada = kawasaki;
                break;
            case 3:
                motoSelecionada = ducati;
                break;
            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        System.out.println("Velocidade atual da moto selecionada: " + motoSelecionada.velocidadeAtual);

        System.out.println("Quanto você gostaria de acelerar a moto?");
        double quantidadeAceleracao = sc.nextDouble();

        int resultado = motoSelecionada.acelerar(quantidadeAceleracao);

        if (resultado == 0) {
            System.out.println("A moto capotou,foi de F");
        } else {
            System.out.println("Nova velocidade da moto: " + motoSelecionada.velocidadeAtual);
        }
      sc.nextLine(); 
        System.out.println("Qual o tipo de combustível utilizado na moto (Gasolina/Álcool)?");
        String tipoCombustivel = sc.nextLine();

        System.out.println("Tipo de combustível selecionado: " + tipoCombustivel);

        motoSelecionada.buzinar();

        motoSelecionada.desligar();

        sc.close();
    }
}
