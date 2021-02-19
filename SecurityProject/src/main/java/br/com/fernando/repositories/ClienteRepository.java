package br.com.fernando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fernando.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
