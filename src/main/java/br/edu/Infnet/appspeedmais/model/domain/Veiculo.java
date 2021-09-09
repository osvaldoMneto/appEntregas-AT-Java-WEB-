package br.edu.Infnet.appspeedmais.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

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
	private String ano;
	private String marca;
	
	
	

	
	

	public Veiculo(String descricao, String ano) {
		this.descricao = descricao;
		this.ano = ano;
		this.marca = marca;
		
	}
	
	public String verVeiculo() {
		
		StringBuilder vec= new StringBuilder();
		vec.append(descricao);
		vec.append(";");
		vec.append(ano);
		vec.append(";");
		vec.append(marca);
		vec.append(";");
		try {
			vec.append(valorDoServico());
		} catch (ErroBikeException | ErroCarroException | ErroMotoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vec.append("\r\n");
		
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

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public abstract float valorDoServico() throws ErroBikeException, ErroCarroException, ErroMotoException;
	
	
}    

    