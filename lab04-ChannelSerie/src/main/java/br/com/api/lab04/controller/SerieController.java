package br.com.api.lab04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.lab04.model.Serie;
import br.com.api.lab04.service.SerieService;

@RestController
public class SerieController {
	
	@Autowired
	SerieService serieService;
	
	
	public Serie registerSerie(Serie serie){
		Serie serieCadastrado = serieService.registerSerie(serie);
		
		return serieCadastrado;
	}

}
