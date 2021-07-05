package mz.ac.ujc.esa.boot.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mz.ac.ujc.esa.boot.domain.Cargo;
import mz.ac.ujc.esa.boot.service.CargoService;

@Controller
@RequestMapping("/cargos")
public class CargoController {

	@Autowired
	CargoService service;

	@GetMapping("cadastrar")
	public String cadastrar(Cargo cargo) {

		return "/admin/pages/cargos/add-cargo";
	}

	@GetMapping("listar")
	public String listar() {

		return "/admin/pages/cargos/list-cargo";
	}

	@PostMapping("gravar")
	public String gravar(Cargo cargo) {
		service.registar(cargo);
		return "redirect:/cargos/cadastrar";
	}

	@GetMapping("actualizar")
	public String actualizar() {

		return "/admin/pages/cargos/add-cargo";
	}

	@GetMapping("apagar")
	public String apagar() {

		return "/admin/pages/cargos/add-cargo";
	}

}
