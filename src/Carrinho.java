import java.util.ArrayList;

public class Carrinho {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        FluxoMenu fluxo = new FluxoMenu(estoque);

        // (a) Crie pelo menos 3 produtos utilizando o novo construtor[cite: 1]
        Produto p1 = new Produto("Camiseta Algodão", "101", 50.00, 20);
        estoque.add(p1);

        Produto p2 = new Produto("Calça Jeans", "102", 120.00, 15);
        estoque.add(p2);

        Produto p3 = new Produto("Tênis Esportivo", "103", 250.00, 10);
        estoque.add(p3);


        fluxo.exibirMenu();
    }
}