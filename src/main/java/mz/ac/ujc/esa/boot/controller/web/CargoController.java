package mz.ac.ujc.esa.boot.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cargos")
public class CargoController {

	@GetMapping("cadastrar")
	public String cadastrar() {

		return "/admin/pages/cargos/add-cargo";
	}

	@GetMapping("listar")
	public String listar() {

		return "/admin/pages/cargos/list-cargo";
	}

	@GetMapping("actualizar")
	public String actualizar() {

		return "/admin/pages/cargos/add-cargo";
	}

	@GetMapping("apagar")
	public String apagar() {

		return "/admin/pages/cargos/add-cargo";
	}

	@GetMapping("home")
	public String index() {

		return "/layout";
	}
}
