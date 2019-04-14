package br.ufjf.dcc193.trabalho01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * HomeController
 */
@Controller
public class HomeController {

    @RequestMapping({"","index.html"})
    public String home(){
        return "home";
    }

    @RequestMapping("novaSede.html")
    public String companyForm(){
        return "companyForm";
    }

    @RequestMapping("novoMembro.html")
    public String memberForm(){
        return "memberForm";
    }
    
    @RequestMapping("novaTarefa.html")
    public String taskForm(){
        return "taskForm";
    }
    
}