package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Emprestimo;
import com.example.demo.service.EmprestimoService;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {
	
	@Autowired
	EmprestimoService emprestimoService;
	
	@RequestMapping(value = "/calculo", produces = MediaType.APPLICATION_JSON_VALUE)
	public Emprestimo calculo() {
		return emprestimoService.calculo();
	}
	
}
