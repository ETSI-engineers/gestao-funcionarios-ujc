package mz.ac.ujc.esa.boot.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/faculdades")
public class FaculdadeController {

    @GetMapping("cadastrar")
    public String cadastrar() {

        return "/admin/pages/faculdades/add-faculdade";
    }

    @GetMapping("listar")
    public String listar() {

        return "/admin/pages/faculdades/list-faculdade";
    }

    @GetMapping("actualizar")
    public String actualizar() {

        return "/admin/pages/faculdades/edit-faculdade";
    }

    @GetMapping("apagar")
    public String apagar() {

        return "/admin/pages/faculdades/delete-faculdade";
    }

    @GetMapping("home")
    public String index() {

        return "/admin/iframe";
    }
}
