import java.util.Scanner;

public class aprovação {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   
   System.out.println("numero de faltas:");
   int faltas=sc.nextInt();
   System.out.println("coloque sua média de notas: ");
   double media =sc.nextDouble();
   
   if((media<10 || media>6)  || faltas== 5 ){System.out.println("O aluno foi aprovado.");}
   

   else{System.out.println("o aluno foi reprovado. ");}
    sc.close();}
}
