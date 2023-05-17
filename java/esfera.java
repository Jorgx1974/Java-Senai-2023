import java.util.Scanner;

public class esfera {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

while (true) {
System.out.println("Selecione umas das figura abaixo \n:");
System.out.println("1 - Cubo");
System.out.println("2 - Esfera");
System.out.println("3 - Sair do programa");

int configuracão = sc.nextInt();

if (configuracão == 1) {
System.out.println("Digite o valor do lado do cubo:");
double lado = sc.nextDouble();
double area = 6 * lado * lado;
double volume = lado * lado * lado;
System.out.printf("Área do cubo: %.2f\n", area);
System.out.printf("Volume do cubo: %.2f\n", volume);
} else if (configuracão == 2) {
System.out.println("Digite o valor do raio da esfera:");
double raio = sc.nextDouble();
double area = 4 * Math.PI * raio * raio;
double volume = (4.0 / 3.0) * Math.PI * raio * raio * raio;
System.out.printf("Área da esfera: %.2f\n", area);
System.out.printf("Volume da esfera: %.2f\n", volume);
} else if (configuracão == 3) {
break;
} else {
System.out.println("Opção inválida. Tente novamente.");
}
}

sc.close();
}
}
