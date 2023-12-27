package org.hackaboss.c9d10ejercicio1.excepcion;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * Esta clase se encarga de eliminar la traza de error que se muestra de nuestra aplicación, así evitamos problemas
 * */
@Component
public class FechaExcepcion extends DefaultErrorAttributes {
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
        errorAttributes.remove("trace");
        return errorAttributes;
    }
}
