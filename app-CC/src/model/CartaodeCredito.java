package model;

public class CartaodeCredito {
	public String dataEmissao, validadeCartao, categoria, bandeira, variante;
	public int numeroCartao, senha, cvv;
	public double valorLimite;
	
	public CartaodeCredito(String dataEmissao, String validadeCartao, String categoria, String bandeira,
			String variante, int numeroCartao, int senha, int cvv, double valorLimite) {
		super();
		this.dataEmissao = dataEmissao;
		this.validadeCartao = validadeCartao;
		this.categoria = categoria;
		this.bandeira = bandeira;
		this.variante = variante;
		this.numeroCartao = numeroCartao;
		this.senha = senha;
		this.cvv = cvv;
		this.valorLimite = valorLimite;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getValidadeCartao() {
		return validadeCartao;
	}

	public void setValidadeCartao(String validadeCartao) {
		this.validadeCartao = validadeCartao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getVariante() {
		return variante;
	}

	public void setVariante(String variante) {
		this.variante = variante;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	
	
}
