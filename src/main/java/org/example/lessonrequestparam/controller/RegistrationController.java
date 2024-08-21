package org.example.lessonrequestparam.controller;

import lombok.RequiredArgsConstructor;
import org.example.lessonrequestparam.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class RegistrationController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }

   @PostMapping(value = "/index")
    public String registrationPost(
            @RequestParam("username") String username,
            @RequestParam("password") String password


   ){

       System.out.println(username + " " + password);

        return "redirect:/index?success";
    }
}
