import java.util.Scanner;
import java.util.ArrayList;

public class lista {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    boolean continuar =true;
    int rida, acão;
do {    System.out.println("=========MENU=========");
   



System.out.println("1-JOGOS DE AÇÃO ");
System.out.println("2-JOGOS DE CORRIDAS");
System.out.println("3-JOGOS DE AVENTURA");
int cor=sc.nextInt();
if(cor==1){
continuar=false;}

System.out.println("=====jogos de ação=====");
System.out.println("11-Dark souls");
System.out.println("12=God of War");
System.out.println("13=Batman Arkham-Knight");
System.out.println("0- voltar pro inicio");
acão =sc.nextInt();
if(cor==11){continuar=false;
    System.out.println("1-Dark souls R$70,00 \n");
   System.out.println("Você deseja colocar mais algum no carrinho?");      
   System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
   cor = sc.nextInt();}
   if(cor==12){continuar=false;
    System.out.println(" God of War R$70,00 \n");
   System.out.println("Você deseja colocar mais algum no carrinho?");      
   System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
   rida = sc.nextInt();}
   
if(cor==2){

System.out.println("========jogos de corridas=======");
System.out.println("");
System.out.println("1-forza horizon 5 R$80,00");
System.out.println("2-gran turismo 7 R$80,00");
System.out.println("3-need for speed umbound R$50,00");    
System.out.println("0- voltar pro inicio");
System.out.println("escolha o jogo abaixo");
}
if(cor==0){
    continuar=false;
    System.out.println("compra encerrado.");
}
if(cor==21){ 
    continuar=false;
    System.out.println("21-forza horizon 5 R$80,00 \n");
   System.out.println("Você deseja colocar mais algum no carrinho?");      
   System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
   rida= sc.nextInt();      
}    if(cor==1){continuar=true;}
if(cor==22){ 
    continuar=false;
    System.out.println("22-gran turismo 7 R$80,00 \n");
   System.out.println("Você deseja colocar mais algum no carrinho?");      
   System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
   rida= sc.nextInt();
   if(cor==1){continuar=true;}      
}  if(cor==23) {  System.out.println("23-need for speed umbound R$50,00 \n");
System.out.println("Você deseja colocar mais algum no carrinho?");      
System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
rida= sc.nextInt();}
if(cor==1){continuar=true;}      



    
} while (continuar);
    }
}