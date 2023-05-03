import java.util.Scanner;




public class ifAninhado {

public static void main(String[] args) {

 Scanner Sc = new Scanner (System.in);

 System.out.println("digite o numero "); 

 int num = Sc.nextInt();




if(num >0){

 if (num%2==0){

 System.out.println("numero par e positivo");

 } else{

System.out.println("impar e positivo");

 }

}

else if (num<0){

 if(num%2==0){

 System.out.println("numero par e NEGATIVO");

 } else {

 System.out.println("numero impar e negativo");

 }

}  else{

System.out.println("É ZERUUUUUUUUUUU!!!");

}

Sc.close();

 }

}