package com.workmatch.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/candidatos")
public class CandidatoResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listarCandidato() {

		return "Testando REST...";
	}

}