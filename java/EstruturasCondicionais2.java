import java.util.Scanner;
 
public class EstruturasCondicionais2 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Digite seu salário");
      double salario = sc.nextDouble();

System.out.println("digite sua idade");
int idade =sc.nextInt();

 int IdadeDeMaior =18;
 double salarioMinimo =1320;
 
 if(salario>salarioMinimo  && idade>=IdadeDeMaior){
System.out.println("você é maior de idade e ganha mais de um salario minimo.");


 }
 if(salario<salarioMinimo  && idade>=IdadeDeMaior){
  System.out.println("você é maior de idade e ganha menos de um salario minimo.");



 }


 if(salario==salarioMinimo  && idade>=IdadeDeMaior){
System.out.println("você é maior de idade e ganha um salario minimo.");}

  if(salario>salarioMinimo  && idade<=IdadeDeMaior){
    System.out.println("você é menor de idade e ganha mais de um salario minimo.");
  }
  if(salario<salarioMinimo  && idade<=IdadeDeMaior){
    System.out.println("você é menor de idade e ganha menos de um salario minimo.");
  }
   
  if(salario==salarioMinimo  && idade<=IdadeDeMaior){
  System.out.println("você é menor de idade e ganha um salario minimo");

  }







sc.close();






    }





}