package mz.ac.ujc.esa.boot.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @GetMapping("cadastrar")
    public String cadastrar() {

        return "/admin/pages/funcionarios/add-func";
    }

    @GetMapping("listar")
    public String listar() {

        return "/admin/pages/funcionarios/list-func";
    }

    @GetMapping("actualizar")
    public String actualizar() {

        return "/admin/pages/funcionarios/edit-curso";
    }

    @GetMapping("apagar")
    public String apagar() {

        return "/admin/pages/funcionarios/delete-curso";
    }

    @GetMapping("minhas")
    public String requisicoesFunc() {

        return "/admin/pages/funcionarios/list-requi";
    }

    @GetMapping("requisitar")
    public String requisitar() {

        return "/admin/pages/funcionarios/add-requi";
    }

}
