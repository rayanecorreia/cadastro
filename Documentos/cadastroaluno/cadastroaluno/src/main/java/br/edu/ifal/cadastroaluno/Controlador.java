package br.edu.ifal.cadastroaluno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controlador{

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("index.html");
    }

    @RequestMapping("/formulario")
    public ModelAndView formulario(){
        return new ModelAndView("formulario.html");
    }

  
    @RequestMapping("/cadastro")
    public ModelAndView novoAluno(String nome, String idade){
        ModelAndView resposta = new ModelAndView("formulario.html");
        resposta.addObject("mensagem", nome + " cadastrado com sucesso");
        return resposta;
    }
}