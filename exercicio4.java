import java.util.Scanner;







public class exercicio4 {




public static void main(String[] args) {




Scanner sc = new Scanner (System.in);



int idadeMinima = 18;




 double salarioMinimo = 1302.0;



 double alturaMinima = 180.0;

 double pesoMaximo = 60.0;


String meuNome = "Jorge";



 char meuGenero = 'm';






System.out.println("Digite a sua idade:");
int idade = sc.nextInt();



boolean maiorDeIdade = idade >= idadeMinima;




System.out.println("É maior de idade? " + maiorDeIdade);




System.out.println("Digite a sua taxa salárial:");

double salario = sc.nextDouble();

boolean ganhaMaisQueMinimo = salario > salarioMinimo;

System.out.println("Ganha mais que o salário mínimo? " +ganhaMaisQueMinimo);







System.out.println("Digite a sua altura:");



double altura = sc.nextDouble();




boolean maiorQueAlturaMinima = altura > alturaMinima;




System.out.println("Tem altura maior que " +alturaMinima + "cm? " +maiorQueAlturaMinima);





System.out.println("Digite o seu peso:");



double peso = sc.nextDouble();




boolean menorQuePesoMaximo = peso < pesoMaximo;
System.out.println("Tem peso menor que " + pesoMaximo + "kg? " +menorQuePesoMaximo);







System.out.println("Digite o seu nome:");




String nome = sc.next();

boolean mesmoNome = nome.equals(meuNome);




System.out.println("Tem o mesmo nome que o usuário (" + meuNome + ")? " +mesmoNome);




System.out.println("Digite se o gênero é(m/f):");



char genero = sc.next().charAt(0);
boolean mesmoGenero = genero == meuGenero;




 System.out.println("Tem o mesmo gênero que o usuário (" + meuGenero + ")? " +mesmoGenero);







sc.close();




}




}