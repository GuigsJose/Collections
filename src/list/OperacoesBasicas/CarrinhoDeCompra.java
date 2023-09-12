package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> itemList;
    public CarrinhoDeCompra(){
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    @Override
    public String toString() {
        return "CarrinhoDeCompra{" +
                "itemList=" + itemList +
                '}';
    }

    public double calcularValorTotal(){
        //Inicializa a variável que irá armazenar o valor total como zero
        double valorTotal = 0d;
        // Verifica se a lista principal não está vazia
        if (!itemList.isEmpty()){
            // Loop for-each para percorrer todos os itens na lista principal
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();

                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            // Se a lista principal estiver vazia, lança uma exceção RuntimeException
            throw new RuntimeException("Sua lista está vazia");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        // Adicionando itens ao carrinho
        carrinhoDeCompra.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompra.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompra.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompra.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho    

        // Removendo um item do carrinho
        carrinhoDeCompra.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho


        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompra.calcularValorTotal());
    }
}

