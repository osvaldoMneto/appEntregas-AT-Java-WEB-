package br.edu.Infnet.appspeedmais.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.style.ToStringCreator;



public class Pedido {
	
	private String descricao;
	private Cliente cliente;
	private LocalDateTime data;
	private int numeroPedido;
	
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

	

}

	
	