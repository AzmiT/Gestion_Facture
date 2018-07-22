package com.example.metier;

import java.util.List;
import java.util.Optional;

import com.example.entities.Client;

public interface ClientMetier {

	Optional<Client> getClientById(Long id);

	Client saveClient(Client client);

	Client updateClient(long id, Client client);

	void deleteClient(long id);

	List<Client> getAllClients();
}