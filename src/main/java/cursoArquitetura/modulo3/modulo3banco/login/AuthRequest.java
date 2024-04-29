package cursoArquitetura.modulo3.modulo3banco.login;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class AuthRequest {

    private String username;
    private String password;

}
