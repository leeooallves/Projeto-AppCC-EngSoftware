package model;

public class Cliente {
	public String usuario, nome, senha, rua, cidade, estado, pais;
	public int cpf, telefone, numero;
	public double renda;
	
	public Cliente() {
		
	}

	public Cliente(String usuario, String nome, String senha, String rua, String cidade, String estado, String pais,
			int cpf, int telefone, int numero, double renda) {
		super();
		this.usuario = usuario;
		this.nome = nome;
		this.senha = senha;
		this.rua = rua;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
		this.cpf = cpf;
		this.telefone = telefone;
		this.numero = numero;
		this.renda = renda;
	}



	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	
	
}
