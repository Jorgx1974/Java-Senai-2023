import java.util.Scanner;

public class salario {

public static void main(String[] args) {


String nome = "jorge miguel mesquita flor";
int idade = 16; 
String numerodetelefone= "40028922";
String endereço= "jardin tango" ;
double salario= 16.000;

System.out.println("meu nome é:"+nome);
System.out.println("minha idade é:"+idade);
System.out.println("meu endereço:"+endereço);
System.out.println("meu numero de telefone:"+ numerodetelefone);
System.out.println("meu salario é:"+salario);

final Scanner sc = new Scanner(System.in);
double lado1,lado2, area;
System.out.println("Digite o lado1: " );
lado1=sc.nextDouble();
System.out.println();
lado2=sc.nextDouble();
area=lado1*lado2;
System.out.println("o valor da area é: " +area);
sc.close();

}





}