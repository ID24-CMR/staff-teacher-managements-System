package org.idrice24.controllers;

import org.idrice24.entities.Users;
import org.idrice24.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
   // private UserServices userServices;
    
        @Autowired
        public void setUserSer(UserServices userServices){
       //     this.userServices = userServices;
    }

    @GetMapping("/login")
    public String loginPage(Model model, Users users){
        model.addAttribute("users", users);
        return "login";
    }

    @GetMapping("/users/signin/{email}")
    public String signinPage(Model model){

        return "index";
    }

}
