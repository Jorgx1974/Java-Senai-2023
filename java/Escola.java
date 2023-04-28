import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
    
      
    double mediadoaluno;
    
       
System.out.println("digite seu nome");
    String nome = sc.next();

System.out.println("digite a idade do aluno");
int idade =sc.nextInt();

System.out.println("o telefone do aluno");
double telefone= sc.nextDouble();

System.out.println("Digite a 1º nota: " );
double nota1= sc.nextDouble();
System.out.println("digite a 2º nota: ");
double nota2= sc.nextDouble();
System.out.println("digite a 3º nota:");
  double nota3=sc.nextDouble();
  System.out.println("digite o número de faltas do aluno  no total no ano  ");
  double faltas=sc.nextDouble();
  mediadoaluno =(nota1+nota2+nota3)/3;
System.out.println(" a media sera"+ mediadoaluno);


if ((mediadoaluno>=5.1 && mediadoaluno<=10)&& faltas<=4)   {
    System.out.println("o aluno" +nome+ "com a idade" +idade+ "foi aprovado");
    if (mediadoaluno==5 && faltas>=19 && faltas <=19 ) {
        System.out.println("o aluno"  +nome+  "com a idade" +idade+ "foi ficou de recuperação,por favor liga para" +telefone+ "para informar");
        if (mediadoaluno<5 ||  faltas>=20)   {
            System.out.println("o aluno" +nome+ "com a idade" +idade+ "foi aprovado");
        
        }
        
    }
    }
sc.close();
}
}
