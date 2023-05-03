import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in); 
    
    System.out.println("Digite um número");
    int num = sc.nextInt();
    if(num>0){
      System.out.println("Número positivo");  
    }
    if(num<0){System.out.println("Número Negativo");}
    
    if(num ==0){System.out.println("é Zero");}
    
    sc.close();
    
    }
}
