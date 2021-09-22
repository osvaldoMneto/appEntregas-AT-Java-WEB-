package br.edu.Infnet.appspeedmais.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.Infnet.appspeedmais.client.IEnderecoClient;
import br.edu.Infnet.appspeedmais.model.domain.Endereco;



@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClient enderecoClient;

	public Endereco obterCep(String cep) {

		return enderecoClient.obterCep(cep);
	}
}