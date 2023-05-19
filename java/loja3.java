import java.util.ArrayList;
import java.util.List;

class Produto {
private String nome;
private double preco;

public Produto(String nome, double preco) {
this.nome = nome;
this.preco = preco;
}

public double getPreco() {
return preco;
}
}

class Carrinho {
private List<Produto> produtos;

public Carrinho() {
produtos = new ArrayList<>();
}

public void adicionarProduto(Produto produto) {
produtos.add(produto);
}

public double calcularTotal() {
double total = 0;
for (Produto produto : produtos) {
total += produto.getPreco();
}
return total;
}
}

public class Main {
public static void main(String[] args) {
List<Produto> jogos = new ArrayList<>();

// Adiciona os jogos ao carrinho virtual
jogos.add(new Produto("Dark Souls", 70.00));
jogos.add(new Produto("God of War", 70.00));
jogos.add(new Produto("Forza Horizon 5", 80.00));

// Criação do carrinho
Carrinho carrinho = new Carrinho();

// Adiciona os jogos ao carrinho
for (Produto jogo : jogos) {
carrinho.adicionarProduto(jogo);
}

// Calcula o total do carrinho
double total = carrinho.calcularTotal();

// Imprime o preço total dos jogos
System.out.println("Preço total dos jogos no carrinho: R$ " + total);
}
}