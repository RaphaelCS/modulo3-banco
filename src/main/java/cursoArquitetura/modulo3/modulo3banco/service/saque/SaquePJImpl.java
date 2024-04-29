package cursoArquitetura.modulo3.modulo3banco.service.saque;

import cursoArquitetura.modulo3.modulo3banco.exception.SaldoInsuficienteException;
import cursoArquitetura.modulo3.modulo3banco.exception.ValorInvalidoException;
import cursoArquitetura.modulo3.modulo3banco.model.ClientePJ;
import cursoArquitetura.modulo3.modulo3banco.model.Conta;

import java.math.BigDecimal;


public interface SaquePJImpl<T extends Conta> extends Saque<ClientePJ, T>{

    BigDecimal TAXA = BigDecimal.valueOf(0.005);

    @Override
    default void sacar(ClientePJ clientePJ, T conta, BigDecimal valor) throws ValorInvalidoException, SaldoInsuficienteException {
        BigDecimal taxa = valor.multiply(TAXA);
        if(valor.compareTo(BigDecimal.ZERO)<1) {
            throw new ValorInvalidoException("Valor menor que zero ou igual a zero");
        }
        if(conta.getSaldo().compareTo(valor.add(taxa))<0) {
            throw new SaldoInsuficienteException();
        }
        conta.setSaldo(conta.getSaldo().subtract(valor));
        conta.setSaldo(conta.getSaldo().subtract(taxa));
    }
}
