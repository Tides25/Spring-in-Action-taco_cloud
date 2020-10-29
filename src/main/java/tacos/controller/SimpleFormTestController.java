package tacos.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import tacos.component.Other;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/test")
@SessionAttributes("others")
public class SimpleFormTestController {

    @ModelAttribute("input")
    public Other other() {
        return new Other();
    }

    @GetMapping
    public String showSimpleForm() {
        return "simpleFormTest";
    }

    @PostMapping
    public String processInputForm(@Valid Other user_input, Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "redirect:/simpleFormTest";
        }
        log.info("User input is: " + user_input.getInput());
        return "home";
    }
}
