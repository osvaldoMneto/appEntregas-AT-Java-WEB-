package br.edu.Infnet.appspeedmais.model.domain;

import javax.persistence.Entity;


import br.edu.Infnet.appspeedmais.model.exceptions.ErroBikeException;
import br.edu.Infnet.appspeedmais.model.exceptions.ErroCarroException;
import br.edu.Infnet.appspeedmais.model.exceptions.ErroMotoException;

@Entity
public class Bike extends Veiculo {
	
	private  int tempoporkm;
	private String cor;
	private String condutor;
	
	
	public Bike() {
		
	}
	
	public Bike(String descricao, String ano, String marca, String condutor) {
		super( descricao, ano, marca, condutor);
	}
	


	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder bka = new StringBuilder();
		
		bka.append(this.tempoporkm);
		bka.append(";");
		bka.append(cor);
		bka.append(";");
		bka.append(condutor);
		bka.append(";");
		bka.append(super.toString());
		
		
		bka.append(super.toString());	
		
		
		
		return bka.toString();
	
	}
	

	
	
	@Override
	public float valorDoServico() throws ErroCarroException, ErroBikeException, ErroMotoException {
		// TODO Auto-generated method stub
		if(this.tempoporkm==0 || this.tempoporkm<0) {
			throw new ErroBikeException (" tempo Invalido!");
		}
		
		 if (this.tempoporkm<5) {
			 
				int valor1 = 5;
				System.out.println ("O valor do serviço é de R$" + valor1 +" por Km");
				 
			 }else { 
				  int valor2 = 3;
				 System.out.println("O valor do serviço é R$"+ valor2+ "Km");}
		
		
		return this.valorDoServico();
	}
	
	public int getTempoporkm() {
		return tempoporkm;
	}

	public void setTempoporkm(int tempoporkm) {
		this.tempoporkm = tempoporkm;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCondutor() {
		return condutor;
	}

	public void setCondutor(String condutor) {
		this.condutor = condutor;
	}
}

	
