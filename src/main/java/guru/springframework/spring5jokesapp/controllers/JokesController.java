package guru.springframework.spring5jokesapp.controllers;

import guru.springframework.spring5jokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", this.jokesService.getJoke());
        return "index";
    }
}
