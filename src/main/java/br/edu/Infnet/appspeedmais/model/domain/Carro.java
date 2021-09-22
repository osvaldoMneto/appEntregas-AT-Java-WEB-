package br.edu.Infnet.appspeedmais.model.domain;


import javax.persistence.Entity;

import br.edu.Infnet.appspeedmais.model.exceptions.ErroCarroException;



@Entity
public class Carro extends Veiculo {

	private int lugares;
	private boolean airberg;
	private String mala;
	private int nota;
	
	public Carro() {
		
	}
	
	public Carro(String descricao, String ano, String marca, String condutor) {
		super(descricao, ano, marca,condutor);
		
	}
	// TODO Auto-generated method stub
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
	
	StringBuilder carA = new StringBuilder();
	
	carA.append(this.lugares);
	carA.append(";");
	carA.append(super.toString());
	carA.append(";");
	carA.append(airberg? "s" : "N" );
	carA.append(";");
	carA.append(mala);
	carA.append(";");
	carA.append(nota);
	
	
	
	return carA.toString();
	
	}
	
	@Override
	public float valorDoServico() throws ErroCarroException {
		// TODO Auto-generated method stub
		
		if(lugares!= 2 || lugares !=4 || lugares !=6) {
			throw new ErroCarroException("Os Carros são somente  de 2, 4 e 6 lugares");
		}
		
		 if (lugares==6 || airberg) {
			 
			int valor1 = 5;
			System.out.println ("O valor do serviço é de R$" + valor1 +" por Km");
			 
		 }else { 
			  int valor2 = 3;
			 System.out.println("O valor do serviço é R$"+ valor2+ "Km");}
		  
		  
		return valorDoServico();
	}
	
	public int getLugares() {
		return lugares;
	}

	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	public boolean isAirberg() {
		return airberg;
	}

	public void setAirberg(boolean airberg) {
		this.airberg = airberg;
	}

	public String getMala() {
		return mala;
	}

	public void setMala(String mala) {
		this.mala = mala;
	}
	
	
}

