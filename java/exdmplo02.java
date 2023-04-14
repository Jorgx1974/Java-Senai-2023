/*constante -> Variavel em JAVA em que não posso alterar o valor 
 * Usamos a palavra chave FINAL.
 * 
 * 
 */



public class exdmplo02 {

    public static final int TAXA = 10; 
    public static final double PI = 3.14;


    // public -> a constante pode ser acessada em qualquer parte do codigo. 
    // static -> essa constante é compartilhada entre todas as classes do meu programa.
    // final -> não posso alterar o valor.

    public static void main(String[] args) {

        System.out.println("A Taxa da loja é de:"+TAXA+"%");
        System.out.println(" PI valer:"+PI);
    }
}
