package cursoArquitetura.modulo3.modulo3banco.repository;

import cursoArquitetura.modulo3.modulo3banco.model.Cliente;
import cursoArquitetura.modulo3.modulo3banco.model.ClientePF;
import cursoArquitetura.modulo3.modulo3banco.model.Conta;
import cursoArquitetura.modulo3.modulo3banco.model.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ContaRepository<T extends Conta, U extends Cliente> extends JpaRepository<T, Long> {

    public Optional<T> findByUuid(UUID uuid);
    public List<T> findByCliente(Optional<U> cliente);
}
