package br.com.fernando.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fernando.entities.Cliente;
import br.com.fernando.repositories.ClienteRepository;
import br.com.fernando.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente buscar(Integer id) {
		
		Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado"));
		
		return cliente;
		
	}
}
