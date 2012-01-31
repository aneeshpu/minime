package com.minime.webapp.controller;

import com.minime.LinkedIn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/linkedin")
public class LinkedinController {

    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    LinkedIn getLinked(){
        return new LinkedIn();
    }
}
