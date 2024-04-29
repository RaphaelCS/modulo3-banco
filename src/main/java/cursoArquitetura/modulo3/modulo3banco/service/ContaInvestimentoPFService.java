package cursoArquitetura.modulo3.modulo3banco.service;

import cursoArquitetura.modulo3.modulo3banco.model.ContaInvestimento;
import cursoArquitetura.modulo3.modulo3banco.service.consultaSaldo.ConsultaSaldo;
import cursoArquitetura.modulo3.modulo3banco.service.deposito.Deposito;
import cursoArquitetura.modulo3.modulo3banco.service.investimento.InvestirPFImpl;
import cursoArquitetura.modulo3.modulo3banco.service.saque.SaquePFImpl;
import cursoArquitetura.modulo3.modulo3banco.service.transferencia.TransferenciaPFImpl;

public class ContaInvestimentoPFService implements SaquePFImpl<ContaInvestimento>, ConsultaSaldo<ContaInvestimento>,
        Deposito<ContaInvestimento>, TransferenciaPFImpl<ContaInvestimento>, InvestirPFImpl {
}
