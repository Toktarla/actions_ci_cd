package com.toktar.proj1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/add")
    public ModelAndView addNumbers(@RequestParam("number1") int number1,
                                   @RequestParam("number2") int number2) {
        int result = number1 + number2;
        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
