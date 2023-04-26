import java.util.Scanner;



public class atividade{



 public static void main(String[] args) {



 Scanner sc = new Scanner(System.in);

 double valor,prest,desc,juros;

 double valortot,prestm,valorjuros,prestv,valorpp;



 System.out.println("Insira o valor da compra: ");

 valor = sc.nextDouble();

 System.out.println("Quantidade de prestações: ");

 prest = sc.nextDouble();

 System.out.println("Valor do desconto à vista (Sem %): ");

 desc = sc.nextDouble()/100;

 System.out.println("Valor dos juros por prestação (Sem %): ");

 juros = sc.nextDouble()/100;
 valortot = valor-(valor*desc);

 prestv = (valor/prest);

 prestm = prestv+(prestv*(juros*prest));
 valorjuros = prestv*(juros*prest);

valorpp = prestm*prest;

System.out.println("Valor total à vista: " +valortot);

 System.out.println("Valor de cada parcela: "+prestm);

 System.out.println("Valor dos juros em cada prestação: "+valorjuros);

 System.out.println("Valor total com os juros (em caso de prestação): "+valorpp);
 sc.close();

}

}