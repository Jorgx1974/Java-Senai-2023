/* 
 && - > E
 || -> OU
 != -> Diferente
 == -> Verifica o conteúdo das variáveis
 IF -> Se
 ELse -> 
 
 
 
*/

import java.util.Scanner;

public class VerificaParlmpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    System.out.println("digite um numero");
        int num = sc.nextInt();
            if(num%2==0){System.out.println("par");}
    
else{System.out.println("impar");};
sc.close();
}
}
