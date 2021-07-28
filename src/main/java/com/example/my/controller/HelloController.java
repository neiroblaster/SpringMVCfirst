package com.example.my.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author imssbora
 */
@Controller
public class HelloController {

        @RequestMapping(path={"/"},method=RequestMethod.GET)
        public String sayHello(Model model) {
                model.addAttribute("message","Hello Den!");
                return "index";
        }

//        @PostMapping ("/successful")
//        public String login (@RequestParam (value = "login") String login,
//                             @RequestParam (value = "password") String password,
//                             Model model) {
//                        model.addAttribute("login", login);
//                        model.addAttribute("password", password);
//
//                return "successful";

                @PostMapping ("/successful")
                public String login () {
                        return "successful";
        }
}
