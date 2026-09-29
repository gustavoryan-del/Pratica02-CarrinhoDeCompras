public class Item {
    private Produto produto;
    private int quantidade;
    private double subtotal;

    public Item(Produto produto){
        this.produto = produto;
    }
    public Item(){
    }


    public void comprar(String codigo, int quantidade) {
        if (codigo.equalsIgnoreCase(produto.getCodigo())) {
            if (quantidade > produto.getQuantidade()) {
                System.out.println("Quantidade indisponível");
            } else {
                this.produto.setQuantidade(this.produto.getQuantidade() - quantidade);
                this.quantidade = quantidade;
                subtotal = retornaSubtotal();
                System.out.println("Compra realizada com sucesso");
            }
        }
    }

    public void calcularSubtotal() {
        subtotal = this.produto.getPreco() * this.quantidade;
        System.out.println("Subtotal: " + subtotal);
    }
    public double retornaSubtotal() {
        subtotal = this.produto.getPreco() * this.quantidade;
        return subtotal;
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade> 0 && quantidade <= this.produto.getQuantidade()) {
            this.quantidade = quantidade;
        }
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        if (subtotal >=0) {
            this.subtotal = subtotal;
        }
    }
}