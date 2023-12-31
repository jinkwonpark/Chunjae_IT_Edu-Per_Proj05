package com.chunjae.pro05.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class HomeCtrl {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Locale locale, Model model) { return "/index";}

    @GetMapping("/login")
    public String login(){return "login";}
}
