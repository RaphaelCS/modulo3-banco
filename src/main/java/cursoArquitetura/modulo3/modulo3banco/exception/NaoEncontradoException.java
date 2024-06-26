package cursoArquitetura.modulo3.modulo3banco.exception;

import org.springframework.http.HttpStatus;

public class NaoEncontradoException extends AbstractException {

    public NaoEncontradoException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
