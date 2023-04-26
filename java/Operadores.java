//Importando o scanner

import java.util.Scanner;

public class Operadores{
public static void main(String[] args) {
 
    
Scanner sc= new Scanner(System.in);
double  n1, n2, n3, n4;
double  soma, subtracao ,mult ,div;
int resto =30;

System.out.println("resto da divisao:" +resto%4);
System.out.println("resto da divisao 2:" +resto%5);
System.out.println("resto da divisao 3:" +resto%9);
System.out.println("digite um número:");
n1 =sc.nextDouble();
System.out.println("digite 2° número:");
n2 =sc.nextDouble();
System.out.println("digite 3° número:");
n3 =sc.nextDouble();
System.out.println("digite 4° número:");
n4 =sc.nextDouble();
//Operadorea Ariméticos -> +, -, *, /, resto(%)
soma =n1+n2+n3+n4;
subtracao= n1-n2-n3-n4;
mult =n1*n2*n3*n4;
div =n1/n2/n3/n4;
System.out.println("Soma:" +soma);
System.out.println("substração"+subtracao);
System.out.println("multiplicação"+mult);
System.out.println("divisão"+div);
sc.close();
}


}