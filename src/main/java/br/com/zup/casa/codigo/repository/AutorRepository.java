package br.com.zup.casa.codigo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.casa.codigo.model.Autor;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long>{

	Optional<Autor> findByEmail(String email);
}
