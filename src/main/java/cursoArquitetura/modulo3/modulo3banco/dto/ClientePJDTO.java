package cursoArquitetura.modulo3.modulo3banco.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClientePJDTO {

    private UUID uuid;
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @CNPJ(message = "CPF inválido")
    @NotBlank(message = "CNPJ é obrigatório")
    private String cnpj;
}
