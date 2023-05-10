import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    int numerosAlunos =0;
    double mediaTurma =0;
    double mediaAluno=0;  
    while(mediaAluno!= -1){
    System.out.println("=======INSTRUÇÕES======\n");
 System.out.println("não digite notas negativas\n");
 System.out.println("para encerra o progr,a digite[-1]\n");   
        System.out.println("Digite a média do aluno");   
 mediaAluno =sc.nextDouble();    
if(mediaAluno != -1){
    numerosAlunos++; //Estou incrementando os alunos (+1)
mediaTurma += mediaAluno; } 
mediaTurma =mediaTurma /numerosAlunos;
}System.out.println("a media da turma é" +mediaTurma);  }
}
