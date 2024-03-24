/**
 * 
 */
package model;

/**
 * @author Lucas Batista 24 de mar. de 2024
 */
public class Produto {
	private int codigo;
	private double valor;
	private String descricao;

	public Produto(int i, double d, String string) {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
