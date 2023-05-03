import java.util.Scanner;

public class Número {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Digite o  número1: ");
double num1 = sc.nextDouble();

System.out.print("Digite o  número2: ");
double num2 = sc.nextDouble();

System.out.print("Digite o  número3: ");
double num3 = sc.nextDouble();

double maior = num1;

if (num2 > maior) {
maior = num2;
}

if (num3 > maior) {
maior = num3;
}

System.out.println("O maior número é: " + maior);
sc.close();
}
}