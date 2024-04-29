package cursoArquitetura.modulo3.modulo3banco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@DiscriminatorValue("3")
@Entity
@Getter
@Setter
@AllArgsConstructor
public class ContaPoupanca extends Conta {

/*
    public ContaPoupanca(ClientePF cliente) {
        super(cliente);
    }

*/
}
