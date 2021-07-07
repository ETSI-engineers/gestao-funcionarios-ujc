package mz.ac.ujc.esa.boot.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("admin")
    public String admin() {
        return "/iframe";
    }

    @GetMapping("home")
    public String home() {
        return "user/iframe";
    }
}
