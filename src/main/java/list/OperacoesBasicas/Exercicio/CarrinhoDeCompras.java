package list.OperacoesBasicas.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        for(Item i: itemList){
            System.out.println(i);
            if(i.getNome().equalsIgnoreCase(nome)){;
                itemList.remove(i);
            }
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i: itemList){
            valorTotal = valorTotal + (i.getPreco() * i.getQuantidade());
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Carne", 30.00, 1);
        carrinhoDeCompras.adicionarItem("Sabonete", 2.99, 5);
        carrinhoDeCompras.adicionarItem("Manteiga", 15.99, 1);

        System.out.println("Valor total do carrinho: " + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Manteiga");

        System.out.println("Valor total do carrinho: " + carrinhoDeCompras.calcularValorTotal());


        carrinhoDeCompras.exibirItens();
    }
}