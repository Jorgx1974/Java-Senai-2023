// Tipos de variáveis em Java
/*  
 *  String -> Armazena texto
 * char-> Armazena uma única letra
 * int -> números inteiros
 * float -> números decimais
 * double -> números decimais. Maior precisão
 *  
 */

 /* Regras par criar variáveis
 *Toda váriavel DEVE começar com letra minúscula
*não pode haver espaço no nome da variável 
*nomealuno,enderecoCliente,produtoAdquirido 
  
  
  */
 


 public class Exemplos01{

public static void main(String[] args) {

String nome = "Jorge Mesquita";    
 int idade = 16;
 boolean chuva = true; //em variáveis booleanas eu uso true ou false
 char letra = 'J';// Todo char DEVE estar com aspas simples ''
 double salario=50000.12;
 float altura = (float) 1.62;//

System.out.println("meu nome é :"+nome);
System.out.println("minha idade é :"+ idade);
System.out.println("EStá chovendo?"+chuva);
System.out.println("A inicial do meu nome é:" +letra);
System.out.println("meu salario é:" +salario);
System.out.println("minha altura é" +altura+ "Metros");









}



 }