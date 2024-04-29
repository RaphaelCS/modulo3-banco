package cursoArquitetura.modulo3.modulo3banco.service.consultaSaldo;



import cursoArquitetura.modulo3.modulo3banco.model.Conta;

import java.math.BigDecimal;

public interface ConsultaSaldo<T extends Conta> {

    default BigDecimal consultarSaldo(T conta) {
        return conta.getSaldo();
    }

}
