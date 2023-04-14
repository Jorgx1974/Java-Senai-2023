//Sabendo que a área do quadrado é calculado pela fórmula : Área = lado* lado, crie um programa em Java em que o usuário digite o lado do quadrado  e o programa calcule a área.


import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
double  lado1,lado2, area; 
System.out.println("Digite o lado1: " );
lado1=sc.nextDouble();
System.out.println();
lado2=sc.nextDouble();
 area=lado1*lado2;   
System.out.println("o valor da area é: " +area);
sc.close();
}
 

}
