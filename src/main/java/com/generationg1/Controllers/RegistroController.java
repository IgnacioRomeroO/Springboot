package com.generationg1.Controllers;

import com.generationg1.Models.Usuario;
import org.springframework.boot.env.ConfigTreePropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/registro")
public class RegistroController {

    //crear ruta para desplegar el jsp//

    @RequestMapping("")
    public String registro(@ModelAttribute("usuario") Usuario usuario) {
        return "registro.jsp";
    }

    @PostMapping ("/usuario")
    public String registroUsuario(@RequestParam (value = "nombre") String nombre,
                                  @RequestParam (value = "apellido") String apellido,
                                  @RequestParam (value = "edad") String edad) {
        System.out.println("Parametro nombre: " + nombre);
        System.out.println("Parametro apellido: " + apellido);
        System.out.println("Parametro edad: " + edad);
        return "registro.jsp";
    }
}
