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

    ModelAndView mvHome = new ModelAndView();
    List<Sede> sedes = new ArrayList<Sede>();

    @RequestMapping({"","index.html"})
    public ModelAndView home(){
        mvHome.setViewName("home");
        
       // Sede sede1 = new Sede(1,"Microsoft");
       // sedes.add(sede1);
       // Sede sede2 = new Sede(2,"Apple");
       // sedes.add(sede2);
       // Sede sede3 = new Sede(3,"Podrão do Juca");
       // sedes.add(sede3);
       // mv.addObject("sedes", sedes);
        return mvHome;
    }

    @RequestMapping("novaSede.html")
    public String companyForm(){
        return "companyForm";
    }
/*
    @RequestMapping("verSede.html")
    public String sede(){
        return "viewSede";
    }

    @RequestMapping("verSede.html")
    public ModelAndView sede(Integer id, String nome, String estado, String cidade, String bairro, String telefone, String email){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("viewSede");
        mv.addObject("id", id);
        mv.addObject("nome", nome);
        mv.addObject("estado", estado);
        mv.addObject("cidade", cidade);
        mv.addObject("bairro", bairro);
        mv.addObject("telefone", telefone);
        mv.addObject("email", email);
        return mv;
    }
*/
    @RequestMapping("verSede.html")
    public ModelAndView sede(Sede S){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("viewSede");
        mv.addObject("sede", S);
        sedes.add(S);
        mvHome.addObject("sedes", sedes);
        return mv;
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