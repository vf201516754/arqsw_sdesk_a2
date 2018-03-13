package br.usjt.arqsw.entity;

public class Chamado {
	public int idChamado;
	public String descricao;
	public String status;
	public String dtAbertura;
	public String dtFechamento;
	public Fila fila;
	
	public int getIdChamado() {
		return idChamado;
	}

	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDtAbertura() {
		return dtAbertura;
	}

	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

	public String getDtFechamento() {
		return dtFechamento;
	}

	public void setDtFechamento(String dtFechamento) {
		this.dtFechamento = dtFechamento;
	}

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}
}
