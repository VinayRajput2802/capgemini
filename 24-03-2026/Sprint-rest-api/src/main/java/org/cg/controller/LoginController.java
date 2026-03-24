package org.cg.controller;

import jakarta.servlet.http.HttpSession;
import org.cg.Exception.UserNotFound;
import org.cg.entity.Login;
import org.cg.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping("/login")
    public String login(@RequestBody Login user, HttpSession ses){
        Login user1 = service.validateUser(user);
        ses.setAttribute("name",user1.getUserName());
        return "Login Successfull";

    }

    @GetMapping("/logout")
    public String logout(Login user,HttpSession ses){
        if (ses.getAttribute("name") != null){
            ses.invalidate();
        }
        return "Logout Successfull";
    }
}
