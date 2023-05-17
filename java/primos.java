import java.util.Scanner;

public class primos {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Digite um número inteiro positivo \n: ");
int numero = sc.nextInt();

boolean big = true;

if (numero < 2) {
big = false;
} else {
for (int i = 2; i <= Math.sqrt(numero); i++) { // Math.sqrt:retorna a raiz quadrada de um número
if (numero % i == 0) {
big = false;
break;
}
}
}

if (big) {
System.out.println(numero + " é um número primo \n.");
} else {
System.out.println(numero + " não é um número primo \n.");
}

sc.close();
}
}