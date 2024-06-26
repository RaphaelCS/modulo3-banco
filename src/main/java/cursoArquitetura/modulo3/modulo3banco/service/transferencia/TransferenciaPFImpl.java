package cursoArquitetura.modulo3.modulo3banco.service.transferencia;

import cursoArquitetura.modulo3.modulo3banco.exception.SaldoInsuficienteException;
import cursoArquitetura.modulo3.modulo3banco.exception.ValorInvalidoException;
import cursoArquitetura.modulo3.modulo3banco.model.ClientePF;
import cursoArquitetura.modulo3.modulo3banco.model.Conta;

import java.math.BigDecimal;

public interface TransferenciaPFImpl<T extends Conta> extends Transferencia<ClientePF, T>{
    @Override
    default void transferir(ClientePF cliente, T contaOrigem, BigDecimal valor, Conta contaDestino) throws ValorInvalidoException, SaldoInsuficienteException {
        if(valor.compareTo(BigDecimal.ZERO)<1){
            throw new ValorInvalidoException("Valor menor que zero ou igual a zero");
        }
        if(contaOrigem.getSaldo().compareTo(valor)<0) {
            throw new SaldoInsuficienteException();
        }
        contaOrigem.setSaldo(contaOrigem.getSaldo().subtract(valor));
        contaDestino.setSaldo(contaDestino.getSaldo().add(valor));
    }

}
