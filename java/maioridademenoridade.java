import java.util.Scanner;



public class maioridademenoridade {
public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
    
System.out.println("escreva quantos anos você tem:");
int idade= sc.nextInt();
if(idade>= 18){System.out.println("você é maior de idade");}
else{System.out.println("você é leite com pêra");}
sc.close();
} 
}
