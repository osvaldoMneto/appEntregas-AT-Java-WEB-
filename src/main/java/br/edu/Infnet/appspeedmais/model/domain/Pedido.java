package br.edu.Infnet.appspeedmais.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



public class Pedido {
	
	private String descricao;
	private Cliente cliente;
	private LocalDateTime data;
	private int numeroPedido;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idSolicitante")
	private Solicitante solicitante;
	@ManyToMany(cascade = CascadeType.DETACH)	
	private List<Veiculo> veiculos;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	
	

	public Pedido() {
		data = LocalDateTime.now();
	}
	
	
	public Pedido(String descricao) {
		this();
		this.descricao = descricao;
	}
	
	

	@Override
	public String toString() {
		DateTimeFormatter formatodata = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
		return String.format("%s;%s;%s", this.descricao, this.data.format(formatodata), this.cliente);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	




	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public int getNumeroPedido() {
		return numeroPedido;
	}



	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public LocalDateTime getData() {
		return data;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}


	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}


	public List<Veiculo> getVeiculos() {
		return veiculos;
	}


	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public void setData(LocalDateTime data) {
		this.data = data;
	}


}

	
	