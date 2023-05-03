import java.util.Scanner;

public class VerificaNumero2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in); 
    
    System.out.println("Digite um número");
    int num = sc.nextInt();
    if(num>0){
      System.out.println("Número positivo");  
    }
    else if(num<0){System.out.println("Número Negativo");}
    
    else{System.out.println("é Zero");}
    
    sc.close();
    
    }
}
