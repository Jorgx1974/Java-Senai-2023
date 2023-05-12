import java.util.Scanner;

public class valorcompra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double compras;
        double somas = 0;
        double valordamenorCompra = Double.MAX_VALUE;
        double valordamaiorCompra = Double.MIN_VALUE;
        for (int c = 0; c <= 10; c++) {
            System.out.print("Digite o valor da" + (c + 1) + ":\n ");
            compras = sc.nextDouble();
            somas += compras;

            if (compras < valordamenorCompra) {
                valordamenorCompra = compras;
            }

            if (compras > valordamaiorCompra) {
                valordamaiorCompra = compras;
            }
            double media = somas / 10;
            double diferenca = valordamaiorCompra - valordamenorCompra;

            System.out.println("a  Média das compras:\n " + media);
            System.out.println("o valor da Menor compra:\n " + valordamenorCompra);
            System.out.println(" o valor da Maior compra:\n " + valordamaiorCompra);
            System.out.println("Diferença entre a maior e menor compra: \n" + diferenca);

        }
        sc.close();

    }

}
