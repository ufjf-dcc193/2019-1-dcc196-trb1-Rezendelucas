package br.ufjf.dcc193.trabalho01.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trabalho01.model.Atividade;
import br.ufjf.dcc193.trabalho01.model.Membro;
import br.ufjf.dcc193.trabalho01.model.Sede;


/**
 * HomeController
 */
@Controller
public class HomeController {

    List<Sede> sedes = new ArrayList<Sede>();
    List<Membro> membros = new ArrayList<Membro>();
    List<Atividade> tarefas = new ArrayList<Atividade>();

    @RequestMapping({"","index.html"})
    public ModelAndView home(){
        ModelAndView mvHome_Sede = new ModelAndView();
        mvHome_Sede.setViewName("home");
        mvHome_Sede.addObject("sedes", sedes);
        return mvHome_Sede;
    }



////////SEDE

    @RequestMapping("novaSede.html")
    public String companyForm(){
        return "companyForm";
    }

    @RequestMapping("verSede.html")
    public ModelAndView sede(@RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        //define a view a ser carregada
        mv.setViewName("viewSede");

        for (Sede var : sedes) {
            if(var.getId() == idSede ){
               mv.addObject("sede", var);
               break;
           }
        }
        mv.addObject("tarefas", tarefas);
        mv.addObject("membros", membros);
        return mv;
    }

    @RequestMapping("visualizaSede.html")
    public ModelAndView sede(Sede S){
        ModelAndView mv = new ModelAndView();
        //define a view a ser carregada
        mv.setViewName("viewSede");
           
        sedes.add(S);
        mv.addObject("sede", S);    
        
        return mv;
    }



//////////MEMBRO

    @RequestMapping("novoMembro.html")
    public ModelAndView memberForm(@RequestParam int id){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("memberForm");
        mv.addObject("idSede", id);
        return mv;
    }

    @RequestMapping("verMembro.html")
    public ModelAndView membro(@RequestParam int idMembro,@RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("viewMember");

        for (Membro var : membros) {
            if(var.getId() == idMembro){
               mv.addObject("membro", var);
               mv.addObject("idSede", idSede);
               break;
           }
         }    
        return mv;
    }

    @RequestMapping("visualizaMembro.html")
    public ModelAndView membro(Membro M, @RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("viewMember");

        membros.add(M);
        mv.addObject("membro", M);    
        mv.addObject("idSede", idSede);

        return mv;
    }
    
 
 ////////TAREFA   

    @RequestMapping("novaTarefa.html")
    public ModelAndView taskForm(@RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("taskForm");
        mv.addObject("idSede", idSede);
        return mv;
    }


    @RequestMapping("verTarefa.html")
    public ModelAndView taskForm(@RequestParam int idTarefa,@RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("viewTask");

        for (Atividade var : tarefas) {
            if(var.getId() == idTarefa){
               mv.addObject("tarefa", var);
               mv.addObject("idSede", idSede);
               break;
           }
         }    
        return mv;
    }
   
    @RequestMapping("visualizaTarefa.html")
    public ModelAndView taskForm(Atividade A, @RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("viewTask");

        tarefas.add(A);
        mv.addObject("tarefa", A);    
        mv.addObject("idSede", idSede);

        return mv;
    }
    
}