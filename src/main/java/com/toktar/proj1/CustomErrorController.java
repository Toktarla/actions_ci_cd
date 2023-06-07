package com.toktar.proj1;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController, CustomErrorControllerx {

    @Override
    @RequestMapping("/error")
    public String handleError() {
        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
