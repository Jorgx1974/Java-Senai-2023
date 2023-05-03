import java.util.Scanner;

public class triangulo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Digite o  lado1 do triângulo: ");
int lado1 = sc.nextInt();

System.out.print("Digite o  lado2 do triângulo: ");
int lado2 = sc.nextInt();

System.out.print("Digite o lado3 do triângulo: ");
int lado3 = sc.nextInt();
 {
if (lado1 == lado2 && lado1 == lado3) {
System.out.println("ele será um Triângulo Equilátero");
} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
System.out.println("ele será um  Triângulo Isósceles");
} else {

System.out.println("ele será um Triângulo Escaleno");
}
}

sc.close();
}
}