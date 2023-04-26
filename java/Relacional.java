/*Operadores Relacionais:>,>=,  <,<=
Operadores Lógicos:
E-> &&(retorna verdadeiro se os dois lados forem verdadeiro);
OU -> || (retorna Verdadeiro se pelos menos um dos lados for 
verdadeiro)
 == ->verifica se o número da esquerda é igual ao da direita
 != ->verifica se os números são diferentes
 
 
 IMPORTANTE:
 Para comparar STRINGS usamos o métodos EQUALS.
 
 
 */


public class Relacional {
    public static void main(String[] args) {
       int idadeDeMaior= 18; 
       int idadeProfessor = 31;
       int idadeAluno = 16;
   
    System.out.println("Professor é maior de idade?"
+    (+idadeProfessor>idadeDeMaior));
   System.out.println("aluno é menor de idade" 
   +(idadeAluno<idadeDeMaior));
System.out.println(idadeDeMaior==18 && idadeAluno !=16);
System.out.println(idadeDeMaior==18 || idadeAluno !=16);
System.out.println(idadeDeMaior==18 && idadeAluno==16);



}
  
  
}
