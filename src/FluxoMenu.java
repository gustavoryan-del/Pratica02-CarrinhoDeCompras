import java.util.ArrayList;
import java.util.Scanner;

public class FluxoMenu {
    private ArrayList<Produto> estoque;
    private Fatura fatura = new Fatura();

    public FluxoMenu(ArrayList<Produto> estoque) {
        this.estoque = estoque;
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        do {
            System.out.println("Digite 0 para sair");
            System.out.println("Digite 1 para comprar");
            System.out.println("Digite 2 para ver a fatura");
            System.out.println("Digite 3 para excluir um item");
            System.out.println("Digite 4 para alterar a quantidade de um item");
            System.out.println("Digite 5 para finalizar a compra");
            System.out.println("Digite a opção desejada: ");
            input = scanner.nextInt();
            if (input == 0){
                System.out.println("Obrigado, volte sempre!");
                break;
            }
            if (input == 1) {
                String codigo;
                int quantidade;
                for (Produto produto : estoque) {
                    produto.imprime();
                }
                System.out.println("Digite o código do produto desejado: ");
                codigo = scanner.next();
                for(Produto produto: estoque){
                    if (codigo.equalsIgnoreCase(produto.getCodigo())){
                        Item item = new Item(produto);
                        System.out.println("Digite a quantidade do produto desejado: ");
                        quantidade = scanner.nextInt();
                        item.comprar(codigo, quantidade);
                        fatura.getItems().add(item);
                    }
                }
            }

            if (input == 2){
                fatura.verFatura();
            }
            if (input == 3){
                String codigoItem;
                System.out.println("Digite o codigo do item que deseja excluir: ");
                codigoItem = scanner.next();
                for (Item item: this.fatura.getItems()){
                    if (codigoItem.equalsIgnoreCase(item.getProduto().getCodigo())){
                        fatura.excluirItem(item);
                        break;
                    }
                }
                System.out.println("Item excluído com sucesso");
            }
            if (input == 4){
                String codigoItem;
                int quantidade;
                System.out.println("Digite o codigo do item que deseja alterar: ");
                codigoItem = scanner.next();
                System.out.println("Digite a nova quantidade do produto desejado: ");
                quantidade = scanner.nextInt();
                fatura.alterarItem(codigoItem, quantidade);
                System.out.println("Item alterado com sucesso");
            }
            if (input == 5){
                fatura.imprime();
                System.out.println("Obrigado por comprar conosco");
                break;
            }
        } while (input != 0);
    }

}