public class OperadoresLógicoseRelacionaisemJava {
    public static void main(String[] args) {
        String nome = "Jorge";
        String nomedohumano ="jalin";
        char genero= 'M';
        char generodoaluno='M';   
    
        int idadeAluno = 16;   
        int idadeDeMaior= 18; 
        float altura= (float)   1.80;
        float alturadoaluno= (float)   1.63;
        double pesodoaluno= 54;
        double peso=  60;
        int salariominimo =1302;
        int salariodoaluno=5000;
       
    System.out.println(("o nome do aluno é o mesmo?"+ nome =="Jorge Mesquita" && nomedohumano !="jalin"));
    System.out.println("os generos são iguais? "+ ( genero =='M' || generodoaluno !='M'));
    System.out.println("a idade é de maior?"+  (idadeAluno>idadeDeMaior));
    
System.out.println("a altura do aluno é maior?"+  (alturadoaluno>altura));
    System.out.println("o salario é maior que o salario minino?"+   (salariodoaluno>salariominimo));
System.out.println("o peso é menor que a do aluno?"+(pesodoaluno>peso));





    }
}
