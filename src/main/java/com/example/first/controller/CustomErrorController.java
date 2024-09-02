package com.example.first.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Custom error handling logicß
        return "error"; // Return the name of the error view
    }

    public String getErrorPath() {
        return "/error";
    }
}
