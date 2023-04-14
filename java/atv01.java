// tipos de variáveis em Java

/*

String -> Armazena texto
char -> Armazena uma única letra 
int-> Números inteiros 
flot-> Números decimais 
double-> Números decimais. Maior precisão 

*/ 

/*
 * Toda vériavel DEVE começar com letra mínuscula
 * não pode haver espaço no nome da váriavel
 * nomeAluno, enderecoClinte, produtoAdquirido
 */

public class atv01{

public static void main(String[] args) {
    
    String nome = "Daniel Inacio Duarte";
    String nome1 = "Rafaella";
    int idade= 16;
    char letra = 'C'; // Todo criar DEVE estar com aspas simples
    float altura = (float) 1.76; // Estou convertendo um double para float
    String numero= "11975193320";
    String endereco= "rua doutor zito 162";
    


    System.out.println("meu nome é:"+nome);
    System.out.println("meu nome é:"+nome1);
    System.out.println("minha idade é:"+idade);
    System.out.println("Meu estado civil é:"+letra);
    System.out.println("Eu tenho:"+altura+"metros" );
    System.out.println("esse é o meu telefone:"+numero);
    System.out.println("o meu endereço é:"+endereco);
   
}

}
