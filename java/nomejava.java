import java.util.Scanner;

public class nomejava {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);  
    
    String java ="java";
    

    System.out.println("escreva a palavra");
    String palavra=sc.next();
boolean mesmonome=palavra.equals(java);

System.out.println("tem o mesmo nome que ("+java+") ?" +mesmonome);
sc.close();

}
    
}
