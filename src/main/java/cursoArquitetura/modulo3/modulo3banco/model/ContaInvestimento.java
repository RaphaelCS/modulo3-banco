package cursoArquitetura.modulo3.modulo3banco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("2")
@Entity
@Getter
@Setter
@AllArgsConstructor
public class ContaInvestimento extends Conta {
/*
    public ContaInvestimento(Cliente cliente)  {
        super(cliente);
    }
*/

}
