package mz.ac.ujc.esa.boot.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @GetMapping("cadastrar")
    public String cadastrar() {

        return "/admin/pages/departamentos/add-departamento";
    }

    @GetMapping("listar")
    public String listar() {

        return "/admin/pages/departamentos/list-departamento";
    }

    @GetMapping("actualizar")
    public String actualizar() {

        return "/admin/pages/departamentos/edit-departamento";
    }

    @GetMapping("apagar")
    public String apagar() {

        return "/admin/pages/departamentos/delete-departamento";
    }

}
