package cursoArquitetura.modulo3.modulo3banco.exception;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ErrorResponse {
    private final int statusCode;
    private final String message;
}
