package br.ufjf.dcc193.trabalho01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.trabalho01.SedeRepository;
import br.ufjf.dcc193.trabalho01.model.Atividade;
import br.ufjf.dcc193.trabalho01.model.Membro;
import br.ufjf.dcc193.trabalho01.model.Sede;


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
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
       
        sedes = Srep.findAll();
        mv.addObject("sedes", sedes);
        return mv;
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


    @RequestMapping("deletarSede.html")
    public ModelAndView home(@RequestParam int idSede){
        ModelAndView mvHome_Sede = new ModelAndView();
        mvHome_Sede.setViewName("home");

        for(Sede S : sedes){
            if(S.getId() == idSede){
                Srep.delete(S);
            }
        }


        sedes = Srep.findAll();
        mvHome_Sede.addObject("sedes", sedes);
        return mvHome_Sede;
    }

    @RequestMapping("editarSede.html")
    public ModelAndView editarSede(@RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editSede");

        sedes = Srep.findAll();
        for(Sede S : sedes){
            if(S.getId() == idSede){
                mv.addObject("sede", S);
            }
        }
        return mv;
    }

    @RequestMapping("sedeEditada.html")
    public ModelAndView sede(Sede nS, @RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        //define a view a ser carregada
        mv.setViewName("viewSede");
           
        for(Sede S : sedes){
            if(S.getId() == idSede){
                S.setNome(nS.getNome());
                S.setEstado(nS.getEstado());
                S.setCidade(nS.getCidade());
                S.setBairro(nS.getBairro());
                S.setTelefone(nS.getTelefone());
                S.setEmail(nS.getEmail());
                Srep.save(S);
                mv.addObject("sede", S);
                break;
            }
        } 
        return mv;
    }




//////////MEMBRO

    @RequestMapping("novoMembro.html")
    public ModelAndView memberForm(@RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("memberForm");
        mv.addObject("idSede", idSede);
        return mv;
    }

    @RequestMapping("verMembro.html")
    public ModelAndView verMembro(@RequestParam int idMembro,@RequestParam int idSede){
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
    public ModelAndView visualizaMembro(Membro M, @RequestParam int idSede){
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
    
    @RequestMapping("deletarMembro.html")
    public ModelAndView deletarMembro(@RequestParam int idMembro, @RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("viewSede");

        sedes = Srep.findAll();
        for(Sede S : sedes){
            if(S.getId() == idSede){
                List<Membro> sedeMembers = S.getMembro();
                for(Membro M : sedeMembers){
                    if(M.getId() == idMembro){
                      sedeMembers.remove(M);
                      S.setMembros(sedeMembers);    
                      Srep.save(S);
                      membros = S.getMembro();
                      mv.addObject("sede", S);
                      break;
                    }
                }
              break;  
            }
        }
        
        sedes = Srep.findAll();
        mv.addObject("membros", membros);
        mv.addObject("tarefas", tarefas);
        return mv;
    }

    @RequestMapping("editarMembro.html")
    public ModelAndView editarMembro(@RequestParam int idMembro,@RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editMembro");

        sedes = Srep.findAll();
        
        for(Sede S : sedes){
            if(S.getId() == idSede){
                List<Membro> sedeMembers = S.getMembro();
                for(Membro M : sedeMembers){
                    if(M.getId() == idMembro){
                        mv.addObject("membro", M);
                        mv.addObject("sede", S);
                    }
                }
            }
        }
        sedes = Srep.findAll();
        return mv;
    }

    @RequestMapping("membroEditado.html")
    public ModelAndView sede(Membro nM, @RequestParam int idMembro, @RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        //define a view a ser carregada
        mv.setViewName("viewSede");
        
        sedes = Srep.findAll();
        for(Sede S : sedes){
            if(S.getId() == idSede){
                List<Membro> sedeMembers = S.getMembro();
                for(Membro M : sedeMembers){
                    if(M.getId() == idMembro){
                        M.setNome(nM.getNome());
                        M.setFuncao(nM.getFuncao());
                        M.setEmail(nM.getFuncao());
                        M.setEntrada(nM.getEntrada());
                        M.setSaida(nM.getSaida());
                        Membro temp = M;
                        sedeMembers.remove(M);
                        sedeMembers.add(temp);
                        membros = sedeMembers;
                        S.setMembros(sedeMembers);
                        Srep.save(S);
                        mv.addObject("sede", S);
                        break;
                    }
                }
            }
        } 
        mv.addObject("membros", membros);
        mv.addObject("tarefas", tarefas);
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

    @RequestMapping("deletarTarefa.html")
    public ModelAndView deletarTarefa(@RequestParam int idTarefa, @RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("viewSede");

        sedes = Srep.findAll();
        for(Sede S : sedes){
            if(S.getId() == idSede){
                List<Atividade> sedeTarefas = S.getAtividade();
                for(Atividade A : sedeTarefas){
                    if(A.getId() == idTarefa){
                      sedeTarefas.remove(A);
                      S.setAtividades(sedeTarefas);    
                      Srep.save(S);
                      tarefas = S.getAtividade();
                      mv.addObject("sede", S);
                      break;
                    }
                }
              break;  
            }
        }
        
        sedes = Srep.findAll();
        mv.addObject("membros", membros);
        mv.addObject("tarefas", tarefas);
        return mv;
    }

    @RequestMapping("editarTarefa.html")
    public ModelAndView editarTarefa(@RequestParam int idTarefa,@RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("editTarefa");

        sedes = Srep.findAll();
        
        for(Sede S : sedes){
            if(S.getId() == idSede){
                List<Atividade> sedeTarefas = S.getAtividade();
                for(Atividade A : sedeTarefas){
                    if(A.getId() == idTarefa){
                        mv.addObject("tarefa", A);
                        mv.addObject("sede", S);
                    }
                }
            }
        }
        sedes = Srep.findAll();
        return mv;
    }

    @RequestMapping("tarefaEditada.html")
    public ModelAndView tarefaEditada(Atividade nT, @RequestParam int idTarefa, @RequestParam int idSede){
        ModelAndView mv = new ModelAndView();
        //define a view a ser carregada
        mv.setViewName("viewSede");
        
        sedes = Srep.findAll();
        for(Sede S : sedes){
            if(S.getId() == idSede){
                List<Atividade> sedeTarefas = S.getAtividade();
                for(Atividade A : sedeTarefas){
                    if(A.getId() == idTarefa){
                        A.setTitulo(nT.getTitulo());
                        A.setDescricao(nT.getDescricao());
                        A.setInicio(nT.getInicio());
                        A.setFim(nT.getFim());
                        A.setTotal(nT.getTotal());
                        A.setCategoria(nT.getCategoria());
                        Atividade temp = A;
                        sedeTarefas.remove(A);
                        sedeTarefas.add(temp);
                        tarefas = sedeTarefas;
                        S.setAtividades(sedeTarefas);
                        Srep.save(S);
                        mv.addObject("sede", S);
                        break;
                    }
                }
            }
        } 
        mv.addObject("membros", membros);
        mv.addObject("tarefas", tarefas);
        return mv;
    }
 
    
}