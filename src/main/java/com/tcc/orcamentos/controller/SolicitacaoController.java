package com.tcc.orcamentos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.tcc.orcamentos.entity.Solicitacao;
import com.tcc.orcamentos.service.SolicitacaoService;


@Controller
@RequestMapping("/solicitacoes")
public class SolicitacaoController {
	
	@Autowired
	private SolicitacaoService solicitacaoService;

	@GetMapping("/visualizarPendentes")
	public ModelAndView visualizarPendentes() {
		ModelAndView mv = new ModelAndView("solicitacao/visualizarPendentes");
		List<Solicitacao> solicitacoesPendentes = solicitacaoService.findPendentes();
		mv.addObject("solicitacoes", solicitacoesPendentes);
		return mv;
	}

	@GetMapping("/visualizarStatus")
	public ModelAndView visualizarStatus() {
		ModelAndView mv = new ModelAndView("solicitacao/visualizarStatus");
		List<Solicitacao> solicitacoes = solicitacaoService.findAll();
		mv.addObject("solicitacoes", solicitacoes);
		return mv;
	}

	@GetMapping("/visualizarEncerradas")
	public ModelAndView visualizarEncerradas() {
		ModelAndView mv = new ModelAndView("solicitacao/visualizarEncerradas");
		List<Solicitacao> solicitacoesEncerradas = solicitacaoService.findEncerradas();
		mv.addObject("solicitacoes", solicitacoesEncerradas);
		return mv;
	}
}
