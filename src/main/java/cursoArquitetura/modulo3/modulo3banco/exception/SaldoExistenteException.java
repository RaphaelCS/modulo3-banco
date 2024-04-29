package cursoArquitetura.modulo3.modulo3banco.exception;

public class SaldoExistenteException extends Exception{

    public SaldoExistenteException() {
        super("Conta possui saldo!");

    }
}
