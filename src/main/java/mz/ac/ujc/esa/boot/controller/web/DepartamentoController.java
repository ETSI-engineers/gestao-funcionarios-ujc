package mz.ac.ujc.esa.boot.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mz.ac.ujc.esa.boot.domain.Departamento;
import mz.ac.ujc.esa.boot.service.DepartamentoService;

@Controller
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoService service;

    @GetMapping("cadastrar")
    public String cadastrar(Departamento departamento) {

        return "/admin/pages/departamentos/add-departamento";
    }

    @GetMapping("listar")
    public String listar(ModelMap model) {
        model.addAttribute("departamentos", service.pesquisarTodos());
        return "/admin/pages/departamentos/list-departamento";
    }

    /**
     * Metodo de pre actualizacao de registo de departamentos com recurso ao metodo
     * actualizar que faz o redirecionamento
     * 
     * @param id
     * @param model
     * @return
     */
    @GetMapping("editar/{id}")
    public String preActualizar(@PathVariable("id") Long id, ModelMap model) {
        model.addAttribute("departamentos", service.pesquisarPorId(id));

        return "/admin/pages/departamentos/add-departamento";
    }

    @PostMapping("editar")
    public String actualizar(Departamento departamento) {
        service.editar(departamento);

        return "redirect:/departamentos/cadastrar";
    }

    @GetMapping("apagar")
    public String apagar() {

        return "/admin/pages/departamentos/delete-departamento";
    }

    /**
     * metodo para fazer o registo de departamentos com recurso ao formulario de
     * cadastro mo redir
     * 
     * @param departamento
     * @return
     */
    @PostMapping("gravar")
    public String gravar(Departamento departamento) {
        service.registar(departamento);
        return "redirect:/departamentos/cadastrar";
    }

}
