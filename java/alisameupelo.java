package Projeto;
import java.util.ArrayList;
import java.util.Scanner;
public class alisameupelo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> jogoCorrida = new ArrayList<String>();
        jogoCorrida.add("\n Forza 5\n");
        jogoCorrida.add("\n Gran Turismo 7\n");
        jogoCorrida.add("\n Need for Speed Unbound\n");
        ArrayList<String> jogoAcao = new ArrayList<String>();
        jogoAcao.add("\n Dark Souls\n");
        jogoAcao.add("\n God of War\n");
        jogoAcao.add("\n Batman Arkham-Knight\n");
        ArrayList<String> jogoAventura = new ArrayList<String>();
        jogoAventura.add("\n Zelda - Breath of the Wild\n");
        jogoAventura.add("\n Pokémon\n");
        jogoAventura.add("\n The Witcher 3 - Wild Hunt\n");

        int opc = 0;
        boolean continuar3 = true;
        boolean continuar = true;
        int cadastro = 0;
        int corrida = 0;
        int acao = 0;
        int aventura = 0;
        int promocao = 0;
        int quantidade = 0;
        
            do{
                System.out.println("================================================================\n");
                System.out.println("                            Strean                             \n");
                System.out.println("================================================================n");
                System.out.println("1 -Cadastrar Usuário\n");
                System.out.println("2 -Listar Jogos de Corrida\n");
                System.out.println("3 -Listar Jogos de Ação\n");
                System.out.println("4 -Listar Jogos de Aventura\n");
                System.out.println("5 -Listar todos os Jogos\n");
                System.out.println("6 -Cadastrar um novo Jogo\n");
                System.out.println("7 -Efetuar Compra \n");
                System.out.println("8 -Encerrar o Programa\n");
                
                
                System.out.println("Digite a opção desejada");
                opc = sc.nextInt();

                

                    if(opc==8){//Encerrar Programa
                        continuar=false;
                        System.out.println("Você saiu da STREAN");
                    }
                    


                    if(opc == 1){//Cadastro
            
                        System.out.println("Digite seu Nome: ");
                    String nome = sc.next();
                    
                            
                        System.out.println("Digite sua Idade: ");
                    String idade = sc.next();
                        
                        System.out.println("Digite seu Telefone: ");
                    String telefone = sc.next();

                        System.out.println("Digite seu Endereço: ");
                    String endereço = sc.next();
                    
                        System.out.println("*******Cadastro Completo*******\n");
                        cadastro++;

                        

                    do{//Voltar para Menu
                        System.out.println("1- Voltar ao Menu\n");
                        System.out.println("2- Sair da Strean\n");
                    int opc3 = sc.nextInt();
                        
                    if(opc3==1){
                        continuar = true;
                    }
                    if(opc3==2){    
                        continuar = false;
                    }
                    continuar3 = false;
                    }while(continuar3);
                        
                
                    }



                    if(opc == 2){//Jogos de Corrida
                        continuar = false;
                        
                    System.out.println("Jogos de Corrida: \n"+jogoCorrida);

                    

                    do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }

                   


                    if(opc == 3){//Jogos de Ação
                        continuar = false;

                        System.out.println("Jogos de Ação: \n" + jogoAcao);
                    
                        do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }



                    if(opc == 4){//Jogos de Aventura
                        continuar = false;
                        
                        System.out.println("Jogos de Aventura: \n" + jogoAventura);

                        do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }



                    if(opc == 5){//Todos jogos
                        continuar = false;
                        
                    System.out.println("Jogos de Corrida: "+jogoCorrida+"\n");
                    System.out.println("Jogos de Ação: "+jogoAcao+"\n");
                    System.out.println("Jogos de Aventura: "+jogoAventura+"\n");

                        do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }



                    if(opc == 6){//Adicionar Jogo na lista
                        continuar = false;
                        
                       
                        System.out.println("1- Corrida");
                        System.out.println("2- Ação");
                        System.out.println("3- Aventura");
                        System.out.println("Digite o nome do jogo: ");
                        String jogo = sc.next();
                        System.out.println("Escolha a classificação do jogo:");
                        int classi = sc.nextInt();


                        if(classi==1){
                            jogoCorrida.add(jogo);
                        }
                        if(classi==2){
                            jogoAcao.add(jogo);
                        }
                        if(classi==3){
                            jogoAventura.add(jogo);
                        }


                        do{//Voltar para Menu
                            System.out.println("\n");
                            System.out.println("1- Voltar ao Menu\n");
                            System.out.println("2- Sair da Strean\n");
                        int opc3 = sc.nextInt();
                            
                            if(opc3==1){
                                continuar = true;
                            }
                            if(opc3==2){    
                                continuar = false;
                            }
                            continuar3 = false;
                    }while(continuar3);
                    }



                    if(opc == 7){//Efetuar pagamento
                        continuar = false;
                    if(cadastro==0){
                        System.out.println("Para Efetuar uma compra você precisa fazer o Cadastro\n");
                    }
                    else{

                        boolean continuar2 = true;

                        do{
                            System.out.println("================================================================\n");
                            System.out.println("                   Strean                      \n");
                            System.out.println("================================================================= \n");
                            System.out.println("1 -Jogos de Corrida (R$80,00)\n");
                            System.out.println("2 -Jogos de Ação (R$70,00)\n");
                            System.out.println("3 -Jogos de Aventura (R$90,00)\n");
                            System.out.println("4 -Jogos em Promoção (R$50,00)\n");
                            System.out.println("5 -Ir para Pagamento\n");
                        continuar2 =false;
                            System.out.println("Escolha o Produto");
                            int opc2 = sc.nextInt();

                            if(opc2 ==1){
                                continuar2 = false;
                                corrida++;
                                    System.out.println("Escolha o Jogo");
                              

                                
                                    System.out.println("Escolha a quantidade");
                                    sc.nextInt(quantidade);
                            }
                            if(opc2 ==2){
                                continuar2 = false;
                                acao++;
                            }
                            if(opc2 ==3){
                                continuar2 = false;
                                aventura++;
                            }
                            if(opc2 ==4){
                                continuar2 = false;
                                promocao++;
                            }
                            if(opc2 ==5){
                                continuar2 = false;
                            
                                boolean conti = true;
                                int opcao;
                                int resp;

                                System.out.println("***** APÓS A REALIZAÇÃO DO PEDIDO, FAÇA SEU PAGAMENTO AQUI *****\n");
                                
                                do{

                                    System.out.println("**Escolha uma forma de pagamento**\n");
                                    System.out.println("1 - PIX com (10% de DESCONTO)\n");
                                    System.out.println("2 - Transfêrencia Bancária\n");
                                    System.out.println("3 - Cartão de Debito com (10% de DESCONTO)\n");
                                    System.out.println("4 - Cartão de Credito com (5% de DESCONTO)\n");
                                    System.out.println("0 - Para voltar ao menu inicial\n");
                                        
                                    System.out.println("Digite a opção desejada");
                                    opcao = sc.nextInt();

                                    if (opcao == 1) {
                                        System.out.println("Você escolheu a forma de pagamento PIX, que havera 10% de DESCONTO");
                                        conti = false;
                                        resp = sc.nextInt();
                                        if (resp == 1) {
                                            conti = false;
                                        }

                                    }
                                    if (opcao == 2) {
                                        System.out.println("Você escolheu a opção de Transfêrencia Bancária");
                                        conti = false;
                                        resp = sc.nextInt();
                                        if(resp == 2) {
                                            conti = false;
                                        }
                                    }
                                    if (opcao == 3) {
                                        System.out.println("Você escolheu a forma de pagamento de Cartao de Debito, que havera 10% de DESCONTO");
                                        conti = false;
                                        resp = sc.nextInt();
                                        if (resp == 3) {
                                            conti = false;
                                        }
                                        
                                    }
                                    if (opcao == 4) {
                                        System.out.println("Você escolheu a forma de pagamento de Cartão de Credito, que havera 5% de DESCONTO");
                                        conti = false;
                                        resp = sc.nextInt();
                                        if (resp == 4) {
                                            conti = false;
                                        }

                                    }
                                    if (opcao ==0){
                                        System.out.println("Compra efetuada com sucesso :)");

                                    }

                                }while(conti);
                                    
                            }
                        }while(continuar2);        
                        
                    }

                    do{//Voltar para Menu
                        System.out.println("\n");
                        System.out.println("1- Voltar ao Menu\n");
                        System.out.println("2- Sair da Strean\n");
                    int opc3 = sc.nextInt();
                        
                        if(opc3==1){
                            continuar = true;
                        }
                        if(opc3==2){    
                            continuar = false;
                        }
                        continuar3 = false;
                }while(continuar3);
                    }
                
            } while (continuar);




    sc.close();
    }
}

