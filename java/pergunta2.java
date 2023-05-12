import java.util.Scanner;
public class pergunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pessoasMaisDe50Anos = 0;
        int pessoasMenosDe40kg = 0;
        int pessoasEntre1e2m = 0;
        
        for (int i = 1; i <= 5; i++) {
        System.out.println("Pessoa " + i);
        
        System.out.print ("Informe a idade dessa pessoa\n: ");
        int idade = sc.nextInt();
        
        System.out.print("Informe a altura  dessa pessoa\n: ");
        double altura = sc.nextDouble();
        
        System.out.print("Informe o peso em kg dessa pessoa:\n ");
        double peso = sc.nextDouble();
        
        if (idade > 50) {
        pessoasMaisDe50Anos++;
        }
        
        if (peso < 40) {
        pessoasMenosDe40kg++;
        }
        
        if (altura >= 1 && altura <= 2) {
        pessoasEntre1e2m++;
        }
        
       
        }
        
        System.out.println("Pessoas com mais de 50 anos\n: " + pessoasMaisDe50Anos);
        System.out.println("Pessoas com menos de 40kg\n: " + pessoasMenosDe40kg);
        System.out.println("Pessoas com altura entre 1m e 2m\n: " + pessoasEntre1e2m);
        
        sc.close();
        }
        }

