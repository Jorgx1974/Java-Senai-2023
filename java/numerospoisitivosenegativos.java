import java.util.Scanner;

public class numerospoisitivosenegativos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
    System.out.println("escreva um numero");
    int num = sc.nextInt();
    if(num>0){
        System.out.println("Número positivo");  
      }
      else if(num<0){System.out.println("Número Negativo");}
    sc.close();  
}
}
