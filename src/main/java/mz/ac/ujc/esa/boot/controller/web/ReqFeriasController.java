package mz.ac.ujc.esa.boot.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/requisicoes")
public class ReqFeriasController {

    @GetMapping("autorizar")
    public String autorizar() {

        return "/admin/pages/req-ferias/requisicoes";
    }

    @GetMapping("listar")
    public String listar() {

        return "/admin/pages/req-ferias/requisicoes";
    }

    @GetMapping("actualizar")
    public String actualizar() {

        return "/admin/pages/departamentos/edit-departamento";
    }
}
