package cursoArquitetura.modulo3.modulo3banco.service;

import cursoArquitetura.modulo3.modulo3banco.model.ContaPoupanca;
import cursoArquitetura.modulo3.modulo3banco.service.consultaSaldo.ConsultaSaldo;
import cursoArquitetura.modulo3.modulo3banco.service.deposito.Deposito;
import cursoArquitetura.modulo3.modulo3banco.service.saque.SaquePFImpl;
import cursoArquitetura.modulo3.modulo3banco.service.transferencia.TransferenciaPFImpl;

public class ContaPoupancaService implements ConsultaSaldo<ContaPoupanca>, SaquePFImpl<ContaPoupanca>,
        Deposito<ContaPoupanca>, TransferenciaPFImpl<ContaPoupanca> {
}
