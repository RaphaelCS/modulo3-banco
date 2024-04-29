package cursoArquitetura.modulo3.modulo3banco.service;

import cursoArquitetura.modulo3.modulo3banco.model.ContaCorrente;
import cursoArquitetura.modulo3.modulo3banco.service.consultaSaldo.ConsultaSaldo;
import cursoArquitetura.modulo3.modulo3banco.service.deposito.Deposito;
import cursoArquitetura.modulo3.modulo3banco.service.saque.SaquePJImpl;
import cursoArquitetura.modulo3.modulo3banco.service.transferencia.TransferenciaPJImpl;

public class ContaCorrentePJService implements ConsultaSaldo<ContaCorrente>, Deposito<ContaCorrente>,
        SaquePJImpl<ContaCorrente>, TransferenciaPJImpl<ContaCorrente> {
}
