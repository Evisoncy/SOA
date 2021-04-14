package edu.unmsm.sistemas.ws;

import edu.unmsm.sistemas.dto.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


@WebService(serviceName = "WS001")
public class WS001 {

    
    @WebMethod(operationName = "getListUsuario")
    public List<Usuario> getListUsuario(@WebParam(name = "code") String code) {
        List<Usuario> ls = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            Usuario u = new Usuario();
            u.setId(code + i);
            u.setUsername("Username " + i);
            u.setName("Name " + i);
            u.setEmail("Email " + i);
            ls.add(u);
        }
        return ls;
     }
}
