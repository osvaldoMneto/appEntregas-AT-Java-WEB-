package br.edu.Infnet.appspeedmais.model.domain;

public class Cliente {

	
	private String nome;
	private String end;
	private String e_mail;
	
	

	
	public Cliente(String nome, String end, String e_mail) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.end = end;
		this.e_mail = e_mail;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuilder cl = new StringBuilder();
		
		
		cl.append(this.nome);
		cl.append(";");
		cl.append(this.end);
		cl.append(";");
		cl.append(e_mail);
		
		return cl.toString();
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}