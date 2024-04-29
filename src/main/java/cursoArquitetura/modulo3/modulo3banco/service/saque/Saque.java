package cursoArquitetura.modulo3.modulo3banco.service.saque;

import cursoArquitetura.modulo3.modulo3banco.exception.SaldoInsuficienteException;
import cursoArquitetura.modulo3.modulo3banco.exception.ValorInvalidoException;
import cursoArquitetura.modulo3.modulo3banco.model.Cliente;
import cursoArquitetura.modulo3.modulo3banco.model.Conta;

import java.math.BigDecimal;

public interface Saque<T extends Cliente, S extends Conta> {

    void sacar(T cliente, S conta, BigDecimal valor) throws ValorInvalidoException, SaldoInsuficienteException;
}
