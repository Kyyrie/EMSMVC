package org.snva.emsmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoaderListener;


@Controller
@RequestMapping("/")
public class HelloController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap){

        modelMap.put("Message","I am from the backend");
        return "index";
    }

    /*@RequestMapping(method = RequestMethod.GET)
    public String home(ModelMap modelMap){

        modelMap.put("Message","I am from the home");
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String contact(ModelMap modelMap){

        modelMap.put("Message","I am from the contact");
        return "index";
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }*/
}