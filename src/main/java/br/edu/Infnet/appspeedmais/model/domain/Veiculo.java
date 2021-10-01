package br.edu.Infnet.appspeedmais.model.domain;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


import br.edu.Infnet.appspeedmais.model.exceptions.ErroBikeException;
import br.edu.Infnet.appspeedmais.model.exceptions.ErroCarroException;
import br.edu.Infnet.appspeedmais.model.exceptions.ErroMotoException;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  abstract class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private String condutor;
	private String ano;
	private String marca;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	@ManyToMany(mappedBy ="veiculos")
	private List<Pedido> pedidos;
	

	public Veiculo() {
			
		}
	
		public Veiculo(String descricao, String ano, String marca, String condutor) {
			this.descricao = descricao;
			this.ano = ano;
			this.marca = marca;
			this.condutor = condutor;
		}
	
	public String verVeiculo() {
		
		StringBuilder vec= new StringBuilder();
		vec.append(descricao);
		vec.append(";");
		vec.append(ano);
		vec.append(";");
		vec.append(marca);
		vec.append(";");
	
		
		return vec.toString();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder vec = new StringBuilder();
		vec.append(this.descricao);
		vec.append(";");
		vec.append(this.ano);
		vec.append(";");
		vec.append(marca);
		
		return vec.toString();
	}
	
	
	
	public String getDescricao() {
		return descricao;
	}

	
	public String getAno() {
		return ano;
	}
	public String getMarca() {
		return marca;
	}	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getdescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCondutor() {
		return condutor;
	}

	public void setCondutor(String condutor) {
		this.condutor = condutor;
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public  void valordoServiço() {
		
		
	}

	public abstract float valorDoServico() throws ErroCarroException, ErroBikeException, ErroMotoException;
	
}    

    