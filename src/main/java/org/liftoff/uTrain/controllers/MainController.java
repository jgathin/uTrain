package org.liftoff.uTrain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping
    String displayIndexPage(Model model) {
        model.addAttribute("title", "Hello World");

        return "index";
    }
}
