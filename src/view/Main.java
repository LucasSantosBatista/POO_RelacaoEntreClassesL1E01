/**
 * 
 */
package view;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

/**
 * @author Lucas Batista 24 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		Produto produto1 = new Produto(1, 10.0, "Produto 1");
		Produto produto2 = new Produto(2, 20.0, "Produto 2");

		ItemPedido item1 = new ItemPedido(produto1, 2);
		ItemPedido item2 = new ItemPedido(produto2, 3);

		Pedido pedido = new Pedido();
		pedido.adicionaItem(item1);
		pedido.adicionaItem(item2);

		System.out.println("Valor total do pedido: " + pedido.getValorTotal());
	}
}
