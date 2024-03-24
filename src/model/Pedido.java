/**
 * 
 */
package model;

import java.util.List;

/**
 * @author Lucas Batista 24 de mar. de 2024
 */
public class Pedido {
	private int numeroNota;
	private double valorTotal;
	private List<ItemPedido> itens;

	public Pedido() {

	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void adicionaItem(ItemPedido item) {
		itens.add(item);
		valorTotal += item.getProduto().getValor() * item.getQuantidade();
	}

}
