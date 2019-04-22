package br.ufjf.dcc193.trabalho01.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trabalho01.model.Sede;


/**
 * HomeController
 */
@Controller
public class HomeController {

    @RequestMapping({"","index.html"})
    public ModelAndView home(){
        
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        List<Sede> sedes = new ArrayList<Sede>();
        Sede sede1 = new Sede("Microsoft", 1);
        sedes.add(sede1);
        Sede sede2 = new Sede("Apple", 2);
        sedes.add(sede2);
        Sede sede3 = new Sede("Podrão do Juca", 3);
        sedes.add(sede3);
        mv.addObject("sedes", sedes);
        return mv;
        //return "home";
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