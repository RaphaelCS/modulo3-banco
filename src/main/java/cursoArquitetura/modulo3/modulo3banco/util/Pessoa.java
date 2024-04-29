package cursoArquitetura.modulo3.modulo3banco.util;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(columnDefinition = "UUID", nullable = false)
    private UUID uuid;
}
