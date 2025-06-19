package org.idrice24.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SplashController {

    @GetMapping("/")
    public String splash(){
        return "splash"; // splash.html
    }

    @GetMapping("/index")
    public String index(){
        return "index"; // index.html
    }

}
