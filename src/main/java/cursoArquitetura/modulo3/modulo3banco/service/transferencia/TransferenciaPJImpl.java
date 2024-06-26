package cursoArquitetura.modulo3.modulo3banco.service.transferencia;
import cursoArquitetura.modulo3.modulo3banco.exception.SaldoInsuficienteException;
import cursoArquitetura.modulo3.modulo3banco.exception.ValorInvalidoException;
import cursoArquitetura.modulo3.modulo3banco.model.ClientePJ;
import cursoArquitetura.modulo3.modulo3banco.model.Conta;

import java.math.BigDecimal;

public interface TransferenciaPJImpl <T extends Conta> extends Transferencia<ClientePJ,T>{

    BigDecimal TAXA = BigDecimal.valueOf(0.005);


    default void transferir(ClientePJ cliente, T contaOrigem, BigDecimal valor, Conta contaDestino)throws ValorInvalidoException, SaldoInsuficienteException {
        if (valor.compareTo(BigDecimal.ZERO)<1){
            throw new ValorInvalidoException("Valor menor que zero ou igual a zero");
        }
        BigDecimal taxa = valor.multiply(TAXA);
        if(contaOrigem.getSaldo().compareTo(valor.add(taxa))<0){
            throw new SaldoInsuficienteException();
        }
        contaOrigem.setSaldo(contaOrigem.getSaldo().subtract(valor));
        contaOrigem.setSaldo(contaOrigem.getSaldo().subtract(taxa));
        contaDestino.setSaldo(contaDestino.getSaldo().add(valor));
    }
}
