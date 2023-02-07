package periodic.idat.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndedxController {
    @GetMapping(value = { "/Inicio", "/" })
    public String inicio() {
        return "Inicio";
    }

    @GetMapping("/Entretenimiento")
    public String Entretenimiento() {
        return "Entretenimiento";
    }

    @GetMapping("/Deportes")
    public String Deportes() {
        return "Deportes";
    }

    @GetMapping("/Noticias")
    public String Noticias() {
        return "Noticias";
    }
}
