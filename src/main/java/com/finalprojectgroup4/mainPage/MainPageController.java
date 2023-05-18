package com.finalprojectgroup4.mainPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPageController {
    @GetMapping("mainPage")
    public String displayMainPage(){
        return "mainPage";

    }
}