/**
 * 
 */
package model;

/**
 * @author Lucas Batista 24 de mar. de 2024
 */
public class ItemPedido {
	private int quantidade;
	private Produto produto;

	public ItemPedido() {
		super();
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
		this.quantidade = quantidade;
	}

}
