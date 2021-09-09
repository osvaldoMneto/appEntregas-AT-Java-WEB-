package br.edu.Infnet.appspeedmais.model.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.io.ClassPathResource;

import br.edu.Infnet.appspeedmais.model.domain.Bike;
import br.edu.Infnet.appspeedmais.model.domain.Carro;
import br.edu.Infnet.appspeedmais.model.domain.Cliente;
import br.edu.Infnet.appspeedmais.model.domain.Moto;
import br.edu.Infnet.appspeedmais.model.exceptions.ErroBikeException;
import br.edu.Infnet.appspeedmais.model.exceptions.ErroCarroException;
import br.edu.Infnet.appspeedmais.model.exceptions.ErroMotoException;



public class UsuarioTeste {
	

	String dir = System.getProperty("user.dir");
	
	
	
	
	public static void main(String[]args) throws IOException, ErroMotoException, ErroCarroException, ErroBikeException {
		
		InputStream inputstream;
		
		
		String dir = System.getProperty("user.dir");
		String arq = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))+".txt";
		
		try {
			//String dir ="C:\\Users\\micro-\\dev\\" ;
			//String arq = "Pedidos.txt";
			
			try {
				
				InputStream resource = new ClassPathResource("C:\\Users\\micro-\\dev").getInputStream();

				FileWriter fileW = new FileWriter(dir + arq);
				BufferedWriter escrita = new BufferedWriter(fileW);
				
				BufferedReader leitura = new BufferedReader(new InputStreamReader(resource));

				
				
				//FileWriter fileW = new FileWriter(dir+"out_"+arq);
				//BufferedWriter escrita = new BufferedWriter(fileW);
				
				
				//FileReader file = new FileReader(dir + arq);
				//BufferedReader leitura = new BufferedReader(file);
				
				String linha= leitura.readLine();
				
				while( linha !=null) {
					String[] campos = linha.split(";");
					
				{
					
					switch ( campos[0].toUpperCase()) {
					
					case"0":
						Cliente cliente = new Cliente(campos[2], campos[3], campos[3]);
						System.out.println("Pedido/Cliente");
					
					case"B":
						Bike bk2 = new Bike(campos[1], campos[2]);
						bk2.setCondutor(campos[3]);
						bk2.setTempoporkm(Integer.valueOf(campos[4]));
						escrita.write(bk2.verVeiculo());
						
						System.out.println("Bike: " +bk2);
						
						
						break;
						
						
					case "C":
						Carro car1 = new Carro(campos[1], campos[2]);
						car1.setLugares(Integer.valueOf(campos[3]));
						car1.setLugares(Integer.valueOf(campos[4]));
						escrita.write(car1.verVeiculo());
						System.out.println(" Carro:  " +car1);
						
						break;
					
						
					case "M":
						Moto mot1 = new Moto(campos[1], campos[2]);
						mot1.setPlaca(campos[3]);
						mot1.setNota(Integer.valueOf(campos[4]));
						escrita.write(mot1.verVeiculo());
						System.out.println("Moto: " +mot1);
						break;
					
					default:
						System.out.println("Opção Inválida!!");	
						break;
					}
					
				}
					linha = leitura.readLine();
				}
				
					
			
				leitura.close();
				escrita.close();
				fileW.close();
				
			}catch(IOException e) {
				System.out.println(e.getMessage());
				}
			}finally {
				System.out.println("Operação Finalizada");
			}
	

		}

}
			
				
				
				
			
		

			
					
		
	


