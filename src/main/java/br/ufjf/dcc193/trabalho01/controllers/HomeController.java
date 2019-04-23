package br.ufjf.dcc193.trabalho01.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trabalho01.AtividadeRepository;
import br.ufjf.dcc193.trabalho01.MainApplication;
import br.ufjf.dcc193.trabalho01.MembroRepository;
import br.ufjf.dcc193.trabalho01.SedeRepository;
import br.ufjf.dcc193.trabalho01.model.Atividade;
import br.ufjf.dcc193.trabalho01.model.Membro;
import br.ufjf.dcc193.trabalho01.model.Sede;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Configurable;


/**
 * HomeController
 */
@Controller
public class HomeController {

    @Autowired
    SedeRepository Srep;
    

    List<Sede> sedes;
    List<Membro> membros;
    List<Atividade> tarefas;

    @RequestMapping({"","index.html"})
    public ModelAndView home(){
        ModelAndView mvHome_Sede = new ModelAndView();

        mvHome_Sede.setViewName("home");
        sedes = Srep.findAll();
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

        sedes = Srep.findAll();
        for (Sede var : sedes) {
            if(var.getId() == idSede ){
               mv.addObject("sede", var);
               membros = var.getMembro();
               tarefas = var.getAtividade();
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
           
        Srep.save(S);
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

        sedes = Srep.findAll();
        for(Sede S : sedes){
            if(S.getId() == idSede){
                S.setMembro(M);
                Srep.save(S);
            }
        }

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

        sedes = Srep.findAll();
        for(Sede S : sedes){
            if(S.getId() == idSede){
                S.setAtividade(A);
                Srep.save(S);
            }
        }

        mv.addObject("tarefa", A);    
        mv.addObject("idSede", idSede);

        return mv;
    }
    
}