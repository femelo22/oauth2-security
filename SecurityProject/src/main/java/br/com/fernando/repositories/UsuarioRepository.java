package br.com.fernando.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fernando.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Optional<Usuario> findByUsername(String username);
	
}
