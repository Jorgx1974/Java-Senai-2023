import java.util.Scanner;

public class Lista2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
boolean continuar = true;
int star=0;
do {
System.out.println("=========MENU=========");
System.out.println("1-JOGOS DE AÇÃO ");
System.out.println("2-JOGOS DE CORRIDAS");
System.out.println("3-JOGOS DE AVENTURA");

int opcao = sc.nextInt();

if (opcao == 1) {          
System.out.println("=====JOGOS DE AÇÃO=====");
System.out.println("11-Dark Souls");
System.out.println("12-God of War");
System.out.println("13-Batman Arkham Knight");
System.out.println("0- Voltar ao início");

int escolhaAcao = sc.nextInt();

if (escolhaAcao == 11) {
System.out.println("Dark Souls - R$70,00");
System.out.println("Você deseja colocar mais algum no carrinho?");
System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
int continuarCompra = sc.nextInt();



if (continuarCompra == 0) {
continuar = false;

}
} else if (escolhaAcao == 12) {
System.out.println("God of War - R$70,00");
System.out.println("Você deseja colocar mais algum no carrinho?");
System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
int continuarCompra = sc.nextInt();

if (continuarCompra == 0) {
continuar = false;
System.out.println("Compra encerrada.");
}
} else if (escolhaAcao == 0) {
continuar = false;
System.out.println("Compra encerrada.");
}
else if (escolhaAcao == 13) {
    System.out.println("13-Batman Arkham Knight- R$70,00");
    System.out.println("Você deseja colocar mais algum no carrinho?");
    System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
    int continuarCompra = sc.nextInt();
    
    
    if (continuarCompra == 0) {
    continuar = false;
    System.out.println("Compra encerrada.");
    }
    } else if (escolhaAcao == 0) {
    continuar = false;
    System.out.println("Compra encerrada.");
    }
} else if (opcao == 2) {
System.out.println("=====JOGOS DE CORRIDAS=====");
System.out.println("21-Forza Horizon 5 - R$80,00");
System.out.println("22-Gran Turismo 7 - R$80,00");
System.out.println("23-Need for Speed Unbound - R$50,00");
System.out.println("0- Voltar ao início");

int escolhaCorrida = sc.nextInt();

if (escolhaCorrida == 0) {
continuar = false;
System.out.println("Compra encerrada.");
}
if (escolhaCorrida== 21) {
    System.out.println("21-Forza Horizon 5 - R$80,00");
    System.out.println("Você deseja colocar mais algum no carrinho?");
    System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
    int continuarCompra = sc.nextInt();
    
    if (continuarCompra == 0) {
    continuar = false;
    System.out.println("Compra encerrada.");
    }
    }else if (escolhaCorrida == 22) {
        System.out.println("22-Gran Turismo 7 - R$80,00");
        System.out.println("Você deseja colocar mais algum no carrinho?");
        System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
        int continuarCompra = sc.nextInt();
        
        if (continuarCompra == 0) {
        continuar = false;
        System.out.println("Compra encerrada.");
        }
        }else if (escolhaCorrida == 23) {
            System.out.println("Need for Speed Unbound - R$80,00");
            System.out.println("Você deseja colocar mais algum no carrinho?");
            System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
            int continuarCompra = sc.nextInt();
            
            if (continuarCompra == 0) {
            continuar = false;
            System.out.println("Compra encerrada.");
            }
            }
} else if (opcao == 3) {
System.out.println("=====JOGOS DE AVENTURA=====");
System.out.println("31-Zelda - Breath of the Wild R$-90,00");
System.out.println("32-Pokémon R$-90,00");
System.out.println("33-The Witcher 3 - Wild Hunt R$-90,00");

System.out.println("0- Voltar ao início");

int escolhaAventura = sc.nextInt();
if (escolhaAventura == 0) {
    continuar = false;
    System.out.println("Compra encerrada.");
    }if (escolhaAventura == 31) {
        System.out.println("Zelda - Breath of the Wild R$-90,00");
        System.out.println("Você deseja colocar mais algum no carrinho?");
        System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
        int continuarCompra = sc.nextInt();
        
        if (continuarCompra == 0) {
        continuar = false;
        System.out.println("Compra encerrada.");
        }
        }else if (escolhaAventura == 32) {
            System.out.println("Pokémon R$-90,00");
            System.out.println("Você deseja colocar mais algum no carrinho?");
            System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
            int continuarCompra = sc.nextInt();
            
            if (continuarCompra == 0) {
            continuar = false;
            System.out.println("Compra encerrada."); 
            }
            }else if (escolhaAventura == 33) {
                System.out.println("The Witcher 3 - Wild Hunt R$-90,00");
                System.out.println("Você deseja colocar mais algum no carrinho?");
                System.out.println("Digite 1 para continuar ou 0 para encerrar a compra");
                int continuarCompra = sc.nextInt();
                
                if (continuarCompra == 0) {
                continuar = false;
                System.out.println("Compra encerrada.");
                }
                }
    } else if (opcao == 0) {
    continuar = false;
    System.out.println("Compra encerrada.");
    }
    } while (continuar);
    
    sc.close();
    }
    }