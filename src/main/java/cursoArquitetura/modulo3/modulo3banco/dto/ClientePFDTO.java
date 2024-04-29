package cursoArquitetura.modulo3.modulo3banco.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientePFDTO {

    private UUID uuid;
    @NotNull
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @CPF(message = "CPF inválido")
    @NotBlank(message = "CPF é obrigatório")
    @NotNull
    private String cpf;
    @NotNull
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;
}
