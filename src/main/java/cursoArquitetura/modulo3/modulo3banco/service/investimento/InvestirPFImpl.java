package cursoArquitetura.modulo3.modulo3banco.service.investimento;

import cursoArquitetura.modulo3.modulo3banco.exception.SaldoInsuficienteException;
import cursoArquitetura.modulo3.modulo3banco.exception.ValorInvalidoException;
import cursoArquitetura.modulo3.modulo3banco.model.ClientePF;
import cursoArquitetura.modulo3.modulo3banco.model.ContaCorrente;
import cursoArquitetura.modulo3.modulo3banco.model.ContaInvestimento;

import java.math.BigDecimal;

public interface InvestirPFImpl extends Investir<ClientePF> {

    BigDecimal RENDIMENTO = BigDecimal.valueOf(0.01);

    @Override
    default ContaInvestimento investir(ClientePF cliente, ContaCorrente conta, BigDecimal valor) throws ValorInvalidoException, SaldoInsuficienteException {
        /*
        if(valor.compareTo(BigDecimal.ZERO)<1){
            throw new ValorInvalidoException("Valor menor que zero ou igual a zero");
        }
        if(conta.getSaldo().compareTo(valor)<0) {
            throw new SaldoInsuficienteException();
        }

        ContaInvestimento contaInvestimento = BancoDadosService.verificarExistenciaContaInvestimento(cliente);
        if(contaInvestimento==null){
           // contaInvestimento = new ContaInvestimento(conta.getCliente());
        }
        //new ContaCorrentePFService().transferir((ClientePF) conta.getCliente(),conta,valor,contaInvestimento);
        contaInvestimento.setSaldo(contaInvestimento.getSaldo().add(valor.multiply(RENDIMENTO)));
        return contaInvestimento;

         */
        return null;
    }
}
