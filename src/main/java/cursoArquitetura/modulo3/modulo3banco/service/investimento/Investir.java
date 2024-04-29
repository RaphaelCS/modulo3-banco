package cursoArquitetura.modulo3.modulo3banco.service.investimento;

import cursoArquitetura.modulo3.modulo3banco.exception.SaldoInsuficienteException;
import cursoArquitetura.modulo3.modulo3banco.exception.ValorInvalidoException;
import cursoArquitetura.modulo3.modulo3banco.model.Cliente;
import cursoArquitetura.modulo3.modulo3banco.model.ContaCorrente;
import cursoArquitetura.modulo3.modulo3banco.model.ContaInvestimento;

import java.math.BigDecimal;

public interface Investir<T extends Cliente>{

    ContaInvestimento investir(T cliente, ContaCorrente conta, BigDecimal valor) throws ValorInvalidoException, SaldoInsuficienteException;
}
