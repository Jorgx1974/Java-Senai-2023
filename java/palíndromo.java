import java.util.Scanner;

public class palíndromo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite alguma palavra palavra \n: ");
String vascao = sc.nextLine();

boolean palavra = true;
int comecodapalavra = 0;
int fimdapalavra = vascao.length() - 1;
//-> retorna a quantidade de caracteres de uma string
while (comecodapalavra < fimdapalavra) {
if (vascao.charAt(comecodapalavra++) != vascao.charAt(fimdapalavra--)) { //charAt: ele  Retorna o caractere em uma localização específica em uma String ,resumindo, pega a ultima letra da variavel , e inseri na primeira da variavel, depois pega penultima e inseri na segunda, e assim em diante, até pegar a primeira, e colocar na ultima.  
palavra = false;
break;
}
}
if (palavra) {
System.out.println(vascao + " é um palíndromo \n.");
} else {
System.out.println(vascao + " não é um palíndromo \n.");
}
sc.close();
} 
}