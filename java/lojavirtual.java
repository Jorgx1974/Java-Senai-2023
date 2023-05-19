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
// Criação dos produtos
Produto produto1 = new Produto("Camiseta", 29.99);
Produto produto2 = new Produto("Calça", 59.99);
Produto produto3 = new Produto("Tênis", 99.99);

// Criação do carrinho
Carrinho carrinho = new Carrinho();

// Adiciona os produtos ao carrinho
carrinho.adicionarProduto(produto1);
carrinho.adicionarProduto(produto2);
carrinho.adicionarProduto(produto3);

// Calcula o total do carrinho
double total = carrinho.calcularTotal();

// Imprime o total do carrinho
System.out.println("Total do carrinho: R$ " + total);
}
}