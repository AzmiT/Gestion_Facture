package com.example.services;


	import org.springframework.beans.factory.annotation.Autowired;

	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;

	import org.springframework.web.bind.annotation.RestController;

	import com.example.metier.ClientMetier;
	import com.example.entities.Client;

	import java.util.List;
	import java.util.Optional;


	@RestController
	@CrossOrigin("*")
	public class ClientServices {
		
		
		@Autowired
	private ClientMetier clientMetier;

		@RequestMapping(value="/Client",method=RequestMethod.GET)
		public List<Client> getAllClients() {
			return clientMetier.getAllClients();
		} 
		
		@RequestMapping(value="/Client/{id}",method=RequestMethod.GET)
		public Optional<Client> getClientById(@PathVariable long id) {
			return clientMetier.getClientById(id);
		}
		
		@RequestMapping(value="/Client",method=RequestMethod.POST)
		public Client saveClient(@RequestBody Client Client) {
			return clientMetier.saveClient(Client);
		}

		@RequestMapping(value="/Client/{id}",method=RequestMethod.PUT)
		public Client updateClient(@PathVariable Long id, @RequestBody Client Client) {
			
			return clientMetier.updateClient(id, Client);
		}

		
		@RequestMapping(value="/Client/{id}",method=RequestMethod.DELETE)
		public void deleteClient(@PathVariable long id) {
			clientMetier.deleteClient(id);
		}
	}

