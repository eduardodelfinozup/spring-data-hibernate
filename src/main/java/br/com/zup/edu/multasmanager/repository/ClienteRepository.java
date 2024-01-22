package br.com.zup.edu.multasmanager.repository;

import br.com.zup.edu.multasmanager.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
