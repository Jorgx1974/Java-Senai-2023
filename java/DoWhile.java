import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        boolean continuar = true;
        int opc; 
        Scanner sc = new Scanner(System.in);
    int resp;
        do {

            System.out.println("***Menu de opções do SENAI***\n");
            System.out.println("1- Prestar atenção na aula \n");
            System.out.println("2- Fazer todos os exexrcícios\n");
            System.out.println("3- Não falar palavrão\n");
            System.out.println("4- Não dormir na aula\n");
            System.out.println("5- NÃO passar o zap zap para os alunos da sala da sala da frente\n");
            System.out.println("6-Ourvir os conselhos do edgard\n");
            System.out.println("0- Sair do menu\n");

            System.out.println("Digite a opção desejada");
            opc = sc.nextInt();

            if(opc==0){
                continuar=false;
                System.out.println("Programa encerrado.");
            }
            if(opc==1){ 
                continuar=false;
                System.out.println("1- Prestar atenção na aula \n");
               System.out.println("Você deseja continuar?");      
               System.out.println("Digite 1 para continuar ou 2 para encerrar");
               resp= sc.nextInt();         
            if(resp==1){continuar=true;}
            }     if(opc==2){ 
                continuar=false;
                System.out.println("2- Fazer todos os exexrcícios\n");
               System.out.println("Você deseja continuar?");      
               System.out.println("Digite 1 para continuar ou 2 para encerrar");
               resp= sc.nextInt();         
            if(resp==1){continuar=true;}
            }         if(opc==3){ 
                continuar=false;
                System.out.println("3- Não falar palavrão\n");
               System.out.println("Você deseja continuar?");      
               System.out.println("Digite 1 para continuar ou 2 para encerrar");
               resp= sc.nextInt();         
            if(resp==1){continuar=true;}
            }             if(opc==4){ 
                continuar=false;
                System.out.println("4- Não dormir na aula\n");
               System.out.println("Você deseja continuar?");      
               System.out.println("Digite 1 para continuar ou 2 para encerrar");
               resp= sc.nextInt();         
            if(resp==1){continuar=true;}
            }         
            if(opc==5){ 
                continuar=false;
                System.out.println("5- NÃO passar o zap zap para os alunos da sala da sala da frente\n");
               System.out.println("Você deseja continuar?");      
               System.out.println("Digite 1 para continuar ou 2 para encerrar");
               resp= sc.nextInt();         
            if(resp==1){continuar=true;}
            }            if(opc==6){ 
                continuar=false;
                System.out.println("6-Ourvir os conselhos do edgard\n");
               System.out.println("Você deseja continuar?");      
               System.out.println("Digite 1 para continuar ou 2 para encerrar");
               resp= sc.nextInt();         
            if(resp==1){continuar=true;}
            }         



            
        } 
         while (continuar);
         sc.close();
    }
}