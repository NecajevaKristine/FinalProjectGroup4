package com.finalprojectgroup4.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController (UserService userService){
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegisterPage(){
        return "register";
    }

    @PostMapping("/register")
    public String handleUserRegistration (User user){
        try{
            this.userService.createUser(user);
            return "redirect:login?status=REGISTER_SUCCESS";
        }catch(Exception exception){
            exception.printStackTrace();
            return "redirect:register?status=REGISTER_FAILED& message="+exception.getMessage();
        }
    }

    @GetMapping("login")
    public String displayLoginPage(){
        return "login";
    }

}

