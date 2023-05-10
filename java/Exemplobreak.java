/*
 * break ->parar o laço de repertição]
 * continue -> continuar depois de determinado trecho 
 */

public class Exemplobreak {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
System.out.println("O valor de i é:" +i);
if(i==3){
    continue;
}
if (i==8){
    System.out.println("parando a execução do programa");
break; }
continue;
        }
    }
}
