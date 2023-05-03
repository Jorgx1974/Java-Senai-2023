import java.util.Scanner;

public class graus {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Digite a temperatura: ");
double celsius = sc.nextDouble();

double fahrenheit = (celsius * 9/5) + 32;
double kelvin = celsius + 273.15;

System.out.println("Temperatura em graus Fahrenheit será : " + fahrenheit);
System.out.println("e em  Kelvin será: " + kelvin);
sc.close();

}
}