package com.toktar.proj1;

import org.springframework.web.bind.annotation.RequestMapping;

public interface CustomErrorControllerx {
    @RequestMapping("/error")
    String handleError();

    String getErrorPath();
}
