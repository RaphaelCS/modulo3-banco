package cursoArquitetura.modulo3.modulo3banco.service;

import cursoArquitetura.modulo3.modulo3banco.model.ContaInvestimento;
import cursoArquitetura.modulo3.modulo3banco.service.consultaSaldo.ConsultaSaldo;
import cursoArquitetura.modulo3.modulo3banco.service.deposito.Deposito;
import cursoArquitetura.modulo3.modulo3banco.service.investimento.InvestirPJImpl;
import cursoArquitetura.modulo3.modulo3banco.service.saque.SaquePJImpl;
import cursoArquitetura.modulo3.modulo3banco.service.transferencia.TransferenciaPJImpl;

public class ContaInvestimentoPJService implements SaquePJImpl<ContaInvestimento>, ConsultaSaldo<ContaInvestimento>,
        Deposito<ContaInvestimento>, TransferenciaPJImpl<ContaInvestimento>, InvestirPJImpl {
}
