package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Emprestimo;

@Service
public class EmprestimoService {
	
	@Autowired
	CalculatorService calculatorService;
	
	@Autowired
	CapitalCityService capitalCityService;
	
	public Emprestimo calculo() {
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setName("Augusto");
		emprestimo.setAge(calculatorService.getAddResult(33, 0));
		emprestimo.setFrom(capitalCityService.getCapitalCityResult("BR"));
		return emprestimo;
	}
	
}
