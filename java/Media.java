/* programa que calcula média dos alunos */

// importação necessária para utilizar o scanner

//SEMPRE PRECISO COLOCAR ESSA LINHA 
import java.util.Scanner; //Para que eu possa trabalhar com entrada de dados via teclado


public class Media {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in); //Sempre escrever assim
double nota1, nota2, nota3, media; // Declaração das variáveis
String name="Jorge Miguel Mesquita Flor";
float RM =(float)  23158657;
System.out.println("a nota do aluno: "+name);
System.out.println("da matricula: " +RM);

System.out.println("Digite a 1º nota: " );
nota1= sc.nextDouble();
System.out.println("digite a 2º nota: ");
nota2= sc.nextDouble();
System.out.println("digite a 3º nota:");
nota3=sc.nextDouble();
media =(nota1+nota2+nota3)/3;
System.out.println("O aluno obteve média:" +media);
sc.close();


}    

}
