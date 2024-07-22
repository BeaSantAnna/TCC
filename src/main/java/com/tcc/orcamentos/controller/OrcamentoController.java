package com.tcc.orcamentos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import com.tcc.orcamentos.entity.Orcamento;
import com.tcc.orcamentos.service.OrcamentoService;


@Controller
@RequestMapping("/orcamento")
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @GetMapping("/emitir")
    public ModelAndView emitir(Orcamento orcamento) {
        ModelAndView mv = new ModelAndView("orcamento/emitir");
        mv.addObject("orcamento", orcamento);
        return mv;
    }

    @PostMapping("/emitir")
    public String emitirPDF(@ModelAttribute Orcamento orcamento) {
    	orcamentoService.save(orcamento);
        return "redirect:/orcamento/visualizar";
    }

    @GetMapping("/visualizar")
    public ModelAndView visualizarPDFs() {
        ModelAndView mv = new ModelAndView("orcamento/visualizar");
        List<Orcamento> pdfs = orcamentoService.findAll();
        mv.addObject("pdfs", pdfs);
        return mv;
    }
}
