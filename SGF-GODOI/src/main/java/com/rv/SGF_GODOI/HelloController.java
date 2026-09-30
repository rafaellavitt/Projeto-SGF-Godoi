package com.rv.SGF_GODOI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String dizerOla() {
        return "Olá, Flutter! A API está no ar.";
    }
}