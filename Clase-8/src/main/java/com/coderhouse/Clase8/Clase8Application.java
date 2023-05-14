package com.coderhouse.Clase8;

import com.coderhouse.Clase8.repository.ClientRepository;
import com.coderhouse.Clase8.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.Clase8.model.Product;
import com.coderhouse.Clase8.model.Client;

import java.util.Optional;

@SpringBootApplication
public class Clase8Application implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ClientRepository clientRepository;


	public static void main(String[] args) {
		SpringApplication.run(Clase8Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listening on http://localhost:8888/h2-console");

		Product taza = new Product();
		taza.setCode("T000001");
		taza.setDescription("Taza 400 mL");
		taza.setPrice(10);
		taza.setStock(100);

		this.productRepository.save(taza);

		// Descomentar el siguiente código para mostrar el producto de ID 1

		/* Optional<Product> productoObtenido = this.productRepository.findById(1);

		if (productoObtenido.isPresent()) {
			System.out.println(productoObtenido.get());
		} */

		Client primerCliente = new Client();

		primerCliente.setName("Nicolás");
		primerCliente.setLastname("Tagliaficco");
		primerCliente.setDocnumber("42.567.232");

		this.clientRepository.save(primerCliente);

		// Descomentar el siguiente código para mostrar el Cliente de ID 1

		/*

		Optional<Product> clienteObtenido = this.clientRepository.findById(1);

		if (clienteObtenido.isPresent()) {
			System.out.println(clienteObtenido.get());
		} */

	}
}
