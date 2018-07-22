package com.example.metier;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.dao.ClientRepository;
import com.example.entities.Client;

@Service
public class ClientMetierImp implements ClientMetier
{
	@Autowired
    private ClientRepository clientRepository;

	
	@Override
	public Optional<Client> getClientById(Long id) {
		  
		return clientRepository.findById(id);
	}

	@Override
	public Client saveClient(Client client) {
		
        return clientRepository.save(client);
	}

	@Override
	public Client updateClient(long id , Client client) {
		
		client.setIdClient(id);
        return clientRepository.save(client);       
	}

	@Override
	public void deleteClient(long id) {
		
        clientRepository.deleteById(id);
	}

	@Override
	public List<Client> getAllClients() {
		
	       return clientRepository.findAll();	}
   
   
}