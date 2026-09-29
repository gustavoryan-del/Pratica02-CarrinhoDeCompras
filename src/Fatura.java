import java.util.ArrayList;

public class Fatura {
    private ArrayList<Item> items = new ArrayList<>();
    private double valorTotal;

    public void imprime() {
        for (Item item : items) {
            valorTotal += item.getSubtotal();
        }
        System.out.println("Valor total: " + valorTotal);
    }

    public void excluirItem(Item item) {
        if (items.contains(item)) {
            this.items.remove(item);
            System.out.println("Item Removido com sucesso");
        } else {
            System.out.println("Item não consta na fatura");
        }

    }

    public void alterarItem(String codigo , int novaQuantidade){
        for (Item item: items){
            if (item.getProduto().getCodigo().equalsIgnoreCase(codigo)){
                item.setQuantidade(novaQuantidade);
                item.setSubtotal(item.retornaSubtotal());
            }
        }
    }

    public void adicionarItem(Item item) {
        this.items.add(item);
        System.out.println("Item adicionado com sucesso");
    }

    public void verFatura() {
        for (Item item : items) {
            System.out.println("Nome: " + item.getProduto().getNome() + "| Quantidade: " + item.getQuantidade() + "| Subtotal: " + item.getSubtotal());
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}