import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lista3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
boolean continuar = true;
List<Item> carrinho = new ArrayList<>();

do {
System.out.println("=========MENU=========");
System.out.println("1-JOGOS DE AÇÃO ");
System.out.println("2-JOGOS DE CORRIDAS");
System.out.println("3-JOGOS DE AVENTURA");
System.out.println("0-Encerrar Compra");

int opcao = sc.nextInt();

if (opcao == 1) {
System.out.println("=====JOGOS DE AÇÃO=====");
System.out.println("11-Dark Souls");
System.out.println("12-God of War");
System.out.println("13-Batman Arkham Knight");
System.out.println("0-Voltar ao início");

int escolhaAcao = sc.nextInt();

if (escolhaAcao == 11) {
carrinho.add(new Item("Dark Souls", 70.00));
System.out.println("Dark Souls - R$70,00");
} else if (escolhaAcao == 12) {
carrinho.add(new Item("God of War", 70.00));
System.out.println("God of War - R$70,00");
} else if (escolhaAcao == 13) {
carrinho.add(new Item("Batman Arkham Knight", 70.00));
System.out.println("Batman Arkham Knight - R$70,00");
} else if (escolhaAcao == 0) {
continuar = false;
System.out.println("Compra encerrada.");
}

} else if (opcao == 2) {
System.out.println("=====JOGOS DE CORRIDAS=====");
System.out.println("21-Forza Horizon 5 - R$80,00");
System.out.println("22-Gran Turismo 7 - R$80,00");
System.out.println("23-Need for Speed Unbound - R$50,00");
System.out.println("0-Voltar ao início");

int escolhaCorrida = sc.nextInt();

if (escolhaCorrida == 21) {
carrinho.add(new Item("Forza Horizon 5", 80.00));
System.out.println("Forza Horizon 5 - R$80,00");
} else if (escolhaCorrida == 22) {
carrinho.add(new Item("Gran Turismo 7", 80.00));
System.out.println("Gran Turismo 7 - R$80,00");
} else if (escolhaCorrida == 23) {
carrinho.add(new Item("Need for Speed Unbound", 50.00));
System.out.println("Need for Speed Unbound - R$50,00");
} else if (escolhaCorrida == 0) {
continuar = false;
System.out.println("Compra encerrada.");
}

} else if (opcao == 3) {
System.out.println("=====JOGOS DE AVENTURA=====");
System.out.println("31-Zelda - Breath of the Wild - R$90,00");
System.out.println("32-Pokémon - R$90,00");
System.out.println("33-The Witcher 3 - Wild Hunt - R$90,00");
System.out.println("0-Voltar ao início");

int escolhaAventura = sc.nextInt();

if (escolhaAventura == 31) {
carrinho.add(new Item("Zelda - Breath of the Wild", 90.00));
System.out.println("Zelda - Breath of the Wild - R$90,00");
} else if (escolhaAventura == 32) {
carrinho.add(new Item("Pokémon", 90.00));
System.out.println("Pokémon - R$90,00");
} else if (escolhaAventura == 33) {
carrinho.add(new Item("The Witcher 3 - Wild Hunt", 90.00));
System.out.println("The Witcher 3 - Wild Hunt - R$90,00");
} else if (escolhaAventura == 0) {
continuar = false;
System.out.println("Compra encerrada.");
}

} else if (opcao == 0) {
continuar = false;
System.out.println("Compra encerrada.");
}

} while (continuar);


double precoTotal = 0.0;
System.out.println("=====Carrinho de Compras=====");
for (Item item : carrinho) {
System.out.println(item.getNome() + " - R$" + item.getPreco());
precoTotal += item.getPreco();
}
System.out.println("Preço Total: R$" + precoTotal);

sc.close();
}
}

class Item {
private String nome;
private double preco;

public Item(String nome, double preco) {
this.nome = nome;
this.preco = preco;
}

public String getNome() {
return nome;
}

public double getPreco() {
return preco;
}
}