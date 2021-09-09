package br.edu.Infnet.appspeedmais.model.domain;

public class Pedido {
	private String descricao;
	private String end;
	
	public Pedido( String descricao, String end) {
		this.descricao= descricao;
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuilder pd = new StringBuilder();
		
		
		pd.append(this.descricao);
		pd.append(";");
		pd.append(this.end);
		
		return pd.toString();
	}
	public String getDescriçao() {
		return descricao;
	}

	public void setDescriçao(String descriçao) {
		this.descricao = descriçao;
	}


	
}
