package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
@GetMapping("/")
public String welcome(Model model) {
model.addAttribute("missatge", "Estic al home");
return "index";
}
@GetMapping("/saludo")
public String saludo(Model model) {
model.addAttribute("saludo", "Estic en saludo");
return "saludo";
}
@GetMapping("/despedida")
public String despedida(Model model) {
model.addAttribute("despedida", "Estic en despedida");
return "despedida";
}
}