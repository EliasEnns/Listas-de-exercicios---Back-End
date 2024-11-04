package com.elias.exercicio.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebController {

    @RequestMapping("/soma")
    public double soma(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @RequestMapping("/multiplicacao")
    public double multiplicacao(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @RequestMapping("/divisao")
    public double divisao(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}