package br.com.zup.casa.codigo.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.casa.codigo.controller.request.NovoAutorRequest;
import br.com.zup.casa.codigo.model.Autor;

@RestController
public class AutorController {
	
	@PersistenceContext
	private EntityManager manager;
	
	@PostMapping(value = "/autores")
	@Transactional
	public String cria(@Valid @RequestBody NovoAutorRequest request){
		Autor autor = request.toModel();
		manager.persist(autor);
		return autor.toString();
	}
}
