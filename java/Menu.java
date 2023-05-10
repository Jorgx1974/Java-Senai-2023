import java.util.Scanner;

public class Menu { public static void main(String[] args) {
  

int opc =2;
while(opc!=4){
    Scanner sc = new Scanner(System.in);   
 System.out.println("digite uma opção");
 int op=sc.nextInt();
 
 if (op ==1){    
    System.out.println("1-Start Game");
    opc= 1;}
     
    if( op==2){  
    System.out.println("2- configurations");
    opc = 2;}
   
   if(op==3){
    System.out.println("3-load Game");
opc =3;}

if (op==4){    
System.out.println("4-Exit game");
 opc =4; }
}
}
}
    

