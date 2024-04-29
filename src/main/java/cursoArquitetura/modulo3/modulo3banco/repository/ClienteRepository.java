package cursoArquitetura.modulo3.modulo3banco.repository;

import cursoArquitetura.modulo3.modulo3banco.model.Cliente;
import cursoArquitetura.modulo3.modulo3banco.model.ClientePF;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClienteRepository<T extends Cliente> extends JpaRepository<T, Long> {

    public Optional<T> findByUuid(UUID uuid);
}
