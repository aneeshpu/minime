package com.minime.webapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minime.Minime;

@Controller
@RequestMapping(value = "/hello")
public class MinimeController {

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    Minime greet() {
        return new Minime();
    }
}
