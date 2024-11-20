
package br.com.luana.domain;

import java.math.BigDecimal;


public class IProdutoService {

	private Produto produto;
	
	private Integer quantidade;
	
	private BigDecimal valorTotal;
	
	public IProdutoService() {
		this.quantidade = 0;
		this.valorTotal = BigDecimal.ZERO;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void adicionar(Integer quantidade) {
		this.quantidade += quantidade;
		BigDecimal novoValor = this.produto.getValor().multiply(BigDecimal.valueOf(quantidade));
		BigDecimal novoTotal = this.valorTotal.add(novoValor);
		this.valorTotal = novoTotal;
	}
	
	public void remover(Integer quantidade) {
		this.quantidade -= quantidade;
		BigDecimal novoValor = this.produto.getValor().multiply(BigDecimal.valueOf(quantidade));
		this.valorTotal = this.valorTotal.subtract(novoValor);
	}
	
	
}