package com.testapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by BS-36 on 3/2/15.
 */

@Controller
public class WelcomeController {

    @RequestMapping(value = "/")
    public String welcome(Model model)
    {
        model.addAttribute("message","Hello");
        return "welcome";
    }

    @RequestMapping(value = "/second")
    public String second(Model model)
    {
        model.addAttribute("message","Hello this is second page");
        return "second";
    }
}
