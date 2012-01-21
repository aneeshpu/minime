package com.minime.webapp.controller;

import com.minime.Minime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/hello")
public class MinimeController {

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    String greet() {
        return new Minime().getGreeting();
    }
}
