import java.util.Scanner;

public class idade {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Digite a idade da primeira pessoa: ");
int idade1 = sc.nextInt();

System.out.print("Digite a idade da segunda pessoa: ");
int idade2 = sc.nextInt();

if (idade1 > idade2) {
System.out.println("A primeira pessoa é mais velha.");}
else{System.out.println("a segunda pessoa é a mais velha.");}
sc.close();
}
}