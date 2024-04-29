package cursoArquitetura.modulo3.modulo3banco.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientePFDTO {

    private UUID uuid;
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @CPF(message = "CPF inválido")
    @NotBlank(message = "CPF é obrigatório")
    private String cpf;
    //todo acertar data nascimento
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
//    @NotBlank(message = "Data de nascimento é obrigatória")
//    private Date dataNascimento;
}
